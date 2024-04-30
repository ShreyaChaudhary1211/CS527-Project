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

public class TtmlTrackImpl extends AbstractTrack {public static class __CLR4_5_2aaiaailvlulixo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,13525,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    TrackMetaData trackMetaData = new TrackMetaData();
    SampleDescriptionBox sampleDescriptionBox = new SampleDescriptionBox();
    XMLSubtitleSampleEntry xmlSubtitleSampleEntry = new XMLSubtitleSampleEntry();

    List<Sample> samples = new ArrayList<Sample>();
    SubSampleInformationBox subSampleInformationBox = new SubSampleInformationBox();


    private long[] sampleDurations;


    public TtmlTrackImpl(String name, List<Document> ttmls) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException, URISyntaxException {
        super(name);__CLR4_5_2aaiaailvlulixo.R.inc(13339);try{__CLR4_5_2aaiaailvlulixo.R.inc(13338);
        __CLR4_5_2aaiaailvlulixo.R.inc(13340);extractLanguage(ttmls);
        __CLR4_5_2aaiaailvlulixo.R.inc(13341);Set<String> mimeTypes = new HashSet<String>();
        __CLR4_5_2aaiaailvlulixo.R.inc(13342);sampleDurations = new long[ttmls.size()];
        __CLR4_5_2aaiaailvlulixo.R.inc(13343);XPathFactory xPathfactory = XPathFactory.newInstance();
        __CLR4_5_2aaiaailvlulixo.R.inc(13344);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2aaiaailvlulixo.R.inc(13345);xpath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);
        __CLR4_5_2aaiaailvlulixo.R.inc(13346);long startTime = 0;

        __CLR4_5_2aaiaailvlulixo.R.inc(13347);for (int sampleNo = 0; (((sampleNo < ttmls.size())&&(__CLR4_5_2aaiaailvlulixo.R.iget(13348)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13349)==0&false)); sampleNo++) {{
            __CLR4_5_2aaiaailvlulixo.R.inc(13350);final Document ttml = ttmls.get(sampleNo);
            __CLR4_5_2aaiaailvlulixo.R.inc(13351);SubSampleInformationBox.SubSampleEntry subSampleEntry = new SubSampleInformationBox.SubSampleEntry();
            __CLR4_5_2aaiaailvlulixo.R.inc(13352);subSampleInformationBox.getEntries().add(subSampleEntry);
            __CLR4_5_2aaiaailvlulixo.R.inc(13353);subSampleEntry.setSampleDelta(1);
            __CLR4_5_2aaiaailvlulixo.R.inc(13354);sampleDurations[sampleNo] = extractDuration(ttml);

            __CLR4_5_2aaiaailvlulixo.R.inc(13355);List<byte[]> images = extractImages(ttml);
            __CLR4_5_2aaiaailvlulixo.R.inc(13356);mimeTypes.addAll(extractMimeTypes(ttml));

            // No changes of XML after this point!
            __CLR4_5_2aaiaailvlulixo.R.inc(13357);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            __CLR4_5_2aaiaailvlulixo.R.inc(13358);TtmlHelpers.pretty(ttml, baos, 4);
            __CLR4_5_2aaiaailvlulixo.R.inc(13359);SubSampleInformationBox.SubSampleEntry.SubsampleEntry xmlEntry =
                    new SubSampleInformationBox.SubSampleEntry.SubsampleEntry();
            __CLR4_5_2aaiaailvlulixo.R.inc(13360);xmlEntry.setSubsampleSize(baos.size());

            __CLR4_5_2aaiaailvlulixo.R.inc(13361);subSampleEntry.getSubsampleEntries().add(xmlEntry);
            __CLR4_5_2aaiaailvlulixo.R.inc(13362);for (byte[] image : images) {{
                __CLR4_5_2aaiaailvlulixo.R.inc(13363);baos.write(image);
                __CLR4_5_2aaiaailvlulixo.R.inc(13364);SubSampleInformationBox.SubSampleEntry.SubsampleEntry imageEntry =
                        new SubSampleInformationBox.SubSampleEntry.SubsampleEntry();
                __CLR4_5_2aaiaailvlulixo.R.inc(13365);imageEntry.setSubsampleSize(image.length);
                __CLR4_5_2aaiaailvlulixo.R.inc(13366);subSampleEntry.getSubsampleEntries().add(imageEntry);

            }

            }__CLR4_5_2aaiaailvlulixo.R.inc(13367);final byte[] finalSample = baos.toByteArray();
            __CLR4_5_2aaiaailvlulixo.R.inc(13368);samples.add(new Sample() {
                public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_2aaiaailvlulixo.R.inc(13369);
                    __CLR4_5_2aaiaailvlulixo.R.inc(13370);channel.write(ByteBuffer.wrap(finalSample));
                }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

                public long getSize() {try{__CLR4_5_2aaiaailvlulixo.R.inc(13371);
                    __CLR4_5_2aaiaailvlulixo.R.inc(13372);return finalSample.length;
                }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

                public ByteBuffer asByteBuffer() {try{__CLR4_5_2aaiaailvlulixo.R.inc(13373);
                    __CLR4_5_2aaiaailvlulixo.R.inc(13374);return ByteBuffer.wrap(finalSample);
                }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}
            });
        }


        }__CLR4_5_2aaiaailvlulixo.R.inc(13375);xmlSubtitleSampleEntry.setNamespace(join(",", getAllNamespaces(ttmls.get(0))));
        __CLR4_5_2aaiaailvlulixo.R.inc(13376);xmlSubtitleSampleEntry.setSchemaLocation("");
        __CLR4_5_2aaiaailvlulixo.R.inc(13377);xmlSubtitleSampleEntry.setAuxiliaryMimeTypes(join(",", new ArrayList<String>(mimeTypes).toArray(new String[mimeTypes.size()])));
        __CLR4_5_2aaiaailvlulixo.R.inc(13378);sampleDescriptionBox.addBox(xmlSubtitleSampleEntry);
        __CLR4_5_2aaiaailvlulixo.R.inc(13379);trackMetaData.setTimescale(30000);
        __CLR4_5_2aaiaailvlulixo.R.inc(13380);trackMetaData.setLayer(65535);


    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    public static String getLanguage(Document document) {try{__CLR4_5_2aaiaailvlulixo.R.inc(13381);
        __CLR4_5_2aaiaailvlulixo.R.inc(13382);return document.getDocumentElement().getAttribute("xml:lang");
    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    protected static List<byte[]> extractImages(Document ttml) throws XPathExpressionException, URISyntaxException, IOException {try{__CLR4_5_2aaiaailvlulixo.R.inc(13383);
        __CLR4_5_2aaiaailvlulixo.R.inc(13384);XPathFactory xPathfactory = XPathFactory.newInstance();
        __CLR4_5_2aaiaailvlulixo.R.inc(13385);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2aaiaailvlulixo.R.inc(13386);XPathExpression expr = xpath.compile("//*/@backgroundImage");
        __CLR4_5_2aaiaailvlulixo.R.inc(13387);NodeList nl = (NodeList) expr.evaluate(ttml, XPathConstants.NODESET);

        __CLR4_5_2aaiaailvlulixo.R.inc(13388);LinkedHashMap<String, String> internalNames2Original = new LinkedHashMap<String, String>();

        __CLR4_5_2aaiaailvlulixo.R.inc(13389);int p = 1;
        __CLR4_5_2aaiaailvlulixo.R.inc(13390);for (int i = 0; (((i < nl.getLength())&&(__CLR4_5_2aaiaailvlulixo.R.iget(13391)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13392)==0&false)); i++) {{
            __CLR4_5_2aaiaailvlulixo.R.inc(13393);Node bgImageNode = nl.item(i);
            __CLR4_5_2aaiaailvlulixo.R.inc(13394);String uri = bgImageNode.getNodeValue();
            __CLR4_5_2aaiaailvlulixo.R.inc(13395);String ext = uri.substring(uri.lastIndexOf("."));

            __CLR4_5_2aaiaailvlulixo.R.inc(13396);String internalName = internalNames2Original.get(uri);
            __CLR4_5_2aaiaailvlulixo.R.inc(13397);if ((((internalName == null)&&(__CLR4_5_2aaiaailvlulixo.R.iget(13398)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13399)==0&false))) {{
                __CLR4_5_2aaiaailvlulixo.R.inc(13400);internalName = "urn:mp4parser:" + p++ + ext;
                __CLR4_5_2aaiaailvlulixo.R.inc(13401);internalNames2Original.put(internalName, uri);
            }
            }__CLR4_5_2aaiaailvlulixo.R.inc(13402);bgImageNode.setNodeValue(internalName);

        }
        }__CLR4_5_2aaiaailvlulixo.R.inc(13403);List<byte[]> images = new ArrayList<byte[]>();
        __CLR4_5_2aaiaailvlulixo.R.inc(13404);if ((((!internalNames2Original.isEmpty())&&(__CLR4_5_2aaiaailvlulixo.R.iget(13405)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13406)==0&false))) {{
            __CLR4_5_2aaiaailvlulixo.R.inc(13407);for (Map.Entry<String, String> internalName2Original : internalNames2Original.entrySet()) {{

                __CLR4_5_2aaiaailvlulixo.R.inc(13408);URI pic = new URI(ttml.getDocumentURI()).resolve(internalName2Original.getValue());
                __CLR4_5_2aaiaailvlulixo.R.inc(13409);images.add(streamToByteArray(pic.toURL().openStream()));

            }
        }}
        }__CLR4_5_2aaiaailvlulixo.R.inc(13410);return images;
    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    private static String join(String joiner, String[] i) {try{__CLR4_5_2aaiaailvlulixo.R.inc(13411);
        __CLR4_5_2aaiaailvlulixo.R.inc(13412);StringBuilder result = new StringBuilder();
        __CLR4_5_2aaiaailvlulixo.R.inc(13413);for (String s : i) {{
            __CLR4_5_2aaiaailvlulixo.R.inc(13414);result.append(s).append(joiner);
        }
        }__CLR4_5_2aaiaailvlulixo.R.inc(13415);result.setLength((((result.length() > 0 )&&(__CLR4_5_2aaiaailvlulixo.R.iget(13416)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13417)==0&false))? result.length() - 1 : 0);
        __CLR4_5_2aaiaailvlulixo.R.inc(13418);return result.toString();
    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    private static long latestTimestamp(Document document) {try{__CLR4_5_2aaiaailvlulixo.R.inc(13419);
        __CLR4_5_2aaiaailvlulixo.R.inc(13420);XPathFactory xPathfactory = XPathFactory.newInstance();
        __CLR4_5_2aaiaailvlulixo.R.inc(13421);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2aaiaailvlulixo.R.inc(13422);xpath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);

        __CLR4_5_2aaiaailvlulixo.R.inc(13423);try {
            __CLR4_5_2aaiaailvlulixo.R.inc(13424);XPathExpression xp = xpath.compile("//*[name()='p']");
            __CLR4_5_2aaiaailvlulixo.R.inc(13425);NodeList timedNodes = (NodeList) xp.evaluate(document, XPathConstants.NODESET);
            __CLR4_5_2aaiaailvlulixo.R.inc(13426);long lastTimeStamp = 0;
            __CLR4_5_2aaiaailvlulixo.R.inc(13427);for (int i = 0; (((i < timedNodes.getLength())&&(__CLR4_5_2aaiaailvlulixo.R.iget(13428)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13429)==0&false)); i++) {{
                __CLR4_5_2aaiaailvlulixo.R.inc(13430);lastTimeStamp = Math.max(getEndTime(timedNodes.item(i)), lastTimeStamp);
            }
            }__CLR4_5_2aaiaailvlulixo.R.inc(13431);return lastTimeStamp;
        } catch (XPathExpressionException e) {
            __CLR4_5_2aaiaailvlulixo.R.inc(13432);throw new RuntimeException(e);
        }

    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    private static byte[] streamToByteArray(InputStream input) throws IOException {try{__CLR4_5_2aaiaailvlulixo.R.inc(13433);
        __CLR4_5_2aaiaailvlulixo.R.inc(13434);byte[] buffer = new byte[8096];
        __CLR4_5_2aaiaailvlulixo.R.inc(13435);ByteArrayOutputStream output = new ByteArrayOutputStream();

        __CLR4_5_2aaiaailvlulixo.R.inc(13436);int n = 0;
        __CLR4_5_2aaiaailvlulixo.R.inc(13437);while (-1 != (n = input.read(buffer))) {{
            __CLR4_5_2aaiaailvlulixo.R.inc(13440);output.write(buffer, 0, n);
        }
        }__CLR4_5_2aaiaailvlulixo.R.inc(13441);return output.toByteArray();
    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    protected long firstTimestamp(Document document) {try{__CLR4_5_2aaiaailvlulixo.R.inc(13442);
        __CLR4_5_2aaiaailvlulixo.R.inc(13443);XPathFactory xPathfactory = XPathFactory.newInstance();
        __CLR4_5_2aaiaailvlulixo.R.inc(13444);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2aaiaailvlulixo.R.inc(13445);xpath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);

        __CLR4_5_2aaiaailvlulixo.R.inc(13446);try {
            __CLR4_5_2aaiaailvlulixo.R.inc(13447);XPathExpression xp = xpath.compile("//*[@begin]");
            __CLR4_5_2aaiaailvlulixo.R.inc(13448);NodeList timedNodes = (NodeList) xp.evaluate(document, XPathConstants.NODESET);

            __CLR4_5_2aaiaailvlulixo.R.inc(13449);long firstTimestamp = Long.MAX_VALUE;
            __CLR4_5_2aaiaailvlulixo.R.inc(13450);for (int i = 0; (((i < timedNodes.getLength())&&(__CLR4_5_2aaiaailvlulixo.R.iget(13451)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13452)==0&false)); i++) {{
                __CLR4_5_2aaiaailvlulixo.R.inc(13453);firstTimestamp = Math.min(getStartTime(timedNodes.item(i)), firstTimestamp);
            }
            }__CLR4_5_2aaiaailvlulixo.R.inc(13454);return firstTimestamp;
        } catch (XPathExpressionException e) {
            __CLR4_5_2aaiaailvlulixo.R.inc(13455);throw new RuntimeException(e);
        }

    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    protected long lastTimestamp(Document document) {try{__CLR4_5_2aaiaailvlulixo.R.inc(13456);
        __CLR4_5_2aaiaailvlulixo.R.inc(13457);XPathFactory xPathfactory = XPathFactory.newInstance();
        __CLR4_5_2aaiaailvlulixo.R.inc(13458);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2aaiaailvlulixo.R.inc(13459);xpath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);

        __CLR4_5_2aaiaailvlulixo.R.inc(13460);try {
            __CLR4_5_2aaiaailvlulixo.R.inc(13461);XPathExpression xp = xpath.compile("//*[@end]");
            __CLR4_5_2aaiaailvlulixo.R.inc(13462);NodeList timedNodes = (NodeList) xp.evaluate(document, XPathConstants.NODESET);

            __CLR4_5_2aaiaailvlulixo.R.inc(13463);long lastTimeStamp = 0;
            __CLR4_5_2aaiaailvlulixo.R.inc(13464);for (int i = 0; (((i < timedNodes.getLength())&&(__CLR4_5_2aaiaailvlulixo.R.iget(13465)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13466)==0&false)); i++) {{
                __CLR4_5_2aaiaailvlulixo.R.inc(13467);lastTimeStamp = Math.max(getEndTime(timedNodes.item(i)), lastTimeStamp);
            }
            }__CLR4_5_2aaiaailvlulixo.R.inc(13468);return lastTimeStamp;
        } catch (XPathExpressionException e) {
            __CLR4_5_2aaiaailvlulixo.R.inc(13469);throw new RuntimeException(e);
        }

    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    protected void extractLanguage(List<Document> ttmls) {try{__CLR4_5_2aaiaailvlulixo.R.inc(13470);
        __CLR4_5_2aaiaailvlulixo.R.inc(13471);String firstLang = null;
        __CLR4_5_2aaiaailvlulixo.R.inc(13472);for (Document ttml : ttmls) {{

            __CLR4_5_2aaiaailvlulixo.R.inc(13473);String lang = getLanguage(ttml);
            __CLR4_5_2aaiaailvlulixo.R.inc(13474);if ((((firstLang == null)&&(__CLR4_5_2aaiaailvlulixo.R.iget(13475)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13476)==0&false))) {{
                __CLR4_5_2aaiaailvlulixo.R.inc(13477);firstLang = lang;
                __CLR4_5_2aaiaailvlulixo.R.inc(13478);trackMetaData.setLanguage(Locale.forLanguageTag(lang).getISO3Language());
            } }else {__CLR4_5_2aaiaailvlulixo.R.inc(13479);if ((((!firstLang.equals(lang))&&(__CLR4_5_2aaiaailvlulixo.R.iget(13480)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13481)==0&false))) {{
                __CLR4_5_2aaiaailvlulixo.R.inc(13482);throw new RuntimeException("Within one Track all sample documents need to have the same language");
            }

        }}}
    }}finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    protected List<String> extractMimeTypes(Document ttml) throws XPathExpressionException {try{__CLR4_5_2aaiaailvlulixo.R.inc(13483);
        __CLR4_5_2aaiaailvlulixo.R.inc(13484);XPathFactory xPathfactory = XPathFactory.newInstance();

        __CLR4_5_2aaiaailvlulixo.R.inc(13485);XPath xpath = xPathfactory.newXPath();

        __CLR4_5_2aaiaailvlulixo.R.inc(13486);XPathExpression expr = xpath.compile("//*/@smpte:backgroundImage");
        __CLR4_5_2aaiaailvlulixo.R.inc(13487);NodeList nl = (NodeList) expr.evaluate(ttml, XPathConstants.NODESET);

        __CLR4_5_2aaiaailvlulixo.R.inc(13488);Set<String> mimeTypes = new LinkedHashSet<String>();

        __CLR4_5_2aaiaailvlulixo.R.inc(13489);int p = 1;
        __CLR4_5_2aaiaailvlulixo.R.inc(13490);for (int i = 0; (((i < nl.getLength())&&(__CLR4_5_2aaiaailvlulixo.R.iget(13491)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13492)==0&false)); i++) {{
            __CLR4_5_2aaiaailvlulixo.R.inc(13493);Node bgImageNode = nl.item(i);
            __CLR4_5_2aaiaailvlulixo.R.inc(13494);String uri = bgImageNode.getNodeValue();
            __CLR4_5_2aaiaailvlulixo.R.inc(13495);String ext = uri.substring(uri.lastIndexOf("."));
            __CLR4_5_2aaiaailvlulixo.R.inc(13496);if ((((ext.contains("jpg") || ext.contains("jpeg"))&&(__CLR4_5_2aaiaailvlulixo.R.iget(13497)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13498)==0&false))) {{
                __CLR4_5_2aaiaailvlulixo.R.inc(13499);mimeTypes.add("image/jpeg");
            } }else {__CLR4_5_2aaiaailvlulixo.R.inc(13500);if ((((ext.contains("png"))&&(__CLR4_5_2aaiaailvlulixo.R.iget(13501)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13502)==0&false))) {{
                __CLR4_5_2aaiaailvlulixo.R.inc(13503);mimeTypes.add("image/png");
            }
        }}}
        }__CLR4_5_2aaiaailvlulixo.R.inc(13504);return new ArrayList<String>(mimeTypes);
    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    long extractDuration(Document ttml) {try{__CLR4_5_2aaiaailvlulixo.R.inc(13505);
        __CLR4_5_2aaiaailvlulixo.R.inc(13506);return lastTimestamp(ttml) - firstTimestamp(ttml);
    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_2aaiaailvlulixo.R.inc(13507);
        __CLR4_5_2aaiaailvlulixo.R.inc(13508);return sampleDescriptionBox;
    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}


    public long[] getSampleDurations() {try{__CLR4_5_2aaiaailvlulixo.R.inc(13509);
        __CLR4_5_2aaiaailvlulixo.R.inc(13510);long[] adoptedSampleDuration = new long[sampleDurations.length];
        __CLR4_5_2aaiaailvlulixo.R.inc(13511);for (int i = 0; (((i < adoptedSampleDuration.length)&&(__CLR4_5_2aaiaailvlulixo.R.iget(13512)!=0|true))||(__CLR4_5_2aaiaailvlulixo.R.iget(13513)==0&false)); i++) {{
            __CLR4_5_2aaiaailvlulixo.R.inc(13514);adoptedSampleDuration[i] = sampleDurations[i] * trackMetaData.getTimescale() / 1000;
        }
        }__CLR4_5_2aaiaailvlulixo.R.inc(13515);return adoptedSampleDuration;

    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_2aaiaailvlulixo.R.inc(13516);
        __CLR4_5_2aaiaailvlulixo.R.inc(13517);return trackMetaData;
    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_2aaiaailvlulixo.R.inc(13518);
        __CLR4_5_2aaiaailvlulixo.R.inc(13519);return "subt";
    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_2aaiaailvlulixo.R.inc(13520);
        __CLR4_5_2aaiaailvlulixo.R.inc(13521);return samples;
    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    @Override
    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_2aaiaailvlulixo.R.inc(13522);
        __CLR4_5_2aaiaailvlulixo.R.inc(13523);return subSampleInformationBox;

    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_2aaiaailvlulixo.R.inc(13524);

    }finally{__CLR4_5_2aaiaailvlulixo.R.flushNeeded();}}
}
