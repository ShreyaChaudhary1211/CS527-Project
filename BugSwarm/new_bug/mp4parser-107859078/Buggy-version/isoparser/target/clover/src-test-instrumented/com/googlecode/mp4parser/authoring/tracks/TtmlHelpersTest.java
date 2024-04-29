/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers;
import com.googlecode.mp4parser.authoring.tracks.ttml.TtmlTrackImpl;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import static com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTime;
import static com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTimeExpression;

/**
 * Created by sannies on 06.08.2015.
 */
public class TtmlHelpersTest {static class __CLR4_5_2j24j24lvl9emrn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,24733,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testToTime() throws Exception {__CLR4_5_2j24j24lvl9emrn.R.globalSliceStart(getClass().getName(),24700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rgq529j24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j24j24lvl9emrn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j24j24lvl9emrn.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.tracks.TtmlHelpersTest.testToTime",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24700,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rgq529j24() throws Exception{try{__CLR4_5_2j24j24lvl9emrn.R.inc(24700);
        __CLR4_5_2j24j24lvl9emrn.R.inc(24701);Assert.assertEquals(-3599000, toTime("-00:59:59.000"));
        __CLR4_5_2j24j24lvl9emrn.R.inc(24702);Assert.assertEquals(3599000, toTime("00:59:59.000"));
    }finally{__CLR4_5_2j24j24lvl9emrn.R.flushNeeded();}}

    @Test
    public void testToTimeExpression() throws Exception {__CLR4_5_2j24j24lvl9emrn.R.globalSliceStart(getClass().getName(),24703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26mmhlzj27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j24j24lvl9emrn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j24j24lvl9emrn.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.tracks.TtmlHelpersTest.testToTimeExpression",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24703,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26mmhlzj27() throws Exception{try{__CLR4_5_2j24j24lvl9emrn.R.inc(24703);
        __CLR4_5_2j24j24lvl9emrn.R.inc(24704);Assert.assertEquals("-00:59:59.009", toTimeExpression(-3599009));
        __CLR4_5_2j24j24lvl9emrn.R.inc(24705);Assert.assertEquals("00:59:59.010", toTimeExpression(3599010));
    }finally{__CLR4_5_2j24j24lvl9emrn.R.flushNeeded();}}

    @Test
    public void testDeepCopyDocument() throws IOException, ParserConfigurationException, SAXException, XPathExpressionException, URISyntaxException {__CLR4_5_2j24j24lvl9emrn.R.globalSliceStart(getClass().getName(),24706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28sxtytj2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j24j24lvl9emrn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j24j24lvl9emrn.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.tracks.TtmlHelpersTest.testDeepCopyDocument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24706,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28sxtytj2a() throws IOException, ParserConfigurationException, SAXException, XPathExpressionException, URISyntaxException{try{__CLR4_5_2j24j24lvl9emrn.R.inc(24706);
        __CLR4_5_2j24j24lvl9emrn.R.inc(24707);DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        __CLR4_5_2j24j24lvl9emrn.R.inc(24708);DocumentBuilder db = documentBuilderFactory.newDocumentBuilder();
        __CLR4_5_2j24j24lvl9emrn.R.inc(24709);Document ttml = db.parse(new InputSource(TtmlHelpersTest.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "/com/googlecode/mp4parser/authoring/tracks/ttml/tos-chapters-en.xml"));
        //Document ttml = db.parse(new InputSource("http://localhost/mp4parser/isoparser/src/test/resources/com/googlecode/mp4parser/authoring/tracks/ttml/tos-chapters-en.xml"));
        __CLR4_5_2j24j24lvl9emrn.R.inc(24710);File master = File.createTempFile("TtmlHelpersTest", "testDeepCopyDocument");
        __CLR4_5_2j24j24lvl9emrn.R.inc(24711);master.delete();
        __CLR4_5_2j24j24lvl9emrn.R.inc(24712);master.mkdir();

        __CLR4_5_2j24j24lvl9emrn.R.inc(24713);File f = new File(master, "target");


        __CLR4_5_2j24j24lvl9emrn.R.inc(24714);File targetFile = new File(f, "subs.xml");

        __CLR4_5_2j24j24lvl9emrn.R.inc(24715);TtmlHelpers.deepCopyDocument(ttml, targetFile);


        __CLR4_5_2j24j24lvl9emrn.R.inc(24716);Document copy = db.parse(new InputSource(targetFile.getAbsolutePath()));

        __CLR4_5_2j24j24lvl9emrn.R.inc(24717);XPathFactory xPathfactory = XPathFactory.newInstance();
        __CLR4_5_2j24j24lvl9emrn.R.inc(24718);XPath xpath = xPathfactory.newXPath();
        __CLR4_5_2j24j24lvl9emrn.R.inc(24719);XPathExpression expr = xpath.compile("//*/@backgroundImage");
        __CLR4_5_2j24j24lvl9emrn.R.inc(24720);NodeList nl = (NodeList) expr.evaluate(copy, XPathConstants.NODESET);
        __CLR4_5_2j24j24lvl9emrn.R.inc(24721);for (int i = 0; (((i < nl.getLength())&&(__CLR4_5_2j24j24lvl9emrn.R.iget(24722)!=0|true))||(__CLR4_5_2j24j24lvl9emrn.R.iget(24723)==0&false)); i++) {{
            __CLR4_5_2j24j24lvl9emrn.R.inc(24724);Node backgroundImage = nl.item(i);
            __CLR4_5_2j24j24lvl9emrn.R.inc(24725);URI backgroundImageUri = URI.create(backgroundImage.getNodeValue());
            __CLR4_5_2j24j24lvl9emrn.R.inc(24726);File bgImg = new File(new URI(copy.getDocumentURI()).resolve(backgroundImageUri));
            __CLR4_5_2j24j24lvl9emrn.R.inc(24727);Assert.assertTrue(bgImg.exists());
            __CLR4_5_2j24j24lvl9emrn.R.inc(24728);Assert.assertTrue(bgImg.delete());
            __CLR4_5_2j24j24lvl9emrn.R.inc(24729);bgImg.getParentFile().delete();
        }
        }__CLR4_5_2j24j24lvl9emrn.R.inc(24730);Assert.assertTrue(targetFile.delete());
        __CLR4_5_2j24j24lvl9emrn.R.inc(24731);Assert.assertTrue(f.delete());
        __CLR4_5_2j24j24lvl9emrn.R.inc(24732);Assert.assertTrue(master.delete());



    }finally{__CLR4_5_2j24j24lvl9emrn.R.flushNeeded();}}
}