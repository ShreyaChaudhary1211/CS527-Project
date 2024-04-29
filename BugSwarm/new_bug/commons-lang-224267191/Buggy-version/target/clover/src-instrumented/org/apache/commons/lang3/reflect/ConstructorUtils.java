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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.Validate;

/**
 * <p> Utility reflection methods focused on constructors, modeled after
 * {@link MethodUtils}. </p>
 *
 * <h3>Known Limitations</h3> <h4>Accessing Public Constructors In A Default
 * Access Superclass</h4> <p>There is an issue when invoking {@code public} constructors
 * contained in a default access superclass. Reflection correctly locates these
 * constructors and assigns them as {@code public}. However, an
 * {@link IllegalAccessException} is thrown if the constructor is
 * invoked.</p>
 *
 * <p>{@link ConstructorUtils} contains a workaround for this situation: it
 * will attempt to call {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} on this constructor. If this
 * call succeeds, then the method can be invoked as normal. This call will only
 * succeed when the application has sufficient security privileges. If this call
 * fails then a warning will be logged and the method may fail.</p>
 *
 * @since 2.5
 */
public class ConstructorUtils {public static class __CLR4_5_2curcurlvha7b1z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,16736,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>ConstructorUtils instances should NOT be constructed in standard
     * programming. Instead, the class should be used as
     * {@code ConstructorUtils.invokeConstructor(cls, args)}.</p>
     *
     * <p>This constructor is {@code public} to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public ConstructorUtils() {
        super();__CLR4_5_2curcurlvha7b1z.R.inc(16660);try{__CLR4_5_2curcurlvha7b1z.R.inc(16659);
    }finally{__CLR4_5_2curcurlvha7b1z.R.flushNeeded();}}

    /**
     * <p>Returns a new instance of the specified class inferring the right constructor
     * from the types of the arguments.</p>
     * 
     * <p>This locates and calls a constructor.
     * The constructor signature must match the argument types by assignment compatibility.</p>
     *
     * @param <T> the type to be constructed
     * @param cls  the class to be constructed, not {@code null}
     * @param args  the array of arguments, {@code null} treated as empty
     * @return new instance of {@code cls}, not {@code null}
     *
     * @throws NullPointerException if {@code cls} is {@code null}
     * @throws NoSuchMethodException if a matching constructor cannot be found
     * @throws IllegalAccessException if invocation is not permitted by security
     * @throws InvocationTargetException if an error occurs on invocation
     * @throws InstantiationException if an error occurs on instantiation
     * @see #invokeConstructor(java.lang.Class, java.lang.Object[], java.lang.Class[])
     */
    public static <T> T invokeConstructor(final Class<T> cls, Object... args)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {try{__CLR4_5_2curcurlvha7b1z.R.inc(16661);
        __CLR4_5_2curcurlvha7b1z.R.inc(16662);args = ArrayUtils.nullToEmpty(args);
        __CLR4_5_2curcurlvha7b1z.R.inc(16663);final Class<?> parameterTypes[] = ClassUtils.toClass(args);
        __CLR4_5_2curcurlvha7b1z.R.inc(16664);return invokeConstructor(cls, args, parameterTypes);
    }finally{__CLR4_5_2curcurlvha7b1z.R.flushNeeded();}}

