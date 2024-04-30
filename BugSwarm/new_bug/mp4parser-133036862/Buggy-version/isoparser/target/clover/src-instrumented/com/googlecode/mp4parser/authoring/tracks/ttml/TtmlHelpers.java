/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.ttml;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TtmlHelpers {public static class __CLR4_5_2a28a28lvluliti{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,13209,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static byte[] namespacesStyleSheet1 = ("<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n" +
            "    <xsl:output method=\"text\"/>\n" +
            "    <xsl:key name=\"kElemByNSURI\"\n" +
            "             match=\"*[namespace::*[not(. = ../../namespace::*)]]\"\n" +
            "              use=\"namespace::*[not(. = ../../namespace::*)]\"/>\n" +
            "    <xsl:template match=\"/\">\n" +
            "        <xsl:for-each select=\n" +
            "            \"//namespace::*[not(. = ../../namespace::*)]\n" +
            "                           [count(..|key('kElemByNSURI',.)[1])=1]\">\n" +
            "            <xsl:value-of select=\"concat(.,'&#xA;')\"/>\n" +
            "        </xsl:for-each>\n" +
            "    </xsl:template>\n" +
            "</xsl:stylesheet>").getBytes();

    public static void main(String[] args) throws URISyntaxException, ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException {try{__CLR4_5_2a28a28lvluliti.R.inc(13040);
        __CLR4_5_2a28a28lvluliti.R.inc(13041);DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        __CLR4_5_2a28a28lvluliti.R.inc(13042);dbf.setNamespaceAware(true);
        __CLR4_5_2a28a28lvluliti.R.inc(13043);DocumentBuilder builder = dbf.newDocumentBuilder();
        __CLR4_5_2a28a28lvluliti.R.inc(13044);Document doc = builder.parse("C:\\dev\\mp4parser\\a.xml");
        __CLR4_5_2a28a28lvluliti.R.inc(13045);List<Document> split = TtmlSegmenter.split(doc, 60);
/*        for (Document document : split) {
            pretty(document, System.out, 4);
        }*/
        __CLR4_5_2a28a28lvluliti.R.inc(13046);Track t = new TtmlTrackImpl("a.xml", split);
        __CLR4_5_2a28a28lvluliti.R.inc(13047);Movie m = new Movie();
        __CLR4_5_2a28a28lvluliti.R.inc(13048);m.addTrack(t);
        __CLR4_5_2a28a28lvluliti.R.inc(13049);Container c = new DefaultMp4Builder().build(m);
        __CLR4_5_2a28a28lvluliti.R.inc(13050);c.writeContainer(new FileOutputStream("output.mp4").getChannel());
    }finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}

    public static String[] getAllNamespaces(Document doc) {try{__CLR4_5_2a28a28lvluliti.R.inc(13051);
        __CLR4_5_2a28a28lvluliti.R.inc(13052);TransformerFactory tf = TransformerFactory.newInstance();
        __CLR4_5_2a28a28lvluliti.R.inc(13053);Transformer transformer;
        __CLR4_5_2a28a28lvluliti.R.inc(13054);try {
            __CLR4_5_2a28a28lvluliti.R.inc(13055);transformer = tf.newTransformer(new StreamSource(new ByteArrayInputStream(namespacesStyleSheet1)));
            __CLR4_5_2a28a28lvluliti.R.inc(13056);StringWriter sw = new StringWriter();
            __CLR4_5_2a28a28lvluliti.R.inc(13057);transformer.transform(new DOMSource(doc), new StreamResult(sw));
            __CLR4_5_2a28a28lvluliti.R.inc(13058);List<String> r = new ArrayList<String>(new LinkedHashSet<String>(Arrays.asList(sw.getBuffer().toString().split("\n"))));
            __CLR4_5_2a28a28lvluliti.R.inc(13059);return r.toArray(new String[r.size()]);
        } catch (TransformerConfigurationException e) {
            __CLR4_5_2a28a28lvluliti.R.inc(13060);throw new RuntimeException(e);
        } catch (TransformerException e) {
            __CLR4_5_2a28a28lvluliti.R.inc(13061);throw new RuntimeException(e);
        }

    }finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}


    public static String toTimeExpression(long ms) {try{__CLR4_5_2a28a28lvluliti.R.inc(13062);
        __CLR4_5_2a28a28lvluliti.R.inc(13063);return toTimeExpression(ms, -1);
    }finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}

    public static String toTimeExpression(long ms, int frames) {try{__CLR4_5_2a28a28lvluliti.R.inc(13064);
        __CLR4_5_2a28a28lvluliti.R.inc(13065);String minus = (((ms >= 0 )&&(__CLR4_5_2a28a28lvluliti.R.iget(13066)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13067)==0&false))? "" : "-";
        __CLR4_5_2a28a28lvluliti.R.inc(13068);ms = Math.abs(ms);

        __CLR4_5_2a28a28lvluliti.R.inc(13069);long hours = ms / 1000 / 60 / 60;
        __CLR4_5_2a28a28lvluliti.R.inc(13070);ms -= hours * 1000 * 60 * 60;

        __CLR4_5_2a28a28lvluliti.R.inc(13071);long minutes = ms / 1000 / 60;
        __CLR4_5_2a28a28lvluliti.R.inc(13072);ms -= minutes * 1000 * 60;

        __CLR4_5_2a28a28lvluliti.R.inc(13073);long seconds = ms / 1000;
        __CLR4_5_2a28a28lvluliti.R.inc(13074);ms -= seconds * 1000;
        __CLR4_5_2a28a28lvluliti.R.inc(13075);if ((((frames >= 0)&&(__CLR4_5_2a28a28lvluliti.R.iget(13076)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13077)==0&false))) {{
            __CLR4_5_2a28a28lvluliti.R.inc(13078);return String.format("%s%02d:%02d:%02d:%d", minus, hours, minutes, seconds, frames);
        } }else {{
            __CLR4_5_2a28a28lvluliti.R.inc(13079);return String.format("%s%02d:%02d:%02d.%03d", minus, hours, minutes, seconds, ms);
        }
    }}finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}

    public static long toTime(String expr) {try{__CLR4_5_2a28a28lvluliti.R.inc(13080);
        __CLR4_5_2a28a28lvluliti.R.inc(13081);Pattern p = Pattern.compile("(-?)([0-9][0-9]):([0-9][0-9]):([0-9][0-9])([\\.:][0-9][0-9]?[0-9]?)?");
        __CLR4_5_2a28a28lvluliti.R.inc(13082);Matcher m = p.matcher(expr);
        __CLR4_5_2a28a28lvluliti.R.inc(13083);if ((((m.matches())&&(__CLR4_5_2a28a28lvluliti.R.iget(13084)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13085)==0&false))) {{
            __CLR4_5_2a28a28lvluliti.R.inc(13086);String minus = m.group(1);
            __CLR4_5_2a28a28lvluliti.R.inc(13087);String hours = m.group(2);
            __CLR4_5_2a28a28lvluliti.R.inc(13088);String minutes = m.group(3);
            __CLR4_5_2a28a28lvluliti.R.inc(13089);String seconds = m.group(4);
            __CLR4_5_2a28a28lvluliti.R.inc(13090);String fraction = m.group(5);
            __CLR4_5_2a28a28lvluliti.R.inc(13091);if ((((fraction == null)&&(__CLR4_5_2a28a28lvluliti.R.iget(13092)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13093)==0&false))) {{
                __CLR4_5_2a28a28lvluliti.R.inc(13094);fraction = ".000";
            }

            }__CLR4_5_2a28a28lvluliti.R.inc(13095);fraction = fraction.replace(":", ".");
            __CLR4_5_2a28a28lvluliti.R.inc(13096);long ms = Long.parseLong(hours) * 60 * 60 * 1000;
            __CLR4_5_2a28a28lvluliti.R.inc(13097);ms += Long.parseLong(minutes) * 60 * 1000;
            __CLR4_5_2a28a28lvluliti.R.inc(13098);ms += Long.parseLong(seconds) * 1000;
            __CLR4_5_2a28a28lvluliti.R.inc(13099);if ((((fraction.contains(":"))&&(__CLR4_5_2a28a28lvluliti.R.iget(13100)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13101)==0&false))) {{
                __CLR4_5_2a28a28lvluliti.R.inc(13102);ms += Double.parseDouble("0" + fraction.replace(":", ".")) * 40 * 1000; // 40ms == 25fps - simplifying assumption should be ok for here
            } }else {{
                __CLR4_5_2a28a28lvluliti.R.inc(13103);ms += Double.parseDouble("0" + fraction) * 1000;
            }

            }__CLR4_5_2a28a28lvluliti.R.inc(13104);return ms * (((("-".equals(minus) )&&(__CLR4_5_2a28a28lvluliti.R.iget(13105)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13106)==0&false))? -1 : 1);
        } }else {{
            __CLR4_5_2a28a28lvluliti.R.inc(13107);throw new RuntimeException("Cannot match '" + expr + "' to time expression");
        }
    }}finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}


    public static final String SMPTE_TT_NAMESPACE = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt";
    public static final String TTML_NAMESPACE = "http://www.w3.org/ns/ttml";

    public static final NamespaceContext NAMESPACE_CONTEXT = new TextTrackNamespaceContext();

    private static class TextTrackNamespaceContext implements NamespaceContext {


        public String getNamespaceURI(String prefix) {try{__CLR4_5_2a28a28lvluliti.R.inc(13108);
            __CLR4_5_2a28a28lvluliti.R.inc(13109);if ((((prefix.equals("ttml"))&&(__CLR4_5_2a28a28lvluliti.R.iget(13110)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13111)==0&false))) {{
                __CLR4_5_2a28a28lvluliti.R.inc(13112);return TTML_NAMESPACE;
            }
            }__CLR4_5_2a28a28lvluliti.R.inc(13113);if ((((prefix.equals("smpte"))&&(__CLR4_5_2a28a28lvluliti.R.iget(13114)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13115)==0&false))) {{
                __CLR4_5_2a28a28lvluliti.R.inc(13116);return SMPTE_TT_NAMESPACE;
            }
            }__CLR4_5_2a28a28lvluliti.R.inc(13117);return null;
        }finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}

        public Iterator getPrefixes(String val) {try{__CLR4_5_2a28a28lvluliti.R.inc(13118);
            __CLR4_5_2a28a28lvluliti.R.inc(13119);return Arrays.asList("ttml", "smpte").iterator();
        }finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}

        public String getPrefix(String uri) {try{__CLR4_5_2a28a28lvluliti.R.inc(13120);
            __CLR4_5_2a28a28lvluliti.R.inc(13121);if ((((uri.equals(TTML_NAMESPACE))&&(__CLR4_5_2a28a28lvluliti.R.iget(13122)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13123)==0&false))) {{
                __CLR4_5_2a28a28lvluliti.R.inc(13124);return "ttml";
            }
            }__CLR4_5_2a28a28lvluliti.R.inc(13125);if ((((uri.equals(SMPTE_TT_NAMESPACE))&&(__CLR4_5_2a28a28lvluliti.R.iget(13126)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13127)==0&false))) {{
                __CLR4_5_2a28a28lvluliti.R.inc(13128);return "smpte";
            }
            }__CLR4_5_2a28a28lvluliti.R.inc(13129);return null;
        }finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}
    }

    public static void pretty(Document document, OutputStream outputStream, int indent) throws IOException {try{__CLR4_5_2a28a28lvluliti.R.inc(13130);
        __CLR4_5_2a28a28lvluliti.R.inc(13131);TransformerFactory transformerFactory = TransformerFactory.newInstance();
        __CLR4_5_2a28a28lvluliti.R.inc(13132);Transformer transformer = null;
        __CLR4_5_2a28a28lvluliti.R.inc(13133);try {
            __CLR4_5_2a28a28lvluliti.R.inc(13134);transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException e) {
            __CLR4_5_2a28a28lvluliti.R.inc(13135);throw new RuntimeException(e);
        }
        __CLR4_5_2a28a28lvluliti.R.inc(13136);transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        __CLR4_5_2a28a28lvluliti.R.inc(13137);if ((((indent > 0)&&(__CLR4_5_2a28a28lvluliti.R.iget(13138)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13139)==0&false))) {{
            __CLR4_5_2a28a28lvluliti.R.inc(13140);transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            __CLR4_5_2a28a28lvluliti.R.inc(13141);transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", Integer.toString(indent));
        }
        }__CLR4_5_2a28a28lvluliti.R.inc(13142);Result result = new StreamResult(outputStream);
        __CLR4_5_2a28a28lvluliti.R.inc(13143);Source source = new DOMSource(document);
        __CLR4_5_2a28a28lvluliti.R.inc(13144);try {
            __CLR4_5_2a28a28lvluliti.R.inc(13145);transformer.transform(source, result);
        } catch (TransformerException e) {
            __CLR4_5_2a28a28lvluliti.R.inc(13146);throw new IOException(e);
        }
    }finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}


    public static long getStartTime(Node p) {try{__CLR4_5_2a28a28lvluliti.R.inc(13147);
        __CLR4_5_2a28a28lvluliti.R.inc(13148);long time = 0;
        __CLR4_5_2a28a28lvluliti.R.inc(13149);Node current = p;
        __CLR4_5_2a28a28lvluliti.R.inc(13150);while ((current = current.getParentNode()) != null) {{
            __CLR4_5_2a28a28lvluliti.R.inc(13153);if ((((current.getAttributes() != null && current.getAttributes().getNamedItem("begin") != null)&&(__CLR4_5_2a28a28lvluliti.R.iget(13154)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13155)==0&false))) {{
                __CLR4_5_2a28a28lvluliti.R.inc(13156);time += toTime(current.getAttributes().getNamedItem("begin").getNodeValue());
            }
        }}

        }__CLR4_5_2a28a28lvluliti.R.inc(13157);if ((((p.getAttributes() != null && p.getAttributes().getNamedItem("begin") != null)&&(__CLR4_5_2a28a28lvluliti.R.iget(13158)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13159)==0&false))) {{
            __CLR4_5_2a28a28lvluliti.R.inc(13160);return time + toTime(p.getAttributes().getNamedItem("begin").getNodeValue());
        }
        }__CLR4_5_2a28a28lvluliti.R.inc(13161);return time;
    }finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}

    public static long getEndTime(Node p) {try{__CLR4_5_2a28a28lvluliti.R.inc(13162);
        __CLR4_5_2a28a28lvluliti.R.inc(13163);long time = 0;
        __CLR4_5_2a28a28lvluliti.R.inc(13164);Node current = p;
        __CLR4_5_2a28a28lvluliti.R.inc(13165);while ((current = current.getParentNode()) != null) {{
            __CLR4_5_2a28a28lvluliti.R.inc(13168);if ((((current.getAttributes() != null && current.getAttributes().getNamedItem("begin") != null)&&(__CLR4_5_2a28a28lvluliti.R.iget(13169)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13170)==0&false))) {{
                __CLR4_5_2a28a28lvluliti.R.inc(13171);time += toTime(current.getAttributes().getNamedItem("begin").getNodeValue());
            }
        }}

        }__CLR4_5_2a28a28lvluliti.R.inc(13172);if ((((p.getAttributes() != null && p.getAttributes().getNamedItem("end") != null)&&(__CLR4_5_2a28a28lvluliti.R.iget(13173)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13174)==0&false))) {{
            __CLR4_5_2a28a28lvluliti.R.inc(13175);return time + toTime(p.getAttributes().getNamedItem("end").getNodeValue());
        }
        }__CLR4_5_2a28a28lvluliti.R.inc(13176);return time;
    }finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}

    public static void deepCopyDocument(Document ttml, File target) throws IOException {try{__CLR4_5_2a28a28lvluliti.R.inc(13177);
        __CLR4_5_2a28a28lvluliti.R.inc(13178);try {
            __CLR4_5_2a28a28lvluliti.R.inc(13179);XPathFactory xPathfactory = XPathFactory.newInstance();
            __CLR4_5_2a28a28lvluliti.R.inc(13180);XPath xpath = xPathfactory.newXPath();
            __CLR4_5_2a28a28lvluliti.R.inc(13181);XPathExpression expr = xpath.compile("//*/@backgroundImage");
            __CLR4_5_2a28a28lvluliti.R.inc(13182);NodeList nl = (NodeList) expr.evaluate(ttml, XPathConstants.NODESET);
            __CLR4_5_2a28a28lvluliti.R.inc(13183);for (int i = 0; (((i < nl.getLength())&&(__CLR4_5_2a28a28lvluliti.R.iget(13184)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13185)==0&false)); i++) {{
                __CLR4_5_2a28a28lvluliti.R.inc(13186);Node backgroundImage = nl.item(i);
                __CLR4_5_2a28a28lvluliti.R.inc(13187);URI backgroundImageUri = URI.create(backgroundImage.getNodeValue());
                __CLR4_5_2a28a28lvluliti.R.inc(13188);if ((((!backgroundImageUri.isAbsolute())&&(__CLR4_5_2a28a28lvluliti.R.iget(13189)!=0|true))||(__CLR4_5_2a28a28lvluliti.R.iget(13190)==0&false))) {{
                    __CLR4_5_2a28a28lvluliti.R.inc(13191);copyLarge(new URI(ttml.getDocumentURI()).resolve(backgroundImageUri).toURL().openStream(), new File(target.toURI().resolve(backgroundImageUri).toURL().getFile()));
                }
            }}
            }__CLR4_5_2a28a28lvluliti.R.inc(13192);copyLarge(new URI(ttml.getDocumentURI()).toURL().openStream(), target);

        } catch (XPathExpressionException e) {
            __CLR4_5_2a28a28lvluliti.R.inc(13193);throw new IOException(e);
        } catch (URISyntaxException e) {
            __CLR4_5_2a28a28lvluliti.R.inc(13194);throw new IOException(e);
        }
    }finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}

    private static long copyLarge(InputStream input, File outputFile)
            throws IOException {try{__CLR4_5_2a28a28lvluliti.R.inc(13195);
        __CLR4_5_2a28a28lvluliti.R.inc(13196);byte[] buffer = new byte[16384];
        __CLR4_5_2a28a28lvluliti.R.inc(13197);long count = 0;
        __CLR4_5_2a28a28lvluliti.R.inc(13198);int n = 0;
        __CLR4_5_2a28a28lvluliti.R.inc(13199);outputFile.getParentFile().mkdirs();
        __CLR4_5_2a28a28lvluliti.R.inc(13200);FileOutputStream output = new FileOutputStream(outputFile);
        __CLR4_5_2a28a28lvluliti.R.inc(13201);try {
            __CLR4_5_2a28a28lvluliti.R.inc(13202);while (-1 != (n = input.read(buffer))) {{
                __CLR4_5_2a28a28lvluliti.R.inc(13205);output.write(buffer, 0, n);
                __CLR4_5_2a28a28lvluliti.R.inc(13206);count += n;
            }
        }} finally {
            __CLR4_5_2a28a28lvluliti.R.inc(13207);output.close();
        }
        __CLR4_5_2a28a28lvluliti.R.inc(13208);return count;
    }finally{__CLR4_5_2a28a28lvluliti.R.flushNeeded();}}
}
