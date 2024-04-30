/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import com.googlecode.mp4parser.authoring.tracks.TextTrackImpl;

import java.io.*;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Adds subtitles.
 */
public class SubTitleExample {public static class __CLR4_5_2p3p3lvluo0ik{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448995581L,8589935092L,998,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws IOException {try{__CLR4_5_2p3p3lvluo0ik.R.inc(903);
        __CLR4_5_2p3p3lvluo0ik.R.inc(904);Movie m1 = MovieCreator.build(new FileDataSourceImpl("C:\\dev\\DRMTODAY-872\\Tears_Of_Steel_128000_eng.mp4"));
        __CLR4_5_2p3p3lvluo0ik.R.inc(905);Movie m2 = MovieCreator.build(new FileDataSourceImpl("C:\\dev\\DRMTODAY-872\\Tears_Of_Steel_600000.mp4"));
        //WebVttTrack webVttTrack = new WebVttTrack(new , "subs", Locale.ENGLISH);
        __CLR4_5_2p3p3lvluo0ik.R.inc(906);TextTrackImpl textTrack = new TextTrackImpl();
        __CLR4_5_2p3p3lvluo0ik.R.inc(907);textTrack.getSubs().addAll(
                WebVttParser.parse(new FileInputStream("C:\\dev\\DRMTODAY-872\\Tears_Of_Steel_eng.vtt")));

        __CLR4_5_2p3p3lvluo0ik.R.inc(908);Movie m = new Movie();
        __CLR4_5_2p3p3lvluo0ik.R.inc(909);for (Track track : m2.getTracks()) {{
            __CLR4_5_2p3p3lvluo0ik.R.inc(910);m.addTrack(track);
        }
        }__CLR4_5_2p3p3lvluo0ik.R.inc(911);for (Track track : m1.getTracks()) {{
            __CLR4_5_2p3p3lvluo0ik.R.inc(912);m.addTrack(track);
        }
        }__CLR4_5_2p3p3lvluo0ik.R.inc(913);m.addTrack(textTrack);
        __CLR4_5_2p3p3lvluo0ik.R.inc(914);DefaultMp4Builder builder = new DefaultMp4Builder();
        __CLR4_5_2p3p3lvluo0ik.R.inc(915);builder.setFragmenter(new DefaultFragmenterImpl(2));
        __CLR4_5_2p3p3lvluo0ik.R.inc(916);Container c = builder.build(m);
        __CLR4_5_2p3p3lvluo0ik.R.inc(917);WritableByteChannel wbc = new FileOutputStream("output.mp4").getChannel();
        __CLR4_5_2p3p3lvluo0ik.R.inc(918);c.writeContainer(wbc);
    }finally{__CLR4_5_2p3p3lvluo0ik.R.flushNeeded();}}

    public static class WebVttParser {
        private static final String WEBVTT_FILE_HEADER_STRING = "^\ufeff?WEBVTT((\\u0020|	).*)?$";
        private static final Pattern WEBVTT_FILE_HEADER =
                Pattern.compile(WEBVTT_FILE_HEADER_STRING);

        private static final String WEBVTT_METADATA_HEADER_STRING = "\\S*[:=]\\S*";
        private static final Pattern WEBVTT_METADATA_HEADER =
                Pattern.compile(WEBVTT_METADATA_HEADER_STRING);

        private static final String WEBVTT_CUE_IDENTIFIER_STRING = "^(?!.*(-->)).*$";
        private static final Pattern WEBVTT_CUE_IDENTIFIER =
                Pattern.compile(WEBVTT_CUE_IDENTIFIER_STRING);

        private static final String WEBVTT_TIMESTAMP_STRING = "(\\d+:)?[0-5]\\d:[0-5]\\d\\.\\d{3}";
        private static final Pattern WEBVTT_TIMESTAMP = Pattern.compile(WEBVTT_TIMESTAMP_STRING);

        private static final String WEBVTT_CUE_SETTING_STRING = "\\S*:\\S*";
        private static final Pattern WEBVTT_CUE_SETTING = Pattern.compile(WEBVTT_CUE_SETTING_STRING);

