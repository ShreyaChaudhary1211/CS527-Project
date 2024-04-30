/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import com.googlecode.mp4parser.authoring.tracks.CroppedTrack;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sannies
 * Date: 10/28/12
 * Time: 11:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class ServeMp4 extends AbstractHandler {public static class __CLR4_5_2gugulvluo0cj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448995581L,8589935092L,684,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Movie movie;

    public static void main(String[] args) throws Exception {try{__CLR4_5_2gugulvluo0cj.R.inc(606);
        __CLR4_5_2gugulvluo0cj.R.inc(607);Movie movie = MovieCreator.build("/home/sannies/CSI.S13E02.HDTV.x264-LOL.mp4");


        __CLR4_5_2gugulvluo0cj.R.inc(608);Server server = new Server(8080);
        __CLR4_5_2gugulvluo0cj.R.inc(609);server.setHandler(new ServeMp4(movie));
        __CLR4_5_2gugulvluo0cj.R.inc(610);server.start();
        __CLR4_5_2gugulvluo0cj.R.inc(611);server.join();
    }finally{__CLR4_5_2gugulvluo0cj.R.flushNeeded();}}

    public ServeMp4(Movie movie) {try{__CLR4_5_2gugulvluo0cj.R.inc(612);
        __CLR4_5_2gugulvluo0cj.R.inc(613);this.movie = movie;
    }finally{__CLR4_5_2gugulvluo0cj.R.flushNeeded();}}

    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {try{__CLR4_5_2gugulvluo0cj.R.inc(614);
        __CLR4_5_2gugulvluo0cj.R.inc(615);String start = request.getParameter("start");
        __CLR4_5_2gugulvluo0cj.R.inc(616);List<Track> tracks = movie.getTracks();
        __CLR4_5_2gugulvluo0cj.R.inc(617);movie.setTracks(new LinkedList<Track>());
        // remove all tracks we will create new tracks from the old

        __CLR4_5_2gugulvluo0cj.R.inc(618);double startTime = Double.parseDouble(start);
        __CLR4_5_2gugulvluo0cj.R.inc(619);double endTime = (double) tracks.get(0).getDuration() / tracks.get(0).getTrackMetaData().getTimescale();

        __CLR4_5_2gugulvluo0cj.R.inc(620);boolean timeCorrected = false;

        // Here we try to find a track that has sync samples. Since we can only start decoding
        // at such a sample we SHOULD make sure that the start of the new fragment is exactly
        // such a frame
        __CLR4_5_2gugulvluo0cj.R.inc(621);for (Track track : tracks) {{
            __CLR4_5_2gugulvluo0cj.R.inc(622);if ((((track.getSyncSamples() != null && track.getSyncSamples().length > 0)&&(__CLR4_5_2gugulvluo0cj.R.iget(623)!=0|true))||(__CLR4_5_2gugulvluo0cj.R.iget(624)==0&false))) {{
                __CLR4_5_2gugulvluo0cj.R.inc(625);if ((((timeCorrected)&&(__CLR4_5_2gugulvluo0cj.R.iget(626)!=0|true))||(__CLR4_5_2gugulvluo0cj.R.iget(627)==0&false))) {{
                    // This exception here could be a false positive in case we have multiple tracks
                    // with sync samples at exactly the same positions. E.g. a single movie containing
                    // multiple qualities of the same video (Microsoft Smooth Streaming file)

                    __CLR4_5_2gugulvluo0cj.R.inc(628);throw new RuntimeException("The startTime has already been corrected by another track with SyncSample. Not Supported.");
                }
                }__CLR4_5_2gugulvluo0cj.R.inc(629);startTime = correctTimeToSyncSample(track, startTime, false);
                __CLR4_5_2gugulvluo0cj.R.inc(630);endTime = correctTimeToSyncSample(track, endTime, true);
                __CLR4_5_2gugulvluo0cj.R.inc(631);timeCorrected = true;
            }
        }}

        }__CLR4_5_2gugulvluo0cj.R.inc(632);for (Track track : tracks) {{
            __CLR4_5_2gugulvluo0cj.R.inc(633);long currentSample = 0;
            __CLR4_5_2gugulvluo0cj.R.inc(634);double currentTime = 0;
            __CLR4_5_2gugulvluo0cj.R.inc(635);long startSample = -1;
            __CLR4_5_2gugulvluo0cj.R.inc(636);long endSample = -1;

            __CLR4_5_2gugulvluo0cj.R.inc(637);for (int i = 0; (((i < track.getSampleDurations().length)&&(__CLR4_5_2gugulvluo0cj.R.iget(638)!=0|true))||(__CLR4_5_2gugulvluo0cj.R.iget(639)==0&false)); i++) {{
                __CLR4_5_2gugulvluo0cj.R.inc(640);long delta = track.getSampleDurations()[i];

                __CLR4_5_2gugulvluo0cj.R.inc(641);if ((((currentTime <= startTime)&&(__CLR4_5_2gugulvluo0cj.R.iget(642)!=0|true))||(__CLR4_5_2gugulvluo0cj.R.iget(643)==0&false))) {{
                    // current sample is still before the new starttime
                    __CLR4_5_2gugulvluo0cj.R.inc(644);startSample = currentSample;
                }
                }__CLR4_5_2gugulvluo0cj.R.inc(645);if ((((currentTime <= endTime)&&(__CLR4_5_2gugulvluo0cj.R.iget(646)!=0|true))||(__CLR4_5_2gugulvluo0cj.R.iget(647)==0&false))) {{
                    // current sample is after the new start time and still before the new endtime
                    __CLR4_5_2gugulvluo0cj.R.inc(648);endSample = currentSample;
                } }else {{
                    // current sample is after the end of the cropped video
                    __CLR4_5_2gugulvluo0cj.R.inc(649);break;
                }
                }__CLR4_5_2gugulvluo0cj.R.inc(650);currentTime += (double) delta / (double) track.getTrackMetaData().getTimescale();
                __CLR4_5_2gugulvluo0cj.R.inc(651);currentSample++;
            }
            }__CLR4_5_2gugulvluo0cj.R.inc(652);movie.addTrack(new CroppedTrack(track, startSample, endSample));
        }

        }__CLR4_5_2gugulvluo0cj.R.inc(653);Container out = new DefaultMp4Builder().build(movie);
        __CLR4_5_2gugulvluo0cj.R.inc(654);response.setHeader("content-type", "video/mp4");
        __CLR4_5_2gugulvluo0cj.R.inc(655);WritableByteChannel reponse = Channels.newChannel(response.getOutputStream());
        __CLR4_5_2gugulvluo0cj.R.inc(656);out.writeContainer(reponse);
        __CLR4_5_2gugulvluo0cj.R.inc(657);reponse.close();


    }finally{__CLR4_5_2gugulvluo0cj.R.flushNeeded();}}

    private static double correctTimeToSyncSample(Track track, double cutHere, boolean next) {try{__CLR4_5_2gugulvluo0cj.R.inc(658);
        __CLR4_5_2gugulvluo0cj.R.inc(659);double[] timeOfSyncSamples = new double[track.getSyncSamples().length];
        __CLR4_5_2gugulvluo0cj.R.inc(660);long currentSample = 0;
        __CLR4_5_2gugulvluo0cj.R.inc(661);double currentTime = 0;
        __CLR4_5_2gugulvluo0cj.R.inc(662);for (int i = 0; (((i < track.getSampleDurations().length)&&(__CLR4_5_2gugulvluo0cj.R.iget(663)!=0|true))||(__CLR4_5_2gugulvluo0cj.R.iget(664)==0&false)); i++) {{
            __CLR4_5_2gugulvluo0cj.R.inc(665);long delta = track.getSampleDurations()[i];
            __CLR4_5_2gugulvluo0cj.R.inc(666);if ((((Arrays.binarySearch(track.getSyncSamples(), currentSample + 1) >= 0)&&(__CLR4_5_2gugulvluo0cj.R.iget(667)!=0|true))||(__CLR4_5_2gugulvluo0cj.R.iget(668)==0&false))) {{
                // samples always start with 1 but we start with zero therefore +1
                __CLR4_5_2gugulvluo0cj.R.inc(669);timeOfSyncSamples[Arrays.binarySearch(track.getSyncSamples(), currentSample + 1)] = currentTime;
            }
            }__CLR4_5_2gugulvluo0cj.R.inc(670);currentTime += (double) delta / (double) track.getTrackMetaData().getTimescale();
            __CLR4_5_2gugulvluo0cj.R.inc(671);currentSample++;
        }
        }__CLR4_5_2gugulvluo0cj.R.inc(672);double previous = 0;
        __CLR4_5_2gugulvluo0cj.R.inc(673);for (double timeOfSyncSample : timeOfSyncSamples) {{
            __CLR4_5_2gugulvluo0cj.R.inc(674);if ((((timeOfSyncSample > cutHere)&&(__CLR4_5_2gugulvluo0cj.R.iget(675)!=0|true))||(__CLR4_5_2gugulvluo0cj.R.iget(676)==0&false))) {{
                __CLR4_5_2gugulvluo0cj.R.inc(677);if ((((next)&&(__CLR4_5_2gugulvluo0cj.R.iget(678)!=0|true))||(__CLR4_5_2gugulvluo0cj.R.iget(679)==0&false))) {{
                    __CLR4_5_2gugulvluo0cj.R.inc(680);return timeOfSyncSample;
                } }else {{
                    __CLR4_5_2gugulvluo0cj.R.inc(681);return previous;
                }
            }}
            }__CLR4_5_2gugulvluo0cj.R.inc(682);previous = timeOfSyncSample;
        }
        }__CLR4_5_2gugulvluo0cj.R.inc(683);return timeOfSyncSamples[timeOfSyncSamples.length - 1];
    }finally{__CLR4_5_2gugulvluo0cj.R.flushNeeded();}}

}
