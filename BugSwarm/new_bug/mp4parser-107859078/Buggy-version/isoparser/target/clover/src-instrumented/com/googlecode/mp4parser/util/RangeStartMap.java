/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.util;

import java.util.*;

/**
 * Created by sannies on 10.09.2014.
 */
public class RangeStartMap<K extends Comparable, V> implements Map<K, V> {public static class __CLR4_5_2fvofvolvl9el2w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,20649,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    TreeMap<K, V> base = new TreeMap<K, V>(new Comparator<K>() {
        public int compare(K o1, K o2) {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20580);
            __CLR4_5_2fvofvolvl9el2w.R.inc(20581);return -o1.compareTo(o2);
        }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}
    });

    public RangeStartMap() {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20582);
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}

    public RangeStartMap(K k, V v) {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20583);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20584);this.put(k, v);
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}

    public int size() {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20585);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20586);return base.size();
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}

    public boolean isEmpty() {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20587);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20588);return base.isEmpty();
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}

    public boolean containsKey(Object key) {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20589);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20590);return base.get(key) != null;
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}

    public boolean containsValue(Object value) {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20591);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20592);return false;
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}

    public V get(Object k) {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20593);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20594);if ((((!(k instanceof Comparable))&&(__CLR4_5_2fvofvolvl9el2w.R.iget(20595)!=0|true))||(__CLR4_5_2fvofvolvl9el2w.R.iget(20596)==0&false))) {{
            __CLR4_5_2fvofvolvl9el2w.R.inc(20597);return null;
        }
        }__CLR4_5_2fvofvolvl9el2w.R.inc(20598);Comparable<K> key = (Comparable<K>) k;
        __CLR4_5_2fvofvolvl9el2w.R.inc(20599);if ((((isEmpty())&&(__CLR4_5_2fvofvolvl9el2w.R.iget(20600)!=0|true))||(__CLR4_5_2fvofvolvl9el2w.R.iget(20601)==0&false))) {{
            __CLR4_5_2fvofvolvl9el2w.R.inc(20602);return null;
        }
        }__CLR4_5_2fvofvolvl9el2w.R.inc(20603);Iterator<K> keys = base.keySet().iterator();
        __CLR4_5_2fvofvolvl9el2w.R.inc(20604);K a = keys.next();
        __CLR4_5_2fvofvolvl9el2w.R.inc(20605);do {{
            __CLR4_5_2fvofvolvl9el2w.R.inc(20606);if ((((keys.hasNext())&&(__CLR4_5_2fvofvolvl9el2w.R.iget(20607)!=0|true))||(__CLR4_5_2fvofvolvl9el2w.R.iget(20608)==0&false))) {{
                __CLR4_5_2fvofvolvl9el2w.R.inc(20609);if ((((key.compareTo(a) < 0)&&(__CLR4_5_2fvofvolvl9el2w.R.iget(20610)!=0|true))||(__CLR4_5_2fvofvolvl9el2w.R.iget(20611)==0&false))) {{
                    __CLR4_5_2fvofvolvl9el2w.R.inc(20612);a = keys.next();
                } }else {{
                    __CLR4_5_2fvofvolvl9el2w.R.inc(20613);return base.get(a);
                }
            }} }else {{
                __CLR4_5_2fvofvolvl9el2w.R.inc(20614);return base.get(a);
            }
        }} }while (true);
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}

    public V put(K key, V value) {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20615);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20616);return base.put(key, value);
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}

    public V remove(Object k) {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20617);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20618);if ((((!(k instanceof Comparable))&&(__CLR4_5_2fvofvolvl9el2w.R.iget(20619)!=0|true))||(__CLR4_5_2fvofvolvl9el2w.R.iget(20620)==0&false))) {{
            __CLR4_5_2fvofvolvl9el2w.R.inc(20621);return null;
        }
        }__CLR4_5_2fvofvolvl9el2w.R.inc(20622);Comparable<K> key = (Comparable<K>) k;
        __CLR4_5_2fvofvolvl9el2w.R.inc(20623);if ((((isEmpty())&&(__CLR4_5_2fvofvolvl9el2w.R.iget(20624)!=0|true))||(__CLR4_5_2fvofvolvl9el2w.R.iget(20625)==0&false))) {{
            __CLR4_5_2fvofvolvl9el2w.R.inc(20626);return null;
        }
        }__CLR4_5_2fvofvolvl9el2w.R.inc(20627);Iterator<K> keys = base.keySet().iterator();
        __CLR4_5_2fvofvolvl9el2w.R.inc(20628);K a = keys.next();
        __CLR4_5_2fvofvolvl9el2w.R.inc(20629);do {{
            __CLR4_5_2fvofvolvl9el2w.R.inc(20630);if ((((keys.hasNext())&&(__CLR4_5_2fvofvolvl9el2w.R.iget(20631)!=0|true))||(__CLR4_5_2fvofvolvl9el2w.R.iget(20632)==0&false))) {{
                __CLR4_5_2fvofvolvl9el2w.R.inc(20633);if ((((key.compareTo(a) < 0)&&(__CLR4_5_2fvofvolvl9el2w.R.iget(20634)!=0|true))||(__CLR4_5_2fvofvolvl9el2w.R.iget(20635)==0&false))) {{
                    __CLR4_5_2fvofvolvl9el2w.R.inc(20636);a = keys.next();
                } }else {{
                    __CLR4_5_2fvofvolvl9el2w.R.inc(20637);return base.remove(a);
                }
            }} }else {{
                __CLR4_5_2fvofvolvl9el2w.R.inc(20638);return base.remove(a);
            }
        }} }while (true);
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}


    public void putAll(Map<? extends K, ? extends V> m) {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20639);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20640);base.putAll(m);
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}


    public void clear() {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20641);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20642);base.clear();
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}


    public Set<K> keySet() {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20643);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20644);return base.keySet();
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}


    public Collection<V> values() {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20645);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20646);return base.values();
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}


    public Set<Entry<K, V>> entrySet() {try{__CLR4_5_2fvofvolvl9el2w.R.inc(20647);
        __CLR4_5_2fvofvolvl9el2w.R.inc(20648);return base.entrySet();
    }finally{__CLR4_5_2fvofvolvl9el2w.R.flushNeeded();}}
}
