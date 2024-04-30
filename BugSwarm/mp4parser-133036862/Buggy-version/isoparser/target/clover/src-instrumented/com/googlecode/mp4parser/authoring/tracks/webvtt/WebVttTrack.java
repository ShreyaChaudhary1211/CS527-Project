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

public class WebVttTrack extends AbstractTrack {public static class __CLR4_5_2afpafplvlulj0k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,13676,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

        {try{__CLR4_5_2afpafplvlulj0k.R.inc(13525);
            __CLR4_5_2afpafplvlulj0k.R.inc(13526);VTTEmptyCueBox vttEmptyCueBox = new VTTEmptyCueBox();
            __CLR4_5_2afpafplvlulj0k.R.inc(13527);vtte = ByteBuffer.allocate(l2i(vttEmptyCueBox.getSize()));
            __CLR4_5_2afpafplvlulj0k.R.inc(13528);try {
                __CLR4_5_2afpafplvlulj0k.R.inc(13529);vttEmptyCueBox.getBox(new ByteBufferByteChannel(vtte));
            } catch (IOException e) {
                __CLR4_5_2afpafplvlulj0k.R.inc(13530);throw new RuntimeException(e);
            }
            __CLR4_5_2afpafplvlulj0k.R.inc(13531);vtte.rewind();
        }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}


        public void writeTo(WritableByteChannel channel) throws java.io.IOException {try{__CLR4_5_2afpafplvlulj0k.R.inc(13532);
            __CLR4_5_2afpafplvlulj0k.R.inc(13533);channel.write(vtte.duplicate());
        }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}

        public long getSize() {try{__CLR4_5_2afpafplvlulj0k.R.inc(13534);
            __CLR4_5_2afpafplvlulj0k.R.inc(13535);return vtte.remaining();
        }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}

