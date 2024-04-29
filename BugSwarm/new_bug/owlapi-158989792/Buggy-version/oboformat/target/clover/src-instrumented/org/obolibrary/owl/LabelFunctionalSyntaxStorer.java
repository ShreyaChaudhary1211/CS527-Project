/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.owl;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.formats.LabelFunctionalDocumentFormat;
import org.semanticweb.owlapi.functional.renderer.FunctionalSyntaxObjectRenderer;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.AbstractOWLStorer;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.semanticweb.owlapi.util.StringComparator;

/** Implement the writer for {@link LabelFunctionalDocumentFormat}. */
public class LabelFunctionalSyntaxStorer extends AbstractOWLStorer {public static class __CLR4_5_254e54elvicmt7w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,6688,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // generated
    private static final long serialVersionUID = 40000L;

    @Override
    public boolean canStoreOntology(OWLDocumentFormat ontologyFormat) {try{__CLR4_5_254e54elvicmt7w.R.inc(6638);
        __CLR4_5_254e54elvicmt7w.R.inc(6639);return ontologyFormat instanceof LabelFunctionalDocumentFormat;
    }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

    @Override
    protected void storeOntology(@Nonnull OWLOntology ontology, @Nonnull Writer writer, OWLDocumentFormat format)
        throws OWLOntologyStorageException {try{__CLR4_5_254e54elvicmt7w.R.inc(6640);
        __CLR4_5_254e54elvicmt7w.R.inc(6641);try {
            __CLR4_5_254e54elvicmt7w.R.inc(6642);FunctionalSyntaxObjectRenderer renderer = new FunctionalSyntaxObjectRenderer(ontology, writer);
            __CLR4_5_254e54elvicmt7w.R.inc(6643);renderer.setPrefixManager(new LabelPrefixManager(ontology));
            __CLR4_5_254e54elvicmt7w.R.inc(6644);ontology.accept(renderer);
            __CLR4_5_254e54elvicmt7w.R.inc(6645);writer.flush();
        } catch (IOException e) {
            __CLR4_5_254e54elvicmt7w.R.inc(6646);throw new OWLOntologyStorageException(e);
        }
    }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

    static class LabelPrefixManager implements PrefixManager {

        private static final long serialVersionUID = 40000L;
        @Nonnull
        private final OWLOntology ontology;
        @Nonnull
        private final PrefixManager delegate;

        LabelPrefixManager(@Nonnull OWLOntology ontology) {try{__CLR4_5_254e54elvicmt7w.R.inc(6647);
            __CLR4_5_254e54elvicmt7w.R.inc(6648);this.ontology = ontology;
            __CLR4_5_254e54elvicmt7w.R.inc(6649);OWLDocumentFormat ontologyFormat = ontology.getOWLOntologyManager().getOntologyFormat(ontology);
            __CLR4_5_254e54elvicmt7w.R.inc(6650);if ((((ontologyFormat instanceof PrefixManager)&&(__CLR4_5_254e54elvicmt7w.R.iget(6651)!=0|true))||(__CLR4_5_254e54elvicmt7w.R.iget(6652)==0&false))) {{
                __CLR4_5_254e54elvicmt7w.R.inc(6653);delegate = (PrefixManager) ontologyFormat;
            } }else {{
                __CLR4_5_254e54elvicmt7w.R.inc(6654);delegate = new DefaultPrefixManager();
            }
        }}finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public String getPrefixIRI(IRI iri) {try{__CLR4_5_254e54elvicmt7w.R.inc(6655);
            __CLR4_5_254e54elvicmt7w.R.inc(6656);for (OWLAnnotationAssertionAxiom annotation : ontology.getAnnotationAssertionAxioms(iri)) {{
                __CLR4_5_254e54elvicmt7w.R.inc(6657);if ((((annotation.getProperty().isLabel())&&(__CLR4_5_254e54elvicmt7w.R.iget(6658)!=0|true))||(__CLR4_5_254e54elvicmt7w.R.iget(6659)==0&false))) {{
                    __CLR4_5_254e54elvicmt7w.R.inc(6660);OWLAnnotationValue value = annotation.getValue();
                    __CLR4_5_254e54elvicmt7w.R.inc(6661);if ((((value instanceof OWLLiteral)&&(__CLR4_5_254e54elvicmt7w.R.iget(6662)!=0|true))||(__CLR4_5_254e54elvicmt7w.R.iget(6663)==0&false))) {{
                        __CLR4_5_254e54elvicmt7w.R.inc(6664);return '<' + ((OWLLiteral) value).getLiteral() + '>';
                    }
                }}
            }}
            }__CLR4_5_254e54elvicmt7w.R.inc(6665);return delegate.getPrefixIRI(iri);
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public String getDefaultPrefix() {try{__CLR4_5_254e54elvicmt7w.R.inc(6666);
            __CLR4_5_254e54elvicmt7w.R.inc(6667);return delegate.getDefaultPrefix();
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public boolean containsPrefixMapping(String prefixName) {try{__CLR4_5_254e54elvicmt7w.R.inc(6668);
            __CLR4_5_254e54elvicmt7w.R.inc(6669);return delegate.containsPrefixMapping(prefixName);
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public String getPrefix(String prefixName) {try{__CLR4_5_254e54elvicmt7w.R.inc(6670);
            __CLR4_5_254e54elvicmt7w.R.inc(6671);return delegate.getPrefix(prefixName);
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public Map<String, String> getPrefixName2PrefixMap() {try{__CLR4_5_254e54elvicmt7w.R.inc(6672);
            __CLR4_5_254e54elvicmt7w.R.inc(6673);return delegate.getPrefixName2PrefixMap();
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public IRI getIRI(String prefixIRI) {try{__CLR4_5_254e54elvicmt7w.R.inc(6674);
            __CLR4_5_254e54elvicmt7w.R.inc(6675);return delegate.getIRI(prefixIRI);
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public Set<String> getPrefixNames() {try{__CLR4_5_254e54elvicmt7w.R.inc(6676);
            __CLR4_5_254e54elvicmt7w.R.inc(6677);return delegate.getPrefixNames();
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public StringComparator getPrefixComparator() {try{__CLR4_5_254e54elvicmt7w.R.inc(6678);
            __CLR4_5_254e54elvicmt7w.R.inc(6679);return delegate.getPrefixComparator();
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public void setPrefixComparator(StringComparator comparator) {try{__CLR4_5_254e54elvicmt7w.R.inc(6680);
            __CLR4_5_254e54elvicmt7w.R.inc(6681);delegate.setPrefixComparator(comparator);
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public void setDefaultPrefix(String defaultPrefix) {try{__CLR4_5_254e54elvicmt7w.R.inc(6682);
            // do not propagate changes to the original manager
            // there should be no changes during rendering anyway
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public void setPrefix(String prefixName, String prefix) {try{__CLR4_5_254e54elvicmt7w.R.inc(6683);
            // do not propagate changes to the original manager
            // there should be no changes during rendering anyway
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public void copyPrefixesFrom(PrefixManager from) {try{__CLR4_5_254e54elvicmt7w.R.inc(6684);
            // do not propagate changes to the original manager
            // there should be no changes during rendering anyway
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public void copyPrefixesFrom(Map<String, String> from) {try{__CLR4_5_254e54elvicmt7w.R.inc(6685);
            // do not propagate changes to the original manager
            // there should be no changes during rendering anyway
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public void unregisterNamespace(String namespace) {try{__CLR4_5_254e54elvicmt7w.R.inc(6686);
            // do not propagate changes to the original manager
            // there should be no changes during rendering anyway
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}

        @Override
        public void clear() {try{__CLR4_5_254e54elvicmt7w.R.inc(6687);
            // do not propagate changes to the original manager
            // there should be no changes during rendering anyway
        }finally{__CLR4_5_254e54elvicmt7w.R.flushNeeded();}}
    }
}
