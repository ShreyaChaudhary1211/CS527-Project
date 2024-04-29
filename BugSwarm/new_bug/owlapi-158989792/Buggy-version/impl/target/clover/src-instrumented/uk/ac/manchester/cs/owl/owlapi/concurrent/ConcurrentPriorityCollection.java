/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package uk.ac.manchester.cs.owl.owlapi.concurrent;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.PriorityCollectionSorting;
import org.semanticweb.owlapi.util.PriorityCollection;

/**
 * Matthew Horridge Stanford Center for Biomedical Informatics Research 09/04/15
 * A priority collection that supports concurrent reading and writing through a
 * {@link ReadWriteLock}
 * 
 * @param <T>
 *        type contained
 */
public class ConcurrentPriorityCollection<T extends Serializable> extends PriorityCollection<T> {public static class __CLR4_5_2a78a78lviclgx3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,13288,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Lock readLock;
    private final Lock writeLock;

    /**
     * Constructs a {@link ConcurrentPriorityCollection} using the specified
     * {@link ReadWriteLock}
     * 
     * @param readWriteLock
     *        The {@link java.util.concurrent.locks.ReadWriteLock} that should
     *        be used for locking.
     */
    public ConcurrentPriorityCollection(@Nonnull ReadWriteLock readWriteLock, PriorityCollectionSorting sorting) {
        super(sorting);__CLR4_5_2a78a78lviclgx3.R.inc(13221);try{__CLR4_5_2a78a78lviclgx3.R.inc(13220);
        __CLR4_5_2a78a78lviclgx3.R.inc(13222);verifyNotNull(readWriteLock);
        __CLR4_5_2a78a78lviclgx3.R.inc(13223);this.readLock = readWriteLock.readLock();
        __CLR4_5_2a78a78lviclgx3.R.inc(13224);this.writeLock = readWriteLock.writeLock();
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}

    @Override
    public boolean isEmpty() {try{__CLR4_5_2a78a78lviclgx3.R.inc(13225);
        __CLR4_5_2a78a78lviclgx3.R.inc(13226);readLock.lock();
        __CLR4_5_2a78a78lviclgx3.R.inc(13227);try {
            __CLR4_5_2a78a78lviclgx3.R.inc(13228);return super.isEmpty();
        } finally {
            __CLR4_5_2a78a78lviclgx3.R.inc(13229);readLock.unlock();
        }
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}

    @Override
    public int size() {try{__CLR4_5_2a78a78lviclgx3.R.inc(13230);
        __CLR4_5_2a78a78lviclgx3.R.inc(13231);readLock.lock();
        __CLR4_5_2a78a78lviclgx3.R.inc(13232);try {
            __CLR4_5_2a78a78lviclgx3.R.inc(13233);return super.size();
        } finally {
            __CLR4_5_2a78a78lviclgx3.R.inc(13234);readLock.unlock();
        }
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}

    @Override
    public void set(Iterable<T> c) {try{__CLR4_5_2a78a78lviclgx3.R.inc(13235);
        __CLR4_5_2a78a78lviclgx3.R.inc(13236);writeLock.lock();
        __CLR4_5_2a78a78lviclgx3.R.inc(13237);try {
            __CLR4_5_2a78a78lviclgx3.R.inc(13238);super.set(c);
        } finally {
            __CLR4_5_2a78a78lviclgx3.R.inc(13239);writeLock.unlock();
        }
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}

    @Override
    public void add(Iterable<T> c) {try{__CLR4_5_2a78a78lviclgx3.R.inc(13240);
        __CLR4_5_2a78a78lviclgx3.R.inc(13241);writeLock.lock();
        __CLR4_5_2a78a78lviclgx3.R.inc(13242);try {
            __CLR4_5_2a78a78lviclgx3.R.inc(13243);super.add(c);
        } finally {
            __CLR4_5_2a78a78lviclgx3.R.inc(13244);writeLock.unlock();
        }
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}

    @Override
    public void set(T... c) {try{__CLR4_5_2a78a78lviclgx3.R.inc(13245);
        __CLR4_5_2a78a78lviclgx3.R.inc(13246);writeLock.lock();
        __CLR4_5_2a78a78lviclgx3.R.inc(13247);try {
            __CLR4_5_2a78a78lviclgx3.R.inc(13248);super.set(c);
        } finally {
            __CLR4_5_2a78a78lviclgx3.R.inc(13249);writeLock.unlock();
        }
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}

    @Override
    public void add(T... c) {try{__CLR4_5_2a78a78lviclgx3.R.inc(13250);
        __CLR4_5_2a78a78lviclgx3.R.inc(13251);writeLock.lock();
        __CLR4_5_2a78a78lviclgx3.R.inc(13252);try {
            __CLR4_5_2a78a78lviclgx3.R.inc(13253);super.add(c);
        } finally {
            __CLR4_5_2a78a78lviclgx3.R.inc(13254);writeLock.unlock();
        }
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}

    @Override
    public void remove(T... c) {try{__CLR4_5_2a78a78lviclgx3.R.inc(13255);
        __CLR4_5_2a78a78lviclgx3.R.inc(13256);writeLock.lock();
        __CLR4_5_2a78a78lviclgx3.R.inc(13257);try {
            __CLR4_5_2a78a78lviclgx3.R.inc(13258);super.remove(c);
        } finally {
            __CLR4_5_2a78a78lviclgx3.R.inc(13259);writeLock.unlock();
        }
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}

    @Override
    public void clear() {try{__CLR4_5_2a78a78lviclgx3.R.inc(13260);
        __CLR4_5_2a78a78lviclgx3.R.inc(13261);writeLock.lock();
        __CLR4_5_2a78a78lviclgx3.R.inc(13262);try {
            __CLR4_5_2a78a78lviclgx3.R.inc(13263);super.clear();
        } finally {
            __CLR4_5_2a78a78lviclgx3.R.inc(13264);writeLock.unlock();
        }
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}

    @Override
    public Iterator<T> iterator() {try{__CLR4_5_2a78a78lviclgx3.R.inc(13265);
        __CLR4_5_2a78a78lviclgx3.R.inc(13266);return copyIterable().iterator();
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}

    @Override
    public PriorityCollection<T> getByMIMEType(@Nonnull String mimeType) {try{__CLR4_5_2a78a78lviclgx3.R.inc(13267);
        __CLR4_5_2a78a78lviclgx3.R.inc(13268);readLock.lock();
        __CLR4_5_2a78a78lviclgx3.R.inc(13269);try {
            __CLR4_5_2a78a78lviclgx3.R.inc(13270);return super.getByMIMEType(mimeType);
        } finally {
            __CLR4_5_2a78a78lviclgx3.R.inc(13271);readLock.unlock();
        }
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2a78a78lviclgx3.R.inc(13272);
        __CLR4_5_2a78a78lviclgx3.R.inc(13273);readLock.lock();
        __CLR4_5_2a78a78lviclgx3.R.inc(13274);try {
            __CLR4_5_2a78a78lviclgx3.R.inc(13275);return super.toString();
        } finally {
            __CLR4_5_2a78a78lviclgx3.R.inc(13276);readLock.unlock();
        }
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}

    private Iterable<T> copyIterable() {try{__CLR4_5_2a78a78lviclgx3.R.inc(13277);
        __CLR4_5_2a78a78lviclgx3.R.inc(13278);readLock.lock();
        __CLR4_5_2a78a78lviclgx3.R.inc(13279);try {
            __CLR4_5_2a78a78lviclgx3.R.inc(13280);List<T> copy = new ArrayList<>();
            __CLR4_5_2a78a78lviclgx3.R.inc(13281);for (Iterator<T> it = super.iterator(); (((it.hasNext())&&(__CLR4_5_2a78a78lviclgx3.R.iget(13282)!=0|true))||(__CLR4_5_2a78a78lviclgx3.R.iget(13283)==0&false));) {{
                __CLR4_5_2a78a78lviclgx3.R.inc(13284);T element = it.next();
                __CLR4_5_2a78a78lviclgx3.R.inc(13285);copy.add(element);
            }
            }__CLR4_5_2a78a78lviclgx3.R.inc(13286);return copy;
        } finally {
            __CLR4_5_2a78a78lviclgx3.R.inc(13287);readLock.unlock();
        }
    }finally{__CLR4_5_2a78a78lviclgx3.R.flushNeeded();}}
}
