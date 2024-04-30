/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.functional.parser.OWLFunctionalSyntaxOWLParser;
import org.semanticweb.owlapi.functional.renderer.OWLFunctionalSyntaxRenderer;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.UnloadableImportException;

/**
 * Tools to read and write a set of owl axioms to/from a string. Used to
 * preserve untranslatable axioms in an owl2obo conversion.
 */
public class OwlStringTools {public static class __CLR4_5_22ro2rolvicmt1u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,3619,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Exception indicating an un-recoverable error during the handling of axiom
     * strings.
     */
    public static class OwlStringException extends Exception {

        // generated
        private static final long serialVersionUID = 40000L;

        /**
         * @param cause
         *        cause
         */
        protected OwlStringException(Throwable cause) {
            super(cause);__CLR4_5_22ro2rolvicmt1u.R.inc(3589);try{__CLR4_5_22ro2rolvicmt1u.R.inc(3588);
        }finally{__CLR4_5_22ro2rolvicmt1u.R.flushNeeded();}}
    }

    /**
     * Create a string for the given set of axioms. Return null for empty sets
     * or if the set is null.
     * 
     * @param axioms
     *        axioms
     * @param translationManager
     *        translationManager
     * @return string or null
     * @throws OwlStringException
     *         OwlStringException
     * @see #translate(String, OWLOntologyManager)
     */
    @Nullable
    public static String translate(@Nullable Set<OWLAxiom> axioms, @Nonnull OWLOntologyManager translationManager)
        throws OwlStringException {try{__CLR4_5_22ro2rolvicmt1u.R.inc(3590);
        __CLR4_5_22ro2rolvicmt1u.R.inc(3591);if ((((axioms == null || axioms.isEmpty())&&(__CLR4_5_22ro2rolvicmt1u.R.iget(3592)!=0|true))||(__CLR4_5_22ro2rolvicmt1u.R.iget(3593)==0&false))) {{
            __CLR4_5_22ro2rolvicmt1u.R.inc(3594);return null;
        }
        }__CLR4_5_22ro2rolvicmt1u.R.inc(3595);try {
            __CLR4_5_22ro2rolvicmt1u.R.inc(3596);OWLOntology ontology = translationManager.createOntology();
            __CLR4_5_22ro2rolvicmt1u.R.inc(3597);translationManager.addAxioms(ontology, axioms);
            __CLR4_5_22ro2rolvicmt1u.R.inc(3598);OWLFunctionalSyntaxRenderer r = new OWLFunctionalSyntaxRenderer();
            __CLR4_5_22ro2rolvicmt1u.R.inc(3599);Writer writer = new StringWriter();
            __CLR4_5_22ro2rolvicmt1u.R.inc(3600);r.render(ontology, writer);
            __CLR4_5_22ro2rolvicmt1u.R.inc(3601);return writer.toString();
        } catch (OWLRendererException e) {
            __CLR4_5_22ro2rolvicmt1u.R.inc(3602);throw new OwlStringException(e);
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_22ro2rolvicmt1u.R.inc(3603);throw new OwlStringException(e);
        }
    }finally{__CLR4_5_22ro2rolvicmt1u.R.flushNeeded();}}

    /**
     * Parse the axioms from the given axiom string. Returns null for empty and
     * null strings.
     * 
     * @param axioms
     *        axioms
     * @param translationManager
     *        translationManager
     * @return set of axioms or null
     * @throws OwlStringException
     *         OwlStringException
     * @see #translate(Set,OWLOntologyManager)
     */
    @Nullable
    public static Set<OWLAxiom> translate(@Nullable String axioms, @Nonnull OWLOntologyManager translationManager)
        throws OwlStringException {try{__CLR4_5_22ro2rolvicmt1u.R.inc(3604);
        __CLR4_5_22ro2rolvicmt1u.R.inc(3605);if ((((axioms == null || axioms.isEmpty())&&(__CLR4_5_22ro2rolvicmt1u.R.iget(3606)!=0|true))||(__CLR4_5_22ro2rolvicmt1u.R.iget(3607)==0&false))) {{
            __CLR4_5_22ro2rolvicmt1u.R.inc(3608);return null;
        }
        }__CLR4_5_22ro2rolvicmt1u.R.inc(3609);try {
            __CLR4_5_22ro2rolvicmt1u.R.inc(3610);OWLFunctionalSyntaxOWLParser p = new OWLFunctionalSyntaxOWLParser();
            __CLR4_5_22ro2rolvicmt1u.R.inc(3611);OWLOntologyDocumentSource documentSource = new StringDocumentSource(axioms);
            __CLR4_5_22ro2rolvicmt1u.R.inc(3612);OWLOntology ontology = translationManager.createOntology();
            __CLR4_5_22ro2rolvicmt1u.R.inc(3613);p.parse(documentSource, ontology, translationManager.getOntologyLoaderConfiguration());
            __CLR4_5_22ro2rolvicmt1u.R.inc(3614);return ontology.getAxioms();
        } catch (UnloadableImportException e) {
            __CLR4_5_22ro2rolvicmt1u.R.inc(3615);throw new OwlStringException(e);
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_22ro2rolvicmt1u.R.inc(3616);throw new OwlStringException(e);
        } catch (OWLParserException e) {
            __CLR4_5_22ro2rolvicmt1u.R.inc(3617);throw new OwlStringException(e);
        } catch (IOException e) {
            __CLR4_5_22ro2rolvicmt1u.R.inc(3618);throw new OwlStringException(e);
        }
    }finally{__CLR4_5_22ro2rolvicmt1u.R.flushNeeded();}}
}
