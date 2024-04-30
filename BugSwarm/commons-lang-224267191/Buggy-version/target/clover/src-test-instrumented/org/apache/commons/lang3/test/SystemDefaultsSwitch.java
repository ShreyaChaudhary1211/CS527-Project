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
package org.apache.commons.lang3.test;

import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.lang3.LocaleUtils;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Test Rule used with {@link SystemDefaults} annotation that sets and restores the system default Locale and TimeZone.
 * 
 * <p>
 * Set up tests to use alternate system default Locale and/or TimeZone by creating an instance of this rule
 * and annotating the test method with {@link SystemDefaults} 
 * </p>
 * 
 * <pre>
 * public class SystemDefaultsDependentTest {
 *
 *     {@literal @}Rule
 *     public SystemDefaultsSwitch locale = new SystemDefaultsSwitch();
 *
 *     {@literal @}Test
 *     public void testThatWillExecuteWithTheDefaultLocaleAndTimeZone() {
 *         // nothing to do, just implement the test
 *     }
 *
 *     {@literal @}Test
 *     {@literal @}SystemDefaults(local="zh_CN")
 *     public void testWithSimplifiedChinaDefaultLocale() {
 *         // Locale.getDefault() will return Locale.CHINA until the end of this test method
 *     }
 *      
 *     {@literal @}Test
 *     {@literal @}SystemDefaults(timezone="America/New_York")
 *     public void testWithNorthAmericaEasternTimeZone() {
 *         // TimeZone.getDefault() will equal TimeZone.getTimeZone("America/New_York") until the end of this method
 *     }
 * }
 * </pre>
 */
public class SystemDefaultsSwitch implements TestRule {public static class __CLR4_5_213gl13gllvha7ibz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,51174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Override
    public Statement apply(final Statement stmt, final Description description) {try{__CLR4_5_213gl13gllvha7ibz.R.inc(51141);
        __CLR4_5_213gl13gllvha7ibz.R.inc(51142);final SystemDefaults defaults = description.getAnnotation(SystemDefaults.class);
        __CLR4_5_213gl13gllvha7ibz.R.inc(51143);if ((((defaults == null)&&(__CLR4_5_213gl13gllvha7ibz.R.iget(51144)!=0|true))||(__CLR4_5_213gl13gllvha7ibz.R.iget(51145)==0&false))) {{
            __CLR4_5_213gl13gllvha7ibz.R.inc(51146);return stmt;
        }
        }__CLR4_5_213gl13gllvha7ibz.R.inc(51147);return applyTimeZone(defaults, applyLocale(defaults, stmt));
    }finally{__CLR4_5_213gl13gllvha7ibz.R.flushNeeded();}}

    private Statement applyTimeZone(final SystemDefaults defaults, final Statement stmt) {try{__CLR4_5_213gl13gllvha7ibz.R.inc(51148);
        __CLR4_5_213gl13gllvha7ibz.R.inc(51149);if ((((defaults.timezone().isEmpty())&&(__CLR4_5_213gl13gllvha7ibz.R.iget(51150)!=0|true))||(__CLR4_5_213gl13gllvha7ibz.R.iget(51151)==0&false))) {{
            __CLR4_5_213gl13gllvha7ibz.R.inc(51152);return stmt;
        }

        }__CLR4_5_213gl13gllvha7ibz.R.inc(51153);final TimeZone newTimeZone = TimeZone.getTimeZone(defaults.timezone());

        __CLR4_5_213gl13gllvha7ibz.R.inc(51154);return new Statement() {
            @Override
            public void evaluate() throws Throwable {try{__CLR4_5_213gl13gllvha7ibz.R.inc(51155);
                __CLR4_5_213gl13gllvha7ibz.R.inc(51156);final TimeZone save = TimeZone.getDefault();
                __CLR4_5_213gl13gllvha7ibz.R.inc(51157);try {
                    __CLR4_5_213gl13gllvha7ibz.R.inc(51158);TimeZone.setDefault(newTimeZone);
                    __CLR4_5_213gl13gllvha7ibz.R.inc(51159);stmt.evaluate();
                } finally {
                    __CLR4_5_213gl13gllvha7ibz.R.inc(51160);TimeZone.setDefault(save);
                }
            }finally{__CLR4_5_213gl13gllvha7ibz.R.flushNeeded();}}
        };
    }finally{__CLR4_5_213gl13gllvha7ibz.R.flushNeeded();}}

    private Statement applyLocale(final SystemDefaults defaults, final Statement stmt) {try{__CLR4_5_213gl13gllvha7ibz.R.inc(51161);
        __CLR4_5_213gl13gllvha7ibz.R.inc(51162);if ((((defaults.locale().isEmpty())&&(__CLR4_5_213gl13gllvha7ibz.R.iget(51163)!=0|true))||(__CLR4_5_213gl13gllvha7ibz.R.iget(51164)==0&false))) {{
            __CLR4_5_213gl13gllvha7ibz.R.inc(51165);return stmt;
        }

        }__CLR4_5_213gl13gllvha7ibz.R.inc(51166);final Locale newLocale = LocaleUtils.toLocale(defaults.locale());

        __CLR4_5_213gl13gllvha7ibz.R.inc(51167);return new Statement() {
            @Override
            public void evaluate() throws Throwable {try{__CLR4_5_213gl13gllvha7ibz.R.inc(51168);
                __CLR4_5_213gl13gllvha7ibz.R.inc(51169);final Locale save = Locale.getDefault();
                __CLR4_5_213gl13gllvha7ibz.R.inc(51170);try {
                    __CLR4_5_213gl13gllvha7ibz.R.inc(51171);Locale.setDefault(newLocale);
                    __CLR4_5_213gl13gllvha7ibz.R.inc(51172);stmt.evaluate();
                } finally {
                    __CLR4_5_213gl13gllvha7ibz.R.inc(51173);Locale.setDefault(save);
                }
            }finally{__CLR4_5_213gl13gllvha7ibz.R.flushNeeded();}}
        };
    }finally{__CLR4_5_213gl13gllvha7ibz.R.flushNeeded();}}

}
