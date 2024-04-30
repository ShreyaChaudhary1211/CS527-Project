/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.util;

import java.util.*;

/**
 * Created by sannies on 10.09.2014.
 */
public class RangeStartMap<K extends Comparable, V> implements Map<K, V> {public static class __CLR4_5_2fybfyblvlulnjm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,20744,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    TreeMap<K, V> base = new TreeMap<K, V>(new Comparator<K>() {
        public int compare(K o1, K o2) {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20675);
            __CLR4_5_2fybfyblvlulnjm.R.inc(20676);return -o1.compareTo(o2);
        }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}
    });

    public RangeStartMap() {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20677);
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}

    public RangeStartMap(K k, V v) {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20678);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20679);this.put(k, v);
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}

    public int size() {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20680);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20681);return base.size();
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}

    public boolean isEmpty() {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20682);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20683);return base.isEmpty();
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}

    public boolean containsKey(Object key) {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20684);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20685);return base.get(key) != null;
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}

    public boolean containsValue(Object value) {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20686);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20687);return false;
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}

    public V get(Object k) {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20688);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20689);if ((((!(k instanceof Comparable))&&(__CLR4_5_2fybfyblvlulnjm.R.iget(20690)!=0|true))||(__CLR4_5_2fybfyblvlulnjm.R.iget(20691)==0&false))) {{
            __CLR4_5_2fybfyblvlulnjm.R.inc(20692);return null;
        }
        }__CLR4_5_2fybfyblvlulnjm.R.inc(20693);Comparable<K> key = (Comparable<K>) k;
        __CLR4_5_2fybfyblvlulnjm.R.inc(20694);if ((((isEmpty())&&(__CLR4_5_2fybfyblvlulnjm.R.iget(20695)!=0|true))||(__CLR4_5_2fybfyblvlulnjm.R.iget(20696)==0&false))) {{
            __CLR4_5_2fybfyblvlulnjm.R.inc(20697);return null;
        }
        }__CLR4_5_2fybfyblvlulnjm.R.inc(20698);Iterator<K> keys = base.keySet().iterator();
        __CLR4_5_2fybfyblvlulnjm.R.inc(20699);K a = keys.next();
        __CLR4_5_2fybfyblvlulnjm.R.inc(20700);do {{
            __CLR4_5_2fybfyblvlulnjm.R.inc(20701);if ((((keys.hasNext())&&(__CLR4_5_2fybfyblvlulnjm.R.iget(20702)!=0|true))||(__CLR4_5_2fybfyblvlulnjm.R.iget(20703)==0&false))) {{
                __CLR4_5_2fybfyblvlulnjm.R.inc(20704);if ((((key.compareTo(a) < 0)&&(__CLR4_5_2fybfyblvlulnjm.R.iget(20705)!=0|true))||(__CLR4_5_2fybfyblvlulnjm.R.iget(20706)==0&false))) {{
                    __CLR4_5_2fybfyblvlulnjm.R.inc(20707);a = keys.next();
                } }else {{
                    __CLR4_5_2fybfyblvlulnjm.R.inc(20708);return base.get(a);
                }
            }} }else {{
                __CLR4_5_2fybfyblvlulnjm.R.inc(20709);return base.get(a);
            }
        }} }while (true);
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}

    public V put(K key, V value) {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20710);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20711);return base.put(key, value);
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}

    public V remove(Object k) {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20712);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20713);if ((((!(k instanceof Comparable))&&(__CLR4_5_2fybfyblvlulnjm.R.iget(20714)!=0|true))||(__CLR4_5_2fybfyblvlulnjm.R.iget(20715)==0&false))) {{
            __CLR4_5_2fybfyblvlulnjm.R.inc(20716);return null;
        }
        }__CLR4_5_2fybfyblvlulnjm.R.inc(20717);Comparable<K> key = (Comparable<K>) k;
        __CLR4_5_2fybfyblvlulnjm.R.inc(20718);if ((((isEmpty())&&(__CLR4_5_2fybfyblvlulnjm.R.iget(20719)!=0|true))||(__CLR4_5_2fybfyblvlulnjm.R.iget(20720)==0&false))) {{
            __CLR4_5_2fybfyblvlulnjm.R.inc(20721);return null;
        }
        }__CLR4_5_2fybfyblvlulnjm.R.inc(20722);Iterator<K> keys = base.keySet().iterator();
        __CLR4_5_2fybfyblvlulnjm.R.inc(20723);K a = keys.next();
        __CLR4_5_2fybfyblvlulnjm.R.inc(20724);do {{
            __CLR4_5_2fybfyblvlulnjm.R.inc(20725);if ((((keys.hasNext())&&(__CLR4_5_2fybfyblvlulnjm.R.iget(20726)!=0|true))||(__CLR4_5_2fybfyblvlulnjm.R.iget(20727)==0&false))) {{
                __CLR4_5_2fybfyblvlulnjm.R.inc(20728);if ((((key.compareTo(a) < 0)&&(__CLR4_5_2fybfyblvlulnjm.R.iget(20729)!=0|true))||(__CLR4_5_2fybfyblvlulnjm.R.iget(20730)==0&false))) {{
                    __CLR4_5_2fybfyblvlulnjm.R.inc(20731);a = keys.next();
                } }else {{
                    __CLR4_5_2fybfyblvlulnjm.R.inc(20732);return base.remove(a);
                }
            }} }else {{
                __CLR4_5_2fybfyblvlulnjm.R.inc(20733);return base.remove(a);
            }
        }} }while (true);
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}


    public void putAll(Map<? extends K, ? extends V> m) {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20734);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20735);base.putAll(m);
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}


    public void clear() {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20736);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20737);base.clear();
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}


    public Set<K> keySet() {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20738);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20739);return base.keySet();
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}


    public Collection<V> values() {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20740);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20741);return base.values();
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}


    public Set<Entry<K, V>> entrySet() {try{__CLR4_5_2fybfyblvlulnjm.R.inc(20742);
        __CLR4_5_2fybfyblvlulnjm.R.inc(20743);return base.entrySet();
    }finally{__CLR4_5_2fybfyblvlulnjm.R.flushNeeded();}}
}
