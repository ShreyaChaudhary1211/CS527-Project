/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.ttml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import static com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.getEndTime;
import static com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.getStartTime;
import static com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTime;
import static com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTimeExpression;


public class TtmlSegmenter {public static class __CLR4_5_2a6xa6xlvluliuf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,13338,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static List<Document> split(Document doc, int splitTimeInSeconds) throws XPathExpressionException {try{__CLR4_5_2a6xa6xlvluliuf.R.inc(13209);
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13210);int splitTime = splitTimeInSeconds * 1000;
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13211);XPathFactory xPathfactory = XPathFactory.newInstance();

        __CLR4_5_2a6xa6xlvluliuf.R.inc(13212);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13213);XPathExpression xp = xpath.compile("//*[name()='p']");

        __CLR4_5_2a6xa6xlvluliuf.R.inc(13214);boolean thereIsMore;

        __CLR4_5_2a6xa6xlvluliuf.R.inc(13215);List<Document> subDocs = new ArrayList<Document>();


        __CLR4_5_2a6xa6xlvluliuf.R.inc(13216);do {{
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13217);long segmentStartTime = subDocs.size() * splitTime;
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13218);long segmentEndTime = (subDocs.size() + 1) * splitTime;
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13219);Document d = (Document) doc.cloneNode(true);
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13220);NodeList timedNodes = (NodeList) xp.evaluate(d, XPathConstants.NODESET);
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13221);thereIsMore = false;

            __CLR4_5_2a6xa6xlvluliuf.R.inc(13222);for (int i = 0; (((i < timedNodes.getLength())&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13223)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13224)==0&false)); i++) {{
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13225);Node p = timedNodes.item(i);
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13226);long startTime = getStartTime(p);
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13227);long endTime = getEndTime(p);
                //p.appendChild(d.createComment(toTimeExpression(startTime) + " -> " + toTimeExpression(endTime)));
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13228);if ((((startTime < segmentStartTime && endTime > segmentStartTime)&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13229)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13230)==0&false))) {{
                    __CLR4_5_2a6xa6xlvluliuf.R.inc(13231);changeTime(p, "begin", segmentStartTime - startTime);
                    __CLR4_5_2a6xa6xlvluliuf.R.inc(13232);startTime = segmentStartTime;

                }

                }__CLR4_5_2a6xa6xlvluliuf.R.inc(13233);if ((((startTime >= segmentStartTime && startTime < segmentEndTime && endTime > segmentEndTime)&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13234)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13235)==0&false))) {{
                    __CLR4_5_2a6xa6xlvluliuf.R.inc(13236);changeTime(p, "end", segmentEndTime - endTime);
                    __CLR4_5_2a6xa6xlvluliuf.R.inc(13237);startTime = segmentStartTime;
                    __CLR4_5_2a6xa6xlvluliuf.R.inc(13238);endTime = segmentEndTime;
                }

                }__CLR4_5_2a6xa6xlvluliuf.R.inc(13239);if ((((startTime > segmentEndTime)&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13240)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13241)==0&false))) {{
                    __CLR4_5_2a6xa6xlvluliuf.R.inc(13242);thereIsMore = true;
                }

                }__CLR4_5_2a6xa6xlvluliuf.R.inc(13243);if ((((!(startTime >= segmentStartTime && endTime <= segmentEndTime))&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13244)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13245)==0&false))) {{
                    __CLR4_5_2a6xa6xlvluliuf.R.inc(13246);Node parent = p.getParentNode();
                    __CLR4_5_2a6xa6xlvluliuf.R.inc(13247);parent.removeChild(p);
                } }else {{
                    __CLR4_5_2a6xa6xlvluliuf.R.inc(13248);changeTime(p, "begin", -segmentStartTime);
                    __CLR4_5_2a6xa6xlvluliuf.R.inc(13249);changeTime(p, "end", -segmentStartTime);
                }

            }}
            }__CLR4_5_2a6xa6xlvluliuf.R.inc(13250);trimWhitespace(d);

            __CLR4_5_2a6xa6xlvluliuf.R.inc(13251);XPathExpression bodyXP = xpath.compile("/*[name()='tt']/*[name()='body'][1]");
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13252);Element body = (Element) bodyXP.evaluate(d, XPathConstants.NODE);
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13253);String beginTime = body.getAttribute("begin");
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13254);String endTime = body.getAttribute("end");
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13255);if ((((beginTime == null || "".equals(beginTime))&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13256)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13257)==0&false))) {{
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13258);body.setAttribute("begin", toTimeExpression(segmentStartTime));
            } }else {{
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13259);changeTime(body, "begin", segmentStartTime);
            }
            }__CLR4_5_2a6xa6xlvluliuf.R.inc(13260);if ((((endTime == null || "".equals(endTime))&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13261)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13262)==0&false))) {{
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13263);body.setAttribute("end", toTimeExpression(segmentEndTime));
            } }else {{
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13264);changeTime(body, "end", segmentEndTime);
            }
            }__CLR4_5_2a6xa6xlvluliuf.R.inc(13265);subDocs.add(d);
        } }while ((((thereIsMore)&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13266)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13267)==0&false)));

        __CLR4_5_2a6xa6xlvluliuf.R.inc(13268);return subDocs;
    }finally{__CLR4_5_2a6xa6xlvluliuf.R.flushNeeded();}}

    public static void changeTime(Node p, String attribute, long amount) {try{__CLR4_5_2a6xa6xlvluliuf.R.inc(13269);
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13270);if ((((p.getAttributes() != null && p.getAttributes().getNamedItem(attribute) != null)&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13271)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13272)==0&false))) {{
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13273);String oldValue = p.getAttributes().getNamedItem(attribute).getNodeValue();
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13274);long nuTime = toTime(oldValue) + amount;
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13275);int frames = 0;
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13276);if ((((oldValue.contains("."))&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13277)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13278)==0&false))) {{
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13279);frames = -1;
            } }else {{
                // todo more precision! 44 ~= 23 frames per second.
                // that should be ok for non high framerate content
                // actually I'd have to get the ttp:frameRateMultiplier
                // and the ttp:frameRate attribute to calculate at which frame to show the sub
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13280);frames = (int) (nuTime - (nuTime / 1000) * 1000) / 44;
            }
            }__CLR4_5_2a6xa6xlvluliuf.R.inc(13281);p.getAttributes().getNamedItem(attribute).setNodeValue(toTimeExpression(nuTime, frames));
        }

    }}finally{__CLR4_5_2a6xa6xlvluliuf.R.flushNeeded();}}


    public static Document normalizeTimes(Document doc) throws XPathExpressionException {try{__CLR4_5_2a6xa6xlvluliuf.R.inc(13282);
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13283);XPathFactory xPathfactory = XPathFactory.newInstance();

        __CLR4_5_2a6xa6xlvluliuf.R.inc(13284);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13285);xpath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13286);XPathExpression xp = xpath.compile("//*[name()='p']");
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13287);NodeList timedNodes = (NodeList) xp.evaluate(doc, XPathConstants.NODESET);
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13288);for (int i = 0; (((i < timedNodes.getLength())&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13289)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13290)==0&false)); i++) {{
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13291);Node p = timedNodes.item(i);
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13292);pushDown(p);

        }
        }__CLR4_5_2a6xa6xlvluliuf.R.inc(13293);for (int i = 0; (((i < timedNodes.getLength())&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13294)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13295)==0&false)); i++) {{
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13296);Node p = timedNodes.item(i);
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13297);removeAfterPushDown(p, "begin");
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13298);removeAfterPushDown(p, "end");

        }
        }__CLR4_5_2a6xa6xlvluliuf.R.inc(13299);return doc;
    }finally{__CLR4_5_2a6xa6xlvluliuf.R.flushNeeded();}}

    private static void pushDown(Node p) {try{__CLR4_5_2a6xa6xlvluliuf.R.inc(13300);
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13301);long time = 0;

        __CLR4_5_2a6xa6xlvluliuf.R.inc(13302);Node current = p;
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13303);while ((current = current.getParentNode()) != null) {{
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13306);if ((((current.getAttributes() != null && current.getAttributes().getNamedItem("begin") != null)&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13307)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13308)==0&false))) {{
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13309);time += toTime(current.getAttributes().getNamedItem("begin").getNodeValue());
            }
        }}

        }__CLR4_5_2a6xa6xlvluliuf.R.inc(13310);if ((((p.getAttributes() != null && p.getAttributes().getNamedItem("begin") != null)&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13311)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13312)==0&false))) {{
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13313);p.getAttributes().getNamedItem("begin").setNodeValue(toTimeExpression(time + toTime(p.getAttributes().getNamedItem("begin").getNodeValue())));
        }
        }__CLR4_5_2a6xa6xlvluliuf.R.inc(13314);if ((((p.getAttributes() != null && p.getAttributes().getNamedItem("end") != null)&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13315)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13316)==0&false))) {{
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13317);p.getAttributes().getNamedItem("end").setNodeValue(toTimeExpression(time + toTime(p.getAttributes().getNamedItem("end").getNodeValue())));
        }

    }}finally{__CLR4_5_2a6xa6xlvluliuf.R.flushNeeded();}}

    private static void removeAfterPushDown(Node p, String begin) {try{__CLR4_5_2a6xa6xlvluliuf.R.inc(13318);
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13319);Node current = p;
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13320);while ((current = current.getParentNode()) != null) {{
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13323);if ((((current.getAttributes() != null && current.getAttributes().getNamedItem(begin) != null)&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13324)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13325)==0&false))) {{
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13326);current.getAttributes().removeNamedItem(begin);
            }
        }}
    }}finally{__CLR4_5_2a6xa6xlvluliuf.R.flushNeeded();}}

    public static void trimWhitespace(Node node) {try{__CLR4_5_2a6xa6xlvluliuf.R.inc(13327);
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13328);NodeList children = node.getChildNodes();
        __CLR4_5_2a6xa6xlvluliuf.R.inc(13329);for (int i = 0; (((i < children.getLength())&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13330)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13331)==0&false)); ++i) {{
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13332);Node child = children.item(i);
            __CLR4_5_2a6xa6xlvluliuf.R.inc(13333);if ((((child.getNodeType() == Node.TEXT_NODE)&&(__CLR4_5_2a6xa6xlvluliuf.R.iget(13334)!=0|true))||(__CLR4_5_2a6xa6xlvluliuf.R.iget(13335)==0&false))) {{
                __CLR4_5_2a6xa6xlvluliuf.R.inc(13336);child.setTextContent(child.getTextContent().trim());
            }
            }__CLR4_5_2a6xa6xlvluliuf.R.inc(13337);trimWhitespace(child);
        }
    }}finally{__CLR4_5_2a6xa6xlvluliuf.R.flushNeeded();}}


}
