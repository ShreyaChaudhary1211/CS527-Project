/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package uk.ac.manchester.cs.owl.owlapi.util.collections;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class provides a compact implementation of a very small sets - less than
 * or equal to three elements
 * 
 * @param <T>
 *        set element type
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class SmallSet<T> extends AbstractSet<T> {public static class __CLR4_5_2a9va9vlviclgy1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,13445,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    T element1;
    T element2;
    T element3;

    /**
     * default constructor
     */
    public SmallSet() {try{__CLR4_5_2a9va9vlviclgy1.R.inc(13315);}finally{__CLR4_5_2a9va9vlviclgy1.R.flushNeeded();}}

    /**
     * @param collection
     *        collection to copy
     */
    public SmallSet(Collection<T> collection) {try{__CLR4_5_2a9va9vlviclgy1.R.inc(13316);
        __CLR4_5_2a9va9vlviclgy1.R.inc(13317);if ((((collection.size() > 3)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13318)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13319)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13320);throw new IllegalArgumentException(
                    "Trying to create a small set with too many elements - max 3, requested: "
                            + collection.size());
        }
        }__CLR4_5_2a9va9vlviclgy1.R.inc(13321);for (T t : collection) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13322);add(t);
        }
    }}finally{__CLR4_5_2a9va9vlviclgy1.R.flushNeeded();}}

    @Override
    public boolean add(T t) {try{__CLR4_5_2a9va9vlviclgy1.R.inc(13323);
        __CLR4_5_2a9va9vlviclgy1.R.inc(13324);if ((((t == null)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13325)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13326)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13327);throw new NullPointerException("SmallSet cannot store null values");
        }
        }__CLR4_5_2a9va9vlviclgy1.R.inc(13328);if ((((contains(t))&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13329)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13330)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13331);return false;
        }
        }__CLR4_5_2a9va9vlviclgy1.R.inc(13332);if ((((element1 == null)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13333)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13334)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13335);element1 = t;
            __CLR4_5_2a9va9vlviclgy1.R.inc(13336);return true;
        } }else {__CLR4_5_2a9va9vlviclgy1.R.inc(13337);if ((((element2 == null)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13338)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13339)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13340);element2 = t;
            __CLR4_5_2a9va9vlviclgy1.R.inc(13341);return true;
        } }else {__CLR4_5_2a9va9vlviclgy1.R.inc(13342);if ((((element3 == null)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13343)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13344)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13345);element3 = t;
            __CLR4_5_2a9va9vlviclgy1.R.inc(13346);return true;
        } }else {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13347);throw new IllegalStateException(
                    "cannot store more than 3 elements in a small set");
        }
    }}}}finally{__CLR4_5_2a9va9vlviclgy1.R.flushNeeded();}}

    @Override
    public boolean remove(Object o) {try{__CLR4_5_2a9va9vlviclgy1.R.inc(13348);
        __CLR4_5_2a9va9vlviclgy1.R.inc(13349);if ((((o == null)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13350)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13351)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13352);return false;
        }
        }__CLR4_5_2a9va9vlviclgy1.R.inc(13353);int oHash = o.hashCode();
        __CLR4_5_2a9va9vlviclgy1.R.inc(13354);if ((((element1 != null && oHash == element1.hashCode()
                && o.equals(element1))&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13355)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13356)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13357);element1 = null;
            __CLR4_5_2a9va9vlviclgy1.R.inc(13358);return true;
        } }else {__CLR4_5_2a9va9vlviclgy1.R.inc(13359);if ((((element2 != null && oHash == element2.hashCode()
                && o.equals(element2))&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13360)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13361)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13362);element2 = null;
            __CLR4_5_2a9va9vlviclgy1.R.inc(13363);return true;
        } }else {__CLR4_5_2a9va9vlviclgy1.R.inc(13364);if ((((element3 != null && oHash == element3.hashCode()
                && o.equals(element3))&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13365)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13366)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13367);element3 = null;
            __CLR4_5_2a9va9vlviclgy1.R.inc(13368);return true;
        } }else {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13369);return false;
        }
    }}}}finally{__CLR4_5_2a9va9vlviclgy1.R.flushNeeded();}}

    @Override
    public boolean contains(Object o) {try{__CLR4_5_2a9va9vlviclgy1.R.inc(13370);
        __CLR4_5_2a9va9vlviclgy1.R.inc(13371);if ((((o == null)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13372)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13373)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13374);return false;
        }
        }__CLR4_5_2a9va9vlviclgy1.R.inc(13375);int oHash = o.hashCode();
        __CLR4_5_2a9va9vlviclgy1.R.inc(13376);if ((((element1 != null && oHash == element1.hashCode()
                && o.equals(element1))&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13377)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13378)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13379);return true;
        } }else {__CLR4_5_2a9va9vlviclgy1.R.inc(13380);if ((((element2 != null && oHash == element2.hashCode()
                && o.equals(element2))&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13381)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13382)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13383);return true;
        } }else {__CLR4_5_2a9va9vlviclgy1.R.inc(13384);if ((((element3 != null && oHash == element3.hashCode()
                && o.equals(element3))&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13385)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13386)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13387);return true;
        } }else {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13388);return false;
        }
    }}}}finally{__CLR4_5_2a9va9vlviclgy1.R.flushNeeded();}}

    @Override
    public Iterator<T> iterator() {try{__CLR4_5_2a9va9vlviclgy1.R.inc(13389);
        __CLR4_5_2a9va9vlviclgy1.R.inc(13390);return new Iterator<T>() {

            int cp = 1;

            @Override
            public void remove() {try{__CLR4_5_2a9va9vlviclgy1.R.inc(13391);
                __CLR4_5_2a9va9vlviclgy1.R.inc(13392);throw new UnsupportedOperationException("remove");
            }finally{__CLR4_5_2a9va9vlviclgy1.R.flushNeeded();}}

            @Override
            public boolean hasNext() {try{__CLR4_5_2a9va9vlviclgy1.R.inc(13393);
                boolean __CLB4_5_2_bool0=false;__CLR4_5_2a9va9vlviclgy1.R.inc(13394);switch (cp) {
                    case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2a9va9vlviclgy1.R.inc(13395);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2a9va9vlviclgy1.R.inc(13396);if ((((element1 != null)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13397)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13398)==0&false))) {{
                            __CLR4_5_2a9va9vlviclgy1.R.inc(13399);return true;
                        } }else {{
                            __CLR4_5_2a9va9vlviclgy1.R.inc(13400);cp++;
                        }
                    }case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2a9va9vlviclgy1.R.inc(13401);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2a9va9vlviclgy1.R.inc(13402);if ((((element2 != null)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13403)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13404)==0&false))) {{
                            __CLR4_5_2a9va9vlviclgy1.R.inc(13405);return true;
                        } }else {{
                            __CLR4_5_2a9va9vlviclgy1.R.inc(13406);cp++;
                        }
                    }case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2a9va9vlviclgy1.R.inc(13407);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2a9va9vlviclgy1.R.inc(13408);if ((((element3 != null)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13409)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13410)==0&false))) {{
                            __CLR4_5_2a9va9vlviclgy1.R.inc(13411);return true;
                        } }else {{
                            __CLR4_5_2a9va9vlviclgy1.R.inc(13412);cp++;
                        }
                    }default:if (!__CLB4_5_2_bool0) {__CLR4_5_2a9va9vlviclgy1.R.inc(13413);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2a9va9vlviclgy1.R.inc(13414);return false;
                }
            }finally{__CLR4_5_2a9va9vlviclgy1.R.flushNeeded();}}

            @Override
            public T next() {try{__CLR4_5_2a9va9vlviclgy1.R.inc(13415);
                __CLR4_5_2a9va9vlviclgy1.R.inc(13416);if ((((!hasNext())&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13417)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13418)==0&false))) {{
                    __CLR4_5_2a9va9vlviclgy1.R.inc(13419);throw new NoSuchElementException("No Next Element");
                }
                }boolean __CLB4_5_2_bool1=false;__CLR4_5_2a9va9vlviclgy1.R.inc(13420);switch (cp++) {
                    case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_2a9va9vlviclgy1.R.inc(13421);__CLB4_5_2_bool1=true;}
                        __CLR4_5_2a9va9vlviclgy1.R.inc(13422);return element1;
                    case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_2a9va9vlviclgy1.R.inc(13423);__CLB4_5_2_bool1=true;}
                        __CLR4_5_2a9va9vlviclgy1.R.inc(13424);return element2;
                    case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_2a9va9vlviclgy1.R.inc(13425);__CLB4_5_2_bool1=true;}
                        __CLR4_5_2a9va9vlviclgy1.R.inc(13426);return element3;
                }
                __CLR4_5_2a9va9vlviclgy1.R.inc(13427);throw new IllegalStateException(
                        "Iterator pointing past end of virtual array");
            }finally{__CLR4_5_2a9va9vlviclgy1.R.flushNeeded();}}
        };
    }finally{__CLR4_5_2a9va9vlviclgy1.R.flushNeeded();}}

    @Override
    public int size() {try{__CLR4_5_2a9va9vlviclgy1.R.inc(13428);
        __CLR4_5_2a9va9vlviclgy1.R.inc(13429);int count = 0;
        __CLR4_5_2a9va9vlviclgy1.R.inc(13430);if ((((element1 != null)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13431)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13432)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13433);count++;
        }
        }__CLR4_5_2a9va9vlviclgy1.R.inc(13434);if ((((element2 != null)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13435)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13436)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13437);count++;
        }
        }__CLR4_5_2a9va9vlviclgy1.R.inc(13438);if ((((element3 != null)&&(__CLR4_5_2a9va9vlviclgy1.R.iget(13439)!=0|true))||(__CLR4_5_2a9va9vlviclgy1.R.iget(13440)==0&false))) {{
            __CLR4_5_2a9va9vlviclgy1.R.inc(13441);count++;
        }
        }__CLR4_5_2a9va9vlviclgy1.R.inc(13442);return count;
    }finally{__CLR4_5_2a9va9vlviclgy1.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2a9va9vlviclgy1.R.inc(13443);
        __CLR4_5_2a9va9vlviclgy1.R.inc(13444);return String.format("#<SmallSet: %s,%s,%s>", element1, element2,
                element3);
    }finally{__CLR4_5_2a9va9vlviclgy1.R.flushNeeded();}}
}
