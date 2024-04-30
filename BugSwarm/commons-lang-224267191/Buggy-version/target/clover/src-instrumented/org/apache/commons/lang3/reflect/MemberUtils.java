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

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.apache.commons.lang3.ClassUtils;

/**
 * Contains common code for working with {@link java.lang.reflect.Method Methods}/{@link java.lang.reflect.Constructor Constructors},
 * extracted and refactored from {@link MethodUtils} when it was imported from Commons BeanUtils.
 *
 * @since 2.5
 */
abstract class MemberUtils {public static class __CLR4_5_2d2kd2klvha7b3p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,17088,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // TODO extract an interface to implement compareParameterSets(...)?

    private static final int ACCESS_TEST = Modifier.PUBLIC | Modifier.PROTECTED | Modifier.PRIVATE;

    /** Array of primitive number types ordered by "promotability" */
    private static final Class<?>[] ORDERED_PRIMITIVE_TYPES = { Byte.TYPE, Short.TYPE,
            Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE };

    /**
     * XXX Default access superclass workaround.
     *
     * When a {@code public} class has a default access superclass with {@code public} members,
     * these members are accessible. Calling them from compiled code works fine.
     * Unfortunately, on some JVMs, using reflection to invoke these members
     * seems to (wrongly) prevent access even when the modifier is {@code public}.
     * Calling {@code setAccessible(true)} solves the problem but will only work from
     * sufficiently privileged code. Better workarounds would be gratefully
     * accepted.
     * @param o the AccessibleObject to set as accessible
     * @return a boolean indicating whether the accessibility of the object was set to true.
     */
    static boolean setAccessibleWorkaround(final AccessibleObject o) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(16940);
        __CLR4_5_2d2kd2klvha7b3p.R.inc(16941);if ((((o == null || o.isAccessible())&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(16942)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(16943)==0&false))) {{
            __CLR4_5_2d2kd2klvha7b3p.R.inc(16944);return false;
        }
        }__CLR4_5_2d2kd2klvha7b3p.R.inc(16945);final Member m = (Member) o;
        __CLR4_5_2d2kd2klvha7b3p.R.inc(16946);if ((((!o.isAccessible() && Modifier.isPublic(m.getModifiers()) && isPackageAccess(m.getDeclaringClass().getModifiers()))&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(16947)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(16948)==0&false))) {{
            __CLR4_5_2d2kd2klvha7b3p.R.inc(16949);try {
                __CLR4_5_2d2kd2klvha7b3p.R.inc(16950);o.setAccessible(true);
                __CLR4_5_2d2kd2klvha7b3p.R.inc(16951);return true;
            } catch (final SecurityException e) { // NOPMD
                // ignore in favor of subsequent IllegalAccessException
            }
        }
        }__CLR4_5_2d2kd2klvha7b3p.R.inc(16952);return false;
    }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

    /**
     * Returns whether a given set of modifiers implies package access.
     * @param modifiers to test
     * @return {@code true} unless {@code package}/{@code protected}/{@code private} modifier detected
     */
    static boolean isPackageAccess(final int modifiers) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(16953);
        __CLR4_5_2d2kd2klvha7b3p.R.inc(16954);return (modifiers & ACCESS_TEST) == 0;
    }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

    /**
     * Returns whether a {@link Member} is accessible.
     * @param m Member to check
     * @return {@code true} if <code>m</code> is accessible
     */
    static boolean isAccessible(final Member m) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(16955);
        __CLR4_5_2d2kd2klvha7b3p.R.inc(16956);return m != null && Modifier.isPublic(m.getModifiers()) && !m.isSynthetic();
    }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

    /**
     * Compares the relative fitness of two Constructors in terms of how well they
     * match a set of runtime parameter types, such that a list ordered
     * by the results of the comparison would return the best match first
     * (least).
     *
     * @param left the "left" Constructor
     * @param right the "right" Constructor
     * @param actual the runtime parameter types to match against
     * {@code left}/{@code right}
     * @return int consistent with {@code compare} semantics
     * @since 3.5
     */
    static int compareConstructorFit(final Constructor<?> left, final Constructor<?> right, final Class<?>[] actual) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(16957);
      __CLR4_5_2d2kd2klvha7b3p.R.inc(16958);return compareParameterTypes(Executable.of(left), Executable.of(right), actual);
    }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

    /**
     * Compares the relative fitness of two Methods in terms of how well they
     * match a set of runtime parameter types, such that a list ordered
     * by the results of the comparison would return the best match first
     * (least).
     *
     * @param left the "left" Method
     * @param right the "right" Method
     * @param actual the runtime parameter types to match against
     * {@code left}/{@code right}
     * @return int consistent with {@code compare} semantics
     * @since 3.5
     */
    static int compareMethodFit(final Method left, final Method right, final Class<?>[] actual) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(16959);
      __CLR4_5_2d2kd2klvha7b3p.R.inc(16960);return compareParameterTypes(Executable.of(left), Executable.of(right), actual);
    }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

    /**
     * Compares the relative fitness of two Executables in terms of how well they
     * match a set of runtime parameter types, such that a list ordered
     * by the results of the comparison would return the best match first
     * (least).
     *
     * @param left the "left" Executable
     * @param right the "right" Executable
     * @param actual the runtime parameter types to match against
     * {@code left}/{@code right}
     * @return int consistent with {@code compare} semantics
     */
    private static int compareParameterTypes(final Executable left, final Executable right, final Class<?>[] actual) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(16961);
        __CLR4_5_2d2kd2klvha7b3p.R.inc(16962);final float leftCost = getTotalTransformationCost(actual, left);
        __CLR4_5_2d2kd2klvha7b3p.R.inc(16963);final float rightCost = getTotalTransformationCost(actual, right);
        __CLR4_5_2d2kd2klvha7b3p.R.inc(16964);return (((leftCost < rightCost )&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(16965)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(16966)==0&false))? -1 : (((rightCost < leftCost )&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(16967)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(16968)==0&false))? 1 : 0;
    }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

    /**
     * Returns the sum of the object transformation cost for each class in the
     * source argument list.
     * @param srcArgs The source arguments
     * @param executable The executable to calculate transformation costs for
     * @return The total transformation cost
     */
    private static float getTotalTransformationCost(final Class<?>[] srcArgs, final Executable executable) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(16969);
        __CLR4_5_2d2kd2klvha7b3p.R.inc(16970);final Class<?>[] destArgs = executable.getParameterTypes();
        __CLR4_5_2d2kd2klvha7b3p.R.inc(16971);final boolean isVarArgs = executable.isVarArgs();

        // "source" and "destination" are the actual and declared args respectively.
        __CLR4_5_2d2kd2klvha7b3p.R.inc(16972);float totalCost = 0.0f;
        __CLR4_5_2d2kd2klvha7b3p.R.inc(16973);final long normalArgsLen = (((isVarArgs )&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(16974)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(16975)==0&false))? destArgs.length-1 : destArgs.length;
        __CLR4_5_2d2kd2klvha7b3p.R.inc(16976);if ((((srcArgs.length < normalArgsLen)&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(16977)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(16978)==0&false))) {{
            __CLR4_5_2d2kd2klvha7b3p.R.inc(16979);return Float.MAX_VALUE;
        }
        }__CLR4_5_2d2kd2klvha7b3p.R.inc(16980);for (int i = 0; (((i < normalArgsLen)&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(16981)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(16982)==0&false)); i++) {{
            __CLR4_5_2d2kd2klvha7b3p.R.inc(16983);totalCost += getObjectTransformationCost(srcArgs[i], destArgs[i]);
        }
        }__CLR4_5_2d2kd2klvha7b3p.R.inc(16984);if ((((isVarArgs)&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(16985)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(16986)==0&false))) {{
            // When isVarArgs is true, srcArgs and dstArgs may differ in length.
            // There are two special cases to consider:
            __CLR4_5_2d2kd2klvha7b3p.R.inc(16987);final boolean noVarArgsPassed = srcArgs.length < destArgs.length;
            __CLR4_5_2d2kd2klvha7b3p.R.inc(16988);final boolean explicitArrayForVarags = srcArgs.length == destArgs.length && srcArgs[srcArgs.length-1].isArray();

            __CLR4_5_2d2kd2klvha7b3p.R.inc(16989);final float varArgsCost = 0.001f;
            __CLR4_5_2d2kd2klvha7b3p.R.inc(16990);final Class<?> destClass = destArgs[destArgs.length-1].getComponentType();
            __CLR4_5_2d2kd2klvha7b3p.R.inc(16991);if ((((noVarArgsPassed)&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(16992)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(16993)==0&false))) {{
                // When no varargs passed, the best match is the most generic matching type, not the most specific.
                __CLR4_5_2d2kd2klvha7b3p.R.inc(16994);totalCost += getObjectTransformationCost(destClass, Object.class) + varArgsCost;
            }
            }else {__CLR4_5_2d2kd2klvha7b3p.R.inc(16995);if ((((explicitArrayForVarags)&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(16996)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(16997)==0&false))) {{
                __CLR4_5_2d2kd2klvha7b3p.R.inc(16998);final Class<?> sourceClass = srcArgs[srcArgs.length-1].getComponentType();
                __CLR4_5_2d2kd2klvha7b3p.R.inc(16999);totalCost += getObjectTransformationCost(sourceClass, destClass) + varArgsCost;
            }
            }else {{
                // This is typical varargs case.
                __CLR4_5_2d2kd2klvha7b3p.R.inc(17000);for (int i = destArgs.length-1; (((i < srcArgs.length)&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17001)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17002)==0&false)); i++) {{
                    __CLR4_5_2d2kd2klvha7b3p.R.inc(17003);final Class<?> srcClass = srcArgs[i];
                    __CLR4_5_2d2kd2klvha7b3p.R.inc(17004);totalCost += getObjectTransformationCost(srcClass, destClass) + varArgsCost;
                }
            }}
        }}}
        }__CLR4_5_2d2kd2klvha7b3p.R.inc(17005);return totalCost;
    }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

    /**
     * Gets the number of steps required needed to turn the source class into
     * the destination class. This represents the number of steps in the object
     * hierarchy graph.
     * @param srcClass The source class
     * @param destClass The destination class
     * @return The cost of transforming an object
     */
    private static float getObjectTransformationCost(Class<?> srcClass, final Class<?> destClass) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(17006);
        __CLR4_5_2d2kd2klvha7b3p.R.inc(17007);if ((((destClass.isPrimitive())&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17008)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17009)==0&false))) {{
            __CLR4_5_2d2kd2klvha7b3p.R.inc(17010);return getPrimitivePromotionCost(srcClass, destClass);
        }
        }__CLR4_5_2d2kd2klvha7b3p.R.inc(17011);float cost = 0.0f;
        __CLR4_5_2d2kd2klvha7b3p.R.inc(17012);while ((((srcClass != null && !destClass.equals(srcClass))&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17013)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17014)==0&false))) {{
            __CLR4_5_2d2kd2klvha7b3p.R.inc(17015);if ((((destClass.isInterface() && ClassUtils.isAssignable(srcClass, destClass))&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17016)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17017)==0&false))) {{
                // slight penalty for interface match.
                // we still want an exact match to override an interface match,
                // but
                // an interface match should override anything where we have to
                // get a superclass.
                __CLR4_5_2d2kd2klvha7b3p.R.inc(17018);cost += 0.25f;
                __CLR4_5_2d2kd2klvha7b3p.R.inc(17019);break;
            }
            }__CLR4_5_2d2kd2klvha7b3p.R.inc(17020);cost++;
            __CLR4_5_2d2kd2klvha7b3p.R.inc(17021);srcClass = srcClass.getSuperclass();
        }
        /*
         * If the destination class is null, we've traveled all the way up to
         * an Object match. We'll penalize this by adding 1.5 to the cost.
         */
        }__CLR4_5_2d2kd2klvha7b3p.R.inc(17022);if ((((srcClass == null)&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17023)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17024)==0&false))) {{
            __CLR4_5_2d2kd2klvha7b3p.R.inc(17025);cost += 1.5f;
        }
        }__CLR4_5_2d2kd2klvha7b3p.R.inc(17026);return cost;
    }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

    /**
     * Gets the number of steps required to promote a primitive number to another
     * type.
     * @param srcClass the (primitive) source class
     * @param destClass the (primitive) destination class
     * @return The cost of promoting the primitive
     */
    private static float getPrimitivePromotionCost(final Class<?> srcClass, final Class<?> destClass) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(17027);
        __CLR4_5_2d2kd2klvha7b3p.R.inc(17028);float cost = 0.0f;
        __CLR4_5_2d2kd2klvha7b3p.R.inc(17029);Class<?> cls = srcClass;
        __CLR4_5_2d2kd2klvha7b3p.R.inc(17030);if ((((!cls.isPrimitive())&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17031)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17032)==0&false))) {{
            // slight unwrapping penalty
            __CLR4_5_2d2kd2klvha7b3p.R.inc(17033);cost += 0.1f;
            __CLR4_5_2d2kd2klvha7b3p.R.inc(17034);cls = ClassUtils.wrapperToPrimitive(cls);
        }
        }__CLR4_5_2d2kd2klvha7b3p.R.inc(17035);for (int i = 0; (((cls != destClass && i < ORDERED_PRIMITIVE_TYPES.length)&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17036)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17037)==0&false)); i++) {{
            __CLR4_5_2d2kd2klvha7b3p.R.inc(17038);if ((((cls == ORDERED_PRIMITIVE_TYPES[i])&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17039)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17040)==0&false))) {{
                __CLR4_5_2d2kd2klvha7b3p.R.inc(17041);cost += 0.1f;
                __CLR4_5_2d2kd2klvha7b3p.R.inc(17042);if ((((i < ORDERED_PRIMITIVE_TYPES.length - 1)&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17043)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17044)==0&false))) {{
                    __CLR4_5_2d2kd2klvha7b3p.R.inc(17045);cls = ORDERED_PRIMITIVE_TYPES[i + 1];
                }
            }}
        }}
        }__CLR4_5_2d2kd2klvha7b3p.R.inc(17046);return cost;
    }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

    static boolean isMatchingMethod(final Method method, final Class<?>[] parameterTypes) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(17047);
      __CLR4_5_2d2kd2klvha7b3p.R.inc(17048);return MemberUtils.isMatchingExecutable(Executable.of(method), parameterTypes);
    }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

    static boolean isMatchingConstructor(final Constructor<?> method, final Class<?>[] parameterTypes) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(17049);
      __CLR4_5_2d2kd2klvha7b3p.R.inc(17050);return MemberUtils.isMatchingExecutable(Executable.of(method), parameterTypes);
    }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

    private static boolean isMatchingExecutable(final Executable method, final Class<?>[] parameterTypes) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(17051);
        __CLR4_5_2d2kd2klvha7b3p.R.inc(17052);final Class<?>[] methodParameterTypes = method.getParameterTypes();
        __CLR4_5_2d2kd2klvha7b3p.R.inc(17053);if ((((method.isVarArgs())&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17054)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17055)==0&false))) {{
            __CLR4_5_2d2kd2klvha7b3p.R.inc(17056);int i;
            __CLR4_5_2d2kd2klvha7b3p.R.inc(17057);for (i = 0; (((i < methodParameterTypes.length - 1 && i < parameterTypes.length)&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17058)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17059)==0&false)); i++) {{
                __CLR4_5_2d2kd2klvha7b3p.R.inc(17060);if ((((!ClassUtils.isAssignable(parameterTypes[i], methodParameterTypes[i], true))&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17061)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17062)==0&false))) {{
                    __CLR4_5_2d2kd2klvha7b3p.R.inc(17063);return false;
                }
            }}
            }__CLR4_5_2d2kd2klvha7b3p.R.inc(17064);final Class<?> varArgParameterType = methodParameterTypes[methodParameterTypes.length - 1].getComponentType();
            __CLR4_5_2d2kd2klvha7b3p.R.inc(17065);for (; (((i < parameterTypes.length)&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17066)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17067)==0&false)); i++) {{
                __CLR4_5_2d2kd2klvha7b3p.R.inc(17068);if ((((!ClassUtils.isAssignable(parameterTypes[i], varArgParameterType, true))&&(__CLR4_5_2d2kd2klvha7b3p.R.iget(17069)!=0|true))||(__CLR4_5_2d2kd2klvha7b3p.R.iget(17070)==0&false))) {{
                    __CLR4_5_2d2kd2klvha7b3p.R.inc(17071);return false;
                }
            }}
            }__CLR4_5_2d2kd2klvha7b3p.R.inc(17072);return true;
        }
        }__CLR4_5_2d2kd2klvha7b3p.R.inc(17073);return ClassUtils.isAssignable(parameterTypes, methodParameterTypes, true);
    }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

    /**
     * <p> A class providing a subset of the API of java.lang.reflect.Executable in Java 1.8,
     * providing a common representation for function signatures for Constructors and Methods.</p>
     */
    private static final class Executable {
      private final Class<?>[] parameterTypes;
      private final boolean  isVarArgs;

      private static Executable of(final Method method) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(17074); __CLR4_5_2d2kd2klvha7b3p.R.inc(17075);return new Executable(method); }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}
      private static Executable of(final Constructor<?> constructor) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(17076); __CLR4_5_2d2kd2klvha7b3p.R.inc(17077);return new Executable(constructor); }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

      private Executable(final Method method) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(17078);
        __CLR4_5_2d2kd2klvha7b3p.R.inc(17079);parameterTypes = method.getParameterTypes();
        __CLR4_5_2d2kd2klvha7b3p.R.inc(17080);isVarArgs = method.isVarArgs();
      }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

      private Executable(final Constructor<?> constructor) {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(17081);
        __CLR4_5_2d2kd2klvha7b3p.R.inc(17082);parameterTypes = constructor.getParameterTypes();
        __CLR4_5_2d2kd2klvha7b3p.R.inc(17083);isVarArgs = constructor.isVarArgs();
      }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

      public Class<?>[] getParameterTypes() {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(17084); __CLR4_5_2d2kd2klvha7b3p.R.inc(17085);return parameterTypes; }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}

      public boolean isVarArgs() {try{__CLR4_5_2d2kd2klvha7b3p.R.inc(17086); __CLR4_5_2d2kd2klvha7b3p.R.inc(17087);return isVarArgs; }finally{__CLR4_5_2d2kd2klvha7b3p.R.flushNeeded();}}
    }

}