    /**
     * <p>Returns a new instance of the specified class choosing the right constructor
     * from the list of parameter types.</p>
     * 
     * <p>This locates and calls a constructor.
     * The constructor signature must match the parameter types by assignment compatibility.</p>
     *
     * @param <T> the type to be constructed
     * @param cls  the class to be constructed, not {@code null}
     * @param args  the array of arguments, {@code null} treated as empty
     * @param parameterTypes  the array of parameter types, {@code null} treated as empty
     * @return new instance of {@code cls}, not {@code null}
     *
     * @throws NullPointerException if {@code cls} is {@code null}
     * @throws NoSuchMethodException if a matching constructor cannot be found
     * @throws IllegalAccessException if invocation is not permitted by security
     * @throws InvocationTargetException if an error occurs on invocation
     * @throws InstantiationException if an error occurs on instantiation
     * @see Constructor#newInstance
     */
    public static <T> T invokeConstructor(final Class<T> cls, Object[] args, Class<?>[] parameterTypes)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {try{__CLR4_5_2curcurlvha7b1z.R.inc(16665);
        __CLR4_5_2curcurlvha7b1z.R.inc(16666);args = ArrayUtils.nullToEmpty(args);
        __CLR4_5_2curcurlvha7b1z.R.inc(16667);parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        __CLR4_5_2curcurlvha7b1z.R.inc(16668);final Constructor<T> ctor = getMatchingAccessibleConstructor(cls, parameterTypes);
        __CLR4_5_2curcurlvha7b1z.R.inc(16669);if ((((ctor == null)&&(__CLR4_5_2curcurlvha7b1z.R.iget(16670)!=0|true))||(__CLR4_5_2curcurlvha7b1z.R.iget(16671)==0&false))) {{
            __CLR4_5_2curcurlvha7b1z.R.inc(16672);throw new NoSuchMethodException(
                "No such accessible constructor on object: " + cls.getName());
        }
        }__CLR4_5_2curcurlvha7b1z.R.inc(16673);if ((((ctor.isVarArgs())&&(__CLR4_5_2curcurlvha7b1z.R.iget(16674)!=0|true))||(__CLR4_5_2curcurlvha7b1z.R.iget(16675)==0&false))) {{
            __CLR4_5_2curcurlvha7b1z.R.inc(16676);final Class<?>[] methodParameterTypes = ctor.getParameterTypes();
            __CLR4_5_2curcurlvha7b1z.R.inc(16677);args = MethodUtils.getVarArgs(args, methodParameterTypes);
        }
        }__CLR4_5_2curcurlvha7b1z.R.inc(16678);return ctor.newInstance(args);
    }finally{__CLR4_5_2curcurlvha7b1z.R.flushNeeded();}}

    /**
     * <p>Returns a new instance of the specified class inferring the right constructor
     * from the types of the arguments.</p>
     *
     * <p>This locates and calls a constructor.
     * The constructor signature must match the argument types exactly.</p>
     *
     * @param <T> the type to be constructed
     * @param cls the class to be constructed, not {@code null}
     * @param args the array of arguments, {@code null} treated as empty
     * @return new instance of {@code cls}, not {@code null}
     *
     * @throws NullPointerException if {@code cls} is {@code null}
     * @throws NoSuchMethodException if a matching constructor cannot be found
     * @throws IllegalAccessException if invocation is not permitted by security
     * @throws InvocationTargetException if an error occurs on invocation
     * @throws InstantiationException if an error occurs on instantiation
     * @see #invokeExactConstructor(java.lang.Class, java.lang.Object[], java.lang.Class[])
     */
    public static <T> T invokeExactConstructor(final Class<T> cls, Object... args)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {try{__CLR4_5_2curcurlvha7b1z.R.inc(16679);
        __CLR4_5_2curcurlvha7b1z.R.inc(16680);args = ArrayUtils.nullToEmpty(args);
        __CLR4_5_2curcurlvha7b1z.R.inc(16681);final Class<?> parameterTypes[] = ClassUtils.toClass(args);
        __CLR4_5_2curcurlvha7b1z.R.inc(16682);return invokeExactConstructor(cls, args, parameterTypes);
    }finally{__CLR4_5_2curcurlvha7b1z.R.flushNeeded();}}

