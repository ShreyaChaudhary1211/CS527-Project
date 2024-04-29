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
public class ServeMp4 extends AbstractHandler {public static class __CLR4_5_2gvgvlvl9g0re{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,685,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Movie movie;

    public static void main(String[] args) throws Exception {try{__CLR4_5_2gvgvlvl9g0re.R.inc(607);
        __CLR4_5_2gvgvlvl9g0re.R.inc(608);Movie movie = MovieCreator.build("/home/sannies/CSI.S13E02.HDTV.x264-LOL.mp4");


        __CLR4_5_2gvgvlvl9g0re.R.inc(609);Server server = new Server(8080);
        __CLR4_5_2gvgvlvl9g0re.R.inc(610);server.setHandler(new ServeMp4(movie));
        __CLR4_5_2gvgvlvl9g0re.R.inc(611);server.start();
        __CLR4_5_2gvgvlvl9g0re.R.inc(612);server.join();
    }finally{__CLR4_5_2gvgvlvl9g0re.R.flushNeeded();}}

    public ServeMp4(Movie movie) {try{__CLR4_5_2gvgvlvl9g0re.R.inc(613);
        __CLR4_5_2gvgvlvl9g0re.R.inc(614);this.movie = movie;
    }finally{__CLR4_5_2gvgvlvl9g0re.R.flushNeeded();}}

    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {try{__CLR4_5_2gvgvlvl9g0re.R.inc(615);
        __CLR4_5_2gvgvlvl9g0re.R.inc(616);String start = request.getParameter("start");
        __CLR4_5_2gvgvlvl9g0re.R.inc(617);List<Track> tracks = movie.getTracks();
        __CLR4_5_2gvgvlvl9g0re.R.inc(618);movie.setTracks(new LinkedList<Track>());
        // remove all tracks we will create new tracks from the old

        __CLR4_5_2gvgvlvl9g0re.R.inc(619);double startTime = Double.parseDouble(start);
        __CLR4_5_2gvgvlvl9g0re.R.inc(620);double endTime = (double) tracks.get(0).getDuration() / tracks.get(0).getTrackMetaData().getTimescale();

        __CLR4_5_2gvgvlvl9g0re.R.inc(621);boolean timeCorrected = false;

        // Here we try to find a track that has sync samples. Since we can only start decoding
        // at such a sample we SHOULD make sure that the start of the new fragment is exactly
        // such a frame
        __CLR4_5_2gvgvlvl9g0re.R.inc(622);for (Track track : tracks) {{
            __CLR4_5_2gvgvlvl9g0re.R.inc(623);if ((((track.getSyncSamples() != null && track.getSyncSamples().length > 0)&&(__CLR4_5_2gvgvlvl9g0re.R.iget(624)!=0|true))||(__CLR4_5_2gvgvlvl9g0re.R.iget(625)==0&false))) {{
                __CLR4_5_2gvgvlvl9g0re.R.inc(626);if ((((timeCorrected)&&(__CLR4_5_2gvgvlvl9g0re.R.iget(627)!=0|true))||(__CLR4_5_2gvgvlvl9g0re.R.iget(628)==0&false))) {{
                    // This exception here could be a false positive in case we have multiple tracks
                    // with sync samples at exactly the same positions. E.g. a single movie containing
                    // multiple qualities of the same video (Microsoft Smooth Streaming file)

                    __CLR4_5_2gvgvlvl9g0re.R.inc(629);throw new RuntimeException("The startTime has already been corrected by another track with SyncSample. Not Supported.");
                }
                }__CLR4_5_2gvgvlvl9g0re.R.inc(630);startTime = correctTimeToSyncSample(track, startTime, false);
                __CLR4_5_2gvgvlvl9g0re.R.inc(631);endTime = correctTimeToSyncSample(track, endTime, true);
                __CLR4_5_2gvgvlvl9g0re.R.inc(632);timeCorrected = true;
            }
        }}

        }__CLR4_5_2gvgvlvl9g0re.R.inc(633);for (Track track : tracks) {{
            __CLR4_5_2gvgvlvl9g0re.R.inc(634);long currentSample = 0;
            __CLR4_5_2gvgvlvl9g0re.R.inc(635);double currentTime = 0;
            __CLR4_5_2gvgvlvl9g0re.R.inc(636);long startSample = -1;
            __CLR4_5_2gvgvlvl9g0re.R.inc(637);long endSample = -1;

            __CLR4_5_2gvgvlvl9g0re.R.inc(638);for (int i = 0; (((i < track.getSampleDurations().length)&&(__CLR4_5_2gvgvlvl9g0re.R.iget(639)!=0|true))||(__CLR4_5_2gvgvlvl9g0re.R.iget(640)==0&false)); i++) {{
                __CLR4_5_2gvgvlvl9g0re.R.inc(641);long delta = track.getSampleDurations()[i];

                __CLR4_5_2gvgvlvl9g0re.R.inc(642);if ((((currentTime <= startTime)&&(__CLR4_5_2gvgvlvl9g0re.R.iget(643)!=0|true))||(__CLR4_5_2gvgvlvl9g0re.R.iget(644)==0&false))) {{
                    // current sample is still before the new starttime
                    __CLR4_5_2gvgvlvl9g0re.R.inc(645);startSample = currentSample;
                }
                }__CLR4_5_2gvgvlvl9g0re.R.inc(646);if ((((currentTime <= endTime)&&(__CLR4_5_2gvgvlvl9g0re.R.iget(647)!=0|true))||(__CLR4_5_2gvgvlvl9g0re.R.iget(648)==0&false))) {{
                    // current sample is after the new start time and still before the new endtime
                    __CLR4_5_2gvgvlvl9g0re.R.inc(649);endSample = currentSample;
                } }else {{
                    // current sample is after the end of the cropped video
                    __CLR4_5_2gvgvlvl9g0re.R.inc(650);break;
                }
                }__CLR4_5_2gvgvlvl9g0re.R.inc(651);currentTime += (double) delta / (double) track.getTrackMetaData().getTimescale();
                __CLR4_5_2gvgvlvl9g0re.R.inc(652);currentSample++;
            }
            }__CLR4_5_2gvgvlvl9g0re.R.inc(653);movie.addTrack(new CroppedTrack(track, startSample, endSample));
        }

        }__CLR4_5_2gvgvlvl9g0re.R.inc(654);Container out = new DefaultMp4Builder().build(movie);
        __CLR4_5_2gvgvlvl9g0re.R.inc(655);response.setHeader("content-type", "video/mp4");
        __CLR4_5_2gvgvlvl9g0re.R.inc(656);WritableByteChannel reponse = Channels.newChannel(response.getOutputStream());
        __CLR4_5_2gvgvlvl9g0re.R.inc(657);out.writeContainer(reponse);
        __CLR4_5_2gvgvlvl9g0re.R.inc(658);reponse.close();


    }finally{__CLR4_5_2gvgvlvl9g0re.R.flushNeeded();}}

