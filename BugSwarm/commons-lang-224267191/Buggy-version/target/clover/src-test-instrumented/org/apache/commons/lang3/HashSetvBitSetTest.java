/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3;

import java.util.BitSet;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test to show whether using BitSet for removeAll() methods is faster than using HashSet.
 */
public class HashSetvBitSetTest {static class __CLR4_5_2ozpozplvha7fv0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,32504,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int LOOPS = 2000; // number of times to invoke methods
    private static final int LOOPS2 = 10000;

    @Test
    public void testTimes() {__CLR4_5_2ozpozplvha7fv0.R.globalSliceStart(getClass().getName(),32389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vvzm91ozp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ozpozplvha7fv0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ozpozplvha7fv0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.HashSetvBitSetTest.testTimes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32389,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vvzm91ozp(){try{__CLR4_5_2ozpozplvha7fv0.R.inc(32389);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32390);timeHashSet(10); // warmup
        __CLR4_5_2ozpozplvha7fv0.R.inc(32391);timeBitSet(10); // warmup
        __CLR4_5_2ozpozplvha7fv0.R.inc(32392);long timeDiff = printTimes(0);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32393);timeDiff += printTimes(5);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32394);timeDiff += printTimes(10);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32395);timeDiff += printTimes(200);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32396);timeDiff += printTimes(50);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32397);timeDiff += printTimes(100);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32398);timeDiff += printTimes(1000);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32399);timeDiff += printTimes(2000);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32400);Assert.assertTrue(timeDiff <= 0);
    }finally{__CLR4_5_2ozpozplvha7fv0.R.flushNeeded();}}

    /**
     * @return bitSet - HashSet
     */
    private long printTimes(final int count) {try{__CLR4_5_2ozpozplvha7fv0.R.inc(32401);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32402);final long hashSet = timeHashSet(count);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32403);final long bitSet = timeBitSet(count);
        // If percent is less than 100, then bitset is faster
        __CLR4_5_2ozpozplvha7fv0.R.inc(32404);System.out.println("Ratio="+(bitSet*100/hashSet)+"% count="+count+" hash="+hashSet+" bits="+bitSet);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32405);return bitSet - hashSet;
    }finally{__CLR4_5_2ozpozplvha7fv0.R.flushNeeded();}}

    private static long timeHashSet(final int count) {try{__CLR4_5_2ozpozplvha7fv0.R.inc(32406);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32407);int [] result = new int[0];
        __CLR4_5_2ozpozplvha7fv0.R.inc(32408);final long start = System.nanoTime();
        __CLR4_5_2ozpozplvha7fv0.R.inc(32409);for (int i = 0; (((i < LOOPS)&&(__CLR4_5_2ozpozplvha7fv0.R.iget(32410)!=0|true))||(__CLR4_5_2ozpozplvha7fv0.R.iget(32411)==0&false)); i++) {{
            __CLR4_5_2ozpozplvha7fv0.R.inc(32412);result = testHashSet(count);
        }
        }__CLR4_5_2ozpozplvha7fv0.R.inc(32413);final long elapsed = System.nanoTime() - start;
        __CLR4_5_2ozpozplvha7fv0.R.inc(32414);Assert.assertEquals(count, result.length);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32415);return elapsed;
    }finally{__CLR4_5_2ozpozplvha7fv0.R.flushNeeded();}}

    private static long timeBitSet(final int count) {try{__CLR4_5_2ozpozplvha7fv0.R.inc(32416);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32417);int [] result = new int[0];
        __CLR4_5_2ozpozplvha7fv0.R.inc(32418);final long start = System.nanoTime();
        __CLR4_5_2ozpozplvha7fv0.R.inc(32419);for (int i = 0; (((i < LOOPS)&&(__CLR4_5_2ozpozplvha7fv0.R.iget(32420)!=0|true))||(__CLR4_5_2ozpozplvha7fv0.R.iget(32421)==0&false)); i++) {{
            __CLR4_5_2ozpozplvha7fv0.R.inc(32422);result = testBitSet(count);
        }
        }__CLR4_5_2ozpozplvha7fv0.R.inc(32423);final long elapsed = System.nanoTime() - start;
        __CLR4_5_2ozpozplvha7fv0.R.inc(32424);Assert.assertEquals(count, result.length);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32425);return elapsed;
    }finally{__CLR4_5_2ozpozplvha7fv0.R.flushNeeded();}}

    @SuppressWarnings("boxing")
    private static int[] testHashSet(final int count) {try{__CLR4_5_2ozpozplvha7fv0.R.inc(32426);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32427);final HashSet<Integer> toRemove = new HashSet<>();
            __CLR4_5_2ozpozplvha7fv0.R.inc(32428);int found = 0;
            __CLR4_5_2ozpozplvha7fv0.R.inc(32429);for (int i = 0; (((i < count)&&(__CLR4_5_2ozpozplvha7fv0.R.iget(32430)!=0|true))||(__CLR4_5_2ozpozplvha7fv0.R.iget(32431)==0&false)); i++) {{
                __CLR4_5_2ozpozplvha7fv0.R.inc(32432);toRemove.add(found++);
            }
            }__CLR4_5_2ozpozplvha7fv0.R.inc(32433);return extractIndices(toRemove);
        }finally{__CLR4_5_2ozpozplvha7fv0.R.flushNeeded();}}
    
    private static int[] testBitSet(final int count) {try{__CLR4_5_2ozpozplvha7fv0.R.inc(32434);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32435);final BitSet toRemove = new BitSet();
        __CLR4_5_2ozpozplvha7fv0.R.inc(32436);int found = 0;
        __CLR4_5_2ozpozplvha7fv0.R.inc(32437);for (int i = 0; (((i < count)&&(__CLR4_5_2ozpozplvha7fv0.R.iget(32438)!=0|true))||(__CLR4_5_2ozpozplvha7fv0.R.iget(32439)==0&false)); i++) {{
            __CLR4_5_2ozpozplvha7fv0.R.inc(32440);toRemove.set(found++);
        }
        }__CLR4_5_2ozpozplvha7fv0.R.inc(32441);return extractIndices(toRemove);
    }finally{__CLR4_5_2ozpozplvha7fv0.R.flushNeeded();}}
    

    private static int[] extractIndices(final HashSet<Integer> coll) {try{__CLR4_5_2ozpozplvha7fv0.R.inc(32442);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32443);final int[] result = new int[coll.size()];
        __CLR4_5_2ozpozplvha7fv0.R.inc(32444);int i = 0;
        __CLR4_5_2ozpozplvha7fv0.R.inc(32445);for (final Integer index : coll) {{
            __CLR4_5_2ozpozplvha7fv0.R.inc(32446);result[i++] = index.intValue();
        }
        }__CLR4_5_2ozpozplvha7fv0.R.inc(32447);return result;
    }finally{__CLR4_5_2ozpozplvha7fv0.R.flushNeeded();}}

    private static int[] extractIndices(final BitSet coll) {try{__CLR4_5_2ozpozplvha7fv0.R.inc(32448);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32449);final int[] result = new int[coll.cardinality()];
        __CLR4_5_2ozpozplvha7fv0.R.inc(32450);int i = 0;
        __CLR4_5_2ozpozplvha7fv0.R.inc(32451);int j=0;
        __CLR4_5_2ozpozplvha7fv0.R.inc(32452);while((j=coll.nextSetBit(j)) != -1) {{
            __CLR4_5_2ozpozplvha7fv0.R.inc(32455);result[i++] = j++;            
        }
        }__CLR4_5_2ozpozplvha7fv0.R.inc(32456);return result;
    }finally{__CLR4_5_2ozpozplvha7fv0.R.flushNeeded();}}
    
    @Test
    public void testTimesExtractOrBitset() {__CLR4_5_2ozpozplvha7fv0.R.globalSliceStart(getClass().getName(),32457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29wtl1op1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ozpozplvha7fv0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ozpozplvha7fv0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.HashSetvBitSetTest.testTimesExtractOrBitset",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29wtl1op1l(){try{__CLR4_5_2ozpozplvha7fv0.R.inc(32457);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32458);final BitSet toRemove = new BitSet();
        __CLR4_5_2ozpozplvha7fv0.R.inc(32459);final int[] array = new int[100];
        __CLR4_5_2ozpozplvha7fv0.R.inc(32460);toRemove.set(10, 20);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32461);timeBitSetRemoveAll(array, toRemove); // warmup
        __CLR4_5_2ozpozplvha7fv0.R.inc(32462);timeExtractRemoveAll(array, toRemove); // warmup
        __CLR4_5_2ozpozplvha7fv0.R.inc(32463);long timeDiff = printTimes(100,1);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32464);timeDiff += printTimes(100,10);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32465);timeDiff += printTimes(100,50);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32466);timeDiff += printTimes(100,100);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32467);timeDiff += printTimes(1000,10);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32468);timeDiff += printTimes(1000,100);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32469);timeDiff += printTimes(1000,500);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32470);timeDiff += printTimes(1000,1000);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32471);Assert.assertTrue(timeDiff <= 0);
    }finally{__CLR4_5_2ozpozplvha7fv0.R.flushNeeded();}}

    private long printTimes(final int arraySize, final int bitSetSize) {try{__CLR4_5_2ozpozplvha7fv0.R.inc(32472);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32473);final int[] array = new int[arraySize];
        __CLR4_5_2ozpozplvha7fv0.R.inc(32474);final BitSet remove = new BitSet();
        __CLR4_5_2ozpozplvha7fv0.R.inc(32475);for (int i = 0; (((i < bitSetSize)&&(__CLR4_5_2ozpozplvha7fv0.R.iget(32476)!=0|true))||(__CLR4_5_2ozpozplvha7fv0.R.iget(32477)==0&false)); i++) {{
            __CLR4_5_2ozpozplvha7fv0.R.inc(32478);remove.set(i);
        }
        }__CLR4_5_2ozpozplvha7fv0.R.inc(32479);final long bitSet = timeBitSetRemoveAll(array, remove );
        __CLR4_5_2ozpozplvha7fv0.R.inc(32480);final long extract = timeExtractRemoveAll(array, remove);
        // If percent is less than 100, then direct use of bitset is faster
        __CLR4_5_2ozpozplvha7fv0.R.inc(32481);System.out.println("Ratio="+(bitSet*100/extract)+"% array="+array.length+" count="+remove.cardinality()+" extract="+extract+" bitset="+bitSet);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32482);return bitSet - extract;
    }finally{__CLR4_5_2ozpozplvha7fv0.R.flushNeeded();}}

    private long timeBitSetRemoveAll(final int[] array, final BitSet toRemove) {try{__CLR4_5_2ozpozplvha7fv0.R.inc(32483);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32484);int[] output = new int[0];
        __CLR4_5_2ozpozplvha7fv0.R.inc(32485);final long start = System.nanoTime();
        __CLR4_5_2ozpozplvha7fv0.R.inc(32486);for(int i = 0; (((i < LOOPS2)&&(__CLR4_5_2ozpozplvha7fv0.R.iget(32487)!=0|true))||(__CLR4_5_2ozpozplvha7fv0.R.iget(32488)==0&false)); i++){{
            __CLR4_5_2ozpozplvha7fv0.R.inc(32489);output = (int[]) ArrayUtils.removeAll(array, toRemove);            
        }
        }__CLR4_5_2ozpozplvha7fv0.R.inc(32490);final long end = System.nanoTime();
        __CLR4_5_2ozpozplvha7fv0.R.inc(32491);Assert.assertEquals(array.length-toRemove.cardinality(), output.length);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32492);return end - start;
    }finally{__CLR4_5_2ozpozplvha7fv0.R.flushNeeded();}}
    
    private long timeExtractRemoveAll(final int[] array, final BitSet toRemove) {try{__CLR4_5_2ozpozplvha7fv0.R.inc(32493);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32494);int[] output = new int[0];
        __CLR4_5_2ozpozplvha7fv0.R.inc(32495);final long start = System.nanoTime();
        __CLR4_5_2ozpozplvha7fv0.R.inc(32496);for(int i = 0; (((i < LOOPS2)&&(__CLR4_5_2ozpozplvha7fv0.R.iget(32497)!=0|true))||(__CLR4_5_2ozpozplvha7fv0.R.iget(32498)==0&false)); i++){{
            __CLR4_5_2ozpozplvha7fv0.R.inc(32499);final int[] extractIndices = extractIndices(toRemove);
            __CLR4_5_2ozpozplvha7fv0.R.inc(32500);output = (int[]) ArrayUtils.removeAll((Object)array, extractIndices);
        }
        }__CLR4_5_2ozpozplvha7fv0.R.inc(32501);final long end = System.nanoTime();
        __CLR4_5_2ozpozplvha7fv0.R.inc(32502);Assert.assertEquals(array.length-toRemove.cardinality(), output.length);
        __CLR4_5_2ozpozplvha7fv0.R.inc(32503);return end - start;
    }finally{__CLR4_5_2ozpozplvha7fv0.R.flushNeeded();}}
    
}