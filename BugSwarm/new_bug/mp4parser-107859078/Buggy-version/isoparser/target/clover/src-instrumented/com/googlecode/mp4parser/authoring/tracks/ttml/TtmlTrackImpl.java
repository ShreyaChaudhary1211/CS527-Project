/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.ttml;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.*;

import static com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.*;

public class TtmlTrackImpl extends AbstractTrack {public static class __CLR4_5_2a7va7vlvl9eizt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,13430,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    TrackMetaData trackMetaData = new TrackMetaData();
    SampleDescriptionBox sampleDescriptionBox = new SampleDescriptionBox();
    XMLSubtitleSampleEntry xmlSubtitleSampleEntry = new XMLSubtitleSampleEntry();

    List<Sample> samples = new ArrayList<Sample>();
    SubSampleInformationBox subSampleInformationBox = new SubSampleInformationBox();


    private long[] sampleDurations;


    public TtmlTrackImpl(String name, List<Document> ttmls) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException, URISyntaxException {
        super(name);__CLR4_5_2a7va7vlvl9eizt.R.inc(13244);try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13243);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13245);extractLanguage(ttmls);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13246);Set<String> mimeTypes = new HashSet<String>();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13247);sampleDurations = new long[ttmls.size()];
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13248);XPathFactory xPathfactory = XPathFactory.newInstance();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13249);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13250);xpath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13251);long startTime = 0;

        __CLR4_5_2a7va7vlvl9eizt.R.inc(13252);for (int sampleNo = 0; (((sampleNo < ttmls.size())&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13253)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13254)==0&false)); sampleNo++) {{
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13255);final Document ttml = ttmls.get(sampleNo);
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13256);SubSampleInformationBox.SubSampleEntry subSampleEntry = new SubSampleInformationBox.SubSampleEntry();
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13257);subSampleInformationBox.getEntries().add(subSampleEntry);
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13258);subSampleEntry.setSampleDelta(1);
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13259);sampleDurations[sampleNo] = extractDuration(ttml);

            __CLR4_5_2a7va7vlvl9eizt.R.inc(13260);List<byte[]> images = extractImages(ttml);
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13261);mimeTypes.addAll(extractMimeTypes(ttml));

            // No changes of XML after this point!
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13262);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13263);TtmlHelpers.pretty(ttml, baos, 4);
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13264);SubSampleInformationBox.SubSampleEntry.SubsampleEntry xmlEntry =
                    new SubSampleInformationBox.SubSampleEntry.SubsampleEntry();
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13265);xmlEntry.setSubsampleSize(baos.size());

            __CLR4_5_2a7va7vlvl9eizt.R.inc(13266);subSampleEntry.getSubsampleEntries().add(xmlEntry);
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13267);for (byte[] image : images) {{
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13268);baos.write(image);
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13269);SubSampleInformationBox.SubSampleEntry.SubsampleEntry imageEntry =
                        new SubSampleInformationBox.SubSampleEntry.SubsampleEntry();
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13270);imageEntry.setSubsampleSize(image.length);
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13271);subSampleEntry.getSubsampleEntries().add(imageEntry);

            }

            }__CLR4_5_2a7va7vlvl9eizt.R.inc(13272);final byte[] finalSample = baos.toByteArray();
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13273);samples.add(new Sample() {
                public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13274);
                    __CLR4_5_2a7va7vlvl9eizt.R.inc(13275);channel.write(ByteBuffer.wrap(finalSample));
                }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

                public long getSize() {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13276);
                    __CLR4_5_2a7va7vlvl9eizt.R.inc(13277);return finalSample.length;
                }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

                public ByteBuffer asByteBuffer() {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13278);
                    __CLR4_5_2a7va7vlvl9eizt.R.inc(13279);return ByteBuffer.wrap(finalSample);
                }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}
            });
        }


        }__CLR4_5_2a7va7vlvl9eizt.R.inc(13280);xmlSubtitleSampleEntry.setNamespace(join(",", getAllNamespaces(ttmls.get(0))));
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13281);xmlSubtitleSampleEntry.setSchemaLocation("");
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13282);xmlSubtitleSampleEntry.setAuxiliaryMimeTypes(join(",", new ArrayList<String>(mimeTypes).toArray(new String[mimeTypes.size()])));
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13283);sampleDescriptionBox.addBox(xmlSubtitleSampleEntry);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13284);trackMetaData.setTimescale(30000);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13285);trackMetaData.setLayer(65535);


    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    public static String getLanguage(Document document) {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13286);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13287);return document.getDocumentElement().getAttribute("xml:lang");
    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    protected static List<byte[]> extractImages(Document ttml) throws XPathExpressionException, URISyntaxException, IOException {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13288);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13289);XPathFactory xPathfactory = XPathFactory.newInstance();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13290);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13291);XPathExpression expr = xpath.compile("//*/@backgroundImage");
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13292);NodeList nl = (NodeList) expr.evaluate(ttml, XPathConstants.NODESET);

        __CLR4_5_2a7va7vlvl9eizt.R.inc(13293);LinkedHashMap<String, String> internalNames2Original = new LinkedHashMap<String, String>();

        __CLR4_5_2a7va7vlvl9eizt.R.inc(13294);int p = 1;
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13295);for (int i = 0; (((i < nl.getLength())&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13296)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13297)==0&false)); i++) {{
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13298);Node bgImageNode = nl.item(i);
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13299);String uri = bgImageNode.getNodeValue();
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13300);String ext = uri.substring(uri.lastIndexOf("."));

            __CLR4_5_2a7va7vlvl9eizt.R.inc(13301);String internalName = internalNames2Original.get(uri);
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13302);if ((((internalName == null)&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13303)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13304)==0&false))) {{
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13305);internalName = "urn:mp4parser:" + p++ + ext;
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13306);internalNames2Original.put(internalName, uri);
            }
            }__CLR4_5_2a7va7vlvl9eizt.R.inc(13307);bgImageNode.setNodeValue(internalName);

        }
        }__CLR4_5_2a7va7vlvl9eizt.R.inc(13308);List<byte[]> images = new ArrayList<byte[]>();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13309);if ((((!internalNames2Original.isEmpty())&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13310)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13311)==0&false))) {{
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13312);for (Map.Entry<String, String> internalName2Original : internalNames2Original.entrySet()) {{

                __CLR4_5_2a7va7vlvl9eizt.R.inc(13313);URI pic = new URI(ttml.getDocumentURI()).resolve(internalName2Original.getValue());
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13314);images.add(streamToByteArray(pic.toURL().openStream()));

            }
        }}
        }__CLR4_5_2a7va7vlvl9eizt.R.inc(13315);return images;
    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    private static String join(String joiner, String[] i) {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13316);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13317);StringBuilder result = new StringBuilder();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13318);for (String s : i) {{
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13319);result.append(s).append(joiner);
        }
        }__CLR4_5_2a7va7vlvl9eizt.R.inc(13320);result.setLength((((result.length() > 0 )&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13321)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13322)==0&false))? result.length() - 1 : 0);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13323);return result.toString();
    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    private static long latestTimestamp(Document document) {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13324);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13325);XPathFactory xPathfactory = XPathFactory.newInstance();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13326);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13327);xpath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);

        __CLR4_5_2a7va7vlvl9eizt.R.inc(13328);try {
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13329);XPathExpression xp = xpath.compile("//*[name()='p']");
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13330);NodeList timedNodes = (NodeList) xp.evaluate(document, XPathConstants.NODESET);
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13331);long lastTimeStamp = 0;
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13332);for (int i = 0; (((i < timedNodes.getLength())&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13333)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13334)==0&false)); i++) {{
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13335);lastTimeStamp = Math.max(getEndTime(timedNodes.item(i)), lastTimeStamp);
            }
            }__CLR4_5_2a7va7vlvl9eizt.R.inc(13336);return lastTimeStamp;
        } catch (XPathExpressionException e) {
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13337);throw new RuntimeException(e);
        }

    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    private static byte[] streamToByteArray(InputStream input) throws IOException {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13338);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13339);byte[] buffer = new byte[8096];
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13340);ByteArrayOutputStream output = new ByteArrayOutputStream();

        __CLR4_5_2a7va7vlvl9eizt.R.inc(13341);int n = 0;
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13342);while (-1 != (n = input.read(buffer))) {{
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13345);output.write(buffer, 0, n);
        }
        }__CLR4_5_2a7va7vlvl9eizt.R.inc(13346);return output.toByteArray();
    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    protected long firstTimestamp(Document document) {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13347);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13348);XPathFactory xPathfactory = XPathFactory.newInstance();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13349);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13350);xpath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);

        __CLR4_5_2a7va7vlvl9eizt.R.inc(13351);try {
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13352);XPathExpression xp = xpath.compile("//*[@begin]");
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13353);NodeList timedNodes = (NodeList) xp.evaluate(document, XPathConstants.NODESET);

            __CLR4_5_2a7va7vlvl9eizt.R.inc(13354);long firstTimestamp = Long.MAX_VALUE;
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13355);for (int i = 0; (((i < timedNodes.getLength())&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13356)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13357)==0&false)); i++) {{
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13358);firstTimestamp = Math.min(getStartTime(timedNodes.item(i)), firstTimestamp);
            }
            }__CLR4_5_2a7va7vlvl9eizt.R.inc(13359);return firstTimestamp;
        } catch (XPathExpressionException e) {
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13360);throw new RuntimeException(e);
        }

    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    protected long lastTimestamp(Document document) {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13361);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13362);XPathFactory xPathfactory = XPathFactory.newInstance();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13363);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13364);xpath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);

        __CLR4_5_2a7va7vlvl9eizt.R.inc(13365);try {
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13366);XPathExpression xp = xpath.compile("//*[@end]");
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13367);NodeList timedNodes = (NodeList) xp.evaluate(document, XPathConstants.NODESET);

            __CLR4_5_2a7va7vlvl9eizt.R.inc(13368);long lastTimeStamp = 0;
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13369);for (int i = 0; (((i < timedNodes.getLength())&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13370)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13371)==0&false)); i++) {{
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13372);lastTimeStamp = Math.max(getEndTime(timedNodes.item(i)), lastTimeStamp);
            }
            }__CLR4_5_2a7va7vlvl9eizt.R.inc(13373);return lastTimeStamp;
        } catch (XPathExpressionException e) {
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13374);throw new RuntimeException(e);
        }

    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    protected void extractLanguage(List<Document> ttmls) {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13375);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13376);String firstLang = null;
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13377);for (Document ttml : ttmls) {{

            __CLR4_5_2a7va7vlvl9eizt.R.inc(13378);String lang = getLanguage(ttml);
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13379);if ((((firstLang == null)&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13380)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13381)==0&false))) {{
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13382);firstLang = lang;
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13383);trackMetaData.setLanguage(Locale.forLanguageTag(lang).getISO3Language());
            } }else {__CLR4_5_2a7va7vlvl9eizt.R.inc(13384);if ((((!firstLang.equals(lang))&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13385)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13386)==0&false))) {{
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13387);throw new RuntimeException("Within one Track all sample documents need to have the same language");
            }

        }}}
    }}finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    protected List<String> extractMimeTypes(Document ttml) throws XPathExpressionException {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13388);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13389);XPathFactory xPathfactory = XPathFactory.newInstance();

        __CLR4_5_2a7va7vlvl9eizt.R.inc(13390);XPath xpath = xPathfactory.newXPath();

        __CLR4_5_2a7va7vlvl9eizt.R.inc(13391);XPathExpression expr = xpath.compile("//*/@smpte:backgroundImage");
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13392);NodeList nl = (NodeList) expr.evaluate(ttml, XPathConstants.NODESET);

        __CLR4_5_2a7va7vlvl9eizt.R.inc(13393);Set<String> mimeTypes = new LinkedHashSet<String>();

        __CLR4_5_2a7va7vlvl9eizt.R.inc(13394);int p = 1;
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13395);for (int i = 0; (((i < nl.getLength())&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13396)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13397)==0&false)); i++) {{
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13398);Node bgImageNode = nl.item(i);
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13399);String uri = bgImageNode.getNodeValue();
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13400);String ext = uri.substring(uri.lastIndexOf("."));
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13401);if ((((ext.contains("jpg") || ext.contains("jpeg"))&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13402)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13403)==0&false))) {{
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13404);mimeTypes.add("image/jpeg");
            } }else {__CLR4_5_2a7va7vlvl9eizt.R.inc(13405);if ((((ext.contains("png"))&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13406)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13407)==0&false))) {{
                __CLR4_5_2a7va7vlvl9eizt.R.inc(13408);mimeTypes.add("image/png");
            }
        }}}
        }__CLR4_5_2a7va7vlvl9eizt.R.inc(13409);return new ArrayList<String>(mimeTypes);
    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    long extractDuration(Document ttml) {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13410);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13411);return lastTimestamp(ttml) - firstTimestamp(ttml);
    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13412);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13413);return sampleDescriptionBox;
    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}


    public long[] getSampleDurations() {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13414);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13415);long[] adoptedSampleDuration = new long[sampleDurations.length];
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13416);for (int i = 0; (((i < adoptedSampleDuration.length)&&(__CLR4_5_2a7va7vlvl9eizt.R.iget(13417)!=0|true))||(__CLR4_5_2a7va7vlvl9eizt.R.iget(13418)==0&false)); i++) {{
            __CLR4_5_2a7va7vlvl9eizt.R.inc(13419);adoptedSampleDuration[i] = sampleDurations[i] * trackMetaData.getTimescale() / 1000;
        }
        }__CLR4_5_2a7va7vlvl9eizt.R.inc(13420);return adoptedSampleDuration;

    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13421);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13422);return trackMetaData;
    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13423);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13424);return "subt";
    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13425);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13426);return samples;
    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    @Override
    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13427);
        __CLR4_5_2a7va7vlvl9eizt.R.inc(13428);return subSampleInformationBox;

    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_2a7va7vlvl9eizt.R.inc(13429);

    }finally{__CLR4_5_2a7va7vlvl9eizt.R.flushNeeded();}}
}