    /**
     * <p>Returns a new instance of the specified class choosing the right constructor
     * from the list of parameter types.</p>
     *
     * <p>This locates and calls a constructor.
     * The constructor signature must match the parameter types exactly.</p>
     *
     * @param <T> the type to be constructed
     * @param cls the class to be constructed, not {@code null}
     * @param args the array of arguments, {@code null} treated as empty
     * @param parameterTypes  the array of parameter types, {@code null} treated as empty
     * @return new instance of <code>cls</code>, not {@code null}
     *
     * @throws NullPointerException if {@code cls} is {@code null}
     * @throws NoSuchMethodException if a matching constructor cannot be found
     * @throws IllegalAccessException if invocation is not permitted by security
     * @throws InvocationTargetException if an error occurs on invocation
     * @throws InstantiationException if an error occurs on instantiation
     * @see Constructor#newInstance
     */
    public static <T> T invokeExactConstructor(final Class<T> cls, Object[] args,
            Class<?>[] parameterTypes) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {try{__CLR4_5_2curcurlvha7b1z.R.inc(16683);
        __CLR4_5_2curcurlvha7b1z.R.inc(16684);args = ArrayUtils.nullToEmpty(args);
        __CLR4_5_2curcurlvha7b1z.R.inc(16685);parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        __CLR4_5_2curcurlvha7b1z.R.inc(16686);final Constructor<T> ctor = getAccessibleConstructor(cls, parameterTypes);
        __CLR4_5_2curcurlvha7b1z.R.inc(16687);if ((((ctor == null)&&(__CLR4_5_2curcurlvha7b1z.R.iget(16688)!=0|true))||(__CLR4_5_2curcurlvha7b1z.R.iget(16689)==0&false))) {{
            __CLR4_5_2curcurlvha7b1z.R.inc(16690);throw new NoSuchMethodException(
                "No such accessible constructor on object: "+ cls.getName());
        }
        }__CLR4_5_2curcurlvha7b1z.R.inc(16691);return ctor.newInstance(args);
    }finally{__CLR4_5_2curcurlvha7b1z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Finds a constructor given a class and signature, checking accessibility.</p>
     * 
     * <p>This finds the constructor and ensures that it is accessible.
     * The constructor signature must match the parameter types exactly.</p>
     *
     * @param <T> the constructor type
     * @param cls the class to find a constructor for, not {@code null}
     * @param parameterTypes the array of parameter types, {@code null} treated as empty
     * @return the constructor, {@code null} if no matching accessible constructor found
     * @see Class#getConstructor
     * @see #getAccessibleConstructor(java.lang.reflect.Constructor)
     * @throws NullPointerException if {@code cls} is {@code null}
     */
    public static <T> Constructor<T> getAccessibleConstructor(final Class<T> cls,
            final Class<?>... parameterTypes) {try{__CLR4_5_2curcurlvha7b1z.R.inc(16692);
        __CLR4_5_2curcurlvha7b1z.R.inc(16693);Validate.notNull(cls, "class cannot be null");
        __CLR4_5_2curcurlvha7b1z.R.inc(16694);try {
            __CLR4_5_2curcurlvha7b1z.R.inc(16695);return getAccessibleConstructor(cls.getConstructor(parameterTypes));
        } catch (final NoSuchMethodException e) {
            __CLR4_5_2curcurlvha7b1z.R.inc(16696);return null;
        }
    }finally{__CLR4_5_2curcurlvha7b1z.R.flushNeeded();}}

    /**
     * <p>Checks if the specified constructor is accessible.</p>
     * 
     * <p>This simply ensures that the constructor is accessible.</p>
     *
     * @param <T> the constructor type
     * @param ctor  the prototype constructor object, not {@code null}
     * @return the constructor, {@code null} if no matching accessible constructor found
     * @see java.lang.SecurityManager
     * @throws NullPointerException if {@code ctor} is {@code null}
     */
    public static <T> Constructor<T> getAccessibleConstructor(final Constructor<T> ctor) {try{__CLR4_5_2curcurlvha7b1z.R.inc(16697);
        __CLR4_5_2curcurlvha7b1z.R.inc(16698);Validate.notNull(ctor, "constructor cannot be null");
        __CLR4_5_2curcurlvha7b1z.R.inc(16699);return (((MemberUtils.isAccessible(ctor)
                && isAccessible(ctor.getDeclaringClass()) )&&(__CLR4_5_2curcurlvha7b1z.R.iget(16700)!=0|true))||(__CLR4_5_2curcurlvha7b1z.R.iget(16701)==0&false))? ctor : null;
    }finally{__CLR4_5_2curcurlvha7b1z.R.flushNeeded();}}

    /**
     * <p>Finds an accessible constructor with compatible parameters.</p>
     * 
     * <p>This checks all the constructor and finds one with compatible parameters
     * This requires that every parameter is assignable from the given parameter types.
     * This is a more flexible search than the normal exact matching algorithm.</p>
     *
     * <p>First it checks if there is a constructor matching the exact signature.
     * If not then all the constructors of the class are checked to see if their
     * signatures are assignment-compatible with the parameter types.
     * The first assignment-compatible matching constructor is returned.</p>
     *
     * @param <T> the constructor type
     * @param cls  the class to find a constructor for, not {@code null}
     * @param parameterTypes find method with compatible parameters
     * @return the constructor, null if no matching accessible constructor found
     * @throws NullPointerException if {@code cls} is {@code null}
     */
    public static <T> Constructor<T> getMatchingAccessibleConstructor(final Class<T> cls,
            final Class<?>... parameterTypes) {try{__CLR4_5_2curcurlvha7b1z.R.inc(16702);
        __CLR4_5_2curcurlvha7b1z.R.inc(16703);Validate.notNull(cls, "class cannot be null");
        // see if we can find the constructor directly
        // most of the time this works and it's much faster
        __CLR4_5_2curcurlvha7b1z.R.inc(16704);try {
            __CLR4_5_2curcurlvha7b1z.R.inc(16705);final Constructor<T> ctor = cls.getConstructor(parameterTypes);
            __CLR4_5_2curcurlvha7b1z.R.inc(16706);MemberUtils.setAccessibleWorkaround(ctor);
            __CLR4_5_2curcurlvha7b1z.R.inc(16707);return ctor;
        } catch (final NoSuchMethodException e) { // NOPMD - Swallow
        }
        __CLR4_5_2curcurlvha7b1z.R.inc(16708);Constructor<T> result = null;
        /*
         * (1) Class.getConstructors() is documented to return Constructor<T> so as
         * long as the array is not subsequently modified, everything's fine.
         */
        __CLR4_5_2curcurlvha7b1z.R.inc(16709);final Constructor<?>[] ctors = cls.getConstructors();

        // return best match:
        __CLR4_5_2curcurlvha7b1z.R.inc(16710);for (Constructor<?> ctor : ctors) {{
            // compare parameters
            __CLR4_5_2curcurlvha7b1z.R.inc(16711);if ((((MemberUtils.isMatchingConstructor(ctor, parameterTypes))&&(__CLR4_5_2curcurlvha7b1z.R.iget(16712)!=0|true))||(__CLR4_5_2curcurlvha7b1z.R.iget(16713)==0&false))) {{
                // get accessible version of constructor
                __CLR4_5_2curcurlvha7b1z.R.inc(16714);ctor = getAccessibleConstructor(ctor);
                __CLR4_5_2curcurlvha7b1z.R.inc(16715);if ((((ctor != null)&&(__CLR4_5_2curcurlvha7b1z.R.iget(16716)!=0|true))||(__CLR4_5_2curcurlvha7b1z.R.iget(16717)==0&false))) {{
                    __CLR4_5_2curcurlvha7b1z.R.inc(16718);MemberUtils.setAccessibleWorkaround(ctor);
                    __CLR4_5_2curcurlvha7b1z.R.inc(16719);if ((((result == null || MemberUtils.compareConstructorFit(ctor, result, parameterTypes) < 0)&&(__CLR4_5_2curcurlvha7b1z.R.iget(16720)!=0|true))||(__CLR4_5_2curcurlvha7b1z.R.iget(16721)==0&false))) {{
                        // temporary variable for annotation, see comment above (1)
                        __CLR4_5_2curcurlvha7b1z.R.inc(16722);@SuppressWarnings("unchecked")
                        final
                        Constructor<T> constructor = (Constructor<T>)ctor;
                        __CLR4_5_2curcurlvha7b1z.R.inc(16723);result = constructor;
                    }
                }}
            }}
        }}
        }__CLR4_5_2curcurlvha7b1z.R.inc(16724);return result;
    }finally{__CLR4_5_2curcurlvha7b1z.R.flushNeeded();}}

    /**
     * Learn whether the specified class is generally accessible, i.e. is
     * declared in an entirely {@code public} manner.
     * @param type to check
     * @return {@code true} if {@code type} and any enclosing classes are
     *         {@code public}.
     */
    private static boolean isAccessible(final Class<?> type) {try{__CLR4_5_2curcurlvha7b1z.R.inc(16725);
        __CLR4_5_2curcurlvha7b1z.R.inc(16726);Class<?> cls = type;
        __CLR4_5_2curcurlvha7b1z.R.inc(16727);while ((((cls != null)&&(__CLR4_5_2curcurlvha7b1z.R.iget(16728)!=0|true))||(__CLR4_5_2curcurlvha7b1z.R.iget(16729)==0&false))) {{
            __CLR4_5_2curcurlvha7b1z.R.inc(16730);if ((((!Modifier.isPublic(cls.getModifiers()))&&(__CLR4_5_2curcurlvha7b1z.R.iget(16731)!=0|true))||(__CLR4_5_2curcurlvha7b1z.R.iget(16732)==0&false))) {{
                __CLR4_5_2curcurlvha7b1z.R.inc(16733);return false;
            }
            }__CLR4_5_2curcurlvha7b1z.R.inc(16734);cls = cls.getEnclosingClass();
        }
        }__CLR4_5_2curcurlvha7b1z.R.inc(16735);return true;
    }finally{__CLR4_5_2curcurlvha7b1z.R.flushNeeded();}}

}
