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

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ClassUtils.Interfaces;
import org.apache.commons.lang3.Validate;

/**
 * <p>Utility reflection methods focused on {@link Method}s, originally from Commons BeanUtils.
 * Differences from the BeanUtils version may be noted, especially where similar functionality
 * already existed within Lang.
 * </p>
 *
 * <h3>Known Limitations</h3>
 * <h4>Accessing Public Methods In A Default Access Superclass</h4>
 * <p>There is an issue when invoking {@code public} methods contained in a default access superclass on JREs prior to 1.4.
 * Reflection locates these methods fine and correctly assigns them as {@code public}.
 * However, an {@link IllegalAccessException} is thrown if the method is invoked.</p>
 *
 * <p>{@link MethodUtils} contains a workaround for this situation. 
 * It will attempt to call {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} on this method.
 * If this call succeeds, then the method can be invoked as normal.
 * This call will only succeed when the application has sufficient security privileges. 
 * If this call fails then the method may fail.</p>
 *
 * @since 2.5
 */
public class MethodUtils {public static class __CLR4_5_2d6od6olvha7b4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,17440,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>{@link MethodUtils} instances should NOT be constructed in standard programming.
     * Instead, the class should be used as
     * {@code MethodUtils.getAccessibleMethod(method)}.</p>
     *
     * <p>This constructor is {@code public} to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public MethodUtils() {
        super();__CLR4_5_2d6od6olvha7b4n.R.inc(17089);try{__CLR4_5_2d6od6olvha7b4n.R.inc(17088);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Invokes a named method without parameters.</p>
     *
     * <p>This method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.</p>
     *
     * <p>This is a convenient wrapper for
     * {@link #invokeMethod(Object object,String methodName, Object[] args, Class[] parameterTypes)}.
     * </p>
     *
     * @param object invoke method on this object
     * @param methodName get method with this name
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the method invoked
     * @throws IllegalAccessException if the requested method is not accessible via reflection
     *  
     *  @since 3.4
     */
    public static Object invokeMethod(final Object object, final String methodName) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17090);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17091);return invokeMethod(object, methodName, ArrayUtils.EMPTY_OBJECT_ARRAY, null);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}
    
