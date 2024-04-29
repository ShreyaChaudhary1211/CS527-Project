/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package uk.ac.manchester.cs.owl.owlapi.concurrent;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

import javax.annotation.Nonnull;
import javax.inject.Inject;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 08/04/15
 */

import org.semanticweb.owlapi.io.OWLOntologyDocumentTarget;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.AxiomAnnotations;
import org.semanticweb.owlapi.model.parameters.ChangeApplied;
import org.semanticweb.owlapi.model.parameters.Imports;
import org.semanticweb.owlapi.model.parameters.Navigation;
import org.semanticweb.owlapi.util.OWLAxiomSearchFilter;
import uk.ac.manchester.cs.owl.owlapi.HasTrimToSize;

/**
 * Matthew Horridge Stanford Center for Biomedical Informatics Research 03/04/15
 */
public class ConcurrentOWLOntologyImpl implements OWLMutableOntology,HasTrimToSize {public static class __CLR4_5_29ha9halviclgwk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,13220,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final OWLOntology delegate;
    private final ReadWriteLock readWriteLock;
    private final Lock readLock;
    private final Lock writeLock;

    /**
     * Constructs a ConcurrentOWLOntology that provides concurrent access to a delegate {@link OWLOntology}.
     * @param delegate The delegate {@link OWLOntology}.
     * @param readWriteLock The {@link java.util.concurrent.locks.ReadWriteLock} that will provide the locking.
     * @throws java.lang.NullPointerException if any parameters are {@code null}.
     */
    @Inject
    public ConcurrentOWLOntologyImpl(@Nonnull OWLOntology delegate, @Nonnull ReadWriteLock readWriteLock) {try{__CLR4_5_29ha9halviclgwk.R.inc(12286);
        __CLR4_5_29ha9halviclgwk.R.inc(12287);this.delegate = verifyNotNull(delegate);
        __CLR4_5_29ha9halviclgwk.R.inc(12288);this.readWriteLock = verifyNotNull(readWriteLock);
        __CLR4_5_29ha9halviclgwk.R.inc(12289);this.readLock = verifyNotNull(readWriteLock).readLock();
        __CLR4_5_29ha9halviclgwk.R.inc(12290);this.writeLock = verifyNotNull(readWriteLock).writeLock();
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public void trimToSize() {try{__CLR4_5_29ha9halviclgwk.R.inc(12291);
        __CLR4_5_29ha9halviclgwk.R.inc(12292);writeLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12293);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12294);if ((((delegate instanceof HasTrimToSize)&&(__CLR4_5_29ha9halviclgwk.R.iget(12295)!=0|true))||(__CLR4_5_29ha9halviclgwk.R.iget(12296)==0&false))) {{
                __CLR4_5_29ha9halviclgwk.R.inc(12297);HasTrimToSize trimmableDelegate = (HasTrimToSize) delegate;
                __CLR4_5_29ha9halviclgwk.R.inc(12298);trimmableDelegate.trimToSize();
            }
        }} finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12299);writeLock.unlock();
        }

    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public void accept(@Nonnull OWLNamedObjectVisitor owlNamedObjectVisitor) {try{__CLR4_5_29ha9halviclgwk.R.inc(12300);
        __CLR4_5_29ha9halviclgwk.R.inc(12301);delegate.accept(owlNamedObjectVisitor);
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public <O> O accept(@Nonnull OWLNamedObjectVisitorEx<O> owlNamedObjectVisitorEx) {try{__CLR4_5_29ha9halviclgwk.R.inc(12302);
        __CLR4_5_29ha9halviclgwk.R.inc(12303);return delegate.accept(owlNamedObjectVisitorEx);
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_29ha9halviclgwk.R.inc(12304);
        __CLR4_5_29ha9halviclgwk.R.inc(12305);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12306);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12307);return delegate.hashCode();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12308);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_29ha9halviclgwk.R.inc(12309);
        __CLR4_5_29ha9halviclgwk.R.inc(12310);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12311);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12312);return delegate.equals(obj);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12313);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public OWLOntologyManager getOWLOntologyManager() {try{__CLR4_5_29ha9halviclgwk.R.inc(12314);
        __CLR4_5_29ha9halviclgwk.R.inc(12315);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12316);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12317);return delegate.getOWLOntologyManager();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12318);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public void setOWLOntologyManager(OWLOntologyManager owlOntologyManager) {try{__CLR4_5_29ha9halviclgwk.R.inc(12319);
        __CLR4_5_29ha9halviclgwk.R.inc(12320);writeLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12321);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12322);delegate.setOWLOntologyManager(owlOntologyManager);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12323);writeLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public OWLOntologyID getOntologyID() {try{__CLR4_5_29ha9halviclgwk.R.inc(12324);
        __CLR4_5_29ha9halviclgwk.R.inc(12325);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12326);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12327);return delegate.getOntologyID();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12328);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean isAnonymous() {try{__CLR4_5_29ha9halviclgwk.R.inc(12329);
        __CLR4_5_29ha9halviclgwk.R.inc(12330);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12331);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12332);return delegate.isAnonymous();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12333);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAnnotation> getAnnotations() {try{__CLR4_5_29ha9halviclgwk.R.inc(12334);
        __CLR4_5_29ha9halviclgwk.R.inc(12335);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12336);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12337);return delegate.getAnnotations();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12338);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<IRI> getDirectImportsDocuments() {try{__CLR4_5_29ha9halviclgwk.R.inc(12339);
        __CLR4_5_29ha9halviclgwk.R.inc(12340);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12341);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12342);return delegate.getDirectImportsDocuments();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12343);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLOntology> getDirectImports() {try{__CLR4_5_29ha9halviclgwk.R.inc(12344);
        __CLR4_5_29ha9halviclgwk.R.inc(12345);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12346);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12347);return delegate.getDirectImports();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12348);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLOntology> getImports() {try{__CLR4_5_29ha9halviclgwk.R.inc(12349);
        __CLR4_5_29ha9halviclgwk.R.inc(12350);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12351);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12352);return delegate.getImports();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12353);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLOntology> getImportsClosure() {try{__CLR4_5_29ha9halviclgwk.R.inc(12354);
        __CLR4_5_29ha9halviclgwk.R.inc(12355);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12356);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12357);return delegate.getImportsClosure();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12358);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLImportsDeclaration> getImportsDeclarations() {try{__CLR4_5_29ha9halviclgwk.R.inc(12359);
        __CLR4_5_29ha9halviclgwk.R.inc(12360);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12361);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12362);return delegate.getImportsDeclarations();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12363);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean isEmpty() {try{__CLR4_5_29ha9halviclgwk.R.inc(12364);
        __CLR4_5_29ha9halviclgwk.R.inc(12365);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12366);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12367);return delegate.isEmpty();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12368);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAxiom> getTBoxAxioms(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12369);
        __CLR4_5_29ha9halviclgwk.R.inc(12370);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12371);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12372);return delegate.getTBoxAxioms(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12373);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAxiom> getABoxAxioms(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12374);
        __CLR4_5_29ha9halviclgwk.R.inc(12375);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12376);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12377);return delegate.getABoxAxioms(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12378);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAxiom> getRBoxAxioms(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12379);
        __CLR4_5_29ha9halviclgwk.R.inc(12380);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12381);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12382);return delegate.getRBoxAxioms(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12383);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLClassAxiom> getGeneralClassAxioms() {try{__CLR4_5_29ha9halviclgwk.R.inc(12384);
        __CLR4_5_29ha9halviclgwk.R.inc(12385);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12386);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12387);return delegate.getGeneralClassAxioms();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12388);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLEntity> getSignature() {try{__CLR4_5_29ha9halviclgwk.R.inc(12389);
        __CLR4_5_29ha9halviclgwk.R.inc(12390);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12391);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12392);return delegate.getSignature();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12393);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLEntity> getSignature(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12394);
        __CLR4_5_29ha9halviclgwk.R.inc(12395);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12396);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12397);return delegate.getSignature(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12398);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean isDeclared(@Nonnull OWLEntity owlEntity) {try{__CLR4_5_29ha9halviclgwk.R.inc(12399);
        __CLR4_5_29ha9halviclgwk.R.inc(12400);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12401);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12402);return delegate.isDeclared(owlEntity);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12403);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean isDeclared(@Nonnull OWLEntity owlEntity, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12404);
        __CLR4_5_29ha9halviclgwk.R.inc(12405);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12406);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12407);return delegate.isDeclared(owlEntity, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12408);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public void saveOntology() throws OWLOntologyStorageException {try{__CLR4_5_29ha9halviclgwk.R.inc(12409);
        __CLR4_5_29ha9halviclgwk.R.inc(12410);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12411);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12412);delegate.saveOntology();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12413);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public void saveOntology(@Nonnull IRI iri) throws OWLOntologyStorageException {try{__CLR4_5_29ha9halviclgwk.R.inc(12414);
        __CLR4_5_29ha9halviclgwk.R.inc(12415);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12416);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12417);delegate.saveOntology(iri);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12418);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public void saveOntology(@Nonnull OutputStream outputStream) throws OWLOntologyStorageException {try{__CLR4_5_29ha9halviclgwk.R.inc(12419);
        __CLR4_5_29ha9halviclgwk.R.inc(12420);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12421);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12422);delegate.saveOntology(outputStream);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12423);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public void saveOntology(@Nonnull OWLDocumentFormat owlDocumentFormat) throws OWLOntologyStorageException {try{__CLR4_5_29ha9halviclgwk.R.inc(12424);
        __CLR4_5_29ha9halviclgwk.R.inc(12425);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12426);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12427);delegate.saveOntology(owlDocumentFormat);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12428);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public void saveOntology(@Nonnull OWLDocumentFormat owlDocumentFormat, @Nonnull IRI iri) throws OWLOntologyStorageException {try{__CLR4_5_29ha9halviclgwk.R.inc(12429);
        __CLR4_5_29ha9halviclgwk.R.inc(12430);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12431);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12432);delegate.saveOntology(owlDocumentFormat, iri);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12433);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public void saveOntology(@Nonnull OWLDocumentFormat owlDocumentFormat, @Nonnull OutputStream outputStream) throws OWLOntologyStorageException {try{__CLR4_5_29ha9halviclgwk.R.inc(12434);
        __CLR4_5_29ha9halviclgwk.R.inc(12435);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12436);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12437);delegate.saveOntology(owlDocumentFormat, outputStream);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12438);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public void saveOntology(@Nonnull OWLOntologyDocumentTarget owlOntologyDocumentTarget) throws OWLOntologyStorageException {try{__CLR4_5_29ha9halviclgwk.R.inc(12439);
        __CLR4_5_29ha9halviclgwk.R.inc(12440);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12441);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12442);delegate.saveOntology(owlOntologyDocumentTarget);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12443);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public void saveOntology(@Nonnull OWLDocumentFormat owlDocumentFormat, @Nonnull OWLOntologyDocumentTarget owlOntologyDocumentTarget) throws OWLOntologyStorageException {try{__CLR4_5_29ha9halviclgwk.R.inc(12444);
        __CLR4_5_29ha9halviclgwk.R.inc(12445);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12446);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12447);delegate.saveOntology(owlDocumentFormat, owlOntologyDocumentTarget);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12448);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLClassExpression> getNestedClassExpressions() {try{__CLR4_5_29ha9halviclgwk.R.inc(12449);
        __CLR4_5_29ha9halviclgwk.R.inc(12450);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12451);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12452);return delegate.getNestedClassExpressions();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12453);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public void accept(@Nonnull OWLObjectVisitor owlObjectVisitor) {try{__CLR4_5_29ha9halviclgwk.R.inc(12454);
        __CLR4_5_29ha9halviclgwk.R.inc(12455);delegate.accept(owlObjectVisitor);
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public <O> O accept(@Nonnull OWLObjectVisitorEx<O> owlObjectVisitorEx) {try{__CLR4_5_29ha9halviclgwk.R.inc(12456);
        __CLR4_5_29ha9halviclgwk.R.inc(12457);return delegate.accept(owlObjectVisitorEx);
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean isTopEntity() {try{__CLR4_5_29ha9halviclgwk.R.inc(12458);
        __CLR4_5_29ha9halviclgwk.R.inc(12459);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12460);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12461);return delegate.isTopEntity();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12462);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean isBottomEntity() {try{__CLR4_5_29ha9halviclgwk.R.inc(12463);
        __CLR4_5_29ha9halviclgwk.R.inc(12464);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12465);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12466);return delegate.isBottomEntity();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12467);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public String toString() {try{__CLR4_5_29ha9halviclgwk.R.inc(12468);
        __CLR4_5_29ha9halviclgwk.R.inc(12469);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12470);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12471);return delegate.toString();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12472);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public int compareTo(OWLObject o) {try{__CLR4_5_29ha9halviclgwk.R.inc(12473);
        __CLR4_5_29ha9halviclgwk.R.inc(12474);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12475);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12476);return delegate.compareTo(o);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12477);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(@Nonnull OWLEntity owlEntity) {try{__CLR4_5_29ha9halviclgwk.R.inc(12478);
        __CLR4_5_29ha9halviclgwk.R.inc(12479);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12480);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12481);return delegate.containsEntityInSignature(owlEntity);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12482);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAnonymousIndividual> getAnonymousIndividuals() {try{__CLR4_5_29ha9halviclgwk.R.inc(12483);
        __CLR4_5_29ha9halviclgwk.R.inc(12484);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12485);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12486);return delegate.getAnonymousIndividuals();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12487);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLClass> getClassesInSignature() {try{__CLR4_5_29ha9halviclgwk.R.inc(12488);
        __CLR4_5_29ha9halviclgwk.R.inc(12489);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12490);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12491);return delegate.getClassesInSignature();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12492);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLObjectProperty> getObjectPropertiesInSignature() {try{__CLR4_5_29ha9halviclgwk.R.inc(12493);
        __CLR4_5_29ha9halviclgwk.R.inc(12494);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12495);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12496);return delegate.getObjectPropertiesInSignature();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12497);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDataProperty> getDataPropertiesInSignature() {try{__CLR4_5_29ha9halviclgwk.R.inc(12498);
        __CLR4_5_29ha9halviclgwk.R.inc(12499);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12500);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12501);return delegate.getDataPropertiesInSignature();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12502);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLNamedIndividual> getIndividualsInSignature() {try{__CLR4_5_29ha9halviclgwk.R.inc(12503);
        __CLR4_5_29ha9halviclgwk.R.inc(12504);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12505);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12506);return delegate.getIndividualsInSignature();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12507);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDatatype> getDatatypesInSignature() {try{__CLR4_5_29ha9halviclgwk.R.inc(12508);
        __CLR4_5_29ha9halviclgwk.R.inc(12509);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12510);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12511);return delegate.getDatatypesInSignature();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12512);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAnnotationProperty> getAnnotationPropertiesInSignature() {try{__CLR4_5_29ha9halviclgwk.R.inc(12513);
        __CLR4_5_29ha9halviclgwk.R.inc(12514);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12515);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12516);return delegate.getAnnotationPropertiesInSignature();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12517);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAxiom> getAxioms(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12518);
        __CLR4_5_29ha9halviclgwk.R.inc(12519);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12520);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12521);return delegate.getAxioms(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12522);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public int getAxiomCount(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12523);
        __CLR4_5_29ha9halviclgwk.R.inc(12524);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12525);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12526);return delegate.getAxiomCount(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12527);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLLogicalAxiom> getLogicalAxioms(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12528);
        __CLR4_5_29ha9halviclgwk.R.inc(12529);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12530);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12531);return delegate.getLogicalAxioms(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12532);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public int getLogicalAxiomCount(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12533);
        __CLR4_5_29ha9halviclgwk.R.inc(12534);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12535);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12536);return delegate.getLogicalAxiomCount(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12537);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public <T extends OWLAxiom> Set<T> getAxioms(@Nonnull AxiomType<T> axiomType, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12538);
        __CLR4_5_29ha9halviclgwk.R.inc(12539);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12540);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12541);return delegate.getAxioms(axiomType, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12542);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public <T extends OWLAxiom> int getAxiomCount(@Nonnull AxiomType<T> axiomType, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12543);
        __CLR4_5_29ha9halviclgwk.R.inc(12544);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12545);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12546);return delegate.getAxiomCount(axiomType, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12547);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsAxiom(@Nonnull OWLAxiom owlAxiom, @Nonnull Imports imports, @Nonnull AxiomAnnotations axiomAnnotations) {try{__CLR4_5_29ha9halviclgwk.R.inc(12548);
        __CLR4_5_29ha9halviclgwk.R.inc(12549);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12550);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12551);return delegate.containsAxiom(owlAxiom, imports, axiomAnnotations);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12552);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAxiom> getAxiomsIgnoreAnnotations(@Nonnull OWLAxiom owlAxiom, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12553);
        __CLR4_5_29ha9halviclgwk.R.inc(12554);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12555);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12556);return delegate.getAxiomsIgnoreAnnotations(owlAxiom, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12557);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAxiom> getReferencingAxioms(@Nonnull OWLPrimitive owlPrimitive, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12558);
        __CLR4_5_29ha9halviclgwk.R.inc(12559);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12560);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12561);return delegate.getReferencingAxioms(owlPrimitive, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12562);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLClassAxiom> getAxioms(@Nonnull OWLClass owlClass, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12563);
        __CLR4_5_29ha9halviclgwk.R.inc(12564);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12565);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12566);return delegate.getAxioms(owlClass, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12567);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLObjectPropertyAxiom> getAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12568);
        __CLR4_5_29ha9halviclgwk.R.inc(12569);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12570);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12571);return delegate.getAxioms(owlObjectPropertyExpression, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12572);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDataPropertyAxiom> getAxioms(@Nonnull OWLDataProperty owlDataProperty, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12573);
        __CLR4_5_29ha9halviclgwk.R.inc(12574);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12575);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12576);return delegate.getAxioms(owlDataProperty, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12577);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLIndividualAxiom> getAxioms(@Nonnull OWLIndividual owlIndividual, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12578);
        __CLR4_5_29ha9halviclgwk.R.inc(12579);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12580);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12581);return delegate.getAxioms(owlIndividual, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12582);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAnnotationAxiom> getAxioms(@Nonnull OWLAnnotationProperty owlAnnotationProperty, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12583);
        __CLR4_5_29ha9halviclgwk.R.inc(12584);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12585);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12586);return delegate.getAxioms(owlAnnotationProperty, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12587);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDatatypeDefinitionAxiom> getAxioms(@Nonnull OWLDatatype owlDatatype, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12588);
        __CLR4_5_29ha9halviclgwk.R.inc(12589);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12590);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12591);return delegate.getAxioms(owlDatatype, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12592);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAxiom> getAxioms() {try{__CLR4_5_29ha9halviclgwk.R.inc(12593);
        __CLR4_5_29ha9halviclgwk.R.inc(12594);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12595);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12596);return delegate.getAxioms();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12597);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLLogicalAxiom> getLogicalAxioms() {try{__CLR4_5_29ha9halviclgwk.R.inc(12598);
        __CLR4_5_29ha9halviclgwk.R.inc(12599);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12600);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12601);return delegate.getLogicalAxioms();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12602);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public <T extends OWLAxiom> Set<T> getAxioms(@Nonnull AxiomType<T> axiomType) {try{__CLR4_5_29ha9halviclgwk.R.inc(12603);
        __CLR4_5_29ha9halviclgwk.R.inc(12604);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12605);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12606);return delegate.getAxioms(axiomType);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12607);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsAxiom(@Nonnull OWLAxiom owlAxiom) {try{__CLR4_5_29ha9halviclgwk.R.inc(12608);
        __CLR4_5_29ha9halviclgwk.R.inc(12609);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12610);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12611);return delegate.containsAxiom(owlAxiom);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12612);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLAxiom> getAxioms(boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12613);
        __CLR4_5_29ha9halviclgwk.R.inc(12614);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12615);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12616);return delegate.getAxioms(b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12617);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public int getAxiomCount(boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12618);
        __CLR4_5_29ha9halviclgwk.R.inc(12619);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12620);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12621);return delegate.getAxiomCount(b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12622);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    @Nonnull
    public Set<OWLLogicalAxiom> getLogicalAxioms(boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12623);
        __CLR4_5_29ha9halviclgwk.R.inc(12624);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12625);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12626);return delegate.getLogicalAxioms(b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12627);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public int getLogicalAxiomCount(boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12628);
        __CLR4_5_29ha9halviclgwk.R.inc(12629);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12630);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12631);return delegate.getLogicalAxiomCount(b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12632);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    @Nonnull
    public <T extends OWLAxiom> Set<T> getAxioms(@Nonnull AxiomType<T> axiomType, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12633);
        __CLR4_5_29ha9halviclgwk.R.inc(12634);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12635);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12636);return delegate.getAxioms(axiomType, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12637);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public <T extends OWLAxiom> int getAxiomCount(@Nonnull AxiomType<T> axiomType, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12638);
        __CLR4_5_29ha9halviclgwk.R.inc(12639);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12640);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12641);return delegate.getAxiomCount(axiomType, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12642);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public boolean containsAxiom(@Nonnull OWLAxiom owlAxiom, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12643);
        __CLR4_5_29ha9halviclgwk.R.inc(12644);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12645);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12646);return delegate.containsAxiom(owlAxiom, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12647);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public boolean containsAxiomIgnoreAnnotations(@Nonnull OWLAxiom owlAxiom, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12648);
        __CLR4_5_29ha9halviclgwk.R.inc(12649);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12650);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12651);return delegate.containsAxiomIgnoreAnnotations(owlAxiom, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12652);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    @Nonnull
    public Set<OWLAxiom> getAxiomsIgnoreAnnotations(@Nonnull OWLAxiom owlAxiom, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12653);
        __CLR4_5_29ha9halviclgwk.R.inc(12654);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12655);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12656);return delegate.getAxiomsIgnoreAnnotations(owlAxiom, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12657);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    @Nonnull
    public Set<OWLAxiom> getReferencingAxioms(@Nonnull OWLPrimitive owlPrimitive, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12658);
        __CLR4_5_29ha9halviclgwk.R.inc(12659);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12660);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12661);return delegate.getReferencingAxioms(owlPrimitive, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12662);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLClassAxiom> getAxioms(@Nonnull OWLClass owlClass, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12663);
        __CLR4_5_29ha9halviclgwk.R.inc(12664);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12665);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12666);return delegate.getAxioms(owlClass, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12667);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLObjectPropertyAxiom> getAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12668);
        __CLR4_5_29ha9halviclgwk.R.inc(12669);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12670);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12671);return delegate.getAxioms(owlObjectPropertyExpression, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12672);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLDataPropertyAxiom> getAxioms(@Nonnull OWLDataProperty owlDataProperty, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12673);
        __CLR4_5_29ha9halviclgwk.R.inc(12674);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12675);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12676);return delegate.getAxioms(owlDataProperty, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12677);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLIndividualAxiom> getAxioms(@Nonnull OWLIndividual owlIndividual, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12678);
        __CLR4_5_29ha9halviclgwk.R.inc(12679);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12680);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12681);return delegate.getAxioms(owlIndividual, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12682);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLAnnotationAxiom> getAxioms(@Nonnull OWLAnnotationProperty owlAnnotationProperty, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12683);
        __CLR4_5_29ha9halviclgwk.R.inc(12684);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12685);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12686);return delegate.getAxioms(owlAnnotationProperty, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12687);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLDatatypeDefinitionAxiom> getAxioms(@Nonnull OWLDatatype owlDatatype, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12688);
        __CLR4_5_29ha9halviclgwk.R.inc(12689);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12690);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12691);return delegate.getAxioms(owlDatatype, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12692);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public int getAxiomCount() {try{__CLR4_5_29ha9halviclgwk.R.inc(12693);
        __CLR4_5_29ha9halviclgwk.R.inc(12694);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12695);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12696);return delegate.getAxiomCount();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12697);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public int getLogicalAxiomCount() {try{__CLR4_5_29ha9halviclgwk.R.inc(12698);
        __CLR4_5_29ha9halviclgwk.R.inc(12699);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12700);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12701);return delegate.getLogicalAxiomCount();
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12702);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public <T extends OWLAxiom> int getAxiomCount(@Nonnull AxiomType<T> axiomType) {try{__CLR4_5_29ha9halviclgwk.R.inc(12703);
        __CLR4_5_29ha9halviclgwk.R.inc(12704);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12705);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12706);return delegate.getAxiomCount(axiomType);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12707);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsAxiomIgnoreAnnotations(@Nonnull OWLAxiom owlAxiom) {try{__CLR4_5_29ha9halviclgwk.R.inc(12708);
        __CLR4_5_29ha9halviclgwk.R.inc(12709);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12710);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12711);return delegate.containsAxiomIgnoreAnnotations(owlAxiom);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12712);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAxiom> getAxiomsIgnoreAnnotations(@Nonnull OWLAxiom owlAxiom) {try{__CLR4_5_29ha9halviclgwk.R.inc(12713);
        __CLR4_5_29ha9halviclgwk.R.inc(12714);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12715);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12716);return delegate.getAxiomsIgnoreAnnotations(owlAxiom);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12717);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAxiom> getReferencingAxioms(@Nonnull OWLPrimitive owlPrimitive) {try{__CLR4_5_29ha9halviclgwk.R.inc(12718);
        __CLR4_5_29ha9halviclgwk.R.inc(12719);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12720);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12721);return delegate.getReferencingAxioms(owlPrimitive);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12722);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLClassAxiom> getAxioms(@Nonnull OWLClass owlClass) {try{__CLR4_5_29ha9halviclgwk.R.inc(12723);
        __CLR4_5_29ha9halviclgwk.R.inc(12724);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12725);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12726);return delegate.getAxioms(owlClass);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12727);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLObjectPropertyAxiom> getAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(12728);
        __CLR4_5_29ha9halviclgwk.R.inc(12729);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12730);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12731);return delegate.getAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12732);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLDataPropertyAxiom> getAxioms(@Nonnull OWLDataProperty owlDataProperty) {try{__CLR4_5_29ha9halviclgwk.R.inc(12733);
        __CLR4_5_29ha9halviclgwk.R.inc(12734);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12735);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12736);return delegate.getAxioms(owlDataProperty);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12737);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLIndividualAxiom> getAxioms(@Nonnull OWLIndividual owlIndividual) {try{__CLR4_5_29ha9halviclgwk.R.inc(12738);
        __CLR4_5_29ha9halviclgwk.R.inc(12739);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12740);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12741);return delegate.getAxioms(owlIndividual);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12742);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLAnnotationAxiom> getAxioms(@Nonnull OWLAnnotationProperty owlAnnotationProperty) {try{__CLR4_5_29ha9halviclgwk.R.inc(12743);
        __CLR4_5_29ha9halviclgwk.R.inc(12744);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12745);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12746);return delegate.getAxioms(owlAnnotationProperty);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12747);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    @Deprecated
    public Set<OWLDatatypeDefinitionAxiom> getAxioms(@Nonnull OWLDatatype owlDatatype) {try{__CLR4_5_29ha9halviclgwk.R.inc(12748);
        __CLR4_5_29ha9halviclgwk.R.inc(12749);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12750);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12751);return delegate.getAxioms(owlDatatype);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12752);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLClass> getClassesInSignature(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12753);
        __CLR4_5_29ha9halviclgwk.R.inc(12754);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12755);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12756);return delegate.getClassesInSignature(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12757);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLObjectProperty> getObjectPropertiesInSignature(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12758);
        __CLR4_5_29ha9halviclgwk.R.inc(12759);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12760);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12761);return delegate.getObjectPropertiesInSignature(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12762);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDataProperty> getDataPropertiesInSignature(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12763);
        __CLR4_5_29ha9halviclgwk.R.inc(12764);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12765);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12766);return delegate.getDataPropertiesInSignature(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12767);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLNamedIndividual> getIndividualsInSignature(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12768);
        __CLR4_5_29ha9halviclgwk.R.inc(12769);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12770);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12771);return delegate.getIndividualsInSignature(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12772);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAnonymousIndividual> getReferencedAnonymousIndividuals(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12773);
        __CLR4_5_29ha9halviclgwk.R.inc(12774);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12775);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12776);return delegate.getReferencedAnonymousIndividuals(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12777);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDatatype> getDatatypesInSignature(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12778);
        __CLR4_5_29ha9halviclgwk.R.inc(12779);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12780);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12781);return delegate.getDatatypesInSignature(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12782);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAnnotationProperty> getAnnotationPropertiesInSignature(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12783);
        __CLR4_5_29ha9halviclgwk.R.inc(12784);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12785);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12786);return delegate.getAnnotationPropertiesInSignature(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12787);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(@Nonnull OWLEntity owlEntity, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12788);
        __CLR4_5_29ha9halviclgwk.R.inc(12789);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12790);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12791);return delegate.containsEntityInSignature(owlEntity, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12792);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(@Nonnull IRI iri, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12793);
        __CLR4_5_29ha9halviclgwk.R.inc(12794);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12795);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12796);return delegate.containsEntityInSignature(iri, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12797);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsClassInSignature(@Nonnull IRI iri, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12798);
        __CLR4_5_29ha9halviclgwk.R.inc(12799);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12800);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12801);return delegate.containsClassInSignature(iri, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12802);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsObjectPropertyInSignature(@Nonnull IRI iri, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12803);
        __CLR4_5_29ha9halviclgwk.R.inc(12804);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12805);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12806);return delegate.containsObjectPropertyInSignature(iri, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12807);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsDataPropertyInSignature(@Nonnull IRI iri, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12808);
        __CLR4_5_29ha9halviclgwk.R.inc(12809);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12810);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12811);return delegate.containsDataPropertyInSignature(iri, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12812);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsAnnotationPropertyInSignature(@Nonnull IRI iri, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12813);
        __CLR4_5_29ha9halviclgwk.R.inc(12814);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12815);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12816);return delegate.containsAnnotationPropertyInSignature(iri, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12817);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsDatatypeInSignature(@Nonnull IRI iri, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12818);
        __CLR4_5_29ha9halviclgwk.R.inc(12819);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12820);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12821);return delegate.containsDatatypeInSignature(iri, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12822);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsIndividualInSignature(@Nonnull IRI iri, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12823);
        __CLR4_5_29ha9halviclgwk.R.inc(12824);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12825);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12826);return delegate.containsIndividualInSignature(iri, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12827);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsDatatypeInSignature(@Nonnull IRI iri) {try{__CLR4_5_29ha9halviclgwk.R.inc(12828);
        __CLR4_5_29ha9halviclgwk.R.inc(12829);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12830);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12831);return delegate.containsDatatypeInSignature(iri);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12832);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(@Nonnull IRI iri) {try{__CLR4_5_29ha9halviclgwk.R.inc(12833);
        __CLR4_5_29ha9halviclgwk.R.inc(12834);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12835);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12836);return delegate.containsEntityInSignature(iri);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12837);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsClassInSignature(@Nonnull IRI iri) {try{__CLR4_5_29ha9halviclgwk.R.inc(12838);
        __CLR4_5_29ha9halviclgwk.R.inc(12839);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12840);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12841);return delegate.containsClassInSignature(iri);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12842);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsObjectPropertyInSignature(@Nonnull IRI iri) {try{__CLR4_5_29ha9halviclgwk.R.inc(12843);
        __CLR4_5_29ha9halviclgwk.R.inc(12844);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12845);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12846);return delegate.containsObjectPropertyInSignature(iri);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12847);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsDataPropertyInSignature(@Nonnull IRI iri) {try{__CLR4_5_29ha9halviclgwk.R.inc(12848);
        __CLR4_5_29ha9halviclgwk.R.inc(12849);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12850);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12851);return delegate.containsDataPropertyInSignature(iri);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12852);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsAnnotationPropertyInSignature(@Nonnull IRI iri) {try{__CLR4_5_29ha9halviclgwk.R.inc(12853);
        __CLR4_5_29ha9halviclgwk.R.inc(12854);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12855);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12856);return delegate.containsAnnotationPropertyInSignature(iri);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12857);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsIndividualInSignature(@Nonnull IRI iri) {try{__CLR4_5_29ha9halviclgwk.R.inc(12858);
        __CLR4_5_29ha9halviclgwk.R.inc(12859);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12860);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12861);return delegate.containsIndividualInSignature(iri);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12862);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLEntity> getEntitiesInSignature(@Nonnull IRI iri, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12863);
        __CLR4_5_29ha9halviclgwk.R.inc(12864);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12865);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12866);return delegate.getEntitiesInSignature(iri, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12867);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public Set<IRI> getPunnedIRIs(@Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12868);
        __CLR4_5_29ha9halviclgwk.R.inc(12869);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12870);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12871);return delegate.getPunnedIRIs(imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12872);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsReference(@Nonnull OWLEntity owlEntity, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12873);
        __CLR4_5_29ha9halviclgwk.R.inc(12874);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12875);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12876);return delegate.containsReference(owlEntity, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12877);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean containsReference(@Nonnull OWLEntity owlEntity) {try{__CLR4_5_29ha9halviclgwk.R.inc(12878);
        __CLR4_5_29ha9halviclgwk.R.inc(12879);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12880);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12881);return delegate.containsReference(owlEntity);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12882);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLEntity> getEntitiesInSignature(@Nonnull IRI iri) {try{__CLR4_5_29ha9halviclgwk.R.inc(12883);
        __CLR4_5_29ha9halviclgwk.R.inc(12884);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12885);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12886);return delegate.getEntitiesInSignature(iri);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12887);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    @Nonnull
    public Set<OWLClass> getClassesInSignature(boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12888);
        __CLR4_5_29ha9halviclgwk.R.inc(12889);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12890);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12891);return delegate.getClassesInSignature(b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12892);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    @Nonnull
    public Set<OWLObjectProperty> getObjectPropertiesInSignature(boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12893);
        __CLR4_5_29ha9halviclgwk.R.inc(12894);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12895);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12896);return delegate.getObjectPropertiesInSignature(b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12897);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    @Nonnull
    public Set<OWLDataProperty> getDataPropertiesInSignature(boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12898);
        __CLR4_5_29ha9halviclgwk.R.inc(12899);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12900);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12901);return delegate.getDataPropertiesInSignature(b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12902);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    @Nonnull
    public Set<OWLNamedIndividual> getIndividualsInSignature(boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12903);
        __CLR4_5_29ha9halviclgwk.R.inc(12904);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12905);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12906);return delegate.getIndividualsInSignature(b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12907);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    @Nonnull
    public Set<OWLAnonymousIndividual> getReferencedAnonymousIndividuals(boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12908);
        __CLR4_5_29ha9halviclgwk.R.inc(12909);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12910);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12911);return delegate.getReferencedAnonymousIndividuals(b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12912);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    @Nonnull
    public Set<OWLDatatype> getDatatypesInSignature(boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12913);
        __CLR4_5_29ha9halviclgwk.R.inc(12914);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12915);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12916);return delegate.getDatatypesInSignature(b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12917);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    @Nonnull
    public Set<OWLAnnotationProperty> getAnnotationPropertiesInSignature(boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12918);
        __CLR4_5_29ha9halviclgwk.R.inc(12919);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12920);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12921);return delegate.getAnnotationPropertiesInSignature(b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12922);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public boolean containsEntityInSignature(@Nonnull OWLEntity owlEntity, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12923);
        __CLR4_5_29ha9halviclgwk.R.inc(12924);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12925);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12926);return delegate.containsEntityInSignature(owlEntity, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12927);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public boolean containsEntityInSignature(@Nonnull IRI iri, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12928);
        __CLR4_5_29ha9halviclgwk.R.inc(12929);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12930);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12931);return delegate.containsEntityInSignature(iri, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12932);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public boolean containsClassInSignature(@Nonnull IRI iri, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12933);
        __CLR4_5_29ha9halviclgwk.R.inc(12934);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12935);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12936);return delegate.containsClassInSignature(iri, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12937);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public boolean containsObjectPropertyInSignature(@Nonnull IRI iri, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12938);
        __CLR4_5_29ha9halviclgwk.R.inc(12939);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12940);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12941);return delegate.containsObjectPropertyInSignature(iri, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12942);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public boolean containsDataPropertyInSignature(@Nonnull IRI iri, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12943);
        __CLR4_5_29ha9halviclgwk.R.inc(12944);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12945);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12946);return delegate.containsDataPropertyInSignature(iri, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12947);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public boolean containsAnnotationPropertyInSignature(@Nonnull IRI iri, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12948);
        __CLR4_5_29ha9halviclgwk.R.inc(12949);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12950);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12951);return delegate.containsAnnotationPropertyInSignature(iri, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12952);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public boolean containsDatatypeInSignature(@Nonnull IRI iri, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12953);
        __CLR4_5_29ha9halviclgwk.R.inc(12954);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12955);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12956);return delegate.containsDatatypeInSignature(iri, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12957);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public boolean containsIndividualInSignature(@Nonnull IRI iri, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12958);
        __CLR4_5_29ha9halviclgwk.R.inc(12959);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12960);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12961);return delegate.containsIndividualInSignature(iri, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12962);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    @Nonnull
    public Set<OWLEntity> getEntitiesInSignature(@Nonnull IRI iri, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12963);
        __CLR4_5_29ha9halviclgwk.R.inc(12964);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12965);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12966);return delegate.getEntitiesInSignature(iri, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12967);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Deprecated
    public boolean containsReference(@Nonnull OWLEntity owlEntity, boolean b) {try{__CLR4_5_29ha9halviclgwk.R.inc(12968);
        __CLR4_5_29ha9halviclgwk.R.inc(12969);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12970);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12971);return delegate.containsReference(owlEntity, b);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12972);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public <T extends OWLAxiom> Set<T> getAxioms(@Nonnull Class<T> aClass, @Nonnull OWLObject owlObject, @Nonnull Imports imports, @Nonnull Navigation navigation) {try{__CLR4_5_29ha9halviclgwk.R.inc(12973);
        __CLR4_5_29ha9halviclgwk.R.inc(12974);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12975);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12976);return delegate.getAxioms(aClass, owlObject, imports, navigation);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12977);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public <T extends OWLAxiom> Collection<T> filterAxioms(@Nonnull OWLAxiomSearchFilter owlAxiomSearchFilter, @Nonnull Object o, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12978);
        __CLR4_5_29ha9halviclgwk.R.inc(12979);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12980);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12981);return delegate.filterAxioms(owlAxiomSearchFilter, o, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12982);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public boolean contains(@Nonnull OWLAxiomSearchFilter owlAxiomSearchFilter, @Nonnull Object o, @Nonnull Imports imports) {try{__CLR4_5_29ha9halviclgwk.R.inc(12983);
        __CLR4_5_29ha9halviclgwk.R.inc(12984);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12985);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12986);return delegate.contains(owlAxiomSearchFilter, o, imports);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12987);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public <T extends OWLAxiom> Set<T> getAxioms(@Nonnull Class<T> aClass, @Nonnull Class<? extends OWLObject> aClass1, @Nonnull OWLObject owlObject, @Nonnull Imports imports, @Nonnull Navigation navigation) {try{__CLR4_5_29ha9halviclgwk.R.inc(12988);
        __CLR4_5_29ha9halviclgwk.R.inc(12989);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12990);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12991);return delegate.getAxioms(aClass, aClass1, owlObject, imports, navigation);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12992);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLSubAnnotationPropertyOfAxiom> getSubAnnotationPropertyOfAxioms(@Nonnull OWLAnnotationProperty owlAnnotationProperty) {try{__CLR4_5_29ha9halviclgwk.R.inc(12993);
        __CLR4_5_29ha9halviclgwk.R.inc(12994);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(12995);try {
            __CLR4_5_29ha9halviclgwk.R.inc(12996);return delegate.getSubAnnotationPropertyOfAxioms(owlAnnotationProperty);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(12997);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAnnotationPropertyDomainAxiom> getAnnotationPropertyDomainAxioms(@Nonnull OWLAnnotationProperty owlAnnotationProperty) {try{__CLR4_5_29ha9halviclgwk.R.inc(12998);
        __CLR4_5_29ha9halviclgwk.R.inc(12999);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13000);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13001);return delegate.getAnnotationPropertyDomainAxioms(owlAnnotationProperty);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13002);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAnnotationPropertyRangeAxiom> getAnnotationPropertyRangeAxioms(@Nonnull OWLAnnotationProperty owlAnnotationProperty) {try{__CLR4_5_29ha9halviclgwk.R.inc(13003);
        __CLR4_5_29ha9halviclgwk.R.inc(13004);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13005);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13006);return delegate.getAnnotationPropertyRangeAxioms(owlAnnotationProperty);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13007);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDeclarationAxiom> getDeclarationAxioms(@Nonnull OWLEntity owlEntity) {try{__CLR4_5_29ha9halviclgwk.R.inc(13008);
        __CLR4_5_29ha9halviclgwk.R.inc(13009);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13010);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13011);return delegate.getDeclarationAxioms(owlEntity);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13012);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAnnotationAssertionAxiom> getAnnotationAssertionAxioms(@Nonnull OWLAnnotationSubject owlAnnotationSubject) {try{__CLR4_5_29ha9halviclgwk.R.inc(13013);
        __CLR4_5_29ha9halviclgwk.R.inc(13014);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13015);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13016);return delegate.getAnnotationAssertionAxioms(owlAnnotationSubject);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13017);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLSubClassOfAxiom> getSubClassAxiomsForSubClass(@Nonnull OWLClass owlClass) {try{__CLR4_5_29ha9halviclgwk.R.inc(13018);
        __CLR4_5_29ha9halviclgwk.R.inc(13019);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13020);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13021);return delegate.getSubClassAxiomsForSubClass(owlClass);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13022);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLSubClassOfAxiom> getSubClassAxiomsForSuperClass(@Nonnull OWLClass owlClass) {try{__CLR4_5_29ha9halviclgwk.R.inc(13023);
        __CLR4_5_29ha9halviclgwk.R.inc(13024);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13025);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13026);return delegate.getSubClassAxiomsForSuperClass(owlClass);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13027);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLEquivalentClassesAxiom> getEquivalentClassesAxioms(@Nonnull OWLClass owlClass) {try{__CLR4_5_29ha9halviclgwk.R.inc(13028);
        __CLR4_5_29ha9halviclgwk.R.inc(13029);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13030);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13031);return delegate.getEquivalentClassesAxioms(owlClass);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13032);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDisjointClassesAxiom> getDisjointClassesAxioms(@Nonnull OWLClass owlClass) {try{__CLR4_5_29ha9halviclgwk.R.inc(13033);
        __CLR4_5_29ha9halviclgwk.R.inc(13034);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13035);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13036);return delegate.getDisjointClassesAxioms(owlClass);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13037);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDisjointUnionAxiom> getDisjointUnionAxioms(@Nonnull OWLClass owlClass) {try{__CLR4_5_29ha9halviclgwk.R.inc(13038);
        __CLR4_5_29ha9halviclgwk.R.inc(13039);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13040);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13041);return delegate.getDisjointUnionAxioms(owlClass);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13042);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLHasKeyAxiom> getHasKeyAxioms(@Nonnull OWLClass owlClass) {try{__CLR4_5_29ha9halviclgwk.R.inc(13043);
        __CLR4_5_29ha9halviclgwk.R.inc(13044);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13045);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13046);return delegate.getHasKeyAxioms(owlClass);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13047);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLSubObjectPropertyOfAxiom> getObjectSubPropertyAxiomsForSubProperty(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13048);
        __CLR4_5_29ha9halviclgwk.R.inc(13049);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13050);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13051);return delegate.getObjectSubPropertyAxiomsForSubProperty(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13052);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLSubObjectPropertyOfAxiom> getObjectSubPropertyAxiomsForSuperProperty(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13053);
        __CLR4_5_29ha9halviclgwk.R.inc(13054);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13055);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13056);return delegate.getObjectSubPropertyAxiomsForSuperProperty(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13057);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLObjectPropertyDomainAxiom> getObjectPropertyDomainAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13058);
        __CLR4_5_29ha9halviclgwk.R.inc(13059);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13060);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13061);return delegate.getObjectPropertyDomainAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13062);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLObjectPropertyRangeAxiom> getObjectPropertyRangeAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13063);
        __CLR4_5_29ha9halviclgwk.R.inc(13064);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13065);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13066);return delegate.getObjectPropertyRangeAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13067);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLInverseObjectPropertiesAxiom> getInverseObjectPropertyAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13068);
        __CLR4_5_29ha9halviclgwk.R.inc(13069);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13070);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13071);return delegate.getInverseObjectPropertyAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13072);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLEquivalentObjectPropertiesAxiom> getEquivalentObjectPropertiesAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13073);
        __CLR4_5_29ha9halviclgwk.R.inc(13074);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13075);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13076);return delegate.getEquivalentObjectPropertiesAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13077);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDisjointObjectPropertiesAxiom> getDisjointObjectPropertiesAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13078);
        __CLR4_5_29ha9halviclgwk.R.inc(13079);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13080);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13081);return delegate.getDisjointObjectPropertiesAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13082);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLFunctionalObjectPropertyAxiom> getFunctionalObjectPropertyAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13083);
        __CLR4_5_29ha9halviclgwk.R.inc(13084);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13085);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13086);return delegate.getFunctionalObjectPropertyAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13087);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLInverseFunctionalObjectPropertyAxiom> getInverseFunctionalObjectPropertyAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13088);
        __CLR4_5_29ha9halviclgwk.R.inc(13089);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13090);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13091);return delegate.getInverseFunctionalObjectPropertyAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13092);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLSymmetricObjectPropertyAxiom> getSymmetricObjectPropertyAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13093);
        __CLR4_5_29ha9halviclgwk.R.inc(13094);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13095);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13096);return delegate.getSymmetricObjectPropertyAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13097);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAsymmetricObjectPropertyAxiom> getAsymmetricObjectPropertyAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13098);
        __CLR4_5_29ha9halviclgwk.R.inc(13099);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13100);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13101);return delegate.getAsymmetricObjectPropertyAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13102);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLReflexiveObjectPropertyAxiom> getReflexiveObjectPropertyAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13103);
        __CLR4_5_29ha9halviclgwk.R.inc(13104);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13105);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13106);return delegate.getReflexiveObjectPropertyAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13107);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLIrreflexiveObjectPropertyAxiom> getIrreflexiveObjectPropertyAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13108);
        __CLR4_5_29ha9halviclgwk.R.inc(13109);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13110);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13111);return delegate.getIrreflexiveObjectPropertyAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13112);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLTransitiveObjectPropertyAxiom> getTransitiveObjectPropertyAxioms(@Nonnull OWLObjectPropertyExpression owlObjectPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13113);
        __CLR4_5_29ha9halviclgwk.R.inc(13114);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13115);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13116);return delegate.getTransitiveObjectPropertyAxioms(owlObjectPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13117);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLSubDataPropertyOfAxiom> getDataSubPropertyAxiomsForSubProperty(@Nonnull OWLDataProperty owlDataProperty) {try{__CLR4_5_29ha9halviclgwk.R.inc(13118);
        __CLR4_5_29ha9halviclgwk.R.inc(13119);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13120);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13121);return delegate.getDataSubPropertyAxiomsForSubProperty(owlDataProperty);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13122);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLSubDataPropertyOfAxiom> getDataSubPropertyAxiomsForSuperProperty(@Nonnull OWLDataPropertyExpression owlDataPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13123);
        __CLR4_5_29ha9halviclgwk.R.inc(13124);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13125);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13126);return delegate.getDataSubPropertyAxiomsForSuperProperty(owlDataPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13127);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDataPropertyDomainAxiom> getDataPropertyDomainAxioms(@Nonnull OWLDataProperty owlDataProperty) {try{__CLR4_5_29ha9halviclgwk.R.inc(13128);
        __CLR4_5_29ha9halviclgwk.R.inc(13129);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13130);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13131);return delegate.getDataPropertyDomainAxioms(owlDataProperty);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13132);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDataPropertyRangeAxiom> getDataPropertyRangeAxioms(@Nonnull OWLDataProperty owlDataProperty) {try{__CLR4_5_29ha9halviclgwk.R.inc(13133);
        __CLR4_5_29ha9halviclgwk.R.inc(13134);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13135);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13136);return delegate.getDataPropertyRangeAxioms(owlDataProperty);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13137);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLEquivalentDataPropertiesAxiom> getEquivalentDataPropertiesAxioms(@Nonnull OWLDataProperty owlDataProperty) {try{__CLR4_5_29ha9halviclgwk.R.inc(13138);
        __CLR4_5_29ha9halviclgwk.R.inc(13139);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13140);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13141);return delegate.getEquivalentDataPropertiesAxioms(owlDataProperty);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13142);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDisjointDataPropertiesAxiom> getDisjointDataPropertiesAxioms(@Nonnull OWLDataProperty owlDataProperty) {try{__CLR4_5_29ha9halviclgwk.R.inc(13143);
        __CLR4_5_29ha9halviclgwk.R.inc(13144);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13145);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13146);return delegate.getDisjointDataPropertiesAxioms(owlDataProperty);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13147);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLFunctionalDataPropertyAxiom> getFunctionalDataPropertyAxioms(@Nonnull OWLDataPropertyExpression owlDataPropertyExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13148);
        __CLR4_5_29ha9halviclgwk.R.inc(13149);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13150);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13151);return delegate.getFunctionalDataPropertyAxioms(owlDataPropertyExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13152);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLClassAssertionAxiom> getClassAssertionAxioms(@Nonnull OWLIndividual owlIndividual) {try{__CLR4_5_29ha9halviclgwk.R.inc(13153);
        __CLR4_5_29ha9halviclgwk.R.inc(13154);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13155);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13156);return delegate.getClassAssertionAxioms(owlIndividual);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13157);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLClassAssertionAxiom> getClassAssertionAxioms(@Nonnull OWLClassExpression owlClassExpression) {try{__CLR4_5_29ha9halviclgwk.R.inc(13158);
        __CLR4_5_29ha9halviclgwk.R.inc(13159);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13160);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13161);return delegate.getClassAssertionAxioms(owlClassExpression);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13162);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDataPropertyAssertionAxiom> getDataPropertyAssertionAxioms(@Nonnull OWLIndividual owlIndividual) {try{__CLR4_5_29ha9halviclgwk.R.inc(13163);
        __CLR4_5_29ha9halviclgwk.R.inc(13164);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13165);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13166);return delegate.getDataPropertyAssertionAxioms(owlIndividual);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13167);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLObjectPropertyAssertionAxiom> getObjectPropertyAssertionAxioms(@Nonnull OWLIndividual owlIndividual) {try{__CLR4_5_29ha9halviclgwk.R.inc(13168);
        __CLR4_5_29ha9halviclgwk.R.inc(13169);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13170);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13171);return delegate.getObjectPropertyAssertionAxioms(owlIndividual);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13172);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLNegativeObjectPropertyAssertionAxiom> getNegativeObjectPropertyAssertionAxioms(@Nonnull OWLIndividual owlIndividual) {try{__CLR4_5_29ha9halviclgwk.R.inc(13173);
        __CLR4_5_29ha9halviclgwk.R.inc(13174);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13175);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13176);return delegate.getNegativeObjectPropertyAssertionAxioms(owlIndividual);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13177);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLNegativeDataPropertyAssertionAxiom> getNegativeDataPropertyAssertionAxioms(@Nonnull OWLIndividual owlIndividual) {try{__CLR4_5_29ha9halviclgwk.R.inc(13178);
        __CLR4_5_29ha9halviclgwk.R.inc(13179);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13180);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13181);return delegate.getNegativeDataPropertyAssertionAxioms(owlIndividual);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13182);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLSameIndividualAxiom> getSameIndividualAxioms(@Nonnull OWLIndividual owlIndividual) {try{__CLR4_5_29ha9halviclgwk.R.inc(13183);
        __CLR4_5_29ha9halviclgwk.R.inc(13184);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13185);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13186);return delegate.getSameIndividualAxioms(owlIndividual);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13187);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDifferentIndividualsAxiom> getDifferentIndividualAxioms(@Nonnull OWLIndividual owlIndividual) {try{__CLR4_5_29ha9halviclgwk.R.inc(13188);
        __CLR4_5_29ha9halviclgwk.R.inc(13189);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13190);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13191);return delegate.getDifferentIndividualAxioms(owlIndividual);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13192);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDatatypeDefinitionAxiom> getDatatypeDefinitions(@Nonnull OWLDatatype owlDatatype) {try{__CLR4_5_29ha9halviclgwk.R.inc(13193);
        __CLR4_5_29ha9halviclgwk.R.inc(13194);readLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13195);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13196);return delegate.getDatatypeDefinitions(owlDatatype);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13197);readLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public ChangeApplied applyChange(@Nonnull OWLOntologyChange owlOntologyChange) {try{__CLR4_5_29ha9halviclgwk.R.inc(13198);
        __CLR4_5_29ha9halviclgwk.R.inc(13199);writeLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13200);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13201);return getMutableOntology().applyChange(owlOntologyChange);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13202);writeLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public ChangeApplied applyChanges(
        @Nonnull List<? extends OWLOntologyChange> list) {try{__CLR4_5_29ha9halviclgwk.R.inc(13203);
        __CLR4_5_29ha9halviclgwk.R.inc(13204);writeLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13205);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13206);return getMutableOntology().applyChanges(list);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13207);writeLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    @Nonnull
    public ChangeApplied addAxiom(@Nonnull OWLAxiom owlAxiom) {try{__CLR4_5_29ha9halviclgwk.R.inc(13208);
        __CLR4_5_29ha9halviclgwk.R.inc(13209);writeLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13210);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13211);return getMutableOntology().addAxiom(owlAxiom);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13212);writeLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    @Override
    public ChangeApplied addAxioms(@Nonnull Set<? extends OWLAxiom> set) {try{__CLR4_5_29ha9halviclgwk.R.inc(13213);
        __CLR4_5_29ha9halviclgwk.R.inc(13214);writeLock.lock();
        __CLR4_5_29ha9halviclgwk.R.inc(13215);try {
            __CLR4_5_29ha9halviclgwk.R.inc(13216);return getMutableOntology().addAxioms(set);
        } finally {
            __CLR4_5_29ha9halviclgwk.R.inc(13217);writeLock.unlock();
        }
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}

    private OWLMutableOntology getMutableOntology() {try{__CLR4_5_29ha9halviclgwk.R.inc(13218);
        __CLR4_5_29ha9halviclgwk.R.inc(13219);return (OWLMutableOntology) delegate;
    }finally{__CLR4_5_29ha9halviclgwk.R.flushNeeded();}}
}
