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

package org.apache.commons.lang3.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;

/**
 * Test class for StrLookup.
 */
@Deprecated
public class StrLookupTest  {static class __CLR4_5_215fl15fllvha7igc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,53742,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testNoneLookup() {__CLR4_5_215fl15fllvha7igc.R.globalSliceStart(getClass().getName(),53697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bimi1715fl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215fl15fllvha7igc.R.rethrow($CLV_t2$);}finally{__CLR4_5_215fl15fllvha7igc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrLookupTest.testNoneLookup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bimi1715fl(){try{__CLR4_5_215fl15fllvha7igc.R.inc(53697);
        __CLR4_5_215fl15fllvha7igc.R.inc(53698);assertEquals(null, StrLookup.noneLookup().lookup(null));
        __CLR4_5_215fl15fllvha7igc.R.inc(53699);assertEquals(null, StrLookup.noneLookup().lookup(""));
        __CLR4_5_215fl15fllvha7igc.R.inc(53700);assertEquals(null, StrLookup.noneLookup().lookup("any"));
    }finally{__CLR4_5_215fl15fllvha7igc.R.flushNeeded();}}

    @Test
    public void testSystemPropertiesLookup() {__CLR4_5_215fl15fllvha7igc.R.globalSliceStart(getClass().getName(),53701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h6yxzp15fp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215fl15fllvha7igc.R.rethrow($CLV_t2$);}finally{__CLR4_5_215fl15fllvha7igc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrLookupTest.testSystemPropertiesLookup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53701,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h6yxzp15fp(){try{__CLR4_5_215fl15fllvha7igc.R.inc(53701);
        __CLR4_5_215fl15fllvha7igc.R.inc(53702);assertEquals(System.getProperty("os.name"), StrLookup.systemPropertiesLookup().lookup("os.name"));
        __CLR4_5_215fl15fllvha7igc.R.inc(53703);assertEquals(null, StrLookup.systemPropertiesLookup().lookup(""));
        __CLR4_5_215fl15fllvha7igc.R.inc(53704);assertEquals(null, StrLookup.systemPropertiesLookup().lookup("other"));
        __CLR4_5_215fl15fllvha7igc.R.inc(53705);try {
            __CLR4_5_215fl15fllvha7igc.R.inc(53706);StrLookup.systemPropertiesLookup().lookup(null);
            __CLR4_5_215fl15fllvha7igc.R.inc(53707);fail();
        } catch (final NullPointerException ex) {
            // expected
        }
    }finally{__CLR4_5_215fl15fllvha7igc.R.flushNeeded();}}

    /**
     * Tests that a lookup object for system properties can deal with a full
     * replacement of the system properties object. This test is related to
     * LANG-1055.
     */
    @Test
    public void testSystemPropertiesLookupReplacedProperties() {__CLR4_5_215fl15fllvha7igc.R.globalSliceStart(getClass().getName(),53708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22cpk8815fw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215fl15fllvha7igc.R.rethrow($CLV_t2$);}finally{__CLR4_5_215fl15fllvha7igc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrLookupTest.testSystemPropertiesLookupReplacedProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53708,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22cpk8815fw(){try{__CLR4_5_215fl15fllvha7igc.R.inc(53708);
        __CLR4_5_215fl15fllvha7igc.R.inc(53709);final Properties oldProperties = System.getProperties();
        __CLR4_5_215fl15fllvha7igc.R.inc(53710);final String osName = "os.name";
        __CLR4_5_215fl15fllvha7igc.R.inc(53711);final String newOsName = oldProperties.getProperty(osName) + "_changed";

        __CLR4_5_215fl15fllvha7igc.R.inc(53712);final StrLookup<String> sysLookup = StrLookup.systemPropertiesLookup();
        __CLR4_5_215fl15fllvha7igc.R.inc(53713);final Properties newProps = new Properties();
        __CLR4_5_215fl15fllvha7igc.R.inc(53714);newProps.setProperty(osName, newOsName);
        __CLR4_5_215fl15fllvha7igc.R.inc(53715);System.setProperties(newProps);
        __CLR4_5_215fl15fllvha7igc.R.inc(53716);try {
            __CLR4_5_215fl15fllvha7igc.R.inc(53717);assertEquals("Changed properties not detected", newOsName, sysLookup.lookup(osName));
        } finally {
            __CLR4_5_215fl15fllvha7igc.R.inc(53718);System.setProperties(oldProperties);
        }
    }finally{__CLR4_5_215fl15fllvha7igc.R.flushNeeded();}}

    /**
     * Tests that a lookup object for system properties sees changes on system
     * properties. This test is related to LANG-1141.
     */
    @Test
    public void testSystemPropertiesLookupUpdatedProperty() {__CLR4_5_215fl15fllvha7igc.R.globalSliceStart(getClass().getName(),53719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dwg53d15g7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215fl15fllvha7igc.R.rethrow($CLV_t2$);}finally{__CLR4_5_215fl15fllvha7igc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrLookupTest.testSystemPropertiesLookupUpdatedProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53719,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dwg53d15g7(){try{__CLR4_5_215fl15fllvha7igc.R.inc(53719);
        __CLR4_5_215fl15fllvha7igc.R.inc(53720);final String osName = "os.name";
        __CLR4_5_215fl15fllvha7igc.R.inc(53721);final String oldOs = System.getProperty(osName);
        __CLR4_5_215fl15fllvha7igc.R.inc(53722);final String newOsName = oldOs + "_changed";

        __CLR4_5_215fl15fllvha7igc.R.inc(53723);final StrLookup<String> sysLookup = StrLookup.systemPropertiesLookup();
        __CLR4_5_215fl15fllvha7igc.R.inc(53724);System.setProperty(osName, newOsName);
        __CLR4_5_215fl15fllvha7igc.R.inc(53725);try {
            __CLR4_5_215fl15fllvha7igc.R.inc(53726);assertEquals("Changed properties not detected", newOsName, sysLookup.lookup(osName));
        } finally {
            __CLR4_5_215fl15fllvha7igc.R.inc(53727);System.setProperty(osName, oldOs);
        }
    }finally{__CLR4_5_215fl15fllvha7igc.R.flushNeeded();}}

    @Test
    public void testMapLookup() {__CLR4_5_215fl15fllvha7igc.R.globalSliceStart(getClass().getName(),53728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xqi5or15gg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215fl15fllvha7igc.R.rethrow($CLV_t2$);}finally{__CLR4_5_215fl15fllvha7igc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrLookupTest.testMapLookup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xqi5or15gg(){try{__CLR4_5_215fl15fllvha7igc.R.inc(53728);
        __CLR4_5_215fl15fllvha7igc.R.inc(53729);final Map<String, Object> map = new HashMap<>();
        __CLR4_5_215fl15fllvha7igc.R.inc(53730);map.put("key", "value");
        __CLR4_5_215fl15fllvha7igc.R.inc(53731);map.put("number", Integer.valueOf(2));
        __CLR4_5_215fl15fllvha7igc.R.inc(53732);assertEquals("value", StrLookup.mapLookup(map).lookup("key"));
        __CLR4_5_215fl15fllvha7igc.R.inc(53733);assertEquals("2", StrLookup.mapLookup(map).lookup("number"));
        __CLR4_5_215fl15fllvha7igc.R.inc(53734);assertEquals(null, StrLookup.mapLookup(map).lookup(null));
        __CLR4_5_215fl15fllvha7igc.R.inc(53735);assertEquals(null, StrLookup.mapLookup(map).lookup(""));
        __CLR4_5_215fl15fllvha7igc.R.inc(53736);assertEquals(null, StrLookup.mapLookup(map).lookup("other"));
    }finally{__CLR4_5_215fl15fllvha7igc.R.flushNeeded();}}

    @Test
    public void testMapLookup_nullMap() {__CLR4_5_215fl15fllvha7igc.R.globalSliceStart(getClass().getName(),53737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xe4fxd15gp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215fl15fllvha7igc.R.rethrow($CLV_t2$);}finally{__CLR4_5_215fl15fllvha7igc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrLookupTest.testMapLookup_nullMap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xe4fxd15gp(){try{__CLR4_5_215fl15fllvha7igc.R.inc(53737);
        __CLR4_5_215fl15fllvha7igc.R.inc(53738);final Map<String, ?> map = null;
        __CLR4_5_215fl15fllvha7igc.R.inc(53739);assertEquals(null, StrLookup.mapLookup(map).lookup(null));
        __CLR4_5_215fl15fllvha7igc.R.inc(53740);assertEquals(null, StrLookup.mapLookup(map).lookup(""));
        __CLR4_5_215fl15fllvha7igc.R.inc(53741);assertEquals(null, StrLookup.mapLookup(map).lookup("any"));
    }finally{__CLR4_5_215fl15fllvha7igc.R.flushNeeded();}}

}
