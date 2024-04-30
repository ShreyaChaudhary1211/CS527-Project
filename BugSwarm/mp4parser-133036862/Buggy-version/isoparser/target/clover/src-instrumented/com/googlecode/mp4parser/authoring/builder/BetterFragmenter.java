/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.Mp4Arrays;

import static java.util.Arrays.binarySearch;

/**
 * Created by sannies on 26.03.2016.
 */
public class BetterFragmenter implements Fragmenter {public static class __CLR4_5_24mj4mjlvluldqn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,6057,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private double targetDuration;

    public BetterFragmenter(double targetDuration) {try{__CLR4_5_24mj4mjlvluldqn.R.inc(5995);
        __CLR4_5_24mj4mjlvluldqn.R.inc(5996);this.targetDuration = targetDuration;
    }finally{__CLR4_5_24mj4mjlvluldqn.R.flushNeeded();}}

    public long[] sampleNumbers(Track track) {try{__CLR4_5_24mj4mjlvluldqn.R.inc(5997);
        __CLR4_5_24mj4mjlvluldqn.R.inc(5998);long ts = track.getTrackMetaData().getTimescale();
        __CLR4_5_24mj4mjlvluldqn.R.inc(5999);long targetTicks = (long) (targetDuration * ts);
        __CLR4_5_24mj4mjlvluldqn.R.inc(6000);long[] fragments = new long[0];
        __CLR4_5_24mj4mjlvluldqn.R.inc(6001);long[] syncSamples = track.getSyncSamples();
        __CLR4_5_24mj4mjlvluldqn.R.inc(6002);long[] durations = track.getSampleDurations();
        __CLR4_5_24mj4mjlvluldqn.R.inc(6003);if ((((syncSamples != null)&&(__CLR4_5_24mj4mjlvluldqn.R.iget(6004)!=0|true))||(__CLR4_5_24mj4mjlvluldqn.R.iget(6005)==0&false))) {{
            __CLR4_5_24mj4mjlvluldqn.R.inc(6006);long[] syncSampleTicks = new long[syncSamples.length];
            __CLR4_5_24mj4mjlvluldqn.R.inc(6007);long ticks = 0;
            __CLR4_5_24mj4mjlvluldqn.R.inc(6008);long duration = track.getDuration();

            __CLR4_5_24mj4mjlvluldqn.R.inc(6009);for (int i = 0; (((i < durations.length)&&(__CLR4_5_24mj4mjlvluldqn.R.iget(6010)!=0|true))||(__CLR4_5_24mj4mjlvluldqn.R.iget(6011)==0&false)); i++) {{
                __CLR4_5_24mj4mjlvluldqn.R.inc(6012);int pos = binarySearch(syncSamples, (long) i + 1);
                __CLR4_5_24mj4mjlvluldqn.R.inc(6013);if ((((pos >= 0)&&(__CLR4_5_24mj4mjlvluldqn.R.iget(6014)!=0|true))||(__CLR4_5_24mj4mjlvluldqn.R.iget(6015)==0&false))) {{
                    __CLR4_5_24mj4mjlvluldqn.R.inc(6016);syncSampleTicks[pos] = ticks;
                }
                }__CLR4_5_24mj4mjlvluldqn.R.inc(6017);ticks += durations[i];
            }
            }__CLR4_5_24mj4mjlvluldqn.R.inc(6018);long nextTargetTick = 0;

            __CLR4_5_24mj4mjlvluldqn.R.inc(6019);for (int currentSyncSampleIndex = 0; (((currentSyncSampleIndex < syncSampleTicks.length - 1)&&(__CLR4_5_24mj4mjlvluldqn.R.iget(6020)!=0|true))||(__CLR4_5_24mj4mjlvluldqn.R.iget(6021)==0&false)); currentSyncSampleIndex++) {{
                __CLR4_5_24mj4mjlvluldqn.R.inc(6022);long tickN1 = syncSampleTicks[currentSyncSampleIndex];
                __CLR4_5_24mj4mjlvluldqn.R.inc(6023);long tickN2 = syncSampleTicks[currentSyncSampleIndex + 1];
                __CLR4_5_24mj4mjlvluldqn.R.inc(6024);if ((((nextTargetTick <= tickN2)&&(__CLR4_5_24mj4mjlvluldqn.R.iget(6025)!=0|true))||(__CLR4_5_24mj4mjlvluldqn.R.iget(6026)==0&false))) {{
                    __CLR4_5_24mj4mjlvluldqn.R.inc(6027);if ((((Math.abs(tickN1 - nextTargetTick) < Math.abs(tickN2 - nextTargetTick))&&(__CLR4_5_24mj4mjlvluldqn.R.iget(6028)!=0|true))||(__CLR4_5_24mj4mjlvluldqn.R.iget(6029)==0&false))) {{
                        __CLR4_5_24mj4mjlvluldqn.R.inc(6030);fragments = Mp4Arrays.copyOfAndAppend(fragments, syncSamples[currentSyncSampleIndex]);
                        __CLR4_5_24mj4mjlvluldqn.R.inc(6031);nextTargetTick = syncSampleTicks[currentSyncSampleIndex] + targetTicks;
                    }
                }}
            }}
            }__CLR4_5_24mj4mjlvluldqn.R.inc(6032);if ((((duration - syncSampleTicks[syncSampleTicks.length - 1] > targetTicks / 2)&&(__CLR4_5_24mj4mjlvluldqn.R.iget(6033)!=0|true))||(__CLR4_5_24mj4mjlvluldqn.R.iget(6034)==0&false))) {{
                __CLR4_5_24mj4mjlvluldqn.R.inc(6035);fragments = Mp4Arrays.copyOfAndAppend(fragments, syncSamples[syncSampleTicks.length - 1]);
            }
        }} }else {{


            __CLR4_5_24mj4mjlvluldqn.R.inc(6036);double time = 0.0D;
            __CLR4_5_24mj4mjlvluldqn.R.inc(6037);fragments = new long[]{1L};
            __CLR4_5_24mj4mjlvluldqn.R.inc(6038);for (int i = 0; (((i < durations.length)&&(__CLR4_5_24mj4mjlvluldqn.R.iget(6039)!=0|true))||(__CLR4_5_24mj4mjlvluldqn.R.iget(6040)==0&false)); ++i) {{
                __CLR4_5_24mj4mjlvluldqn.R.inc(6041);time += (double) durations[i] / (double) ts;
                __CLR4_5_24mj4mjlvluldqn.R.inc(6042);if ((((time >= targetDuration)&&(__CLR4_5_24mj4mjlvluldqn.R.iget(6043)!=0|true))||(__CLR4_5_24mj4mjlvluldqn.R.iget(6044)==0&false))) {{
                    __CLR4_5_24mj4mjlvluldqn.R.inc(6045);if ((((i > 0)&&(__CLR4_5_24mj4mjlvluldqn.R.iget(6046)!=0|true))||(__CLR4_5_24mj4mjlvluldqn.R.iget(6047)==0&false))) {{
                        __CLR4_5_24mj4mjlvluldqn.R.inc(6048);fragments = Mp4Arrays.copyOfAndAppend(fragments, (long) (i + 1));
                    }

                    }__CLR4_5_24mj4mjlvluldqn.R.inc(6049);time = 0.0D;
                }
            }}
            // In case the last Fragment is shorter: make the previous one a bigger and omit the small one
            }__CLR4_5_24mj4mjlvluldqn.R.inc(6050);if ((((time < targetDuration && fragments.length > 1)&&(__CLR4_5_24mj4mjlvluldqn.R.iget(6051)!=0|true))||(__CLR4_5_24mj4mjlvluldqn.R.iget(6052)==0&false))) {{
                __CLR4_5_24mj4mjlvluldqn.R.inc(6053);long[] nuSegmentStartSamples = new long[fragments.length - 1];
                __CLR4_5_24mj4mjlvluldqn.R.inc(6054);System.arraycopy(fragments, 0, nuSegmentStartSamples, 0, fragments.length - 1);
                __CLR4_5_24mj4mjlvluldqn.R.inc(6055);fragments = nuSegmentStartSamples;
            }

        }}
        }__CLR4_5_24mj4mjlvluldqn.R.inc(6056);return fragments;

    }finally{__CLR4_5_24mj4mjlvluldqn.R.flushNeeded();}}
}
