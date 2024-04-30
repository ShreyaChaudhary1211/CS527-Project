/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.webvtt;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CuePayloadBox;
import com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSettingsBox;
import com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.VTTCueBox;
import com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.VTTEmptyCueBox;
import com.googlecode.mp4parser.util.ByteBufferByteChannel;
import com.googlecode.mp4parser.util.Mp4Arrays;
import com.mp4parser.iso14496.part30.WebVTTConfigurationBox;
import com.mp4parser.iso14496.part30.WebVTTSampleEntry;
import com.mp4parser.iso14496.part30.WebVTTSourceLabelBox;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

public class WebVttTrack extends AbstractTrack {public static class __CLR4_5_2ad2ad2lvl9ej14{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,13581,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    TrackMetaData trackMetaData = new TrackMetaData();
    SampleDescriptionBox stsd;

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


    private static final Sample EMPTY_SAMPLE = new Sample() {
        ByteBuffer vtte;

        {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13430);
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13431);VTTEmptyCueBox vttEmptyCueBox = new VTTEmptyCueBox();
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13432);vtte = ByteBuffer.allocate(l2i(vttEmptyCueBox.getSize()));
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13433);try {
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13434);vttEmptyCueBox.getBox(new ByteBufferByteChannel(vtte));
            } catch (IOException e) {
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13435);throw new RuntimeException(e);
            }
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13436);vtte.rewind();
        }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}


        public void writeTo(WritableByteChannel channel) throws java.io.IOException {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13437);
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13438);channel.write(vtte.duplicate());
        }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}

        public long getSize() {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13439);
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13440);return vtte.remaining();
        }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}

        public ByteBuffer asByteBuffer() {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13441);
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13442);return vtte.duplicate();
        }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}
    };

    private static class BoxBearingSample implements Sample {
        List<Box> boxes;

        public BoxBearingSample(List<Box> boxes) {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13443);
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13444);this.boxes = boxes;
        }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}

        public void writeTo(WritableByteChannel channel) throws java.io.IOException {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13445);
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13446);for (Box box : boxes) {{
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13447);box.getBox(channel);
            }
        }}finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}

        public long getSize() {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13448);
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13449);long l = 0;
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13450);for (Box box : boxes) {{
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13451);l += box.getSize();
            }
            }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13452);return l;
        }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}

        public ByteBuffer asByteBuffer() {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13453);
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13454);ByteArrayOutputStream baos = new ByteArrayOutputStream();
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13455);try {
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13456);writeTo(Channels.newChannel(baos));
            } catch (java.io.IOException e) {
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13457);throw new RuntimeException(e);
            }

            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13458);return ByteBuffer.wrap(baos.toByteArray());
        }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}
    }

    List<Sample> samples = new ArrayList<Sample>();
    long[] sampleDurations = new long[0];
    WebVTTSampleEntry sampleEntry;


    public WebVttTrack(InputStream is, String trackName, Locale locale) throws IOException {
        super(trackName);__CLR4_5_2ad2ad2lvl9ej14.R.inc(13460);try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13459);
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13461);trackMetaData.setTimescale(1000);
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13462);trackMetaData.setLanguage(locale.getISO3Language());
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13463);long mediaTimestampUs = 0;

        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13464);stsd = new SampleDescriptionBox();

        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13465);sampleEntry = new WebVTTSampleEntry();
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13466);stsd.addBox(sampleEntry);
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13467);WebVTTConfigurationBox webVttConf = new WebVTTConfigurationBox();
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13468);sampleEntry.addBox(webVttConf);
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13469);sampleEntry.addBox(new WebVTTSourceLabelBox());

        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13470);BufferedReader webvttData = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13471);String line;

        // file should start with "WEBVTT"
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13472);line = webvttData.readLine();
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13473);if ((((line == null || !WEBVTT_FILE_HEADER.matcher(line).matches())&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13474)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13475)==0&false))) {{
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13476);throw new IOException("Expected WEBVTT. Got " + line);
        }
        }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13477);webVttConf.setConfig(webVttConf.getConfig() + "\n" + line);
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13478);while (true) {{
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13479);line = webvttData.readLine();
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13480);if ((((line == null)&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13481)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13482)==0&false))) {{
                // we reached EOF before finishing the header
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13483);throw new IOException("Expected an empty line after webvtt header");
            } }else {__CLR4_5_2ad2ad2lvl9ej14.R.inc(13484);if ((((line.isEmpty())&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13485)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13486)==0&false))) {{
                // we've read the newline that separates the header from the body
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13487);break;
            }

            }}__CLR4_5_2ad2ad2lvl9ej14.R.inc(13488);Matcher matcher = WEBVTT_METADATA_HEADER.matcher(line);
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13489);if ((((!matcher.find())&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13490)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13491)==0&false))) {{
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13492);throw new IOException("Expected WebVTT metadata header. Got " + line);
            }
            }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13493);webVttConf.setConfig(webVttConf.getConfig() + "\n" + line);
        }


        // process the cues and text
        }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13494);while ((line = webvttData.readLine()) != null) {{
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13497);if (((("".equals(line.trim()))&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13498)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13499)==0&false))) {{
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13500);continue;
            }
            // parse the cue identifier (if present) {
            }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13501);Matcher matcher = WEBVTT_CUE_IDENTIFIER.matcher(line);
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13502);if ((((matcher.find())&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13503)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13504)==0&false))) {{
                // ignore the identifier (we currently don't use it) and read the next line
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13505);line = webvttData.readLine();
            }

            }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13506);long startTime;
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13507);long endTime;

            // parse the cue timestamps
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13508);matcher = WEBVTT_TIMESTAMP.matcher(line);

            // parse start timestamp
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13509);if ((((!matcher.find())&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13510)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13511)==0&false))) {{
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13512);throw new IOException("Expected cue start time: " + line);
            } }else {{
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13513);startTime = parseTimestampUs(matcher.group());
            }

            // parse end timestamp
            }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13514);String endTimeString;
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13515);if ((((!matcher.find())&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13516)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13517)==0&false))) {{
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13518);throw new IOException("Expected cue end time: " + line);
            } }else {{
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13519);endTimeString = matcher.group();
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13520);endTime = parseTimestampUs(endTimeString);
            }

            // parse the (optional) cue setting list
            }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13521);line = line.substring(line.indexOf(endTimeString) + endTimeString.length());
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13522);matcher = WEBVTT_CUE_SETTING.matcher(line);
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13523);String settings = null;
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13524);while ((((matcher.find())&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13525)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13526)==0&false))) {{
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13527);settings = matcher.group();
            }
            }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13528);StringBuilder payload = new StringBuilder();
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13529);while (((line = webvttData.readLine()) != null) && (!line.isEmpty())) {{
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13532);if ((((payload.length() > 0)&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13533)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13534)==0&false))) {{
                    __CLR4_5_2ad2ad2lvl9ej14.R.inc(13535);payload.append("\n");
                }
                }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13536);payload.append(line.trim());
            }

            }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13537);if ((((startTime != mediaTimestampUs)&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13538)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13539)==0&false))) {{
                //System.err.println("" + mediaTimestampUs + " - " + startTime + " Add empty sample");
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13540);sampleDurations = Mp4Arrays.copyOfAndAppend(sampleDurations, startTime - mediaTimestampUs);
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13541);samples.add(EMPTY_SAMPLE);
            }
            }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13542);sampleDurations = Mp4Arrays.copyOfAndAppend(sampleDurations, endTime - startTime);
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13543);VTTCueBox vttCueBox = new VTTCueBox();
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13544);if ((((settings != null)&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13545)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13546)==0&false))) {{
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13547);CueSettingsBox csb = new CueSettingsBox();
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13548);csb.setContent(settings);
                __CLR4_5_2ad2ad2lvl9ej14.R.inc(13549);vttCueBox.setCueSettingsBox(csb);
            }
            }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13550);CuePayloadBox cuePayloadBox = new CuePayloadBox();
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13551);cuePayloadBox.setContent(payload.toString());
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13552);vttCueBox.setCuePayloadBox(cuePayloadBox);

            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13553);samples.add(new BoxBearingSample(Collections.<Box>singletonList(vttCueBox)));


            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13554);mediaTimestampUs = endTime;
            // samples.add();
        }


    }}finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}

    private static long parseTimestampUs(String s) throws NumberFormatException {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13555);
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13556);if ((((!s.matches(WEBVTT_TIMESTAMP_STRING))&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13557)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13558)==0&false))) {{
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13559);throw new NumberFormatException("has invalid format");
        }

        }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13560);String[] parts = s.split("\\.", 2);
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13561);long value = 0;
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13562);for (String group : parts[0].split(":")) {{
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13563);value = value * 60 + Long.parseLong(group);
        }
        }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13564);return (value * 1000 + Long.parseLong(parts[1]));
    }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}


    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13565);
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13566);return stsd;
    }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}


    public long[] getSampleDurations() {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13567);
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13568);long[] adoptedSampleDuration = new long[sampleDurations.length];
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13569);for (int i = 0; (((i < adoptedSampleDuration.length)&&(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13570)!=0|true))||(__CLR4_5_2ad2ad2lvl9ej14.R.iget(13571)==0&false)); i++) {{
            __CLR4_5_2ad2ad2lvl9ej14.R.inc(13572);adoptedSampleDuration[i] = sampleDurations[i] * trackMetaData.getTimescale() / 1000;
        }
        }__CLR4_5_2ad2ad2lvl9ej14.R.inc(13573);return adoptedSampleDuration;

    }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13574);
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13575);return trackMetaData;
    }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13576);
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13577);return "text";
    }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13578);
        __CLR4_5_2ad2ad2lvl9ej14.R.inc(13579);return samples;
    }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}

    public void close() throws java.io.IOException {try{__CLR4_5_2ad2ad2lvl9ej14.R.inc(13580);

    }finally{__CLR4_5_2ad2ad2lvl9ej14.R.flushNeeded();}}
}
