/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi;

/**
 * Created by ses on 3/5/15.
 */
import static org.junit.Assert.*;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

import org.apache.felix.framework.FrameworkFactory;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.launch.Framework;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.test.IntegrationTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("javadoc")
@Category(IntegrationTest.class)
public class BundleIsLoadableIntegrationTestCase {static class __CLR4_5_2jjlvics1i0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0073\u0067\u0069\u0064\u0069\u0073\u0074\u0072\u0069\u0062\u0075\u0074\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237553181L,8589935092L,80,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Logger logger = LoggerFactory
        .getLogger(BundleIsLoadableIntegrationTestCase.class);

    @Test
    public void startBundle() throws BundleException, ClassNotFoundException,
        IllegalAccessException, InstantiationException {__CLR4_5_2jjlvics1i0.R.globalSliceStart(getClass().getName(),19);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hwe53fj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jjlvics1i0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jjlvics1i0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.BundleIsLoadableIntegrationTestCase.startBundle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),19,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hwe53fj() throws BundleException, ClassNotFoundException, IllegalAccessException, InstantiationException{try{__CLR4_5_2jjlvics1i0.R.inc(19);
        __CLR4_5_2jjlvics1i0.R.inc(20);Map<String, String> configuration = new HashMap<>();
        __CLR4_5_2jjlvics1i0.R.inc(21);configuration.put("org.osgi.framework.storage.clean", "onFirstInit");
        __CLR4_5_2jjlvics1i0.R.inc(22);configuration.put("felix.log.level", "4");
        __CLR4_5_2jjlvics1i0.R.inc(23);String path = new File("felix-cache").getAbsolutePath();
        __CLR4_5_2jjlvics1i0.R.inc(24);configuration.put("org.osgi.framework.storage", path);
        __CLR4_5_2jjlvics1i0.R.inc(25);FrameworkFactory frameworkFactory = new FrameworkFactory();
        __CLR4_5_2jjlvics1i0.R.inc(26);Framework framework = frameworkFactory.newFramework(configuration);
        __CLR4_5_2jjlvics1i0.R.inc(27);assertNotEquals("framework state", framework.getState(), Bundle.ACTIVE);
        __CLR4_5_2jjlvics1i0.R.inc(28);framework.start();
        __CLR4_5_2jjlvics1i0.R.inc(29);assertEquals("framework state", framework.getState(), Bundle.ACTIVE);
        __CLR4_5_2jjlvics1i0.R.inc(30);File dir = new File("target/");
        __CLR4_5_2jjlvics1i0.R.inc(31);dir = dir.getAbsoluteFile();
        __CLR4_5_2jjlvics1i0.R.inc(32);File file = null;
        __CLR4_5_2jjlvics1i0.R.inc(33);File[] files = dir.listFiles();
        __CLR4_5_2jjlvics1i0.R.inc(34);for (File f : files) {{
            __CLR4_5_2jjlvics1i0.R.inc(35);String fileName = f.getAbsolutePath();
            __CLR4_5_2jjlvics1i0.R.inc(36);if ((((fileName.endsWith("jar") && !fileName.contains("sources")
                && !fileName.contains("javadoc"))&&(__CLR4_5_2jjlvics1i0.R.iget(37)!=0|true))||(__CLR4_5_2jjlvics1i0.R.iget(38)==0&false))) {{
                __CLR4_5_2jjlvics1i0.R.inc(39);file = f;
                __CLR4_5_2jjlvics1i0.R.inc(40);break;
            }
        }}
        }__CLR4_5_2jjlvics1i0.R.inc(41);assertNotNull("file is null", file);
        __CLR4_5_2jjlvics1i0.R.inc(42);URI uri = file.toURI();
        __CLR4_5_2jjlvics1i0.R.inc(43);assertNotNull("uri is null", uri);
        __CLR4_5_2jjlvics1i0.R.inc(44);BundleContext context = framework.getBundleContext();
        __CLR4_5_2jjlvics1i0.R.inc(45);assertNotNull("context is null", context);
        __CLR4_5_2jjlvics1i0.R.inc(46);List<String> bundles = Arrays.asList("javax-inject", "aopalliance",
            "guava", "guice-multibindings", "guice-assistedinject", "guice-4",
            "aopalliance", "commons-io", "commons-codec", "slf4j-simple", "jcl-over-slf4j", "slf4j-api");
        __CLR4_5_2jjlvics1i0.R.inc(47);for (String bundleName : bundles) {{
            __CLR4_5_2jjlvics1i0.R.inc(48);try {
                __CLR4_5_2jjlvics1i0.R.inc(49);String simple = getJarURL(bundleName);
                __CLR4_5_2jjlvics1i0.R.inc(50);if ((((simple.isEmpty())&&(__CLR4_5_2jjlvics1i0.R.iget(51)!=0|true))||(__CLR4_5_2jjlvics1i0.R.iget(52)==0&false))) {{
                    __CLR4_5_2jjlvics1i0.R.inc(53);logger.info("Can't install " + bundleName + ";");
                }
                }__CLR4_5_2jjlvics1i0.R.inc(54);Bundle simpleLoggerBundle = context.installBundle(simple);
                __CLR4_5_2jjlvics1i0.R.inc(55);try {
                    __CLR4_5_2jjlvics1i0.R.inc(56);simpleLoggerBundle.start();
                } catch (BundleException e) {
                    __CLR4_5_2jjlvics1i0.R.inc(57);e.printStackTrace();
                }
            } catch (Throwable e) {
                __CLR4_5_2jjlvics1i0.R.inc(58);logger.info("Can't install: " + bundleName, e);
            }
        }
        }__CLR4_5_2jjlvics1i0.R.inc(59);Bundle bundle = context.installBundle(uri.toString());
        __CLR4_5_2jjlvics1i0.R.inc(60);assertNotNull(bundle);
        __CLR4_5_2jjlvics1i0.R.inc(61);bundle.start();
        __CLR4_5_2jjlvics1i0.R.inc(62);assertEquals("bundle state", bundle.getState(), Bundle.ACTIVE);
        __CLR4_5_2jjlvics1i0.R.inc(63);Class<?> owlManagerClass = bundle
            .loadClass("org.semanticweb.owlapi.apibinding.OWLManager");
        __CLR4_5_2jjlvics1i0.R.inc(64);assertNotNull("no class owlmanager", owlManagerClass);
        __CLR4_5_2jjlvics1i0.R.inc(65);owlManagerClass.newInstance();
        __CLR4_5_2jjlvics1i0.R.inc(66);assertNotEquals(
            "OWLManager class from bundle class loader  equals OWLManager class from system class path",
            OWLManager.class, owlManagerClass);
    }finally{__CLR4_5_2jjlvics1i0.R.flushNeeded();}}

