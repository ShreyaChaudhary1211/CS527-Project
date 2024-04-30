/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.util;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This lazy list tries to postpone the size() call as much as possible.
 */
public class LazyList<E> extends AbstractList<E> {public static class __CLR4_5_2forforlvlulnf9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,20370,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOG = Logger.getLogger(LazyList.class);

    List<E> underlying;
    Iterator<E> elementSource;

    public LazyList(List<E> underlying, Iterator<E> elementSource) {try{__CLR4_5_2forforlvlulnf9.R.inc(20331);
        __CLR4_5_2forforlvlulnf9.R.inc(20332);this.underlying = underlying;
        __CLR4_5_2forforlvlulnf9.R.inc(20333);this.elementSource = elementSource;

    }finally{__CLR4_5_2forforlvlulnf9.R.flushNeeded();}}

    public List<E> getUnderlying() {try{__CLR4_5_2forforlvlulnf9.R.inc(20334);
        __CLR4_5_2forforlvlulnf9.R.inc(20335);return underlying;
    }finally{__CLR4_5_2forforlvlulnf9.R.flushNeeded();}}

    private void blowup() {try{__CLR4_5_2forforlvlulnf9.R.inc(20336);
        __CLR4_5_2forforlvlulnf9.R.inc(20337);LOG.logDebug("blowup running");
        __CLR4_5_2forforlvlulnf9.R.inc(20338);while ((((elementSource.hasNext())&&(__CLR4_5_2forforlvlulnf9.R.iget(20339)!=0|true))||(__CLR4_5_2forforlvlulnf9.R.iget(20340)==0&false))) {{
            __CLR4_5_2forforlvlulnf9.R.inc(20341);underlying.add(elementSource.next());
        }

    }}finally{__CLR4_5_2forforlvlulnf9.R.flushNeeded();}}

    public E get(int i) {try{__CLR4_5_2forforlvlulnf9.R.inc(20342);
        __CLR4_5_2forforlvlulnf9.R.inc(20343);if ((((underlying.size() > i)&&(__CLR4_5_2forforlvlulnf9.R.iget(20344)!=0|true))||(__CLR4_5_2forforlvlulnf9.R.iget(20345)==0&false))) {{
            __CLR4_5_2forforlvlulnf9.R.inc(20346);return underlying.get(i);
        } }else {{
            __CLR4_5_2forforlvlulnf9.R.inc(20347);if ((((elementSource.hasNext())&&(__CLR4_5_2forforlvlulnf9.R.iget(20348)!=0|true))||(__CLR4_5_2forforlvlulnf9.R.iget(20349)==0&false))) {{
                __CLR4_5_2forforlvlulnf9.R.inc(20350);underlying.add(elementSource.next());
                __CLR4_5_2forforlvlulnf9.R.inc(20351);return get(i);
            } }else {{
                __CLR4_5_2forforlvlulnf9.R.inc(20352);throw new NoSuchElementException();
            }
        }}

    }}finally{__CLR4_5_2forforlvlulnf9.R.flushNeeded();}}

    public Iterator<E> iterator() {try{__CLR4_5_2forforlvlulnf9.R.inc(20353);
        __CLR4_5_2forforlvlulnf9.R.inc(20354);return new Iterator<E>() {
            int pos = 0;

            public boolean hasNext() {try{__CLR4_5_2forforlvlulnf9.R.inc(20355);
                __CLR4_5_2forforlvlulnf9.R.inc(20356);return pos < underlying.size() || elementSource.hasNext();
            }finally{__CLR4_5_2forforlvlulnf9.R.flushNeeded();}}

            public E next() {try{__CLR4_5_2forforlvlulnf9.R.inc(20357);
                __CLR4_5_2forforlvlulnf9.R.inc(20358);if ((((pos < underlying.size())&&(__CLR4_5_2forforlvlulnf9.R.iget(20359)!=0|true))||(__CLR4_5_2forforlvlulnf9.R.iget(20360)==0&false))) {{
                    __CLR4_5_2forforlvlulnf9.R.inc(20361);return underlying.get(pos++);
                } }else {{
                    __CLR4_5_2forforlvlulnf9.R.inc(20362);underlying.add(elementSource.next());
                    __CLR4_5_2forforlvlulnf9.R.inc(20363);return next();
                }
            }}finally{__CLR4_5_2forforlvlulnf9.R.flushNeeded();}}

            public void remove() {try{__CLR4_5_2forforlvlulnf9.R.inc(20364);
                __CLR4_5_2forforlvlulnf9.R.inc(20365);throw new UnsupportedOperationException();
            }finally{__CLR4_5_2forforlvlulnf9.R.flushNeeded();}}
        };
    }finally{__CLR4_5_2forforlvlulnf9.R.flushNeeded();}}


    @Override
    public int size() {try{__CLR4_5_2forforlvlulnf9.R.inc(20366);
        __CLR4_5_2forforlvlulnf9.R.inc(20367);LOG.logDebug("potentially expensive size() call");
        __CLR4_5_2forforlvlulnf9.R.inc(20368);blowup();
        __CLR4_5_2forforlvlulnf9.R.inc(20369);return underlying.size();
    }finally{__CLR4_5_2forforlvlulnf9.R.flushNeeded();}}
}
