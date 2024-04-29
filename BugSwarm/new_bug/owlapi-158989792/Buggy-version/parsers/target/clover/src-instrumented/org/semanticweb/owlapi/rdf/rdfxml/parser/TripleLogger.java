/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.rdf.rdfxml.parser;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.model.PrefixManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Wrapper for triple logging functions.
 * 
 * @author ignazio
 * @since 4.0.0
 */
public class TripleLogger {public static class __CLR4_5_2rikriklvicmd41{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,35709,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOGGER = LoggerFactory
            .getLogger(TripleLogger.class);
    private PrefixManager prefixManager;
    // Debug stuff
    private final AtomicInteger count = new AtomicInteger();

    /**
     * @param prefixManager
     *        prefix manager
     */
    public void setPrefixManager(@Nullable PrefixManager prefixManager) {try{__CLR4_5_2rikriklvicmd41.R.inc(35660);
        __CLR4_5_2rikriklvicmd41.R.inc(35661);this.prefixManager = prefixManager;
    }finally{__CLR4_5_2rikriklvicmd41.R.flushNeeded();}}

    /** @return triples counted */
    public int count() {try{__CLR4_5_2rikriklvicmd41.R.inc(35662);
        __CLR4_5_2rikriklvicmd41.R.inc(35663);return count.get();
    }finally{__CLR4_5_2rikriklvicmd41.R.flushNeeded();}}

    /**
     * log triples at debug level and increment triple count
     * 
     * @param s
     *        subject
     * @param p
     *        predicate
     * @param o
     *        object
     */
    public void logTriple(Object s, Object p, Object o) {try{__CLR4_5_2rikriklvicmd41.R.inc(35664);
        __CLR4_5_2rikriklvicmd41.R.inc(35665);justLog(s, p, o);
        __CLR4_5_2rikriklvicmd41.R.inc(35666);incrementTripleCount();
    }finally{__CLR4_5_2rikriklvicmd41.R.flushNeeded();}}

    /**
     * log triples at debug level, including language and datatype, and
     * increment triple count
     * 
     * @param s
     *        subject
     * @param p
     *        predicate
     * @param o
     *        object
     * @param lang
     *        language
     * @param datatype
     *        datatype
     */
    public void logTriple(Object s, Object p, Object o, Object lang,
            Object datatype) {try{__CLR4_5_2rikriklvicmd41.R.inc(35667);
        __CLR4_5_2rikriklvicmd41.R.inc(35668);justLog(s, p, o, lang, datatype);
        __CLR4_5_2rikriklvicmd41.R.inc(35669);incrementTripleCount();
    }finally{__CLR4_5_2rikriklvicmd41.R.flushNeeded();}}

    /**
     * @param s
     *        subject
     * @param p
     *        predicate
     * @param o
     *        object
     * @param lang
     *        language
     * @param datatype
     *        datatype
     */
    public void justLog(Object s, Object p, Object o, Object lang,
            Object datatype) {try{__CLR4_5_2rikriklvicmd41.R.inc(35670);
        __CLR4_5_2rikriklvicmd41.R.inc(35671);if ((((LOGGER.isTraceEnabled())&&(__CLR4_5_2rikriklvicmd41.R.iget(35672)!=0|true))||(__CLR4_5_2rikriklvicmd41.R.iget(35673)==0&false))) {{
            __CLR4_5_2rikriklvicmd41.R.inc(35674);LOGGER.trace("s={} p={} o={} l={} dt={}", shorten(s), shorten(p),
                    shorten(o), lang, shorten(datatype));
        }
    }}finally{__CLR4_5_2rikriklvicmd41.R.flushNeeded();}}

    /**
     * @param s
     *        subject
     * @param p
     *        predicate
     * @param o
     *        object
     */
    public void justLog(Object s, Object p, Object o) {try{__CLR4_5_2rikriklvicmd41.R.inc(35675);
        __CLR4_5_2rikriklvicmd41.R.inc(35676);if ((((LOGGER.isTraceEnabled())&&(__CLR4_5_2rikriklvicmd41.R.iget(35677)!=0|true))||(__CLR4_5_2rikriklvicmd41.R.iget(35678)==0&false))) {{
            __CLR4_5_2rikriklvicmd41.R.inc(35679);LOGGER.trace("s={} p={} o={}", shorten(s), shorten(p), shorten(o));
        }
    }}finally{__CLR4_5_2rikriklvicmd41.R.flushNeeded();}}

