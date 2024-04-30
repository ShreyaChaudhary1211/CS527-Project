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
package org.apache.commons.lang3.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

import org.apache.commons.lang3.Validate;

/**
 * <p>Type literal comparable to {@code javax.enterprise.util.TypeLiteral},
 * made generally available outside the JEE context. Allows the passing around of
 * a "token" that represents a type in a typesafe manner, as opposed to
 * passing the (non-parameterized) {@link Type} object itself. Consider:</p>
 * <p>
 * You might see such a typesafe API as:
 * <pre>
 * class Typesafe {
 *   &lt;T&gt; T obtain(Class&lt;T&gt; type, ...);
 * }
 * </pre>
 * Consumed in the manner of:
 * <pre>
 * Foo foo = typesafe.obtain(Foo.class, ...);
 * </pre>
 * Yet, you run into problems when you want to do this with a parameterized type:
 * <pre>
 * List&lt;String&gt; listOfString = typesafe.obtain(List.class, ...); // could only give us a raw List
 * </pre>
 * {@code java.lang.reflect.Type} might provide some value:
 * <pre>
 * Type listOfStringType = ...; // firstly, how to obtain this? Doable, but not straightforward.
 * List&lt;String&gt; listOfString = (List&lt;String&gt;) typesafe.obtain(listOfStringType, ...); // nongeneric Type would necessitate a cast
 * </pre>
 * The "type literal" concept was introduced to provide an alternative, i.e.:
 * <pre>
 * class Typesafe {
 *   &lt;T&gt; T obtain(TypeLiteral&lt;T&gt; type, ...);
 * }
 * </pre>
 * Consuming code looks like:
 * <pre>
 * List&lt;String&gt; listOfString = typesafe.obtain(new TypeLiteral&lt;List&lt;String&gt;&gt;() {}, ...);
 * </pre>
 * <p>
 * This has the effect of "jumping up" a level to tie a {@code java.lang.reflect.Type}
 * to a type variable while simultaneously making it short work to obtain a
 * {@code Type} instance for any given type, inline.
 * </p>
 * <p>Additionally {@link TypeLiteral} implements the {@link Typed} interface which
 * is a generalization of this concept, and which may be implemented in custom classes.
 * It is suggested that APIs be defined in terms of the interface, in the following manner:
 * </p>
 * <pre>
 *   &lt;T&gt; T obtain(Typed&lt;T&gt; typed, ...);
 * </pre>
 *
 * @since 3.2
 */
public abstract class TypeLiteral<T> implements Typed<T> {public static class __CLR4_5_2dggdgglvha7b5k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,17460,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("rawtypes")
    private static final TypeVariable<Class<TypeLiteral>> T = TypeLiteral.class.getTypeParameters()[0];

    /**
     * Represented type.
     */
    public final Type value;

    private final String toString;

    /**
     * The default constructor.
     */
    protected TypeLiteral() {try{__CLR4_5_2dggdgglvha7b5k.R.inc(17440);
        __CLR4_5_2dggdgglvha7b5k.R.inc(17441);this.value =
            Validate.notNull(TypeUtils.getTypeArguments(getClass(), TypeLiteral.class).get(T),
                "%s does not assign type parameter %s", getClass(), TypeUtils.toLongString(T));

        __CLR4_5_2dggdgglvha7b5k.R.inc(17442);this.toString = String.format("%s<%s>", TypeLiteral.class.getSimpleName(), TypeUtils.toString(value));
    }finally{__CLR4_5_2dggdgglvha7b5k.R.flushNeeded();}}

    @Override
    public final boolean equals(final Object obj) {try{__CLR4_5_2dggdgglvha7b5k.R.inc(17443);
        __CLR4_5_2dggdgglvha7b5k.R.inc(17444);if ((((obj == this)&&(__CLR4_5_2dggdgglvha7b5k.R.iget(17445)!=0|true))||(__CLR4_5_2dggdgglvha7b5k.R.iget(17446)==0&false))) {{
            __CLR4_5_2dggdgglvha7b5k.R.inc(17447);return true;
        }
        }__CLR4_5_2dggdgglvha7b5k.R.inc(17448);if ((((obj instanceof TypeLiteral == false)&&(__CLR4_5_2dggdgglvha7b5k.R.iget(17449)!=0|true))||(__CLR4_5_2dggdgglvha7b5k.R.iget(17450)==0&false))) {{
            __CLR4_5_2dggdgglvha7b5k.R.inc(17451);return false;
        }
        }__CLR4_5_2dggdgglvha7b5k.R.inc(17452);final TypeLiteral<?> other = (TypeLiteral<?>) obj;
        __CLR4_5_2dggdgglvha7b5k.R.inc(17453);return TypeUtils.equals(value, other.value);
    }finally{__CLR4_5_2dggdgglvha7b5k.R.flushNeeded();}}

    @Override 
    public int hashCode() {try{__CLR4_5_2dggdgglvha7b5k.R.inc(17454);
        __CLR4_5_2dggdgglvha7b5k.R.inc(17455);return 37 << 4 | value.hashCode();
    }finally{__CLR4_5_2dggdgglvha7b5k.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2dggdgglvha7b5k.R.inc(17456);
        __CLR4_5_2dggdgglvha7b5k.R.inc(17457);return toString;
    }finally{__CLR4_5_2dggdgglvha7b5k.R.flushNeeded();}}

    @Override
    public Type getType() {try{__CLR4_5_2dggdgglvha7b5k.R.inc(17458);
        __CLR4_5_2dggdgglvha7b5k.R.inc(17459);return value;
    }finally{__CLR4_5_2dggdgglvha7b5k.R.flushNeeded();}}
}
