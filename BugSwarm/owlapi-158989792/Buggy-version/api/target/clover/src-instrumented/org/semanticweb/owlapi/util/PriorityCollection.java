/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.util;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.MIMETypeAware;
import org.semanticweb.owlapi.model.PriorityCollectionSorting;

import com.google.common.collect.Iterators;

/**
 * A collection that is sorted by HasPriority annotation on its members
 * 
 * @author ignazio
 * @param <T>
 *        type of the collection
 * @since 4.0.0
 */
public class PriorityCollection<T extends Serializable> implements Iterable<T>, Serializable {public static class __CLR4_5_2aubaublvickru5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,14108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final List<T> delegate = Collections.synchronizedList(new ArrayList<T>());
    private final PriorityCollectionSorting sorting;

    /**
     * @param sorting
     *        the sort settings.
     */
    public PriorityCollection(PriorityCollectionSorting sorting) {try{__CLR4_5_2aubaublvickru5.R.inc(14051);
        __CLR4_5_2aubaublvickru5.R.inc(14052);this.sorting = sorting;
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    /**
     * @return true if the collection is empty
     */
    public boolean isEmpty() {try{__CLR4_5_2aubaublvickru5.R.inc(14053);
        __CLR4_5_2aubaublvickru5.R.inc(14054);return delegate.isEmpty();
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    /**
     * @return size of the collection
     */
    public int size() {try{__CLR4_5_2aubaublvickru5.R.inc(14055);
        __CLR4_5_2aubaublvickru5.R.inc(14056);return delegate.size();
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    private void sort() {try{__CLR4_5_2aubaublvickru5.R.inc(14057);
        __CLR4_5_2aubaublvickru5.R.inc(14058);sorting.sort(delegate);
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    private void sortSet() {try{__CLR4_5_2aubaublvickru5.R.inc(14059);
        __CLR4_5_2aubaublvickru5.R.inc(14060);sorting.sortInputSet(delegate);
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    /**
     * @param c
     *        collection of elements to set. Existing elements will be removed,
     *        and the priority collection will be sorted according to the
     *        PriorityCollectionSorting value for the manager configuration.
     */
    public void set(Iterable<T> c) {try{__CLR4_5_2aubaublvickru5.R.inc(14061);
        __CLR4_5_2aubaublvickru5.R.inc(14062);clear();
        __CLR4_5_2aubaublvickru5.R.inc(14063);add(c);
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    /**
     * @param c
     *        collection of elements to set. Existing elements will be removed,
     *        and the priority collection will be sorted according to the
     *        PriorityCollectionSorting value for the manager configuration.
     */
    public void set(Set<T> c) {try{__CLR4_5_2aubaublvickru5.R.inc(14064);
        __CLR4_5_2aubaublvickru5.R.inc(14065);clear();
        __CLR4_5_2aubaublvickru5.R.inc(14066);for (T t : c) {{
            __CLR4_5_2aubaublvickru5.R.inc(14067);delegate.add(t);
        }
        }__CLR4_5_2aubaublvickru5.R.inc(14068);sortSet();
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    /**
     * Remove all elements, replace with the arguments and sort according to
     * priority
     * 
     * @param c
     *        list of elements to set
     */
    public void set(T... c) {try{__CLR4_5_2aubaublvickru5.R.inc(14069);
        __CLR4_5_2aubaublvickru5.R.inc(14070);clear();
        __CLR4_5_2aubaublvickru5.R.inc(14071);add(c);
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    /**
     * add the arguments and sort according to the PriorityCollectionSorting
     * value for the manager configuration
     * 
     * @param c
     *        list of elements to add
     */
    public void add(T... c) {try{__CLR4_5_2aubaublvickru5.R.inc(14072);
        __CLR4_5_2aubaublvickru5.R.inc(14073);int i = 0;
        __CLR4_5_2aubaublvickru5.R.inc(14074);for (T t : c) {{
            __CLR4_5_2aubaublvickru5.R.inc(14075);delegate.add(i++, t);
        }
        }__CLR4_5_2aubaublvickru5.R.inc(14076);sort();
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    /**
     * add the arguments and sort according to the PriorityCollectionSorting
     * value for the manager configuration
     * 
     * @param c
     *        list of elements to add
     */
    public void add(Iterable<T> c) {try{__CLR4_5_2aubaublvickru5.R.inc(14077);
        __CLR4_5_2aubaublvickru5.R.inc(14078);int i = 0;
        __CLR4_5_2aubaublvickru5.R.inc(14079);for (T t : c) {{
            __CLR4_5_2aubaublvickru5.R.inc(14080);delegate.add(i++, t);
        }
        }__CLR4_5_2aubaublvickru5.R.inc(14081);sort();
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    /**
     * remove the arguments
     * 
     * @param c
     *        list of elements to remove
     */
    public void remove(T... c) {try{__CLR4_5_2aubaublvickru5.R.inc(14082);
        __CLR4_5_2aubaublvickru5.R.inc(14083);for (T t : c) {{
            __CLR4_5_2aubaublvickru5.R.inc(14084);delegate.remove(t);
        }
    }}finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    /**
     * remove all elements from the collection
     */
    public void clear() {try{__CLR4_5_2aubaublvickru5.R.inc(14085);
        __CLR4_5_2aubaublvickru5.R.inc(14086);delegate.clear();
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    @Override
    public Iterator<T> iterator() {try{__CLR4_5_2aubaublvickru5.R.inc(14087);
        __CLR4_5_2aubaublvickru5.R.inc(14088);return Iterators.unmodifiableIterator(delegate.iterator());
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    /**
     * Returns the first item matching the mime type<br>
     * NOTE: The order in which the services are loaded an examined is not
     * deterministic so this method may return different results if the
     * MIME-Type matches more than one item. However, if the default MIME-Types
     * are always unique, the correct item will always be chosen
     * 
     * @param mimeType
     *        A MIME type to use for choosing an item
     * @return An item matching the given mime type or null if none were found.
     */
    public PriorityCollection<T> getByMIMEType(@Nonnull String mimeType) {try{__CLR4_5_2aubaublvickru5.R.inc(14089);
        __CLR4_5_2aubaublvickru5.R.inc(14090);checkNotNull(mimeType, "MIME-Type cannot be null");
        __CLR4_5_2aubaublvickru5.R.inc(14091);PriorityCollection<T> pc = new PriorityCollection<>(sorting);
        // adding directly to the delegate. No need to order because insertion
        // will be ordered as in this PriorityCollection
        __CLR4_5_2aubaublvickru5.R.inc(14092);for (T t : delegate) {{
            // if the instance has MIME types associated
            __CLR4_5_2aubaublvickru5.R.inc(14093);if ((((t instanceof MIMETypeAware)&&(__CLR4_5_2aubaublvickru5.R.iget(14094)!=0|true))||(__CLR4_5_2aubaublvickru5.R.iget(14095)==0&false))) {{
                __CLR4_5_2aubaublvickru5.R.inc(14096);MIMETypeAware mimeTypeAware = (MIMETypeAware) t;
                __CLR4_5_2aubaublvickru5.R.inc(14097);if ((((mimeType.equals(mimeTypeAware.getDefaultMIMEType()))&&(__CLR4_5_2aubaublvickru5.R.iget(14098)!=0|true))||(__CLR4_5_2aubaublvickru5.R.iget(14099)==0&false))) {{
                    __CLR4_5_2aubaublvickru5.R.inc(14100);pc.add(t);
                } }else {{
                    __CLR4_5_2aubaublvickru5.R.inc(14101);if ((((mimeTypeAware.getMIMETypes().contains(mimeType))&&(__CLR4_5_2aubaublvickru5.R.iget(14102)!=0|true))||(__CLR4_5_2aubaublvickru5.R.iget(14103)==0&false))) {{
                        __CLR4_5_2aubaublvickru5.R.inc(14104);pc.add(t);
                    }
                }}
            }}
        }}
        }__CLR4_5_2aubaublvickru5.R.inc(14105);return pc;
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2aubaublvickru5.R.inc(14106);
        __CLR4_5_2aubaublvickru5.R.inc(14107);return delegate.toString();
    }finally{__CLR4_5_2aubaublvickru5.R.flushNeeded();}}
}