    private static double correctTimeToSyncSample(Track track, double cutHere, boolean next) {try{__CLR4_5_2gvgvlvl9g0re.R.inc(659);
        __CLR4_5_2gvgvlvl9g0re.R.inc(660);double[] timeOfSyncSamples = new double[track.getSyncSamples().length];
        __CLR4_5_2gvgvlvl9g0re.R.inc(661);long currentSample = 0;
        __CLR4_5_2gvgvlvl9g0re.R.inc(662);double currentTime = 0;
        __CLR4_5_2gvgvlvl9g0re.R.inc(663);for (int i = 0; (((i < track.getSampleDurations().length)&&(__CLR4_5_2gvgvlvl9g0re.R.iget(664)!=0|true))||(__CLR4_5_2gvgvlvl9g0re.R.iget(665)==0&false)); i++) {{
            __CLR4_5_2gvgvlvl9g0re.R.inc(666);long delta = track.getSampleDurations()[i];
            __CLR4_5_2gvgvlvl9g0re.R.inc(667);if ((((Arrays.binarySearch(track.getSyncSamples(), currentSample + 1) >= 0)&&(__CLR4_5_2gvgvlvl9g0re.R.iget(668)!=0|true))||(__CLR4_5_2gvgvlvl9g0re.R.iget(669)==0&false))) {{
                // samples always start with 1 but we start with zero therefore +1
                __CLR4_5_2gvgvlvl9g0re.R.inc(670);timeOfSyncSamples[Arrays.binarySearch(track.getSyncSamples(), currentSample + 1)] = currentTime;
            }
            }__CLR4_5_2gvgvlvl9g0re.R.inc(671);currentTime += (double) delta / (double) track.getTrackMetaData().getTimescale();
            __CLR4_5_2gvgvlvl9g0re.R.inc(672);currentSample++;
        }
        }__CLR4_5_2gvgvlvl9g0re.R.inc(673);double previous = 0;
        __CLR4_5_2gvgvlvl9g0re.R.inc(674);for (double timeOfSyncSample : timeOfSyncSamples) {{
            __CLR4_5_2gvgvlvl9g0re.R.inc(675);if ((((timeOfSyncSample > cutHere)&&(__CLR4_5_2gvgvlvl9g0re.R.iget(676)!=0|true))||(__CLR4_5_2gvgvlvl9g0re.R.iget(677)==0&false))) {{
                __CLR4_5_2gvgvlvl9g0re.R.inc(678);if ((((next)&&(__CLR4_5_2gvgvlvl9g0re.R.iget(679)!=0|true))||(__CLR4_5_2gvgvlvl9g0re.R.iget(680)==0&false))) {{
                    __CLR4_5_2gvgvlvl9g0re.R.inc(681);return timeOfSyncSample;
                } }else {{
                    __CLR4_5_2gvgvlvl9g0re.R.inc(682);return previous;
                }
            }}
            }__CLR4_5_2gvgvlvl9g0re.R.inc(683);previous = timeOfSyncSample;
        }
        }__CLR4_5_2gvgvlvl9g0re.R.inc(684);return timeOfSyncSamples[timeOfSyncSamples.length - 1];
    }finally{__CLR4_5_2gvgvlvl9g0re.R.flushNeeded();}}

}
