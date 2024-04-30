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
package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.*;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;

import java.io.IOException;
import java.util.*;

/**
 * Generates a Track that starts at fromSample and ends at toSample (exclusive). The user of this class
 * has to make sure that the fromSample is a random access sample.
 * <ul>
 * <li>In AAC and most other audio formats this is every single sample</li>
 * <li>In H264 this is every sample that is marked in the SyncSampleBox</li>
 * </ul>
 */
public class CroppedTrack extends AbstractTrack {public static class __CLR4_5_279d79dlvlulhrw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,9518,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Track origTrack;
    private int fromSample;
    private int toSample;

    /**
     * Wraps an existing track and masks out a number of samples.
     * Works like {@link java.util.List#subList(int, int)}.
     *
     * @param origTrack  the original <code>Track</code>
     * @param fromSample first sample in the new <code>Track</code> - beginning with 0
     * @param toSample   first sample not in the new <code>Track</code> - beginning with 0
     */
    public CroppedTrack(Track origTrack, long fromSample, long toSample) {
        super("crop(" + origTrack.getName() + ")");__CLR4_5_279d79dlvlulhrw.R.inc(9410);try{__CLR4_5_279d79dlvlulhrw.R.inc(9409);
        __CLR4_5_279d79dlvlulhrw.R.inc(9411);this.origTrack = origTrack;
        assert (((fromSample <= Integer.MAX_VALUE)&&(__CLR4_5_279d79dlvlulhrw.R.iget(9412)!=0|true))||(__CLR4_5_279d79dlvlulhrw.R.iget(9413)==0&false));
        assert (((toSample <= Integer.MAX_VALUE)&&(__CLR4_5_279d79dlvlulhrw.R.iget(9414)!=0|true))||(__CLR4_5_279d79dlvlulhrw.R.iget(9415)==0&false));
        __CLR4_5_279d79dlvlulhrw.R.inc(9416);this.fromSample = (int) fromSample;
        __CLR4_5_279d79dlvlulhrw.R.inc(9417);this.toSample = (int) toSample;
    }finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_279d79dlvlulhrw.R.inc(9418);
        __CLR4_5_279d79dlvlulhrw.R.inc(9419);origTrack.close();
    }finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}


    public List<Sample> getSamples() {try{__CLR4_5_279d79dlvlulhrw.R.inc(9420);
        __CLR4_5_279d79dlvlulhrw.R.inc(9421);return origTrack.getSamples().subList(fromSample, toSample);
    }finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_279d79dlvlulhrw.R.inc(9422);
        __CLR4_5_279d79dlvlulhrw.R.inc(9423);return origTrack.getSampleDescriptionBox();
    }finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}

    public synchronized long[] getSampleDurations() {try{__CLR4_5_279d79dlvlulhrw.R.inc(9424);
        __CLR4_5_279d79dlvlulhrw.R.inc(9425);long[] decodingTimes = new long[toSample - fromSample];
        __CLR4_5_279d79dlvlulhrw.R.inc(9426);System.arraycopy(origTrack.getSampleDurations(), fromSample, decodingTimes, 0, decodingTimes.length);
        __CLR4_5_279d79dlvlulhrw.R.inc(9427);return decodingTimes;
    }finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}

    static List<TimeToSampleBox.Entry> getDecodingTimeEntries(List<TimeToSampleBox.Entry> origSamples, long fromSample, long toSample) {try{__CLR4_5_279d79dlvlulhrw.R.inc(9428);
        __CLR4_5_279d79dlvlulhrw.R.inc(9429);if ((((origSamples != null && !origSamples.isEmpty())&&(__CLR4_5_279d79dlvlulhrw.R.iget(9430)!=0|true))||(__CLR4_5_279d79dlvlulhrw.R.iget(9431)==0&false))) {{
            __CLR4_5_279d79dlvlulhrw.R.inc(9432);long current = 0;
            __CLR4_5_279d79dlvlulhrw.R.inc(9433);ListIterator<TimeToSampleBox.Entry> e = origSamples.listIterator();
            __CLR4_5_279d79dlvlulhrw.R.inc(9434);LinkedList<TimeToSampleBox.Entry> nuList = new LinkedList<TimeToSampleBox.Entry>();

            // Skip while not yet reached:
            __CLR4_5_279d79dlvlulhrw.R.inc(9435);TimeToSampleBox.Entry currentEntry;
            __CLR4_5_279d79dlvlulhrw.R.inc(9436);while ((currentEntry = e.next()).getCount() + current <= fromSample) {{
                __CLR4_5_279d79dlvlulhrw.R.inc(9439);current += currentEntry.getCount();
            }
            // Take just a bit from the next
            }__CLR4_5_279d79dlvlulhrw.R.inc(9440);if ((((currentEntry.getCount() + current >= toSample)&&(__CLR4_5_279d79dlvlulhrw.R.iget(9441)!=0|true))||(__CLR4_5_279d79dlvlulhrw.R.iget(9442)==0&false))) {{
                __CLR4_5_279d79dlvlulhrw.R.inc(9443);nuList.add(new TimeToSampleBox.Entry(toSample - fromSample, currentEntry.getDelta()));
                __CLR4_5_279d79dlvlulhrw.R.inc(9444);return nuList; // done in one step
            } }else {{
                __CLR4_5_279d79dlvlulhrw.R.inc(9445);nuList.add(new TimeToSampleBox.Entry(currentEntry.getCount() + current - fromSample, currentEntry.getDelta()));
            }
            }__CLR4_5_279d79dlvlulhrw.R.inc(9446);current += currentEntry.getCount();

            __CLR4_5_279d79dlvlulhrw.R.inc(9447);while (e.hasNext() && (currentEntry = e.next()).getCount() + current < toSample) {{
                __CLR4_5_279d79dlvlulhrw.R.inc(9450);nuList.add(currentEntry);
                __CLR4_5_279d79dlvlulhrw.R.inc(9451);current += currentEntry.getCount();
            }

            }__CLR4_5_279d79dlvlulhrw.R.inc(9452);nuList.add(new TimeToSampleBox.Entry(toSample - current, currentEntry.getDelta()));

            __CLR4_5_279d79dlvlulhrw.R.inc(9453);return nuList;
        } }else {{
            __CLR4_5_279d79dlvlulhrw.R.inc(9454);return null;
        }
    }}finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_279d79dlvlulhrw.R.inc(9455);
        __CLR4_5_279d79dlvlulhrw.R.inc(9456);return getCompositionTimeEntries(origTrack.getCompositionTimeEntries(), fromSample, toSample);
    }finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}

    static List<CompositionTimeToSample.Entry> getCompositionTimeEntries(List<CompositionTimeToSample.Entry> origSamples, long fromSample, long toSample) {try{__CLR4_5_279d79dlvlulhrw.R.inc(9457);
        __CLR4_5_279d79dlvlulhrw.R.inc(9458);if ((((origSamples != null && !origSamples.isEmpty())&&(__CLR4_5_279d79dlvlulhrw.R.iget(9459)!=0|true))||(__CLR4_5_279d79dlvlulhrw.R.iget(9460)==0&false))) {{
            __CLR4_5_279d79dlvlulhrw.R.inc(9461);long current = 0;
            __CLR4_5_279d79dlvlulhrw.R.inc(9462);ListIterator<CompositionTimeToSample.Entry> e = origSamples.listIterator();
            __CLR4_5_279d79dlvlulhrw.R.inc(9463);ArrayList<CompositionTimeToSample.Entry> nuList = new ArrayList<CompositionTimeToSample.Entry>();

            // Skip while not yet reached:
            __CLR4_5_279d79dlvlulhrw.R.inc(9464);CompositionTimeToSample.Entry currentEntry;
            __CLR4_5_279d79dlvlulhrw.R.inc(9465);while ((currentEntry = e.next()).getCount() + current <= fromSample) {{
                __CLR4_5_279d79dlvlulhrw.R.inc(9468);current += currentEntry.getCount();
            }
            // Take just a bit from the next
            }__CLR4_5_279d79dlvlulhrw.R.inc(9469);if ((((currentEntry.getCount() + current >= toSample)&&(__CLR4_5_279d79dlvlulhrw.R.iget(9470)!=0|true))||(__CLR4_5_279d79dlvlulhrw.R.iget(9471)==0&false))) {{
                __CLR4_5_279d79dlvlulhrw.R.inc(9472);nuList.add(new CompositionTimeToSample.Entry((int) (toSample - fromSample), currentEntry.getOffset()));
                __CLR4_5_279d79dlvlulhrw.R.inc(9473);return nuList; // done in one step
            } }else {{
                __CLR4_5_279d79dlvlulhrw.R.inc(9474);nuList.add(new CompositionTimeToSample.Entry((int) (currentEntry.getCount() + current - fromSample), currentEntry.getOffset()));
            }
            }__CLR4_5_279d79dlvlulhrw.R.inc(9475);current += currentEntry.getCount();

            __CLR4_5_279d79dlvlulhrw.R.inc(9476);while (e.hasNext() && (currentEntry = e.next()).getCount() + current < toSample) {{
                __CLR4_5_279d79dlvlulhrw.R.inc(9479);nuList.add(currentEntry);
                __CLR4_5_279d79dlvlulhrw.R.inc(9480);current += currentEntry.getCount();
            }

            }__CLR4_5_279d79dlvlulhrw.R.inc(9481);nuList.add(new CompositionTimeToSample.Entry((int) (toSample - current), currentEntry.getOffset()));

            __CLR4_5_279d79dlvlulhrw.R.inc(9482);return nuList;
        } }else {{
            __CLR4_5_279d79dlvlulhrw.R.inc(9483);return null;
        }
    }}finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}

    synchronized public long[] getSyncSamples() {try{__CLR4_5_279d79dlvlulhrw.R.inc(9484);
        __CLR4_5_279d79dlvlulhrw.R.inc(9485);if ((((origTrack.getSyncSamples() != null)&&(__CLR4_5_279d79dlvlulhrw.R.iget(9486)!=0|true))||(__CLR4_5_279d79dlvlulhrw.R.iget(9487)==0&false))) {{
            __CLR4_5_279d79dlvlulhrw.R.inc(9488);long[] origSyncSamples = origTrack.getSyncSamples();
            __CLR4_5_279d79dlvlulhrw.R.inc(9489);int i = 0, j = origSyncSamples.length;
            __CLR4_5_279d79dlvlulhrw.R.inc(9490);while ((((i < origSyncSamples.length && origSyncSamples[i] < fromSample)&&(__CLR4_5_279d79dlvlulhrw.R.iget(9491)!=0|true))||(__CLR4_5_279d79dlvlulhrw.R.iget(9492)==0&false))) {{
                __CLR4_5_279d79dlvlulhrw.R.inc(9493);i++;
            }
            }__CLR4_5_279d79dlvlulhrw.R.inc(9494);while ((((j > 0 && toSample < origSyncSamples[j - 1])&&(__CLR4_5_279d79dlvlulhrw.R.iget(9495)!=0|true))||(__CLR4_5_279d79dlvlulhrw.R.iget(9496)==0&false))) {{
                __CLR4_5_279d79dlvlulhrw.R.inc(9497);j--;
            }
            }__CLR4_5_279d79dlvlulhrw.R.inc(9498);long[] syncSampleArray = new long[j - i];
            __CLR4_5_279d79dlvlulhrw.R.inc(9499);System.arraycopy(origTrack.getSyncSamples(), i, syncSampleArray, 0, j - i);
            __CLR4_5_279d79dlvlulhrw.R.inc(9500);for (int k = 0; (((k < syncSampleArray.length)&&(__CLR4_5_279d79dlvlulhrw.R.iget(9501)!=0|true))||(__CLR4_5_279d79dlvlulhrw.R.iget(9502)==0&false)); k++) {{
                __CLR4_5_279d79dlvlulhrw.R.inc(9503);syncSampleArray[k] -= fromSample;
            }
            }__CLR4_5_279d79dlvlulhrw.R.inc(9504);return syncSampleArray;
        }
        }__CLR4_5_279d79dlvlulhrw.R.inc(9505);return null;
    }finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_279d79dlvlulhrw.R.inc(9506);
        __CLR4_5_279d79dlvlulhrw.R.inc(9507);if ((((origTrack.getSampleDependencies() != null && !origTrack.getSampleDependencies().isEmpty())&&(__CLR4_5_279d79dlvlulhrw.R.iget(9508)!=0|true))||(__CLR4_5_279d79dlvlulhrw.R.iget(9509)==0&false))) {{
            __CLR4_5_279d79dlvlulhrw.R.inc(9510);return origTrack.getSampleDependencies().subList(fromSample, toSample);
        } }else {{
            __CLR4_5_279d79dlvlulhrw.R.inc(9511);return null;
        }
    }}finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_279d79dlvlulhrw.R.inc(9512);
        __CLR4_5_279d79dlvlulhrw.R.inc(9513);return origTrack.getTrackMetaData();
    }finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_279d79dlvlulhrw.R.inc(9514);
        __CLR4_5_279d79dlvlulhrw.R.inc(9515);return origTrack.getHandler();
    }finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_279d79dlvlulhrw.R.inc(9516);
        __CLR4_5_279d79dlvlulhrw.R.inc(9517);return origTrack.getSubsampleInformationBox();
    }finally{__CLR4_5_279d79dlvlulhrw.R.flushNeeded();}}

}
