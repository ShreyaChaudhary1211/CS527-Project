/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.IRI;

/**
 * This class will eventually replace the id to uri translation in Owl2Obo and
 * OboO2Owl <br>
 * It is currently in-progress.
 * 
 * @author cjm
 */
public class IdTranslator {public static class __CLR4_5_2kakalvicmsww{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,760,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    static final String OBO_IRI_PREFIX = "http://purl.obolibrary.org/obo/";
    @Nonnull
    private final Map<String, String> idspaceMap = new HashMap<>();

    /**
     * @param iri
     *        iri
     * @return string for iri
     */
    @Nullable
    public static String translateIRI(@SuppressWarnings("unused") IRI iri) {try{__CLR4_5_2kakalvicmsww.R.inc(730);
        __CLR4_5_2kakalvicmsww.R.inc(731);return null;
    }finally{__CLR4_5_2kakalvicmsww.R.flushNeeded();}}

    /**
     * @param id
     *        id
     * @return string for id
     */
    @Nullable
    public String translateIdToIRIString(@Nonnull String id) {try{__CLR4_5_2kakalvicmsww.R.inc(732);
        __CLR4_5_2kakalvicmsww.R.inc(733);if ((((isURI(id))&&(__CLR4_5_2kakalvicmsww.R.iget(734)!=0|true))||(__CLR4_5_2kakalvicmsww.R.iget(735)==0&false))) {{
            __CLR4_5_2kakalvicmsww.R.inc(736);return id;
        }
        }__CLR4_5_2kakalvicmsww.R.inc(737);if ((((id.contains(":"))&&(__CLR4_5_2kakalvicmsww.R.iget(738)!=0|true))||(__CLR4_5_2kakalvicmsww.R.iget(739)==0&false))) {{
            // PREFIXED ID
            __CLR4_5_2kakalvicmsww.R.inc(740);int p = id.lastIndexOf(':');
            __CLR4_5_2kakalvicmsww.R.inc(741);String prefix = id.substring(0, p);
            __CLR4_5_2kakalvicmsww.R.inc(742);String localId = id.substring(p + 1);
            __CLR4_5_2kakalvicmsww.R.inc(743);if ((((!localId.isEmpty() && localId.replaceAll("[0-9]", "").isEmpty())&&(__CLR4_5_2kakalvicmsww.R.iget(744)!=0|true))||(__CLR4_5_2kakalvicmsww.R.iget(745)==0&false))) {{
                // CANONICAL
                __CLR4_5_2kakalvicmsww.R.inc(746);return expandPrefix(prefix) + localId;
            }
        }}
        }__CLR4_5_2kakalvicmsww.R.inc(747);return null;
    }finally{__CLR4_5_2kakalvicmsww.R.flushNeeded();}}

    /**
     * True if id starts with a standard URI prefix (http, ftp, https) followed
     * by a ":". Does not check if it actually conforms to URI syntax.
     * 
     * @param id
     *        id
     * @return boolean
     */
    public static boolean isURI(@Nonnull String id) {try{__CLR4_5_2kakalvicmsww.R.inc(748);
        __CLR4_5_2kakalvicmsww.R.inc(749);if ((((id.startsWith("http:") || id.startsWith("ftp:") || id.startsWith("https:"))&&(__CLR4_5_2kakalvicmsww.R.iget(750)!=0|true))||(__CLR4_5_2kakalvicmsww.R.iget(751)==0&false))) {{
            __CLR4_5_2kakalvicmsww.R.inc(752);return true;
        }
        }__CLR4_5_2kakalvicmsww.R.inc(753);return false;
    }finally{__CLR4_5_2kakalvicmsww.R.flushNeeded();}}

    /**
     * Expands an OBO prefix such as "GO" to
     * "http://purl.obolibrary.org/obo/GO_". By default a prefix XX maps to
     * http://purl.obolibrary.org/obo/XX_
     * 
     * @param prefix
     *        prefix
     * @return expanded prefix
     */
    public String expandPrefix(String prefix) {try{__CLR4_5_2kakalvicmsww.R.inc(754);
        __CLR4_5_2kakalvicmsww.R.inc(755);if ((((idspaceMap.containsKey(prefix))&&(__CLR4_5_2kakalvicmsww.R.iget(756)!=0|true))||(__CLR4_5_2kakalvicmsww.R.iget(757)==0&false))) {{
            __CLR4_5_2kakalvicmsww.R.inc(758);return idspaceMap.get(prefix);
        }
        }__CLR4_5_2kakalvicmsww.R.inc(759);return OBO_IRI_PREFIX + prefix + '_';
    }finally{__CLR4_5_2kakalvicmsww.R.flushNeeded();}}
}