    /**
     * <p>Invokes a named method without parameters.</p>
     *
     * <p>This is a convenient wrapper for
     * {@link #invokeMethod(Object object,boolean forceAccess,String methodName, Object[] args, Class[] parameterTypes)}.
     * </p>
     *
     * @param object invoke method on this object
     * @param forceAccess force access to invoke method even if it's not accessible
     * @param methodName get method with this name
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the method invoked
     * @throws IllegalAccessException if the requested method is not accessible via reflection
     *
     * @since 3.5
     */
    public static Object invokeMethod(final Object object, final boolean forceAccess, final String methodName)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17092);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17093);return invokeMethod(object, forceAccess, methodName, ArrayUtils.EMPTY_OBJECT_ARRAY, null);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Invokes a named method whose parameter type matches the object type.</p>
     *
     * <p>This method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.</p>
     *
     * <p>This method supports calls to methods taking primitive parameters 
     * via passing in wrapping classes. So, for example, a {@code Boolean} object
     * would match a {@code boolean} primitive.</p>
     *
     * <p>This is a convenient wrapper for
     * {@link #invokeMethod(Object object,String methodName, Object[] args, Class[] parameterTypes)}.
     * </p>
     *
     * @param object invoke method on this object
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the method invoked
     * @throws IllegalAccessException if the requested method is not accessible via reflection
     */
    public static Object invokeMethod(final Object object, final String methodName,
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17094);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17095);args = ArrayUtils.nullToEmpty(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17096);final Class<?>[] parameterTypes = ClassUtils.toClass(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17097);return invokeMethod(object, methodName, args, parameterTypes);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}
    
    /**
     * <p>Invokes a named method whose parameter type matches the object type.</p>
     *
     * <p>This method supports calls to methods taking primitive parameters 
     * via passing in wrapping classes. So, for example, a {@code Boolean} object
     * would match a {@code boolean} primitive.</p>
     *
     * <p>This is a convenient wrapper for
     * {@link #invokeMethod(Object object,boolean forceAccess,String methodName, Object[] args, Class[] parameterTypes)}.
     * </p>
     *
     * @param object invoke method on this object
     * @param forceAccess force access to invoke method even if it's not accessible
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the method invoked
     * @throws IllegalAccessException if the requested method is not accessible via reflection
     *
     * @since 3.5
     */
    public static Object invokeMethod(final Object object, final boolean forceAccess, final String methodName,
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17098);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17099);args = ArrayUtils.nullToEmpty(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17100);final Class<?>[] parameterTypes = ClassUtils.toClass(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17101);return invokeMethod(object, forceAccess, methodName, args, parameterTypes);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Invokes a named method whose parameter type matches the object type.</p>
     *
     * <p>This method supports calls to methods taking primitive parameters 
     * via passing in wrapping classes. So, for example, a {@code Boolean} object
     * would match a {@code boolean} primitive.</p>
     *
     * @param object invoke method on this object
     * @param forceAccess force access to invoke method even if it's not accessible
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @param parameterTypes match these parameters - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the method invoked
     * @throws IllegalAccessException if the requested method is not accessible via reflection
     * @since 3.5
     */
    public static Object invokeMethod(final Object object, final boolean forceAccess, final String methodName,
            Object[] args, Class<?>[] parameterTypes)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17102);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17103);parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17104);args = ArrayUtils.nullToEmpty(args);

        __CLR4_5_2d6od6olvha7b4n.R.inc(17105);final String messagePrefix;
        __CLR4_5_2d6od6olvha7b4n.R.inc(17106);Method method = null;

        __CLR4_5_2d6od6olvha7b4n.R.inc(17107);if ((((forceAccess)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17108)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17109)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17110);messagePrefix = "No such method: ";
            __CLR4_5_2d6od6olvha7b4n.R.inc(17111);method = getMatchingMethod(object.getClass(),
                    methodName, parameterTypes);
            __CLR4_5_2d6od6olvha7b4n.R.inc(17112);if ((((method != null && !method.isAccessible())&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17113)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17114)==0&false))) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17115);method.setAccessible(true);
            }
        }} }else {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17116);messagePrefix = "No such accessible method: ";
            __CLR4_5_2d6od6olvha7b4n.R.inc(17117);method = getMatchingAccessibleMethod(object.getClass(),
                    methodName, parameterTypes);
        }

        }__CLR4_5_2d6od6olvha7b4n.R.inc(17118);if ((((method == null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17119)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17120)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17121);throw new NoSuchMethodException(messagePrefix
                    + methodName + "() on object: "
                    + object.getClass().getName());
        }
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17122);args = toVarArgs(method, args);

        __CLR4_5_2d6od6olvha7b4n.R.inc(17123);return method.invoke(object, args);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Invokes a named method whose parameter type matches the object type.</p>
     *
     * <p>This method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.</p>
     *
     * <p>This method supports calls to methods taking primitive parameters 
     * via passing in wrapping classes. So, for example, a {@code Boolean} object
     * would match a {@code boolean} primitive.</p>
     *
     * @param object invoke method on this object
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @param parameterTypes match these parameters - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the method invoked
     * @throws IllegalAccessException if the requested method is not accessible via reflection
     */
    public static Object invokeMethod(final Object object, final String methodName, 
            final Object[] args, final Class<?>[] parameterTypes)
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17124);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17125);return invokeMethod(object, false, methodName, args, parameterTypes);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Invokes a method whose parameter types match exactly the object
     * types.</p>
     *
     * <p>This uses reflection to invoke the method obtained from a call to
     * {@link #getAccessibleMethod}(Class,String,Class[])}.</p>
     *
     * @param object invoke method on this object
     * @param methodName get method with this name
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     *
     * @since 3.4
     */
    public static Object invokeExactMethod(final Object object, final String methodName) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17126);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17127);return invokeExactMethod(object, methodName, ArrayUtils.EMPTY_OBJECT_ARRAY, null);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Invokes a method with no parameters.</p>
     *
     * <p>This uses reflection to invoke the method obtained from a call to
     * {@link #getAccessibleMethod}(Class,String,Class[])}.</p>
     *
     * @param object invoke method on this object
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     */
    public static Object invokeExactMethod(final Object object, final String methodName,
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17128);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17129);args = ArrayUtils.nullToEmpty(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17130);final Class<?>[] parameterTypes = ClassUtils.toClass(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17131);return invokeExactMethod(object, methodName, args, parameterTypes);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Invokes a method whose parameter types match exactly the parameter
     * types given.</p>
     *
     * <p>This uses reflection to invoke the method obtained from a call to
     * {@link #getAccessibleMethod(Class,String,Class[])}.</p>
     *
     * @param object invoke method on this object
     * @param methodName get method with this name
     * @param args use these arguments - treat null as empty array
     * @param parameterTypes match these parameters - treat {@code null} as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     */
    public static Object invokeExactMethod(final Object object, final String methodName,
            Object[] args, Class<?>[] parameterTypes)
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17132);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17133);args = ArrayUtils.nullToEmpty(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17134);parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17135);final Method method = getAccessibleMethod(object.getClass(), methodName,
                parameterTypes);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17136);if ((((method == null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17137)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17138)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17139);throw new NoSuchMethodException("No such accessible method: "
                    + methodName + "() on object: "
                    + object.getClass().getName());
        }
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17140);return method.invoke(object, args);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Invokes a {@code static} method whose parameter types match exactly the parameter
     * types given.</p>
     *
     * <p>This uses reflection to invoke the method obtained from a call to
     * {@link #getAccessibleMethod(Class, String, Class[])}.</p>
     *
     * @param cls invoke static method on this class
     * @param methodName get method with this name
     * @param args use these arguments - treat {@code null} as empty array
     * @param parameterTypes match these parameters - treat {@code null} as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     */
    public static Object invokeExactStaticMethod(final Class<?> cls, final String methodName,
            Object[] args, Class<?>[] parameterTypes)
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17141);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17142);args = ArrayUtils.nullToEmpty(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17143);parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17144);final Method method = getAccessibleMethod(cls, methodName, parameterTypes);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17145);if ((((method == null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17146)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17147)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17148);throw new NoSuchMethodException("No such accessible method: "
                    + methodName + "() on class: " + cls.getName());
        }
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17149);return method.invoke(null, args);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Invokes a named {@code static} method whose parameter type matches the object type.</p>
     *
     * <p>This method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.</p>
     *
     * <p>This method supports calls to methods taking primitive parameters 
     * via passing in wrapping classes. So, for example, a {@code Boolean} class
     * would match a {@code boolean} primitive.</p>
     *
     * <p>This is a convenient wrapper for
     * {@link #invokeStaticMethod(Class, String, Object[], Class[])}.
     * </p>
     *
     * @param cls invoke static method on this class
     * @param methodName get method with this name
     * @param args use these arguments - treat {@code null} as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     */
    public static Object invokeStaticMethod(final Class<?> cls, final String methodName,
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17150);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17151);args = ArrayUtils.nullToEmpty(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17152);final Class<?>[] parameterTypes = ClassUtils.toClass(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17153);return invokeStaticMethod(cls, methodName, args, parameterTypes);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Invokes a named {@code static} method whose parameter type matches the object type.</p>
     *
     * <p>This method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.</p>
     *
     * <p>This method supports calls to methods taking primitive parameters 
     * via passing in wrapping classes. So, for example, a {@code Boolean} class
     * would match a {@code boolean} primitive.</p>
     *
     *
     * @param cls invoke static method on this class
     * @param methodName get method with this name
     * @param args use these arguments - treat {@code null} as empty array
     * @param parameterTypes match these parameters - treat {@code null} as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     */
    public static Object invokeStaticMethod(final Class<?> cls, final String methodName,
            Object[] args, Class<?>[] parameterTypes)
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17154);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17155);args = ArrayUtils.nullToEmpty(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17156);parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17157);final Method method = getMatchingAccessibleMethod(cls, methodName,
                parameterTypes);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17158);if ((((method == null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17159)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17160)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17161);throw new NoSuchMethodException("No such accessible method: "
                    + methodName + "() on class: " + cls.getName());
        }
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17162);args = toVarArgs(method, args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17163);return method.invoke(null, args);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    private static Object[] toVarArgs(final Method method, Object[] args) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17164);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17165);if ((((method.isVarArgs())&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17166)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17167)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17168);final Class<?>[] methodParameterTypes = method.getParameterTypes();
            __CLR4_5_2d6od6olvha7b4n.R.inc(17169);args = getVarArgs(args, methodParameterTypes);
        }
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17170);return args;
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Given an arguments array passed to a varargs method, return an array of arguments in the canonical form,
     * i.e. an array with the declared number of parameters, and whose last parameter is an array of the varargs type.
     * </p>
     *
     * @param args the array of arguments passed to the varags method
     * @param methodParameterTypes the declared array of method parameter types
     * @return an array of the variadic arguments passed to the method
     * @since 3.5
     */
    static Object[] getVarArgs(final Object[] args, final Class<?>[] methodParameterTypes) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17171);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17172);if ((((args.length == methodParameterTypes.length
                && args[args.length - 1].getClass().equals(methodParameterTypes[methodParameterTypes.length - 1]))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17173)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17174)==0&false))) {{
            // The args array is already in the canonical form for the method.
            __CLR4_5_2d6od6olvha7b4n.R.inc(17175);return args;
        }

        // Construct a new array matching the method's declared parameter types.
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17176);final Object[] newArgs = new Object[methodParameterTypes.length];

        // Copy the normal (non-varargs) parameters
        __CLR4_5_2d6od6olvha7b4n.R.inc(17177);System.arraycopy(args, 0, newArgs, 0, methodParameterTypes.length - 1);

        // Construct a new array for the variadic parameters
        __CLR4_5_2d6od6olvha7b4n.R.inc(17178);final Class<?> varArgComponentType = methodParameterTypes[methodParameterTypes.length - 1].getComponentType();
        __CLR4_5_2d6od6olvha7b4n.R.inc(17179);final int varArgLength = args.length - methodParameterTypes.length + 1;

        __CLR4_5_2d6od6olvha7b4n.R.inc(17180);Object varArgsArray = Array.newInstance(ClassUtils.primitiveToWrapper(varArgComponentType), varArgLength);
        // Copy the variadic arguments into the varargs array.
        __CLR4_5_2d6od6olvha7b4n.R.inc(17181);System.arraycopy(args, methodParameterTypes.length - 1, varArgsArray, 0, varArgLength);

        __CLR4_5_2d6od6olvha7b4n.R.inc(17182);if((((varArgComponentType.isPrimitive())&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17183)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17184)==0&false))) {{
            // unbox from wrapper type to primitive type
            __CLR4_5_2d6od6olvha7b4n.R.inc(17185);varArgsArray = ArrayUtils.toPrimitive(varArgsArray);
        }

        // Store the varargs array in the last position of the array to return
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17186);newArgs[methodParameterTypes.length - 1] = varArgsArray;

        // Return the canonical varargs array.
        __CLR4_5_2d6od6olvha7b4n.R.inc(17187);return newArgs;
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Invokes a {@code static} method whose parameter types match exactly the object
     * types.</p>
     *
     * <p>This uses reflection to invoke the method obtained from a call to
     * {@link #getAccessibleMethod(Class, String, Class[])}.</p>
     *
     * @param cls invoke static method on this class
     * @param methodName get method with this name
     * @param args use these arguments - treat {@code null} as empty array
     * @return The value returned by the invoked method
     *
     * @throws NoSuchMethodException if there is no such accessible method
     * @throws InvocationTargetException wraps an exception thrown by the
     *  method invoked
     * @throws IllegalAccessException if the requested method is not accessible
     *  via reflection
     */
    public static Object invokeExactStaticMethod(final Class<?> cls, final String methodName,
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17188);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17189);args = ArrayUtils.nullToEmpty(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17190);final Class<?>[] parameterTypes = ClassUtils.toClass(args);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17191);return invokeExactStaticMethod(cls, methodName, args, parameterTypes);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Returns an accessible method (that is, one that can be invoked via
     * reflection) with given name and parameters. If no such method
     * can be found, return {@code null}.
     * This is just a convenience wrapper for
     * {@link #getAccessibleMethod(Method)}.</p>
     *
     * @param cls get method from this class
     * @param methodName get method with this name
     * @param parameterTypes with these parameters types
     * @return The accessible method
     */
    public static Method getAccessibleMethod(final Class<?> cls, final String methodName,
            final Class<?>... parameterTypes) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17192);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17193);try {
            __CLR4_5_2d6od6olvha7b4n.R.inc(17194);return getAccessibleMethod(cls.getMethod(methodName,
                    parameterTypes));
        } catch (final NoSuchMethodException e) {
            __CLR4_5_2d6od6olvha7b4n.R.inc(17195);return null;
        }
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Returns an accessible method (that is, one that can be invoked via
     * reflection) that implements the specified Method. If no such method
     * can be found, return {@code null}.</p>
     *
     * @param method The method that we wish to call
     * @return The accessible method
     */
    public static Method getAccessibleMethod(Method method) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17196);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17197);if ((((!MemberUtils.isAccessible(method))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17198)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17199)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17200);return null;
        }
        // If the declaring class is public, we are done
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17201);final Class<?> cls = method.getDeclaringClass();
        __CLR4_5_2d6od6olvha7b4n.R.inc(17202);if ((((Modifier.isPublic(cls.getModifiers()))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17203)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17204)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17205);return method;
        }
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17206);final String methodName = method.getName();
        __CLR4_5_2d6od6olvha7b4n.R.inc(17207);final Class<?>[] parameterTypes = method.getParameterTypes();

        // Check the implemented interfaces and subinterfaces
        __CLR4_5_2d6od6olvha7b4n.R.inc(17208);method = getAccessibleMethodFromInterfaceNest(cls, methodName,
                parameterTypes);

        // Check the superclass chain
        __CLR4_5_2d6od6olvha7b4n.R.inc(17209);if ((((method == null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17210)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17211)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17212);method = getAccessibleMethodFromSuperclass(cls, methodName,
                    parameterTypes);
        }
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17213);return method;
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Returns an accessible method (that is, one that can be invoked via
     * reflection) by scanning through the superclasses. If no such method
     * can be found, return {@code null}.</p>
     *
     * @param cls Class to be checked
     * @param methodName Method name of the method we wish to call
     * @param parameterTypes The parameter type signatures
     * @return the accessible method or {@code null} if not found
     */
    private static Method getAccessibleMethodFromSuperclass(final Class<?> cls,
            final String methodName, final Class<?>... parameterTypes) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17214);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17215);Class<?> parentClass = cls.getSuperclass();
        __CLR4_5_2d6od6olvha7b4n.R.inc(17216);while ((((parentClass != null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17217)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17218)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17219);if ((((Modifier.isPublic(parentClass.getModifiers()))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17220)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17221)==0&false))) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17222);try {
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17223);return parentClass.getMethod(methodName, parameterTypes);
                } catch (final NoSuchMethodException e) {
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17224);return null;
                }
            }
            }__CLR4_5_2d6od6olvha7b4n.R.inc(17225);parentClass = parentClass.getSuperclass();
        }
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17226);return null;
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Returns an accessible method (that is, one that can be invoked via
     * reflection) that implements the specified method, by scanning through
     * all implemented interfaces and subinterfaces. If no such method
     * can be found, return {@code null}.</p>
     *
     * <p>There isn't any good reason why this method must be {@code private}.
     * It is because there doesn't seem any reason why other classes should
     * call this rather than the higher level methods.</p>
     *
     * @param cls Parent class for the interfaces to be checked
     * @param methodName Method name of the method we wish to call
     * @param parameterTypes The parameter type signatures
     * @return the accessible method or {@code null} if not found
     */
    private static Method getAccessibleMethodFromInterfaceNest(Class<?> cls,
            final String methodName, final Class<?>... parameterTypes) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17227);
        // Search up the superclass chain
        __CLR4_5_2d6od6olvha7b4n.R.inc(17228);for (; (((cls != null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17229)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17230)==0&false)); cls = cls.getSuperclass()) {{

            // Check the implemented interfaces of the parent class
            __CLR4_5_2d6od6olvha7b4n.R.inc(17231);final Class<?>[] interfaces = cls.getInterfaces();
            __CLR4_5_2d6od6olvha7b4n.R.inc(17232);for (Class<?> anInterface : interfaces) {{
                // Is this interface public?
                __CLR4_5_2d6od6olvha7b4n.R.inc(17233);if ((((!Modifier.isPublic(anInterface.getModifiers()))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17234)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17235)==0&false))) {{
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17236);continue;
                }
                // Does the method exist on this interface?
                }__CLR4_5_2d6od6olvha7b4n.R.inc(17237);try {
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17238);return anInterface.getDeclaredMethod(methodName,
                            parameterTypes);
                } catch (final NoSuchMethodException e) { // NOPMD
                    /*
                     * Swallow, if no method is found after the loop then this
                     * method returns null.
                     */
                }
                // Recursively check our parent interfaces
                __CLR4_5_2d6od6olvha7b4n.R.inc(17239);final Method method = getAccessibleMethodFromInterfaceNest(anInterface,
                        methodName, parameterTypes);
                __CLR4_5_2d6od6olvha7b4n.R.inc(17240);if ((((method != null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17241)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17242)==0&false))) {{
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17243);return method;
                }
            }}
        }}
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17244);return null;
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Finds an accessible method that matches the given name and has compatible parameters.
     * Compatible parameters mean that every method parameter is assignable from 
     * the given parameters.
     * In other words, it finds a method with the given name 
     * that will take the parameters given.</p>
     *
     * <p>This method is used by 
     * {@link 
     * #invokeMethod(Object object, String methodName, Object[] args, Class[] parameterTypes)}.
     * </p>
     *
     * <p>This method can match primitive parameter by passing in wrapper classes.
     * For example, a {@code Boolean} will match a primitive {@code boolean}
     * parameter.
     * </p>
     *
     * @param cls find method in this class
     * @param methodName find method with this name
     * @param parameterTypes find method with most compatible parameters 
     * @return The accessible method
     */
    public static Method getMatchingAccessibleMethod(final Class<?> cls,
            final String methodName, final Class<?>... parameterTypes) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17245);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17246);try {
            __CLR4_5_2d6od6olvha7b4n.R.inc(17247);final Method method = cls.getMethod(methodName, parameterTypes);
            __CLR4_5_2d6od6olvha7b4n.R.inc(17248);MemberUtils.setAccessibleWorkaround(method);
            __CLR4_5_2d6od6olvha7b4n.R.inc(17249);return method;
        } catch (final NoSuchMethodException e) { // NOPMD - Swallow the exception
        }
        // search through all methods
        __CLR4_5_2d6od6olvha7b4n.R.inc(17250);Method bestMatch = null;
        __CLR4_5_2d6od6olvha7b4n.R.inc(17251);final Method[] methods = cls.getMethods();
        __CLR4_5_2d6od6olvha7b4n.R.inc(17252);for (final Method method : methods) {{
            // compare name and parameters
            __CLR4_5_2d6od6olvha7b4n.R.inc(17253);if ((((method.getName().equals(methodName) &&
                    MemberUtils.isMatchingMethod(method, parameterTypes))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17254)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17255)==0&false))) {{
                // get accessible version of method
                __CLR4_5_2d6od6olvha7b4n.R.inc(17256);final Method accessibleMethod = getAccessibleMethod(method);
                __CLR4_5_2d6od6olvha7b4n.R.inc(17257);if ((((accessibleMethod != null && (bestMatch == null || MemberUtils.compareMethodFit(
                            accessibleMethod,
                            bestMatch,
                            parameterTypes) < 0))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17258)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17259)==0&false))) {{
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17260);bestMatch = accessibleMethod;
                }
            }}
        }}
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17261);if ((((bestMatch != null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17262)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17263)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17264);MemberUtils.setAccessibleWorkaround(bestMatch);
        }

        }__CLR4_5_2d6od6olvha7b4n.R.inc(17265);if ((((bestMatch != null && bestMatch.isVarArgs() && bestMatch.getParameterTypes().length > 0 && parameterTypes.length > 0)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17266)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17267)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17268);final Class<?>[] methodParameterTypes = bestMatch.getParameterTypes();
            __CLR4_5_2d6od6olvha7b4n.R.inc(17269);final Class<?> methodParameterComponentType = methodParameterTypes[methodParameterTypes.length - 1].getComponentType();
            __CLR4_5_2d6od6olvha7b4n.R.inc(17270);final String methodParameterComponentTypeName = ClassUtils.primitiveToWrapper(methodParameterComponentType).getName();
            __CLR4_5_2d6od6olvha7b4n.R.inc(17271);final String parameterTypeName = parameterTypes[parameterTypes.length - 1].getName();
            __CLR4_5_2d6od6olvha7b4n.R.inc(17272);final String parameterTypeSuperClassName = parameterTypes[parameterTypes.length - 1].getSuperclass().getName();

            __CLR4_5_2d6od6olvha7b4n.R.inc(17273);if ((((!methodParameterComponentTypeName.equals(parameterTypeName)
                    && !methodParameterComponentTypeName.equals(parameterTypeSuperClassName))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17274)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17275)==0&false))) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17276);return null;
            }
        }}

        }__CLR4_5_2d6od6olvha7b4n.R.inc(17277);return bestMatch;
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}
    
    /**
     * <p>Retrieves a method whether or not it's accessible. If no such method
     * can be found, return {@code null}.</p>
     * @param cls The class that will be subjected to the method search
     * @param methodName The method that we wish to call
     * @param parameterTypes Argument class types
     * @return The method
     * 
     * @since 3.5
     */
    public static Method getMatchingMethod(final Class<?> cls, final String methodName,
            final Class<?>... parameterTypes) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17278);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17279);Validate.notNull(cls, "Null class not allowed.");
        __CLR4_5_2d6od6olvha7b4n.R.inc(17280);Validate.notEmpty(methodName, "Null or blank methodName not allowed.");

        // Address methods in superclasses
        __CLR4_5_2d6od6olvha7b4n.R.inc(17281);Method[] methodArray = cls.getDeclaredMethods();
        __CLR4_5_2d6od6olvha7b4n.R.inc(17282);final List<Class<?>> superclassList = ClassUtils.getAllSuperclasses(cls);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17283);for (final Class<?> klass : superclassList) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17284);methodArray = ArrayUtils.addAll(methodArray, klass.getDeclaredMethods());
        }

        }__CLR4_5_2d6od6olvha7b4n.R.inc(17285);Method inexactMatch = null;
        __CLR4_5_2d6od6olvha7b4n.R.inc(17286);for (final Method method : methodArray) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17287);if ((((methodName.equals(method.getName()) &&
                    Objects.deepEquals(parameterTypes, method.getParameterTypes()))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17288)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17289)==0&false))) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17290);return method;
            } }else {__CLR4_5_2d6od6olvha7b4n.R.inc(17291);if ((((methodName.equals(method.getName()) &&
                    ClassUtils.isAssignable(parameterTypes, method.getParameterTypes(), true))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17292)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17293)==0&false))) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17294);if ((((inexactMatch == null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17295)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17296)==0&false))) {{
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17297);inexactMatch = method;
                } }else {__CLR4_5_2d6od6olvha7b4n.R.inc(17298);if ((((distance(parameterTypes, method.getParameterTypes())
                        < distance(parameterTypes, inexactMatch.getParameterTypes()))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17299)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17300)==0&false))) {{
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17301);inexactMatch = method;
                }
            }}}

        }}}
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17302);return inexactMatch;
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}
    
    /**
     * <p>Returns the aggregate number of inheritance hops between assignable argument class types.  Returns -1
     * if the arguments aren't assignable.  Fills a specific purpose for getMatchingMethod and is not generalized.</p>
     * @param classArray
     * @param toClassArray
     * @return the aggregate number of inheritance hops between assignable argument class types.
     */
    private static int distance(final Class<?>[] classArray, final Class<?>[] toClassArray) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17303);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17304);int answer = 0;

        __CLR4_5_2d6od6olvha7b4n.R.inc(17305);if ((((!ClassUtils.isAssignable(classArray, toClassArray, true))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17306)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17307)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17308);return -1;
        }
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17309);for (int offset = 0; (((offset < classArray.length)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17310)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17311)==0&false)); offset++) {{
            // Note InheritanceUtils.distance() uses different scoring system.
            __CLR4_5_2d6od6olvha7b4n.R.inc(17312);if ((((classArray[offset].equals(toClassArray[offset]))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17313)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17314)==0&false))) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17315);continue;
            } }else {__CLR4_5_2d6od6olvha7b4n.R.inc(17316);if ((((ClassUtils.isAssignable(classArray[offset], toClassArray[offset], true)
                    && !ClassUtils.isAssignable(classArray[offset], toClassArray[offset], false))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17317)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17318)==0&false))) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17319);answer++;
            } }else {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17320);answer = answer + 2;
            }
        }}}

        }__CLR4_5_2d6od6olvha7b4n.R.inc(17321);return answer;
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * Get the hierarchy of overridden methods down to {@code result} respecting generics.
     * @param method lowest to consider
     * @param interfacesBehavior whether to search interfaces, {@code null} {@code implies} false
     * @return Set&lt;Method&gt; in ascending order from sub- to superclass
     * @throws NullPointerException if the specified method is {@code null}
     * @since 3.2
     */
    public static Set<Method> getOverrideHierarchy(final Method method, final Interfaces interfacesBehavior) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17322);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17323);Validate.notNull(method);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17324);final Set<Method> result = new LinkedHashSet<>();
        __CLR4_5_2d6od6olvha7b4n.R.inc(17325);result.add(method);

        __CLR4_5_2d6od6olvha7b4n.R.inc(17326);final Class<?>[] parameterTypes = method.getParameterTypes();

        __CLR4_5_2d6od6olvha7b4n.R.inc(17327);final Class<?> declaringClass = method.getDeclaringClass();

        __CLR4_5_2d6od6olvha7b4n.R.inc(17328);final Iterator<Class<?>> hierarchy = ClassUtils.hierarchy(declaringClass, interfacesBehavior).iterator();
        //skip the declaring class :P
        __CLR4_5_2d6od6olvha7b4n.R.inc(17329);hierarchy.next();
        __CLR4_5_2d6od6olvha7b4n.R.inc(17330);hierarchyTraversal: while ((((hierarchy.hasNext())&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17331)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17332)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17333);final Class<?> c = hierarchy.next();
            __CLR4_5_2d6od6olvha7b4n.R.inc(17334);final Method m = getMatchingAccessibleMethod(c, method.getName(), parameterTypes);
            __CLR4_5_2d6od6olvha7b4n.R.inc(17335);if ((((m == null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17336)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17337)==0&false))) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17338);continue;
            }
            }__CLR4_5_2d6od6olvha7b4n.R.inc(17339);if ((((Arrays.equals(m.getParameterTypes(), parameterTypes))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17340)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17341)==0&false))) {{
                // matches without generics
                __CLR4_5_2d6od6olvha7b4n.R.inc(17342);result.add(m);
                __CLR4_5_2d6od6olvha7b4n.R.inc(17343);continue;
            }
            // necessary to get arguments every time in the case that we are including interfaces
            }__CLR4_5_2d6od6olvha7b4n.R.inc(17344);final Map<TypeVariable<?>, Type> typeArguments = TypeUtils.getTypeArguments(declaringClass, m.getDeclaringClass());
            __CLR4_5_2d6od6olvha7b4n.R.inc(17345);for (int i = 0; (((i < parameterTypes.length)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17346)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17347)==0&false)); i++) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17348);final Type childType = TypeUtils.unrollVariables(typeArguments, method.getGenericParameterTypes()[i]);
                __CLR4_5_2d6od6olvha7b4n.R.inc(17349);final Type parentType = TypeUtils.unrollVariables(typeArguments, m.getGenericParameterTypes()[i]);
                __CLR4_5_2d6od6olvha7b4n.R.inc(17350);if ((((!TypeUtils.equals(childType, parentType))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17351)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17352)==0&false))) {{
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17353);continue hierarchyTraversal;
                }
            }}
            }__CLR4_5_2d6od6olvha7b4n.R.inc(17354);result.add(m);
        }
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17355);return result;
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * Gets all class level public methods of the given class that are annotated with the given annotation.
     * @param cls
     *            the {@link Class} to query
     * @param annotationCls
     *            the {@link java.lang.annotation.Annotation} that must be present on a method to be matched
     * @return an array of Methods (possibly empty).
     * @throws IllegalArgumentException
     *            if the class or annotation are {@code null}
     * @since 3.4
     */
    public static Method[] getMethodsWithAnnotation(final Class<?> cls, final Class<? extends Annotation> annotationCls) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17356);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17357);return getMethodsWithAnnotation(cls, annotationCls, false, false);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * Gets all class level public methods of the given class that are annotated with the given annotation.
     * @param cls
     *            the {@link Class} to query
     * @param annotationCls
     *            the {@link Annotation} that must be present on a method to be matched
     * @return a list of Methods (possibly empty).
     * @throws IllegalArgumentException
     *            if the class or annotation are {@code null}
     * @since 3.4
     */
    public static List<Method> getMethodsListWithAnnotation(final Class<?> cls, final Class<? extends Annotation> annotationCls) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17358);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17359);return getMethodsListWithAnnotation(cls, annotationCls, false, false);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * Gets all methods of the given class that are annotated with the given annotation.
     * @param cls
     *            the {@link Class} to query
     * @param annotationCls
     *            the {@link java.lang.annotation.Annotation} that must be present on a method to be matched
     * @param searchSupers
     *            determines if a lookup in the entire inheritance hierarchy of the given class should be performed
     * @param ignoreAccess
     *            determines if non public methods should be considered
     * @return an array of Methods (possibly empty).
     * @throws IllegalArgumentException
     *            if the class or annotation are {@code null}
     * @since 3.6
     */
    public static Method[] getMethodsWithAnnotation(final Class<?> cls, final Class<? extends Annotation> annotationCls,
                                                    boolean searchSupers, boolean ignoreAccess) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17360);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17361);final List<Method> annotatedMethodsList = getMethodsListWithAnnotation(cls, annotationCls, searchSupers,
                ignoreAccess);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17362);return annotatedMethodsList.toArray(new Method[annotatedMethodsList.size()]);
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * Gets all methods of the given class that are annotated with the given annotation.
     * @param cls
     *            the {@link Class} to query
     * @param annotationCls
     *            the {@link Annotation} that must be present on a method to be matched
     * @param searchSupers
     *            determines if a lookup in the entire inheritance hierarchy of the given class should be performed
     * @param ignoreAccess
     *            determines if non public methods should be considered
     * @return a list of Methods (possibly empty).
     * @throws IllegalArgumentException
     *            if the class or annotation are {@code null}
     * @since 3.6
     */
    public static List<Method> getMethodsListWithAnnotation(final Class<?> cls,
                                                            final Class<? extends Annotation> annotationCls,
                                                            boolean searchSupers, boolean ignoreAccess) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17363);

        __CLR4_5_2d6od6olvha7b4n.R.inc(17364);Validate.isTrue(cls != null, "The class must not be null");
        __CLR4_5_2d6od6olvha7b4n.R.inc(17365);Validate.isTrue(annotationCls != null, "The annotation class must not be null");
        __CLR4_5_2d6od6olvha7b4n.R.inc(17366);List<Class<?>> classes = ((((searchSupers )&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17367)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17368)==0&false))? getAllSuperclassesAndInterfaces(cls)
                : new ArrayList<Class<?>>());
        __CLR4_5_2d6od6olvha7b4n.R.inc(17369);classes.add(cls);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17370);final List<Method> annotatedMethods = new ArrayList<>();
        __CLR4_5_2d6od6olvha7b4n.R.inc(17371);for (Class<?> acls : classes) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17372);final Method[] methods = ((((ignoreAccess )&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17373)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17374)==0&false))? acls.getDeclaredMethods() : acls.getMethods());
            __CLR4_5_2d6od6olvha7b4n.R.inc(17375);for (final Method method : methods) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17376);if ((((method.getAnnotation(annotationCls) != null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17377)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17378)==0&false))) {{
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17379);annotatedMethods.add(method);
                }
            }}
        }}
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17380);return annotatedMethods;
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Gets the annotation object with the given annotation type that is present on the given method
     * or optionally on any equivalent method in super classes and interfaces. Returns null if the annotation
     * type was not present.</p>
     *
     * <p>Stops searching for an annotation once the first annotation of the specified type has been
     * found. Additional annotations of the specified type will be silently ignored.</p>
     * @param <A>
     *            the annotation type
     * @param method
     *            the {@link Method} to query
     * @param annotationCls
     *            the {@link Annotation} to check if is present on the method
     * @param searchSupers
     *            determines if a lookup in the entire inheritance hierarchy of the given class is performed
     *            if the annotation was not directly present
     * @param ignoreAccess
     *            determines if underlying method has to be accessible
     * @return the first matching annotation, or {@code null} if not found
     * @throws IllegalArgumentException
     *            if the method or annotation are {@code null}
     * @since 3.6
     */
    public static <A extends Annotation> A getAnnotation(final Method method, final Class<A> annotationCls,
                                                         boolean searchSupers, boolean ignoreAccess) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17381);

        __CLR4_5_2d6od6olvha7b4n.R.inc(17382);Validate.isTrue(method != null, "The method must not be null");
        __CLR4_5_2d6od6olvha7b4n.R.inc(17383);Validate.isTrue(annotationCls != null, "The annotation class must not be null");
        __CLR4_5_2d6od6olvha7b4n.R.inc(17384);if ((((!ignoreAccess && !MemberUtils.isAccessible(method))&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17385)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17386)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17387);return null;
        }

        }__CLR4_5_2d6od6olvha7b4n.R.inc(17388);A annotation = method.getAnnotation(annotationCls);

        __CLR4_5_2d6od6olvha7b4n.R.inc(17389);if ((((annotation == null && searchSupers)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17390)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17391)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17392);Class<?> mcls = method.getDeclaringClass();
            __CLR4_5_2d6od6olvha7b4n.R.inc(17393);List<Class<?>> classes = getAllSuperclassesAndInterfaces(mcls);
            __CLR4_5_2d6od6olvha7b4n.R.inc(17394);for (Class<?> acls : classes) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17395);Method equivalentMethod;
                __CLR4_5_2d6od6olvha7b4n.R.inc(17396);try {
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17397);equivalentMethod = ((((ignoreAccess )&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17398)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17399)==0&false))? acls.getDeclaredMethod(method.getName(), method.getParameterTypes())
                            : acls.getMethod(method.getName(), method.getParameterTypes()));
                } catch (NoSuchMethodException e) {
                    // if not found, just keep searching
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17400);continue;
                }
                __CLR4_5_2d6od6olvha7b4n.R.inc(17401);annotation = equivalentMethod.getAnnotation(annotationCls);
                __CLR4_5_2d6od6olvha7b4n.R.inc(17402);if ((((annotation != null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17403)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17404)==0&false))) {{
                    __CLR4_5_2d6od6olvha7b4n.R.inc(17405);break;
                }
            }}
        }}

        }__CLR4_5_2d6od6olvha7b4n.R.inc(17406);return annotation;
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}

    /**
     * <p>Gets a combination of {@link ClassUtils#getAllSuperclasses}(Class)} and
     * {@link ClassUtils#getAllInterfaces}(Class)}, one from superclasses, one
     * from interfaces, and so on in a breadth first way.</p>
     *
     * @param cls  the class to look up, may be {@code null}
     * @return the combined {@code List} of superclasses and interfaces in order
     * going up from this one
     *  {@code null} if null input
     */
    private static List<Class<?>> getAllSuperclassesAndInterfaces(final Class<?> cls) {try{__CLR4_5_2d6od6olvha7b4n.R.inc(17407);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17408);if ((((cls == null)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17409)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17410)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17411);return null;
        }

        }__CLR4_5_2d6od6olvha7b4n.R.inc(17412);final List<Class<?>> allSuperClassesAndInterfaces = new ArrayList<>();
        __CLR4_5_2d6od6olvha7b4n.R.inc(17413);List<Class<?>> allSuperclasses = ClassUtils.getAllSuperclasses(cls);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17414);int superClassIndex = 0;
        __CLR4_5_2d6od6olvha7b4n.R.inc(17415);List<Class<?>> allInterfaces = ClassUtils.getAllInterfaces(cls);
        __CLR4_5_2d6od6olvha7b4n.R.inc(17416);int interfaceIndex = 0;
        __CLR4_5_2d6od6olvha7b4n.R.inc(17417);while ((((interfaceIndex < allInterfaces.size() ||
                superClassIndex < allSuperclasses.size())&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17418)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17419)==0&false))) {{
            __CLR4_5_2d6od6olvha7b4n.R.inc(17420);Class<?> acls;
            __CLR4_5_2d6od6olvha7b4n.R.inc(17421);if ((((interfaceIndex >= allInterfaces.size())&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17422)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17423)==0&false))) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17424);acls = allSuperclasses.get(superClassIndex++);
            } }else {__CLR4_5_2d6od6olvha7b4n.R.inc(17425);if ((((superClassIndex >= allSuperclasses.size())&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17426)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17427)==0&false))) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17428);acls = allInterfaces.get(interfaceIndex++);
            } }else {__CLR4_5_2d6od6olvha7b4n.R.inc(17429);if ((((interfaceIndex < superClassIndex)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17430)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17431)==0&false))) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17432);acls = allInterfaces.get(interfaceIndex++);
            } }else {__CLR4_5_2d6od6olvha7b4n.R.inc(17433);if ((((superClassIndex < interfaceIndex)&&(__CLR4_5_2d6od6olvha7b4n.R.iget(17434)!=0|true))||(__CLR4_5_2d6od6olvha7b4n.R.iget(17435)==0&false))) {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17436);acls = allSuperclasses.get(superClassIndex++);
            } }else {{
                __CLR4_5_2d6od6olvha7b4n.R.inc(17437);acls = allInterfaces.get(interfaceIndex++);
            }
            }}}}__CLR4_5_2d6od6olvha7b4n.R.inc(17438);allSuperClassesAndInterfaces.add(acls);
        }
        }__CLR4_5_2d6od6olvha7b4n.R.inc(17439);return allSuperClassesAndInterfaces;
    }finally{__CLR4_5_2d6od6olvha7b4n.R.flushNeeded();}}
}
