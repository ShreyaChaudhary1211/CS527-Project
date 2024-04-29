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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Class to test BitField functionality
 */
public class BitFieldTest  {static class __CLR4_5_2mdtmdtlvha7fc4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,29147,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final BitField bf_multi  = new BitField(0x3F80);
    private static final BitField bf_single = new BitField(0x4000);
    private static final BitField bf_zero = new BitField(0);

    /**
     * test the getValue() method
     */
    @Test
    public void testGetValue() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qcksmkmdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testGetValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qcksmkmdt(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29009);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29010);assertEquals(bf_multi.getValue(-1), 127);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29011);assertEquals(bf_multi.getValue(0), 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29012);assertEquals(bf_single.getValue(-1), 1);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29013);assertEquals(bf_single.getValue(0), 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29014);assertEquals(bf_zero.getValue(-1), 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29015);assertEquals(bf_zero.getValue(0), 0);
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the getShortValue() method
     */
    @Test
    public void testGetShortValue() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x1l1c0me0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testGetShortValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29016,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x1l1c0me0(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29016);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29017);assertEquals(bf_multi.getShortValue((short) - 1), (short) 127);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29018);assertEquals(bf_multi.getShortValue((short) 0), (short) 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29019);assertEquals(bf_single.getShortValue((short) - 1), (short) 1);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29020);assertEquals(bf_single.getShortValue((short) 0), (short) 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29021);assertEquals(bf_zero.getShortValue((short) -1), (short) 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29022);assertEquals(bf_zero.getShortValue((short) 0), (short) 0);
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the getRawValue() method
     */
    @Test
    public void testGetRawValue() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29jelhwme7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testGetRawValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29023,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29jelhwme7(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29023);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29024);assertEquals(bf_multi.getRawValue(-1), 0x3F80);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29025);assertEquals(bf_multi.getRawValue(0), 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29026);assertEquals(bf_single.getRawValue(-1), 0x4000);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29027);assertEquals(bf_single.getRawValue(0), 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29028);assertEquals(bf_zero.getRawValue(-1), 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29029);assertEquals(bf_zero.getRawValue(0), 0);
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the getShortRawValue() method
     */
    @Test
    public void testGetShortRawValue() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2okjk6gmee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testGetShortRawValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29030,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2okjk6gmee(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29030);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29031);assertEquals(bf_multi.getShortRawValue((short) - 1), (short) 0x3F80);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29032);assertEquals(bf_multi.getShortRawValue((short) 0), (short) 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29033);assertEquals(bf_single.getShortRawValue((short) - 1), (short) 0x4000);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29034);assertEquals(bf_single.getShortRawValue((short) 0), (short) 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29035);assertEquals(bf_zero.getShortRawValue((short) -1), (short) 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29036);assertEquals(bf_zero.getShortRawValue((short) 0), (short) 0);
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the isSet() method
     */
    @Test
    public void testIsSet() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gkxvrnmel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testIsSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29037,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gkxvrnmel(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29037);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29038);assertTrue(!bf_multi.isSet(0));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29039);assertTrue(!bf_zero.isSet(0));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29040);for (int j = 0x80; (((j <= 0x3F80)&&(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29041)!=0|true))||(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29042)==0&false)); j += 0x80) {{
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29043);assertTrue(bf_multi.isSet(j));
        }
        }__CLR4_5_2mdtmdtlvha7fc4.R.inc(29044);for (int j = 0x80; (((j <= 0x3F80)&&(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29045)!=0|true))||(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29046)==0&false)); j += 0x80) {{
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29047);assertTrue(!bf_zero.isSet(j));
        }
        }__CLR4_5_2mdtmdtlvha7fc4.R.inc(29048);assertTrue(!bf_single.isSet(0));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29049);assertTrue(bf_single.isSet(0x4000));
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the isAllSet() method
     */
    @Test
    public void testIsAllSet() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oy2m70mey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testIsAllSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29050,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oy2m70mey(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29050);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29051);for (int j = 0; (((j < 0x3F80)&&(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29052)!=0|true))||(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29053)==0&false)); j += 0x80) {{
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29054);assertTrue(!bf_multi.isAllSet(j));
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29055);assertTrue(bf_zero.isAllSet(j));
        }
        }__CLR4_5_2mdtmdtlvha7fc4.R.inc(29056);assertTrue(bf_multi.isAllSet(0x3F80));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29057);assertTrue(!bf_single.isAllSet(0));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29058);assertTrue(bf_single.isAllSet(0x4000));
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the setValue() method
     */
    @Test
    public void testSetValue() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2asu22gmf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testSetValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2asu22gmf7(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29059);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29060);for (int j = 0; (((j < 128)&&(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29061)!=0|true))||(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29062)==0&false)); j++) {{
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29063);assertEquals(bf_multi.getValue(bf_multi.setValue(0, j)), j);
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29064);assertEquals(bf_multi.setValue(0, j), j << 7);
        }
        }__CLR4_5_2mdtmdtlvha7fc4.R.inc(29065);for (int j = 0; (((j < 128)&&(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29066)!=0|true))||(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29067)==0&false)); j++) {{
          __CLR4_5_2mdtmdtlvha7fc4.R.inc(29068);assertEquals(bf_zero.getValue(bf_zero.setValue(0, j)), 0);
          __CLR4_5_2mdtmdtlvha7fc4.R.inc(29069);assertEquals(bf_zero.setValue(0, j), 0);
      }

        // verify that excess bits are stripped off
        }__CLR4_5_2mdtmdtlvha7fc4.R.inc(29070);assertEquals(bf_multi.setValue(0x3f80, 128), 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29071);for (int j = 0; (((j < 2)&&(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29072)!=0|true))||(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29073)==0&false)); j++) {{
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29074);assertEquals(bf_single.getValue(bf_single.setValue(0, j)), j);
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29075);assertEquals(bf_single.setValue(0, j), j << 14);
        }

        // verify that excess bits are stripped off
        }__CLR4_5_2mdtmdtlvha7fc4.R.inc(29076);assertEquals(bf_single.setValue(0x4000, 2), 0);
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the setShortValue() method
     */
    @Test
    public void testSetShortValue() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g9q4csmfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testSetShortValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g9q4csmfp(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29077);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29078);for (int j = 0; (((j < 128)&&(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29079)!=0|true))||(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29080)==0&false)); j++) {{
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29081);assertEquals(bf_multi.getShortValue(bf_multi.setShortValue((short) 0, (short) j)), (short) j);
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29082);assertEquals(bf_multi.setShortValue((short) 0, (short) j), (short) (j << 7));
        }
        }__CLR4_5_2mdtmdtlvha7fc4.R.inc(29083);for (int j = 0; (((j < 128)&&(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29084)!=0|true))||(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29085)==0&false)); j++) {{
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29086);assertEquals(bf_zero.getShortValue(bf_zero.setShortValue((short) 0, (short) j)), (short) 0);
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29087);assertEquals(bf_zero.setShortValue((short) 0, (short) j), (short) 0);
        }

        // verify that excess bits are stripped off
        }__CLR4_5_2mdtmdtlvha7fc4.R.inc(29088);assertEquals(bf_multi.setShortValue((short) 0x3f80, (short) 128), (short) 0);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29089);for (int j = 0; (((j < 2)&&(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29090)!=0|true))||(__CLR4_5_2mdtmdtlvha7fc4.R.iget(29091)==0&false)); j++) {{
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29092);assertEquals(bf_single.getShortValue(bf_single.setShortValue((short) 0, (short) j)), (short) j);
            __CLR4_5_2mdtmdtlvha7fc4.R.inc(29093);assertEquals(bf_single.setShortValue((short) 0, (short) j), (short) (j << 14));
        }

        // verify that excess bits are stripped off
        }__CLR4_5_2mdtmdtlvha7fc4.R.inc(29094);assertEquals(bf_single.setShortValue((short) 0x4000, (short) 2), (short) 0);
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    @Test
    public void testByte() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22w26nzmg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22w26nzmg7(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29095);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29096);assertEquals(0, new BitField(0).setByteBoolean((byte) 0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29097);assertEquals(1, new BitField(1).setByteBoolean((byte) 0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29098);assertEquals(2, new BitField(2).setByteBoolean((byte) 0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29099);assertEquals(4, new BitField(4).setByteBoolean((byte) 0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29100);assertEquals(8, new BitField(8).setByteBoolean((byte) 0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29101);assertEquals(16, new BitField(16).setByteBoolean((byte) 0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29102);assertEquals(32, new BitField(32).setByteBoolean((byte) 0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29103);assertEquals(64, new BitField(64).setByteBoolean((byte) 0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29104);assertEquals(-128, new BitField(128).setByteBoolean((byte) 0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29105);assertEquals(1, new BitField(0).setByteBoolean((byte) 1, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29106);assertEquals(0, new BitField(1).setByteBoolean((byte) 1, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29107);assertEquals(0, new BitField(2).setByteBoolean((byte) 2, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29108);assertEquals(0, new BitField(4).setByteBoolean((byte) 4, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29109);assertEquals(0, new BitField(8).setByteBoolean((byte) 8, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29110);assertEquals(0, new BitField(16).setByteBoolean((byte) 16, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29111);assertEquals(0, new BitField(32).setByteBoolean((byte) 32, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29112);assertEquals(0, new BitField(64).setByteBoolean((byte) 64, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29113);assertEquals(0, new BitField(128).setByteBoolean((byte) 128, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29114);assertEquals(-2, new BitField(1).setByteBoolean((byte) 255, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29115);final byte clearedBit = new BitField(0x40).setByteBoolean((byte) - 63, false);

        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29116);assertFalse(new BitField(0x40).isSet(clearedBit));
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the clear() method
     */
    @Test
    public void testClear() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jlyl6qmgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testClear",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29117,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jlyl6qmgt(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29117);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29118);assertEquals(bf_multi.clear(-1), 0xFFFFC07F);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29119);assertEquals(bf_single.clear(-1), 0xFFFFBFFF);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29120);assertEquals(bf_zero.clear(-1), 0xFFFFFFFF);
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the clearShort() method
     */
    @Test
    public void testClearShort() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ph5mdkmgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testClearShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ph5mdkmgx(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29121);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29122);assertEquals(bf_multi.clearShort((short) - 1), (short) 0xC07F);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29123);assertEquals(bf_single.clearShort((short) - 1), (short) 0xBFFF);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29124);assertEquals(bf_zero.clearShort((short) -1), (short) 0xFFFF);
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the set() method
     */
    @Test
    public void testSet() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_243b3qvmh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_243b3qvmh1(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29125);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29126);assertEquals(bf_multi.set(0), 0x3F80);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29127);assertEquals(bf_single.set(0), 0x4000);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29128);assertEquals(bf_zero.set(0), 0);
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the setShort() method
     */
    @Test
    public void testSetShort() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2maxlf7mh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testSetShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2maxlf7mh5(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29129);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29130);assertEquals(bf_multi.setShort((short) 0), (short) 0x3F80);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29131);assertEquals(bf_single.setShort((short) 0), (short) 0x4000);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29132);assertEquals(bf_zero.setShort((short) 0), (short) 0);
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the setBoolean() method
     */
    @Test
    public void testSetBoolean() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29tknzmh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testSetBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29133,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29tknzmh9(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29133);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29134);assertEquals(bf_multi.set(0), bf_multi.setBoolean(0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29135);assertEquals(bf_single.set(0), bf_single.setBoolean(0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29136);assertEquals(bf_zero.set(0), bf_zero.setBoolean(0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29137);assertEquals(bf_multi.clear(-1), bf_multi.setBoolean(-1, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29138);assertEquals(bf_single.clear(-1), bf_single.setBoolean(-1, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29139);assertEquals(bf_zero.clear(-1), bf_zero.setBoolean(-1, false));
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

    /**
     * test the setShortBoolean() method
     */
    @Test
    public void testSetShortBoolean() {__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceStart(getClass().getName(),29140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ib8y1vmhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mdtmdtlvha7fc4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mdtmdtlvha7fc4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testSetShortBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ib8y1vmhg(){try{__CLR4_5_2mdtmdtlvha7fc4.R.inc(29140);
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29141);assertEquals(bf_multi.setShort((short) 0), bf_multi.setShortBoolean((short) 0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29142);assertEquals(bf_single.setShort((short) 0), bf_single.setShortBoolean((short) 0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29143);assertEquals(bf_zero.setShort((short) 0), bf_zero.setShortBoolean((short) 0, true));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29144);assertEquals(bf_multi.clearShort((short) - 1), bf_multi.setShortBoolean((short) - 1, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29145);assertEquals(bf_single.clearShort((short) - 1), bf_single.setShortBoolean((short) - 1, false));
        __CLR4_5_2mdtmdtlvha7fc4.R.inc(29146);assertEquals(bf_zero.clearShort((short) -1), bf_zero.setShortBoolean((short) -1, false));
    }finally{__CLR4_5_2mdtmdtlvha7fc4.R.flushNeeded();}}

}
