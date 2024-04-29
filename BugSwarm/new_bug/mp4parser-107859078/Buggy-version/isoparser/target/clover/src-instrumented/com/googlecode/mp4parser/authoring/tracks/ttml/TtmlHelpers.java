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


public class TtmlHelpers {public static class __CLR4_5_29zl9zllvl9eiwe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,13114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) throws URISyntaxException, ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(12945);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12946);DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12947);dbf.setNamespaceAware(true);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12948);DocumentBuilder builder = dbf.newDocumentBuilder();
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12949);Document doc = builder.parse("C:\\dev\\mp4parser\\a.xml");
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12950);List<Document> split = TtmlSegmenter.split(doc, 60);
/*        for (Document document : split) {
            pretty(document, System.out, 4);
        }*/
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12951);Track t = new TtmlTrackImpl("a.xml", split);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12952);Movie m = new Movie();
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12953);m.addTrack(t);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12954);Container c = new DefaultMp4Builder().build(m);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12955);c.writeContainer(new FileOutputStream("output.mp4").getChannel());
    }finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}

    public static String[] getAllNamespaces(Document doc) {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(12956);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12957);TransformerFactory tf = TransformerFactory.newInstance();
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12958);Transformer transformer;
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12959);try {
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12960);transformer = tf.newTransformer(new StreamSource(new ByteArrayInputStream(namespacesStyleSheet1)));
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12961);StringWriter sw = new StringWriter();
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12962);transformer.transform(new DOMSource(doc), new StreamResult(sw));
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12963);List<String> r = new ArrayList<String>(new LinkedHashSet<String>(Arrays.asList(sw.getBuffer().toString().split("\n"))));
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12964);return r.toArray(new String[r.size()]);
        } catch (TransformerConfigurationException e) {
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12965);throw new RuntimeException(e);
        } catch (TransformerException e) {
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12966);throw new RuntimeException(e);
        }

    }finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}


    public static String toTimeExpression(long ms) {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(12967);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12968);return toTimeExpression(ms, -1);
    }finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}

    public static String toTimeExpression(long ms, int frames) {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(12969);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12970);String minus = (((ms >= 0 )&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(12971)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(12972)==0&false))? "" : "-";
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12973);ms = Math.abs(ms);

        __CLR4_5_29zl9zllvl9eiwe.R.inc(12974);long hours = ms / 1000 / 60 / 60;
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12975);ms -= hours * 1000 * 60 * 60;

        __CLR4_5_29zl9zllvl9eiwe.R.inc(12976);long minutes = ms / 1000 / 60;
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12977);ms -= minutes * 1000 * 60;

        __CLR4_5_29zl9zllvl9eiwe.R.inc(12978);long seconds = ms / 1000;
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12979);ms -= seconds * 1000;
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12980);if ((((frames >= 0)&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(12981)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(12982)==0&false))) {{
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12983);return String.format("%s%02d:%02d:%02d:%d", minus, hours, minutes, seconds, frames);
        } }else {{
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12984);return String.format("%s%02d:%02d:%02d.%03d", minus, hours, minutes, seconds, ms);
        }
    }}finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}

    public static long toTime(String expr) {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(12985);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12986);Pattern p = Pattern.compile("(-?)([0-9][0-9]):([0-9][0-9]):([0-9][0-9])([\\.:][0-9][0-9]?[0-9]?)?");
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12987);Matcher m = p.matcher(expr);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(12988);if ((((m.matches())&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(12989)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(12990)==0&false))) {{
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12991);String minus = m.group(1);
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12992);String hours = m.group(2);
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12993);String minutes = m.group(3);
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12994);String seconds = m.group(4);
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12995);String fraction = m.group(5);
            __CLR4_5_29zl9zllvl9eiwe.R.inc(12996);if ((((fraction == null)&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(12997)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(12998)==0&false))) {{
                __CLR4_5_29zl9zllvl9eiwe.R.inc(12999);fraction = ".000";
            }

            }__CLR4_5_29zl9zllvl9eiwe.R.inc(13000);fraction = fraction.replace(":", ".");
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13001);long ms = Long.parseLong(hours) * 60 * 60 * 1000;
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13002);ms += Long.parseLong(minutes) * 60 * 1000;
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13003);ms += Long.parseLong(seconds) * 1000;
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13004);if ((((fraction.contains(":"))&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13005)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13006)==0&false))) {{
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13007);ms += Double.parseDouble("0" + fraction.replace(":", ".")) * 40 * 1000; // 40ms == 25fps - simplifying assumption should be ok for here
            } }else {{
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13008);ms += Double.parseDouble("0" + fraction) * 1000;
            }

            }__CLR4_5_29zl9zllvl9eiwe.R.inc(13009);return ms * (((("-".equals(minus) )&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13010)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13011)==0&false))? -1 : 1);
        } }else {{
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13012);throw new RuntimeException("Cannot match '" + expr + "' to time expression");
        }
    }}finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}


    public static final String SMPTE_TT_NAMESPACE = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt";
    public static final String TTML_NAMESPACE = "http://www.w3.org/ns/ttml";

    public static final NamespaceContext NAMESPACE_CONTEXT = new TextTrackNamespaceContext();

    private static class TextTrackNamespaceContext implements NamespaceContext {


        public String getNamespaceURI(String prefix) {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(13013);
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13014);if ((((prefix.equals("ttml"))&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13015)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13016)==0&false))) {{
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13017);return TTML_NAMESPACE;
            }
            }__CLR4_5_29zl9zllvl9eiwe.R.inc(13018);if ((((prefix.equals("smpte"))&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13019)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13020)==0&false))) {{
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13021);return SMPTE_TT_NAMESPACE;
            }
            }__CLR4_5_29zl9zllvl9eiwe.R.inc(13022);return null;
        }finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}

        public Iterator getPrefixes(String val) {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(13023);
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13024);return Arrays.asList("ttml", "smpte").iterator();
        }finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}

        public String getPrefix(String uri) {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(13025);
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13026);if ((((uri.equals(TTML_NAMESPACE))&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13027)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13028)==0&false))) {{
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13029);return "ttml";
            }
            }__CLR4_5_29zl9zllvl9eiwe.R.inc(13030);if ((((uri.equals(SMPTE_TT_NAMESPACE))&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13031)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13032)==0&false))) {{
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13033);return "smpte";
            }
            }__CLR4_5_29zl9zllvl9eiwe.R.inc(13034);return null;
        }finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}
    }

    public static void pretty(Document document, OutputStream outputStream, int indent) throws IOException {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(13035);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13036);TransformerFactory transformerFactory = TransformerFactory.newInstance();
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13037);Transformer transformer = null;
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13038);try {
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13039);transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException e) {
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13040);throw new RuntimeException(e);
        }
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13041);transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13042);if ((((indent > 0)&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13043)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13044)==0&false))) {{
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13045);transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13046);transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", Integer.toString(indent));
        }
        }__CLR4_5_29zl9zllvl9eiwe.R.inc(13047);Result result = new StreamResult(outputStream);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13048);Source source = new DOMSource(document);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13049);try {
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13050);transformer.transform(source, result);
        } catch (TransformerException e) {
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13051);throw new IOException(e);
        }
    }finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}


    public static long getStartTime(Node p) {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(13052);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13053);long time = 0;
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13054);Node current = p;
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13055);while ((current = current.getParentNode()) != null) {{
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13058);if ((((current.getAttributes() != null && current.getAttributes().getNamedItem("begin") != null)&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13059)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13060)==0&false))) {{
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13061);time += toTime(current.getAttributes().getNamedItem("begin").getNodeValue());
            }
        }}

        }__CLR4_5_29zl9zllvl9eiwe.R.inc(13062);if ((((p.getAttributes() != null && p.getAttributes().getNamedItem("begin") != null)&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13063)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13064)==0&false))) {{
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13065);return time + toTime(p.getAttributes().getNamedItem("begin").getNodeValue());
        }
        }__CLR4_5_29zl9zllvl9eiwe.R.inc(13066);return time;
    }finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}

    public static long getEndTime(Node p) {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(13067);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13068);long time = 0;
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13069);Node current = p;
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13070);while ((current = current.getParentNode()) != null) {{
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13073);if ((((current.getAttributes() != null && current.getAttributes().getNamedItem("begin") != null)&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13074)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13075)==0&false))) {{
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13076);time += toTime(current.getAttributes().getNamedItem("begin").getNodeValue());
            }
        }}

        }__CLR4_5_29zl9zllvl9eiwe.R.inc(13077);if ((((p.getAttributes() != null && p.getAttributes().getNamedItem("end") != null)&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13078)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13079)==0&false))) {{
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13080);return time + toTime(p.getAttributes().getNamedItem("end").getNodeValue());
        }
        }__CLR4_5_29zl9zllvl9eiwe.R.inc(13081);return time;
    }finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}

    public static void deepCopyDocument(Document ttml, File target) throws IOException {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(13082);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13083);try {
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13084);XPathFactory xPathfactory = XPathFactory.newInstance();
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13085);XPath xpath = xPathfactory.newXPath();
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13086);XPathExpression expr = xpath.compile("//*/@backgroundImage");
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13087);NodeList nl = (NodeList) expr.evaluate(ttml, XPathConstants.NODESET);
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13088);for (int i = 0; (((i < nl.getLength())&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13089)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13090)==0&false)); i++) {{
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13091);Node backgroundImage = nl.item(i);
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13092);URI backgroundImageUri = URI.create(backgroundImage.getNodeValue());
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13093);if ((((!backgroundImageUri.isAbsolute())&&(__CLR4_5_29zl9zllvl9eiwe.R.iget(13094)!=0|true))||(__CLR4_5_29zl9zllvl9eiwe.R.iget(13095)==0&false))) {{
                    __CLR4_5_29zl9zllvl9eiwe.R.inc(13096);copyLarge(new URI(ttml.getDocumentURI()).resolve(backgroundImageUri).toURL().openStream(), new File(target.toURI().resolve(backgroundImageUri).toURL().getFile()));
                }
            }}
            }__CLR4_5_29zl9zllvl9eiwe.R.inc(13097);copyLarge(new URI(ttml.getDocumentURI()).toURL().openStream(), target);

        } catch (XPathExpressionException e) {
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13098);throw new IOException(e);
        } catch (URISyntaxException e) {
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13099);throw new IOException(e);
        }
    }finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}

    private static long copyLarge(InputStream input, File outputFile)
            throws IOException {try{__CLR4_5_29zl9zllvl9eiwe.R.inc(13100);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13101);byte[] buffer = new byte[16384];
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13102);long count = 0;
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13103);int n = 0;
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13104);outputFile.getParentFile().mkdirs();
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13105);FileOutputStream output = new FileOutputStream(outputFile);
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13106);try {
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13107);while (-1 != (n = input.read(buffer))) {{
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13110);output.write(buffer, 0, n);
                __CLR4_5_29zl9zllvl9eiwe.R.inc(13111);count += n;
            }
        }} finally {
            __CLR4_5_29zl9zllvl9eiwe.R.inc(13112);output.close();
        }
        __CLR4_5_29zl9zllvl9eiwe.R.inc(13113);return count;
    }finally{__CLR4_5_29zl9zllvl9eiwe.R.flushNeeded();}}
}
