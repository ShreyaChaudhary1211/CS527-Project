/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.lang3.builder;

// adapted from org.apache.axis.utils.IDKey

/**
 * Wrap an identity key (System.identityHashCode()) 
 * so that an object can only be equal() to itself.
 * 
 * This is necessary to disambiguate the occasional duplicate
 * identityHashCodes that can occur.
 */ 
final class IDKey {public static class __CLR4_5_29i69i6lvha7aaf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,12334,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
        private final Object value;
        private final int id;

        /**
         * Constructor for IDKey
         * @param _value The value
         */ 
        public IDKey(final Object _value) {try{__CLR4_5_29i69i6lvha7aaf.R.inc(12318);
            // This is the Object hash code 
            __CLR4_5_29i69i6lvha7aaf.R.inc(12319);id = System.identityHashCode(_value);  
            // There have been some cases (LANG-459) that return the 
            // same identity hash code for different objects.  So 
            // the value is also added to disambiguate these cases.
            __CLR4_5_29i69i6lvha7aaf.R.inc(12320);value = _value;
        }finally{__CLR4_5_29i69i6lvha7aaf.R.flushNeeded();}}

        /**
         * returns hash code - i.e. the system identity hashcode.
         * @return the hashcode
         */ 
        @Override
        public int hashCode() {try{__CLR4_5_29i69i6lvha7aaf.R.inc(12321);
           __CLR4_5_29i69i6lvha7aaf.R.inc(12322);return id;
        }finally{__CLR4_5_29i69i6lvha7aaf.R.flushNeeded();}}

        /**
         * checks if instances are equal
         * @param other The other object to compare to
         * @return if the instances are for the same object
         */ 
        @Override
        public boolean equals(final Object other) {try{__CLR4_5_29i69i6lvha7aaf.R.inc(12323);
            __CLR4_5_29i69i6lvha7aaf.R.inc(12324);if ((((!(other instanceof IDKey))&&(__CLR4_5_29i69i6lvha7aaf.R.iget(12325)!=0|true))||(__CLR4_5_29i69i6lvha7aaf.R.iget(12326)==0&false))) {{
                __CLR4_5_29i69i6lvha7aaf.R.inc(12327);return false;
            }
            }__CLR4_5_29i69i6lvha7aaf.R.inc(12328);final IDKey idKey = (IDKey) other;
            __CLR4_5_29i69i6lvha7aaf.R.inc(12329);if ((((id != idKey.id)&&(__CLR4_5_29i69i6lvha7aaf.R.iget(12330)!=0|true))||(__CLR4_5_29i69i6lvha7aaf.R.iget(12331)==0&false))) {{
                __CLR4_5_29i69i6lvha7aaf.R.inc(12332);return false;
            }
            // Note that identity equals is used.
            }__CLR4_5_29i69i6lvha7aaf.R.inc(12333);return value == idKey.value;
         }finally{__CLR4_5_29i69i6lvha7aaf.R.flushNeeded();}}
}
