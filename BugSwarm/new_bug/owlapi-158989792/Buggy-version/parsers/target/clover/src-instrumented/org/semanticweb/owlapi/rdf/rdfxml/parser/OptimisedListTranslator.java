/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.rdf.rdfxml.parser;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.rdf.rdfxml.parser.Translators.ListItemTranslator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Translates an rdf:List into a Java {@code List}, or Java {@code Set}. The
 * type of list (i.e. the type of objects in the list) are determined by a
 * {@code ListItemTranslator}. The translator consumes all triples which are
 * used in the translation.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 * @param <O>
 *        type
 */
class OptimisedListTranslator<O extends OWLObject> {public static class __CLR4_5_2oywoywlvicmcn1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOGGER = LoggerFactory
            .getLogger(OptimisedListTranslator.class);
    private final OWLRDFConsumer consumer;
    private final ListItemTranslator<O> translator;

    /**
     * @param consumer
     *        consumer
     * @param translator
     *        translator
     */
    protected OptimisedListTranslator(OWLRDFConsumer consumer,
            ListItemTranslator<O> translator) {try{__CLR4_5_2oywoywlvicmcn1.R.inc(32360);
        __CLR4_5_2oywoywlvicmcn1.R.inc(32361);this.consumer = consumer;
        __CLR4_5_2oywoywlvicmcn1.R.inc(32362);this.translator = translator;
    }finally{__CLR4_5_2oywoywlvicmcn1.R.flushNeeded();}}

    protected OWLRDFConsumer getConsumer() {try{__CLR4_5_2oywoywlvicmcn1.R.inc(32363);
        __CLR4_5_2oywoywlvicmcn1.R.inc(32364);return consumer;
    }finally{__CLR4_5_2oywoywlvicmcn1.R.flushNeeded();}}

    private void translateList(IRI mainNode, @Nonnull List<O> list) {try{__CLR4_5_2oywoywlvicmcn1.R.inc(32365);
        __CLR4_5_2oywoywlvicmcn1.R.inc(32366);IRI current = mainNode;
        __CLR4_5_2oywoywlvicmcn1.R.inc(32367);while ((((current != null)&&(__CLR4_5_2oywoywlvicmcn1.R.iget(32368)!=0|true))||(__CLR4_5_2oywoywlvicmcn1.R.iget(32369)==0&false))) {{
            __CLR4_5_2oywoywlvicmcn1.R.inc(32370);IRI firstResource = consumer.getFirstResource(current, true);
            __CLR4_5_2oywoywlvicmcn1.R.inc(32371);if ((((firstResource != null)&&(__CLR4_5_2oywoywlvicmcn1.R.iget(32372)!=0|true))||(__CLR4_5_2oywoywlvicmcn1.R.iget(32373)==0&false))) {{
                __CLR4_5_2oywoywlvicmcn1.R.inc(32374);O translate = translator.translate(firstResource);
                __CLR4_5_2oywoywlvicmcn1.R.inc(32375);if ((((translate != null)&&(__CLR4_5_2oywoywlvicmcn1.R.iget(32376)!=0|true))||(__CLR4_5_2oywoywlvicmcn1.R.iget(32377)==0&false))) {{
                    __CLR4_5_2oywoywlvicmcn1.R.inc(32378);LOGGER.debug("list: {}", translate);
                    __CLR4_5_2oywoywlvicmcn1.R.inc(32379);list.add(translate);
                } }else {{
                    __CLR4_5_2oywoywlvicmcn1.R.inc(32380);LOGGER.warn(
                            "Possible malformed list: cannot translate it {}",
                            firstResource);
                }
            }} }else {{
                __CLR4_5_2oywoywlvicmcn1.R.inc(32381);OWLLiteral literal = consumer.getFirstLiteral(current);
                __CLR4_5_2oywoywlvicmcn1.R.inc(32382);if ((((literal != null)&&(__CLR4_5_2oywoywlvicmcn1.R.iget(32383)!=0|true))||(__CLR4_5_2oywoywlvicmcn1.R.iget(32384)==0&false))) {{
                    __CLR4_5_2oywoywlvicmcn1.R.inc(32385);O translate = translator.translate(literal);
                    __CLR4_5_2oywoywlvicmcn1.R.inc(32386);if ((((translate != null)&&(__CLR4_5_2oywoywlvicmcn1.R.iget(32387)!=0|true))||(__CLR4_5_2oywoywlvicmcn1.R.iget(32388)==0&false))) {{
                        __CLR4_5_2oywoywlvicmcn1.R.inc(32389);list.add(translate);
                    }
                }} }else {{
                    // Empty list?
                    __CLR4_5_2oywoywlvicmcn1.R.inc(32390);LOGGER.warn("Possible malformed list: rdf:first triple missing");
                }
            }}
            }__CLR4_5_2oywoywlvicmcn1.R.inc(32391);current = consumer.getRest(current, true);
        }
    }}finally{__CLR4_5_2oywoywlvicmcn1.R.flushNeeded();}}

    /**
     * @param mainNode
     *        mainNode
     * @return translated list
     */
    @SuppressWarnings("unchecked")
    @Nonnull
    public List<O> translateList(@Nonnull IRI mainNode) {try{__CLR4_5_2oywoywlvicmcn1.R.inc(32392);
        __CLR4_5_2oywoywlvicmcn1.R.inc(32393);boolean shared = consumer.isAnonymousSharedNode(mainNode.toString());
        __CLR4_5_2oywoywlvicmcn1.R.inc(32394);List<O> list;
        __CLR4_5_2oywoywlvicmcn1.R.inc(32395);if ((((shared)&&(__CLR4_5_2oywoywlvicmcn1.R.iget(32396)!=0|true))||(__CLR4_5_2oywoywlvicmcn1.R.iget(32397)==0&false))) {{
            __CLR4_5_2oywoywlvicmcn1.R.inc(32398);Object o = consumer.getSharedAnonymousNode(mainNode);
            __CLR4_5_2oywoywlvicmcn1.R.inc(32399);if ((((o != null && o instanceof List)&&(__CLR4_5_2oywoywlvicmcn1.R.iget(32400)!=0|true))||(__CLR4_5_2oywoywlvicmcn1.R.iget(32401)==0&false))) {{
                __CLR4_5_2oywoywlvicmcn1.R.inc(32402);list = (List<O>) o;
            } }else {{
                __CLR4_5_2oywoywlvicmcn1.R.inc(32403);list = new ArrayList<>();
                __CLR4_5_2oywoywlvicmcn1.R.inc(32404);translateList(mainNode, list);
                __CLR4_5_2oywoywlvicmcn1.R.inc(32405);consumer.addSharedAnonymousNode(mainNode, list);
            }
        }} }else {{
            __CLR4_5_2oywoywlvicmcn1.R.inc(32406);list = new ArrayList<>();
            __CLR4_5_2oywoywlvicmcn1.R.inc(32407);translateList(mainNode, list);
        }
        }__CLR4_5_2oywoywlvicmcn1.R.inc(32408);return list;
    }finally{__CLR4_5_2oywoywlvicmcn1.R.flushNeeded();}}

    /**
     * @param mainNode
     *        mainNode
     * @return translated list
     */
    @Nonnull
    public Set<O> translateToSet(@Nonnull IRI mainNode) {try{__CLR4_5_2oywoywlvicmcn1.R.inc(32409);
        __CLR4_5_2oywoywlvicmcn1.R.inc(32410);return new LinkedHashSet<>(translateList(mainNode));
    }finally{__CLR4_5_2oywoywlvicmcn1.R.flushNeeded();}}
}