    @Nonnull
    private String getJarURL(String jarNameFragment) {try{__CLR4_5_2jjlvics1i0.R.inc(67);
        __CLR4_5_2jjlvics1i0.R.inc(68);ClassLoader classLoader = getClass().getClassLoader();
        __CLR4_5_2jjlvics1i0.R.inc(69);if ((((classLoader instanceof URLClassLoader)&&(__CLR4_5_2jjlvics1i0.R.iget(70)!=0|true))||(__CLR4_5_2jjlvics1i0.R.iget(71)==0&false))) {{
            __CLR4_5_2jjlvics1i0.R.inc(72);for (URL url : ((URLClassLoader) classLoader).getURLs()) {{
                __CLR4_5_2jjlvics1i0.R.inc(73);String string = url.toString();
                __CLR4_5_2jjlvics1i0.R.inc(74);if ((((string.contains(jarNameFragment))&&(__CLR4_5_2jjlvics1i0.R.iget(75)!=0|true))||(__CLR4_5_2jjlvics1i0.R.iget(76)==0&false))) {{
                    __CLR4_5_2jjlvics1i0.R.inc(77);System.out.println("BundleIsLoadableIntegrationTestCase.getJarURL() " + string);
                    __CLR4_5_2jjlvics1i0.R.inc(78);return string;
                }
            }}
        }}
        }__CLR4_5_2jjlvics1i0.R.inc(79);return "";
    }finally{__CLR4_5_2jjlvics1i0.R.flushNeeded();}}
}
