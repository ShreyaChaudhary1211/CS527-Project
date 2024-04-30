/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.util.*;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * Created by user on 06.08.2014.
 */
public class ExportTTMLTrack {public static class __CLR4_5_27m7mlvl9g0nw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,375,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {try{__CLR4_5_27m7mlvl9g0nw.R.inc(274);
        //Movie m = MovieCreator.build("C:\\dev\\mp4parser-github\\ttml-example\\subs.uvu");
        __CLR4_5_27m7mlvl9g0nw.R.inc(275);Movie m = MovieCreator.build("C:\\dev\\mp4parser-github\\output.mp4");
        __CLR4_5_27m7mlvl9g0nw.R.inc(276);for (Track track : m.getTracks()) {{
            __CLR4_5_27m7mlvl9g0nw.R.inc(277);if ((((track.getHandler().endsWith("vide"))&&(__CLR4_5_27m7mlvl9g0nw.R.iget(278)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(279)==0&false))) {{
                __CLR4_5_27m7mlvl9g0nw.R.inc(280);Movie vide = new Movie(Collections.singletonList(track));
                __CLR4_5_27m7mlvl9g0nw.R.inc(281);DefaultMp4Builder builder = new DefaultMp4Builder();
                __CLR4_5_27m7mlvl9g0nw.R.inc(282);builder.build(vide).writeContainer(new RandomAccessFile("vide_" + track.getTrackMetaData().getTrackId() + ".mp4", "rw").getChannel());
            }
            }__CLR4_5_27m7mlvl9g0nw.R.inc(283);if ((((track.getHandler().endsWith("soun"))&&(__CLR4_5_27m7mlvl9g0nw.R.iget(284)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(285)==0&false))) {{
                __CLR4_5_27m7mlvl9g0nw.R.inc(286);Movie vide = new Movie(Collections.singletonList(track));
                __CLR4_5_27m7mlvl9g0nw.R.inc(287);DefaultMp4Builder builder = new DefaultMp4Builder();
                __CLR4_5_27m7mlvl9g0nw.R.inc(288);builder.build(vide).writeContainer(new RandomAccessFile("soun_" + track.getTrackMetaData().getTrackId() +".mp4", "rw").getChannel());
            }
            }__CLR4_5_27m7mlvl9g0nw.R.inc(289);if ((((track.getHandler().endsWith("subt"))&&(__CLR4_5_27m7mlvl9g0nw.R.iget(290)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(291)==0&false))) {{
                __CLR4_5_27m7mlvl9g0nw.R.inc(292);for (int i = 0; (((i < track.getSamples().size())&&(__CLR4_5_27m7mlvl9g0nw.R.iget(293)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(294)==0&false)); i++) {{
                    __CLR4_5_27m7mlvl9g0nw.R.inc(295);File f = new File("subtitle_" + track.getTrackMetaData().getTrackId() + "_" + i + ".xml");
                    __CLR4_5_27m7mlvl9g0nw.R.inc(296);f.delete();
                    __CLR4_5_27m7mlvl9g0nw.R.inc(297);RandomAccessFile raf = new RandomAccessFile(f, "rw");
                    __CLR4_5_27m7mlvl9g0nw.R.inc(298);SubSampleInformationBox subs = track.getSubsampleInformationBox();
                    __CLR4_5_27m7mlvl9g0nw.R.inc(299);int j = 0;
                    __CLR4_5_27m7mlvl9g0nw.R.inc(300);ByteBuffer xmlSamplePart = null;
                    __CLR4_5_27m7mlvl9g0nw.R.inc(301);for (SubSampleInformationBox.SubSampleEntry subSampleEntry : subs.getEntries()) {{
                        __CLR4_5_27m7mlvl9g0nw.R.inc(302);j += subSampleEntry.getSampleDelta();
                        __CLR4_5_27m7mlvl9g0nw.R.inc(303);if ((((j == (i + 1))&&(__CLR4_5_27m7mlvl9g0nw.R.iget(304)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(305)==0&false))) {{
                            // found sample entry
                            __CLR4_5_27m7mlvl9g0nw.R.inc(306);Iterator<SubSampleInformationBox.SubSampleEntry.SubsampleEntry> subsampleIter =
                                    subSampleEntry.getSubsampleEntries().iterator();
                            __CLR4_5_27m7mlvl9g0nw.R.inc(307);if ((((subsampleIter.hasNext())&&(__CLR4_5_27m7mlvl9g0nw.R.iget(308)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(309)==0&false))) {{
                                __CLR4_5_27m7mlvl9g0nw.R.inc(310);SubSampleInformationBox.SubSampleEntry.SubsampleEntry xmlSubSampleEntry = subsampleIter.next();
                                __CLR4_5_27m7mlvl9g0nw.R.inc(311);ByteBuffer sample = track.getSamples().get(i).asByteBuffer();
                                __CLR4_5_27m7mlvl9g0nw.R.inc(312);xmlSamplePart = (ByteBuffer) sample.slice().limit(l2i(xmlSubSampleEntry.getSubsampleSize()));
                                __CLR4_5_27m7mlvl9g0nw.R.inc(313);raf.getChannel().write(xmlSamplePart);
                                __CLR4_5_27m7mlvl9g0nw.R.inc(314);raf.close();
                                __CLR4_5_27m7mlvl9g0nw.R.inc(315);DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                                __CLR4_5_27m7mlvl9g0nw.R.inc(316);factory.setNamespaceAware(true);
                                __CLR4_5_27m7mlvl9g0nw.R.inc(317);DocumentBuilder builder = factory.newDocumentBuilder();
                                __CLR4_5_27m7mlvl9g0nw.R.inc(318);Document document = builder.parse(f);

                                __CLR4_5_27m7mlvl9g0nw.R.inc(319);XPathFactory xPathfactory = XPathFactory.newInstance();
                                __CLR4_5_27m7mlvl9g0nw.R.inc(320);NamespaceContext ctx = new NamespaceContext() {
                                    public String getNamespaceURI(String prefix) {try{__CLR4_5_27m7mlvl9g0nw.R.inc(321);
                                        __CLR4_5_27m7mlvl9g0nw.R.inc(322);if ((((prefix.equals("ttml"))&&(__CLR4_5_27m7mlvl9g0nw.R.iget(323)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(324)==0&false))) {{
                                            __CLR4_5_27m7mlvl9g0nw.R.inc(325);return "http://www.w3.org/ns/ttml";
                                        }
                                        }__CLR4_5_27m7mlvl9g0nw.R.inc(326);if ((((prefix.equals("smpte"))&&(__CLR4_5_27m7mlvl9g0nw.R.iget(327)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(328)==0&false))) {{
                                            __CLR4_5_27m7mlvl9g0nw.R.inc(329);return "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt";
                                        }
                                        }__CLR4_5_27m7mlvl9g0nw.R.inc(330);return null;
                                    }finally{__CLR4_5_27m7mlvl9g0nw.R.flushNeeded();}}

                                    public Iterator getPrefixes(String val) {try{__CLR4_5_27m7mlvl9g0nw.R.inc(331);
                                        __CLR4_5_27m7mlvl9g0nw.R.inc(332);return Arrays.asList("ttml", "smpte").iterator();
                                    }finally{__CLR4_5_27m7mlvl9g0nw.R.flushNeeded();}}

                                    public String getPrefix(String uri) {try{__CLR4_5_27m7mlvl9g0nw.R.inc(333);
                                        __CLR4_5_27m7mlvl9g0nw.R.inc(334);if ((((uri.equals("http://www.w3.org/ns/ttml"))&&(__CLR4_5_27m7mlvl9g0nw.R.iget(335)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(336)==0&false))) {{
                                            __CLR4_5_27m7mlvl9g0nw.R.inc(337);return "ttml";
                                        }
                                        }__CLR4_5_27m7mlvl9g0nw.R.inc(338);if ((((uri.equals("http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt"))&&(__CLR4_5_27m7mlvl9g0nw.R.iget(339)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(340)==0&false))) {{
                                            __CLR4_5_27m7mlvl9g0nw.R.inc(341);return "smpte";
                                        }
                                        }__CLR4_5_27m7mlvl9g0nw.R.inc(342);return null;
                                    }finally{__CLR4_5_27m7mlvl9g0nw.R.flushNeeded();}}
                                };
                                __CLR4_5_27m7mlvl9g0nw.R.inc(343);XPath xpath = xPathfactory.newXPath();
                                __CLR4_5_27m7mlvl9g0nw.R.inc(344);xpath.setNamespaceContext(ctx);
                                __CLR4_5_27m7mlvl9g0nw.R.inc(345);XPathExpression expr = xpath.compile("/ttml:tt/ttml:body/ttml:div/@smpte:backgroundImage");
                                __CLR4_5_27m7mlvl9g0nw.R.inc(346);NodeList nl = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
                                __CLR4_5_27m7mlvl9g0nw.R.inc(347);HashSet<String> names = new HashSet<String>();
                                __CLR4_5_27m7mlvl9g0nw.R.inc(348);for (int n = 0; (((n < nl.getLength())&&(__CLR4_5_27m7mlvl9g0nw.R.iget(349)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(350)==0&false)); n++) {{
                                    __CLR4_5_27m7mlvl9g0nw.R.inc(351);names.add(nl.item(n).getNodeValue());
                                }
                                }__CLR4_5_27m7mlvl9g0nw.R.inc(352);List<String> imageNames = new ArrayList<String>(names);
                                __CLR4_5_27m7mlvl9g0nw.R.inc(353);Collections.sort(imageNames);
                                __CLR4_5_27m7mlvl9g0nw.R.inc(354);System.out.println(nl);
                                __CLR4_5_27m7mlvl9g0nw.R.inc(355);System.out.println(document.getFirstChild().getTextContent());


                                __CLR4_5_27m7mlvl9g0nw.R.inc(356);sample = ((ByteBuffer) sample.position(l2i(xmlSubSampleEntry.getSubsampleSize()))).slice();
                                __CLR4_5_27m7mlvl9g0nw.R.inc(357);int p = 0;
                                __CLR4_5_27m7mlvl9g0nw.R.inc(358);while ((((subsampleIter.hasNext())&&(__CLR4_5_27m7mlvl9g0nw.R.iget(359)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(360)==0&false))) {{
                                    __CLR4_5_27m7mlvl9g0nw.R.inc(361);SubSampleInformationBox.SubSampleEntry.SubsampleEntry picSubSampleEntry = subsampleIter.next();
                                    __CLR4_5_27m7mlvl9g0nw.R.inc(362);ByteBuffer pic = (ByteBuffer) sample.slice().limit(l2i(picSubSampleEntry.getSubsampleSize()));
                                    __CLR4_5_27m7mlvl9g0nw.R.inc(363);sample = ((ByteBuffer) sample.position(l2i(picSubSampleEntry.getSubsampleSize()))).slice();
                                    __CLR4_5_27m7mlvl9g0nw.R.inc(364);FileOutputStream fosPic = new FileOutputStream(
                                            "subtitle_" + track.getTrackMetaData().getTrackId() + "_" + i + "_" + imageNames.get(p++).replace(":", "_"));
                                    __CLR4_5_27m7mlvl9g0nw.R.inc(365);fosPic.getChannel().write(pic);
                                }
                                }__CLR4_5_27m7mlvl9g0nw.R.inc(366);String content = IOUtils.toString(new FileInputStream(f));
                                __CLR4_5_27m7mlvl9g0nw.R.inc(367);for (String imageName : imageNames) {{
                                    __CLR4_5_27m7mlvl9g0nw.R.inc(368);content = content.replaceAll(imageName,
                                            "subtitle_" + track.getTrackMetaData().getTrackId() + "_" + i + "_" + imageName.replace(":", "_"));
                                }
                                }__CLR4_5_27m7mlvl9g0nw.R.inc(369);IOUtils.write(content, new FileOutputStream(f));
                            }
                        }}
                    }}
                    }__CLR4_5_27m7mlvl9g0nw.R.inc(370);if ((((xmlSamplePart == null)&&(__CLR4_5_27m7mlvl9g0nw.R.iget(371)!=0|true))||(__CLR4_5_27m7mlvl9g0nw.R.iget(372)==0&false))) {{
                        __CLR4_5_27m7mlvl9g0nw.R.inc(373);xmlSamplePart = track.getSamples().get(i).asByteBuffer();
                        __CLR4_5_27m7mlvl9g0nw.R.inc(374);raf.getChannel().write(xmlSamplePart);
                    }
                }}
            }}
        }}

    }}finally{__CLR4_5_27m7mlvl9g0nw.R.flushNeeded();}}
}