        static List<TextTrackImpl.Line> parse(InputStream in) throws IOException {try{__CLR4_5_2p3p3lvluo0ik.R.inc(919);
            __CLR4_5_2p3p3lvluo0ik.R.inc(920);BufferedReader webvttData = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            __CLR4_5_2p3p3lvluo0ik.R.inc(921);String line;
            __CLR4_5_2p3p3lvluo0ik.R.inc(922);List<TextTrackImpl.Line> samples = new ArrayList<TextTrackImpl.Line>();

            // file should start with "WEBVTT"
            __CLR4_5_2p3p3lvluo0ik.R.inc(923);line = webvttData.readLine();
            __CLR4_5_2p3p3lvluo0ik.R.inc(924);if ((((line == null || !WEBVTT_FILE_HEADER.matcher(line).matches())&&(__CLR4_5_2p3p3lvluo0ik.R.iget(925)!=0|true))||(__CLR4_5_2p3p3lvluo0ik.R.iget(926)==0&false))) {{
                __CLR4_5_2p3p3lvluo0ik.R.inc(927);throw new IOException("Expected WEBVTT. Got " + line);
            }
            }__CLR4_5_2p3p3lvluo0ik.R.inc(928);while (true) {{
                __CLR4_5_2p3p3lvluo0ik.R.inc(929);line = webvttData.readLine();
                __CLR4_5_2p3p3lvluo0ik.R.inc(930);if ((((line == null)&&(__CLR4_5_2p3p3lvluo0ik.R.iget(931)!=0|true))||(__CLR4_5_2p3p3lvluo0ik.R.iget(932)==0&false))) {{
                    // we reached EOF before finishing the header
                    __CLR4_5_2p3p3lvluo0ik.R.inc(933);throw new IOException("Expected an empty line after webvtt header");
                } }else {__CLR4_5_2p3p3lvluo0ik.R.inc(934);if ((((line.isEmpty())&&(__CLR4_5_2p3p3lvluo0ik.R.iget(935)!=0|true))||(__CLR4_5_2p3p3lvluo0ik.R.iget(936)==0&false))) {{
                    // we've read the newline that separates the header from the body
                    __CLR4_5_2p3p3lvluo0ik.R.inc(937);break;
                }

                }}__CLR4_5_2p3p3lvluo0ik.R.inc(938);Matcher matcher = WEBVTT_METADATA_HEADER.matcher(line);
                __CLR4_5_2p3p3lvluo0ik.R.inc(939);if ((((!matcher.find())&&(__CLR4_5_2p3p3lvluo0ik.R.iget(940)!=0|true))||(__CLR4_5_2p3p3lvluo0ik.R.iget(941)==0&false))) {{
                    __CLR4_5_2p3p3lvluo0ik.R.inc(942);throw new IOException("Expected WebVTT metadata header. Got " + line);
                }
            }}


            // process the cues and text
            }__CLR4_5_2p3p3lvluo0ik.R.inc(943);while ((line = webvttData.readLine()) != null) {{
                __CLR4_5_2p3p3lvluo0ik.R.inc(946);if (((("".equals(line.trim()))&&(__CLR4_5_2p3p3lvluo0ik.R.iget(947)!=0|true))||(__CLR4_5_2p3p3lvluo0ik.R.iget(948)==0&false))) {{
                    __CLR4_5_2p3p3lvluo0ik.R.inc(949);continue;
                }
                // parse the cue identifier (if present) {
                }__CLR4_5_2p3p3lvluo0ik.R.inc(950);Matcher matcher = WEBVTT_CUE_IDENTIFIER.matcher(line);
                __CLR4_5_2p3p3lvluo0ik.R.inc(951);if ((((matcher.find())&&(__CLR4_5_2p3p3lvluo0ik.R.iget(952)!=0|true))||(__CLR4_5_2p3p3lvluo0ik.R.iget(953)==0&false))) {{
                    // ignore the identifier (we currently don't use it) and read the next line
                    __CLR4_5_2p3p3lvluo0ik.R.inc(954);line = webvttData.readLine();
                }

                }__CLR4_5_2p3p3lvluo0ik.R.inc(955);long startTime;
                __CLR4_5_2p3p3lvluo0ik.R.inc(956);long endTime;

                // parse the cue timestamps
                __CLR4_5_2p3p3lvluo0ik.R.inc(957);matcher = WEBVTT_TIMESTAMP.matcher(line);

                // parse start timestamp
                __CLR4_5_2p3p3lvluo0ik.R.inc(958);if ((((!matcher.find())&&(__CLR4_5_2p3p3lvluo0ik.R.iget(959)!=0|true))||(__CLR4_5_2p3p3lvluo0ik.R.iget(960)==0&false))) {{
                    __CLR4_5_2p3p3lvluo0ik.R.inc(961);throw new IOException("Expected cue start time: " + line);
                } }else {{
                    __CLR4_5_2p3p3lvluo0ik.R.inc(962);startTime = parseTimestampUs(matcher.group());
                }

                // parse end timestamp
                }__CLR4_5_2p3p3lvluo0ik.R.inc(963);String endTimeString;
                __CLR4_5_2p3p3lvluo0ik.R.inc(964);if ((((!matcher.find())&&(__CLR4_5_2p3p3lvluo0ik.R.iget(965)!=0|true))||(__CLR4_5_2p3p3lvluo0ik.R.iget(966)==0&false))) {{
                    __CLR4_5_2p3p3lvluo0ik.R.inc(967);throw new IOException("Expected cue end time: " + line);
                } }else {{
                    __CLR4_5_2p3p3lvluo0ik.R.inc(968);endTimeString = matcher.group();
                    __CLR4_5_2p3p3lvluo0ik.R.inc(969);endTime = parseTimestampUs(endTimeString);
                }

                // parse the (optional) cue setting list
                }__CLR4_5_2p3p3lvluo0ik.R.inc(970);line = line.substring(line.indexOf(endTimeString) + endTimeString.length());
                __CLR4_5_2p3p3lvluo0ik.R.inc(971);matcher = WEBVTT_CUE_SETTING.matcher(line);
                __CLR4_5_2p3p3lvluo0ik.R.inc(972);String settings = null;
                __CLR4_5_2p3p3lvluo0ik.R.inc(973);while ((((matcher.find())&&(__CLR4_5_2p3p3lvluo0ik.R.iget(974)!=0|true))||(__CLR4_5_2p3p3lvluo0ik.R.iget(975)==0&false))) {{
                    __CLR4_5_2p3p3lvluo0ik.R.inc(976);settings = matcher.group();
                }
                }__CLR4_5_2p3p3lvluo0ik.R.inc(977);StringBuilder payload = new StringBuilder();
                __CLR4_5_2p3p3lvluo0ik.R.inc(978);while (((line = webvttData.readLine()) != null) && (!line.isEmpty())) {{
                    __CLR4_5_2p3p3lvluo0ik.R.inc(981);if ((((payload.length() > 0)&&(__CLR4_5_2p3p3lvluo0ik.R.iget(982)!=0|true))||(__CLR4_5_2p3p3lvluo0ik.R.iget(983)==0&false))) {{
                        __CLR4_5_2p3p3lvluo0ik.R.inc(984);payload.append("\n");
                    }
                    }__CLR4_5_2p3p3lvluo0ik.R.inc(985);payload.append(line.trim());
                }


                }__CLR4_5_2p3p3lvluo0ik.R.inc(986);samples.add(new TextTrackImpl.Line(startTime, endTime, payload.toString()));
            }
            }__CLR4_5_2p3p3lvluo0ik.R.inc(987);return samples;
        }finally{__CLR4_5_2p3p3lvluo0ik.R.flushNeeded();}}