    private Object shorten(@Nullable Object o) {try{__CLR4_5_2rikriklvicmd41.R.inc(35680);
        __CLR4_5_2rikriklvicmd41.R.inc(35681);if ((((o == null)&&(__CLR4_5_2rikriklvicmd41.R.iget(35682)!=0|true))||(__CLR4_5_2rikriklvicmd41.R.iget(35683)==0&false))) {{
            __CLR4_5_2rikriklvicmd41.R.inc(35684);return "null";
        }
        }__CLR4_5_2rikriklvicmd41.R.inc(35685);if ((((o instanceof String
                && (((String) o).startsWith("http:") || ((String) o)
                        .startsWith("urn:")))&&(__CLR4_5_2rikriklvicmd41.R.iget(35686)!=0|true))||(__CLR4_5_2rikriklvicmd41.R.iget(35687)==0&false))) {{
            __CLR4_5_2rikriklvicmd41.R.inc(35688);return shorten(IRI.create((String) o));
        }
        }__CLR4_5_2rikriklvicmd41.R.inc(35689);if ((((prefixManager == null || !(o instanceof IRI))&&(__CLR4_5_2rikriklvicmd41.R.iget(35690)!=0|true))||(__CLR4_5_2rikriklvicmd41.R.iget(35691)==0&false))) {{
            // quote strings and bnodes
            __CLR4_5_2rikriklvicmd41.R.inc(35692);return "\"" + o + '"';
        }
        // there is a prefix manager and o is an IRI
        }__CLR4_5_2rikriklvicmd41.R.inc(35693);IRI i = (IRI) o;
        __CLR4_5_2rikriklvicmd41.R.inc(35694);String result = prefixManager.getPrefixIRI(i);
        __CLR4_5_2rikriklvicmd41.R.inc(35695);if ((((result == null)&&(__CLR4_5_2rikriklvicmd41.R.iget(35696)!=0|true))||(__CLR4_5_2rikriklvicmd41.R.iget(35697)==0&false))) {{
            __CLR4_5_2rikriklvicmd41.R.inc(35698);result = i.toQuotedString();
        }
        }__CLR4_5_2rikriklvicmd41.R.inc(35699);return result;
    }finally{__CLR4_5_2rikriklvicmd41.R.flushNeeded();}}

    /** increment count and log. */
    private void incrementTripleCount() {try{__CLR4_5_2rikriklvicmd41.R.inc(35700);
        __CLR4_5_2rikriklvicmd41.R.inc(35701);if ((((count.incrementAndGet() % 10000 == 0)&&(__CLR4_5_2rikriklvicmd41.R.iget(35702)!=0|true))||(__CLR4_5_2rikriklvicmd41.R.iget(35703)==0&false))) {{
            __CLR4_5_2rikriklvicmd41.R.inc(35704);LOGGER.debug("Parsed: {} triples", count);
        }
    }}finally{__CLR4_5_2rikriklvicmd41.R.flushNeeded();}}

    /** log finl count. */
    public void logNumberOfTriples() {try{__CLR4_5_2rikriklvicmd41.R.inc(35705);
        __CLR4_5_2rikriklvicmd41.R.inc(35706);LOGGER.debug("Total number of triples: {}", count);
    }finally{__CLR4_5_2rikriklvicmd41.R.flushNeeded();}}

    /**
     * @param id
     *        log ontology id
     */
    public static void logOntologyID(OWLOntologyID id) {try{__CLR4_5_2rikriklvicmd41.R.inc(35707);
        __CLR4_5_2rikriklvicmd41.R.inc(35708);LOGGER.debug("Loaded {}", id);
    }finally{__CLR4_5_2rikriklvicmd41.R.flushNeeded();}}
}
