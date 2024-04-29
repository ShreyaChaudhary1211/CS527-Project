/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package org.semanticweb.owlapi.util;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import com.google.common.base.Optional;

/** a set of personalized preconditions */
public final class OWLAPIPreconditions {public static class __CLR4_5_271m71mlvickqh3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,9160,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private OWLAPIPreconditions() {try{__CLR4_5_271m71mlvickqh3.R.inc(9130);}finally{__CLR4_5_271m71mlvickqh3.R.flushNeeded();}}

    /**
     * Check that the argument is not null; if the argument is null, throw an
     * IllegalStateException. This method is meant to be used to verify
     * conditions on member variables rather than input parameters.
     * 
     * @param object
     *        reference to check
     * @param <T>
     *        reference type
     * @return the input reference if not null
     * @throws IllegalStateException
     *         if object is null
     */
    @Nonnull
    public static <T> T verifyNotNull(T object) {try{__CLR4_5_271m71mlvickqh3.R.inc(9131);
        __CLR4_5_271m71mlvickqh3.R.inc(9132);return verifyNotNull(object, "value cannot be null at this stage");
    }finally{__CLR4_5_271m71mlvickqh3.R.flushNeeded();}}

    /**
     * Check that the argument is not null; if the argument is null, throw an
     * IllegalStateException. This method is meant to be used to verify
     * conditions on member variables rather than input parameters.
     * 
     * @param object
     *        reference to check
     * @param message
     *        message to use for the error
     * @param <T>
     *        reference type
     * @return the input reference if not null
     * @throws IllegalStateException
     *         if object is null
     */
    @Nonnull
    public static <T> T verifyNotNull(T object, @Nonnull String message) {try{__CLR4_5_271m71mlvickqh3.R.inc(9133);
        __CLR4_5_271m71mlvickqh3.R.inc(9134);if ((((object == null)&&(__CLR4_5_271m71mlvickqh3.R.iget(9135)!=0|true))||(__CLR4_5_271m71mlvickqh3.R.iget(9136)==0&false))) {{
            __CLR4_5_271m71mlvickqh3.R.inc(9137);throw new IllegalStateException(message);
        }
        }__CLR4_5_271m71mlvickqh3.R.inc(9138);return object;
    }finally{__CLR4_5_271m71mlvickqh3.R.flushNeeded();}}

    /**
     * check for null and throw NullPointerException if null
     * 
     * @param object
     *        reference to check
     * @param <T>
     *        reference type
     * @return the input reference if not null
     * @throws NullPointerException
     *         if object is null
     */
    @Nonnull
    public static <T> T checkNotNull(T object) {try{__CLR4_5_271m71mlvickqh3.R.inc(9139);
        __CLR4_5_271m71mlvickqh3.R.inc(9140);return checkNotNull(object, "this variable cannot be null");
    }finally{__CLR4_5_271m71mlvickqh3.R.flushNeeded();}}

    /**
     * check for null and throw NullPointerException if null
     * 
     * @param object
     *        reference to check
     * @param message
     *        message for the illegal argument exception
     * @param <T>
     *        reference type
     * @return the input reference if not null
     * @throws NullPointerException
     *         if object is null
     */
    @Nonnull
    public static <T> T checkNotNull(T object, @Nonnull String message) {try{__CLR4_5_271m71mlvickqh3.R.inc(9141);
        __CLR4_5_271m71mlvickqh3.R.inc(9142);if ((((object == null)&&(__CLR4_5_271m71mlvickqh3.R.iget(9143)!=0|true))||(__CLR4_5_271m71mlvickqh3.R.iget(9144)==0&false))) {{
            __CLR4_5_271m71mlvickqh3.R.inc(9145);throw new NullPointerException(message);
        }
        }__CLR4_5_271m71mlvickqh3.R.inc(9146);return object;
    }finally{__CLR4_5_271m71mlvickqh3.R.flushNeeded();}}

    /**
     * check for negative value and throw IllegalArgumentException if negative
     * 
     * @param object
     *        value to check
     * @throws IllegalArgumentException
     *         if object is negative
     */
    public static void checkNotNegative(@Nonnegative long object) {try{__CLR4_5_271m71mlvickqh3.R.inc(9147);
        __CLR4_5_271m71mlvickqh3.R.inc(9148);checkNotNegative(object, "this variable cannot be negative: " + object);
    }finally{__CLR4_5_271m71mlvickqh3.R.flushNeeded();}}

    /**
     * check for negative value and throw IllegalArgumentException if negative
     * 
     * @param object
     *        value to check
     * @param message
     *        message for the illegal argument exception
     * @throws IllegalArgumentException
     *         if object is negative
     */
    public static void checkNotNegative(@Nonnegative long object,
            @Nonnull String message) {try{__CLR4_5_271m71mlvickqh3.R.inc(9149);
        __CLR4_5_271m71mlvickqh3.R.inc(9150);if ((((object < 0)&&(__CLR4_5_271m71mlvickqh3.R.iget(9151)!=0|true))||(__CLR4_5_271m71mlvickqh3.R.iget(9152)==0&false))) {{
            __CLR4_5_271m71mlvickqh3.R.inc(9153);throw new IllegalArgumentException(message);
        }
    }}finally{__CLR4_5_271m71mlvickqh3.R.flushNeeded();}}

    /**
     * check for absent and throw IllegalArgumentException if null or absent
     * 
     * @param object
     *        reference to check
     * @param message
     *        message for the illegal argument exception
     * @param <T>
     *        reference type
     * @return the input reference if not null
     * @throws IllegalArgumentException
     *         if object is null
     */
    @Nonnull
    public static <T> T
            checkNotNull(Optional<T> object, @Nonnull String message) {try{__CLR4_5_271m71mlvickqh3.R.inc(9154);
        __CLR4_5_271m71mlvickqh3.R.inc(9155);if ((((object == null || !object.isPresent())&&(__CLR4_5_271m71mlvickqh3.R.iget(9156)!=0|true))||(__CLR4_5_271m71mlvickqh3.R.iget(9157)==0&false))) {{
            __CLR4_5_271m71mlvickqh3.R.inc(9158);throw new IllegalArgumentException(message);
        }
        }__CLR4_5_271m71mlvickqh3.R.inc(9159);return verifyNotNull(object.get());
    }finally{__CLR4_5_271m71mlvickqh3.R.flushNeeded();}}
}