        private static long parseTimestampUs(String s) throws NumberFormatException {try{__CLR4_5_2p3p3lvluo0ik.R.inc(988);
            __CLR4_5_2p3p3lvluo0ik.R.inc(989);if ((((!s.matches(WEBVTT_TIMESTAMP_STRING))&&(__CLR4_5_2p3p3lvluo0ik.R.iget(990)!=0|true))||(__CLR4_5_2p3p3lvluo0ik.R.iget(991)==0&false))) {{
                __CLR4_5_2p3p3lvluo0ik.R.inc(992);throw new NumberFormatException("has invalid format");
            }

            }__CLR4_5_2p3p3lvluo0ik.R.inc(993);String[] parts = s.split("\\.", 2);
            __CLR4_5_2p3p3lvluo0ik.R.inc(994);long value = 0;
            __CLR4_5_2p3p3lvluo0ik.R.inc(995);for (String group : parts[0].split(":")) {{
                __CLR4_5_2p3p3lvluo0ik.R.inc(996);value = value * 60 + Long.parseLong(group);
            }
            }__CLR4_5_2p3p3lvluo0ik.R.inc(997);return (value * 1000 + Long.parseLong(parts[1]));
        }finally{__CLR4_5_2p3p3lvluo0ik.R.flushNeeded();}}
    }

}