        public ByteBuffer asByteBuffer() {try{__CLR4_5_2afpafplvlulj0k.R.inc(13536);
            __CLR4_5_2afpafplvlulj0k.R.inc(13537);return vtte.duplicate();
        }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}
    };

    private static class BoxBearingSample implements Sample {
        List<Box> boxes;

        public BoxBearingSample(List<Box> boxes) {try{__CLR4_5_2afpafplvlulj0k.R.inc(13538);
            __CLR4_5_2afpafplvlulj0k.R.inc(13539);this.boxes = boxes;
        }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}

        public void writeTo(WritableByteChannel channel) throws java.io.IOException {try{__CLR4_5_2afpafplvlulj0k.R.inc(13540);
            __CLR4_5_2afpafplvlulj0k.R.inc(13541);for (Box box : boxes) {{
                __CLR4_5_2afpafplvlulj0k.R.inc(13542);box.getBox(channel);
            }
        }}finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}

        public long getSize() {try{__CLR4_5_2afpafplvlulj0k.R.inc(13543);
            __CLR4_5_2afpafplvlulj0k.R.inc(13544);long l = 0;
            __CLR4_5_2afpafplvlulj0k.R.inc(13545);for (Box box : boxes) {{
                __CLR4_5_2afpafplvlulj0k.R.inc(13546);l += box.getSize();
            }
            }__CLR4_5_2afpafplvlulj0k.R.inc(13547);return l;
        }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}

        public ByteBuffer asByteBuffer() {try{__CLR4_5_2afpafplvlulj0k.R.inc(13548);
            __CLR4_5_2afpafplvlulj0k.R.inc(13549);ByteArrayOutputStream baos = new ByteArrayOutputStream();
            __CLR4_5_2afpafplvlulj0k.R.inc(13550);try {
                __CLR4_5_2afpafplvlulj0k.R.inc(13551);writeTo(Channels.newChannel(baos));
            } catch (java.io.IOException e) {
                __CLR4_5_2afpafplvlulj0k.R.inc(13552);throw new RuntimeException(e);
            }

            __CLR4_5_2afpafplvlulj0k.R.inc(13553);return ByteBuffer.wrap(baos.toByteArray());
        }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}
    }

    List<Sample> samples = new ArrayList<Sample>();
    long[] sampleDurations = new long[0];
    WebVTTSampleEntry sampleEntry;


    public WebVttTrack(InputStream is, String trackName, Locale locale) throws IOException {
        super(trackName);__CLR4_5_2afpafplvlulj0k.R.inc(13555);try{__CLR4_5_2afpafplvlulj0k.R.inc(13554);
        __CLR4_5_2afpafplvlulj0k.R.inc(13556);trackMetaData.setTimescale(1000);
        __CLR4_5_2afpafplvlulj0k.R.inc(13557);trackMetaData.setLanguage(locale.getISO3Language());
        __CLR4_5_2afpafplvlulj0k.R.inc(13558);long mediaTimestampUs = 0;

        __CLR4_5_2afpafplvlulj0k.R.inc(13559);stsd = new SampleDescriptionBox();

        __CLR4_5_2afpafplvlulj0k.R.inc(13560);sampleEntry = new WebVTTSampleEntry();
        __CLR4_5_2afpafplvlulj0k.R.inc(13561);stsd.addBox(sampleEntry);
        __CLR4_5_2afpafplvlulj0k.R.inc(13562);WebVTTConfigurationBox webVttConf = new WebVTTConfigurationBox();
        __CLR4_5_2afpafplvlulj0k.R.inc(13563);sampleEntry.addBox(webVttConf);
        __CLR4_5_2afpafplvlulj0k.R.inc(13564);sampleEntry.addBox(new WebVTTSourceLabelBox());

        __CLR4_5_2afpafplvlulj0k.R.inc(13565);BufferedReader webvttData = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        __CLR4_5_2afpafplvlulj0k.R.inc(13566);String line;

        // file should start with "WEBVTT"
        __CLR4_5_2afpafplvlulj0k.R.inc(13567);line = webvttData.readLine();
        __CLR4_5_2afpafplvlulj0k.R.inc(13568);if ((((line == null || !WEBVTT_FILE_HEADER.matcher(line).matches())&&(__CLR4_5_2afpafplvlulj0k.R.iget(13569)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13570)==0&false))) {{
            __CLR4_5_2afpafplvlulj0k.R.inc(13571);throw new IOException("Expected WEBVTT. Got " + line);
        }
        }__CLR4_5_2afpafplvlulj0k.R.inc(13572);webVttConf.setConfig(webVttConf.getConfig() + "\n" + line);
        __CLR4_5_2afpafplvlulj0k.R.inc(13573);while (true) {{
            __CLR4_5_2afpafplvlulj0k.R.inc(13574);line = webvttData.readLine();
            __CLR4_5_2afpafplvlulj0k.R.inc(13575);if ((((line == null)&&(__CLR4_5_2afpafplvlulj0k.R.iget(13576)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13577)==0&false))) {{
                // we reached EOF before finishing the header
                __CLR4_5_2afpafplvlulj0k.R.inc(13578);throw new IOException("Expected an empty line after webvtt header");
            } }else {__CLR4_5_2afpafplvlulj0k.R.inc(13579);if ((((line.isEmpty())&&(__CLR4_5_2afpafplvlulj0k.R.iget(13580)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13581)==0&false))) {{
                // we've read the newline that separates the header from the body
                __CLR4_5_2afpafplvlulj0k.R.inc(13582);break;
            }

            }}__CLR4_5_2afpafplvlulj0k.R.inc(13583);Matcher matcher = WEBVTT_METADATA_HEADER.matcher(line);
            __CLR4_5_2afpafplvlulj0k.R.inc(13584);if ((((!matcher.find())&&(__CLR4_5_2afpafplvlulj0k.R.iget(13585)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13586)==0&false))) {{
                __CLR4_5_2afpafplvlulj0k.R.inc(13587);throw new IOException("Expected WebVTT metadata header. Got " + line);
            }
            }__CLR4_5_2afpafplvlulj0k.R.inc(13588);webVttConf.setConfig(webVttConf.getConfig() + "\n" + line);
        }


        // process the cues and text
        }__CLR4_5_2afpafplvlulj0k.R.inc(13589);while ((line = webvttData.readLine()) != null) {{
            __CLR4_5_2afpafplvlulj0k.R.inc(13592);if (((("".equals(line.trim()))&&(__CLR4_5_2afpafplvlulj0k.R.iget(13593)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13594)==0&false))) {{
                __CLR4_5_2afpafplvlulj0k.R.inc(13595);continue;
            }
            // parse the cue identifier (if present) {
            }__CLR4_5_2afpafplvlulj0k.R.inc(13596);Matcher matcher = WEBVTT_CUE_IDENTIFIER.matcher(line);
            __CLR4_5_2afpafplvlulj0k.R.inc(13597);if ((((matcher.find())&&(__CLR4_5_2afpafplvlulj0k.R.iget(13598)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13599)==0&false))) {{
                // ignore the identifier (we currently don't use it) and read the next line
                __CLR4_5_2afpafplvlulj0k.R.inc(13600);line = webvttData.readLine();
            }

            }__CLR4_5_2afpafplvlulj0k.R.inc(13601);long startTime;
            __CLR4_5_2afpafplvlulj0k.R.inc(13602);long endTime;

            // parse the cue timestamps
            __CLR4_5_2afpafplvlulj0k.R.inc(13603);matcher = WEBVTT_TIMESTAMP.matcher(line);

            // parse start timestamp
            __CLR4_5_2afpafplvlulj0k.R.inc(13604);if ((((!matcher.find())&&(__CLR4_5_2afpafplvlulj0k.R.iget(13605)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13606)==0&false))) {{
                __CLR4_5_2afpafplvlulj0k.R.inc(13607);throw new IOException("Expected cue start time: " + line);
            } }else {{
                __CLR4_5_2afpafplvlulj0k.R.inc(13608);startTime = parseTimestampUs(matcher.group());
            }

            // parse end timestamp
            }__CLR4_5_2afpafplvlulj0k.R.inc(13609);String endTimeString;
            __CLR4_5_2afpafplvlulj0k.R.inc(13610);if ((((!matcher.find())&&(__CLR4_5_2afpafplvlulj0k.R.iget(13611)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13612)==0&false))) {{
                __CLR4_5_2afpafplvlulj0k.R.inc(13613);throw new IOException("Expected cue end time: " + line);
            } }else {{
                __CLR4_5_2afpafplvlulj0k.R.inc(13614);endTimeString = matcher.group();
                __CLR4_5_2afpafplvlulj0k.R.inc(13615);endTime = parseTimestampUs(endTimeString);
            }

            // parse the (optional) cue setting list
            }__CLR4_5_2afpafplvlulj0k.R.inc(13616);line = line.substring(line.indexOf(endTimeString) + endTimeString.length());
            __CLR4_5_2afpafplvlulj0k.R.inc(13617);matcher = WEBVTT_CUE_SETTING.matcher(line);
            __CLR4_5_2afpafplvlulj0k.R.inc(13618);String settings = null;
            __CLR4_5_2afpafplvlulj0k.R.inc(13619);while ((((matcher.find())&&(__CLR4_5_2afpafplvlulj0k.R.iget(13620)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13621)==0&false))) {{
                __CLR4_5_2afpafplvlulj0k.R.inc(13622);settings = matcher.group();
            }
            }__CLR4_5_2afpafplvlulj0k.R.inc(13623);StringBuilder payload = new StringBuilder();
            __CLR4_5_2afpafplvlulj0k.R.inc(13624);while (((line = webvttData.readLine()) != null) && (!line.isEmpty())) {{
                __CLR4_5_2afpafplvlulj0k.R.inc(13627);if ((((payload.length() > 0)&&(__CLR4_5_2afpafplvlulj0k.R.iget(13628)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13629)==0&false))) {{
                    __CLR4_5_2afpafplvlulj0k.R.inc(13630);payload.append("\n");
                }
                }__CLR4_5_2afpafplvlulj0k.R.inc(13631);payload.append(line.trim());
            }

            }__CLR4_5_2afpafplvlulj0k.R.inc(13632);if ((((startTime != mediaTimestampUs)&&(__CLR4_5_2afpafplvlulj0k.R.iget(13633)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13634)==0&false))) {{
                //System.err.println("" + mediaTimestampUs + " - " + startTime + " Add empty sample");
                __CLR4_5_2afpafplvlulj0k.R.inc(13635);sampleDurations = Mp4Arrays.copyOfAndAppend(sampleDurations, startTime - mediaTimestampUs);
                __CLR4_5_2afpafplvlulj0k.R.inc(13636);samples.add(EMPTY_SAMPLE);
            }
            }__CLR4_5_2afpafplvlulj0k.R.inc(13637);sampleDurations = Mp4Arrays.copyOfAndAppend(sampleDurations, endTime - startTime);
            __CLR4_5_2afpafplvlulj0k.R.inc(13638);VTTCueBox vttCueBox = new VTTCueBox();
            __CLR4_5_2afpafplvlulj0k.R.inc(13639);if ((((settings != null)&&(__CLR4_5_2afpafplvlulj0k.R.iget(13640)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13641)==0&false))) {{
                __CLR4_5_2afpafplvlulj0k.R.inc(13642);CueSettingsBox csb = new CueSettingsBox();
                __CLR4_5_2afpafplvlulj0k.R.inc(13643);csb.setContent(settings);
                __CLR4_5_2afpafplvlulj0k.R.inc(13644);vttCueBox.setCueSettingsBox(csb);
            }
            }__CLR4_5_2afpafplvlulj0k.R.inc(13645);CuePayloadBox cuePayloadBox = new CuePayloadBox();
            __CLR4_5_2afpafplvlulj0k.R.inc(13646);cuePayloadBox.setContent(payload.toString());
            __CLR4_5_2afpafplvlulj0k.R.inc(13647);vttCueBox.setCuePayloadBox(cuePayloadBox);

            __CLR4_5_2afpafplvlulj0k.R.inc(13648);samples.add(new BoxBearingSample(Collections.<Box>singletonList(vttCueBox)));


            __CLR4_5_2afpafplvlulj0k.R.inc(13649);mediaTimestampUs = endTime;
            // samples.add();
        }


    }}finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}

    private static long parseTimestampUs(String s) throws NumberFormatException {try{__CLR4_5_2afpafplvlulj0k.R.inc(13650);
        __CLR4_5_2afpafplvlulj0k.R.inc(13651);if ((((!s.matches(WEBVTT_TIMESTAMP_STRING))&&(__CLR4_5_2afpafplvlulj0k.R.iget(13652)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13653)==0&false))) {{
            __CLR4_5_2afpafplvlulj0k.R.inc(13654);throw new NumberFormatException("has invalid format");
        }

        }__CLR4_5_2afpafplvlulj0k.R.inc(13655);String[] parts = s.split("\\.", 2);
        __CLR4_5_2afpafplvlulj0k.R.inc(13656);long value = 0;
        __CLR4_5_2afpafplvlulj0k.R.inc(13657);for (String group : parts[0].split(":")) {{
            __CLR4_5_2afpafplvlulj0k.R.inc(13658);value = value * 60 + Long.parseLong(group);
        }
        }__CLR4_5_2afpafplvlulj0k.R.inc(13659);return (value * 1000 + Long.parseLong(parts[1]));
    }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}


    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_2afpafplvlulj0k.R.inc(13660);
        __CLR4_5_2afpafplvlulj0k.R.inc(13661);return stsd;
    }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}


    public long[] getSampleDurations() {try{__CLR4_5_2afpafplvlulj0k.R.inc(13662);
        __CLR4_5_2afpafplvlulj0k.R.inc(13663);long[] adoptedSampleDuration = new long[sampleDurations.length];
        __CLR4_5_2afpafplvlulj0k.R.inc(13664);for (int i = 0; (((i < adoptedSampleDuration.length)&&(__CLR4_5_2afpafplvlulj0k.R.iget(13665)!=0|true))||(__CLR4_5_2afpafplvlulj0k.R.iget(13666)==0&false)); i++) {{
            __CLR4_5_2afpafplvlulj0k.R.inc(13667);adoptedSampleDuration[i] = sampleDurations[i] * trackMetaData.getTimescale() / 1000;
        }
        }__CLR4_5_2afpafplvlulj0k.R.inc(13668);return adoptedSampleDuration;

    }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_2afpafplvlulj0k.R.inc(13669);
        __CLR4_5_2afpafplvlulj0k.R.inc(13670);return trackMetaData;
    }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_2afpafplvlulj0k.R.inc(13671);
        __CLR4_5_2afpafplvlulj0k.R.inc(13672);return "text";
    }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_2afpafplvlulj0k.R.inc(13673);
        __CLR4_5_2afpafplvlulj0k.R.inc(13674);return samples;
    }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}

    public void close() throws java.io.IOException {try{__CLR4_5_2afpafplvlulj0k.R.inc(13675);

    }finally{__CLR4_5_2afpafplvlulj0k.R.flushNeeded();}}
}
