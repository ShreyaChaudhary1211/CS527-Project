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

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * <p>Helper methods for working with {@link Annotation} instances.</p>
 *
 * <p>This class contains various utility methods that make working with
 * annotations simpler.</p>
 *
 * <p>{@link Annotation} instances are always proxy objects; unfortunately
 * dynamic proxies cannot be depended upon to know how to implement certain
 * methods in the same manner as would be done by "natural" {@link Annotation}s.
 * The methods presented in this class can be used to avoid that possibility. It
 * is of course also possible for dynamic proxies to actually delegate their
 * e.g. {@link Annotation#equals(Object)}/{@link Annotation#hashCode()}/
 * {@link Annotation#toString()} implementations to {@link AnnotationUtils}.</p>
 *
 * <p>#ThreadSafe#</p>
 *
 * @since 3.0
 */
public class AnnotationUtils {public static class __CLR4_5_200lvha77h6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,210,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A style that prints annotations as recommended.
     */
    private static final ToStringStyle TO_STRING_STYLE = new ToStringStyle() {
        /** Serialization version */
        private static final long serialVersionUID = 1L;

        {try{__CLR4_5_200lvha77h6.R.inc(0);
            __CLR4_5_200lvha77h6.R.inc(1);setDefaultFullDetail(true);
            __CLR4_5_200lvha77h6.R.inc(2);setArrayContentDetail(true);
            __CLR4_5_200lvha77h6.R.inc(3);setUseClassName(true);
            __CLR4_5_200lvha77h6.R.inc(4);setUseShortClassName(true);
            __CLR4_5_200lvha77h6.R.inc(5);setUseIdentityHashCode(false);
            __CLR4_5_200lvha77h6.R.inc(6);setContentStart("(");
            __CLR4_5_200lvha77h6.R.inc(7);setContentEnd(")");
            __CLR4_5_200lvha77h6.R.inc(8);setFieldSeparator(", ");
            __CLR4_5_200lvha77h6.R.inc(9);setArrayStart("[");
            __CLR4_5_200lvha77h6.R.inc(10);setArrayEnd("]");
        }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        protected String getShortClassName(final java.lang.Class<?> cls) {try{__CLR4_5_200lvha77h6.R.inc(11);
            __CLR4_5_200lvha77h6.R.inc(12);Class<? extends Annotation> annotationType = null;
            __CLR4_5_200lvha77h6.R.inc(13);for (final Class<?> iface : ClassUtils.getAllInterfaces(cls)) {{
                __CLR4_5_200lvha77h6.R.inc(14);if ((((Annotation.class.isAssignableFrom(iface))&&(__CLR4_5_200lvha77h6.R.iget(15)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(16)==0&false))) {{
                    __CLR4_5_200lvha77h6.R.inc(17);@SuppressWarnings("unchecked") // OK because we just checked the assignability
                    final
                    Class<? extends Annotation> found = (Class<? extends Annotation>) iface;
                    __CLR4_5_200lvha77h6.R.inc(18);annotationType = found;
                    __CLR4_5_200lvha77h6.R.inc(19);break;
                }
            }}
            }__CLR4_5_200lvha77h6.R.inc(20);return new StringBuilder((((annotationType == null )&&(__CLR4_5_200lvha77h6.R.iget(21)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(22)==0&false))? StringUtils.EMPTY : annotationType.getName())
                    .insert(0, '@').toString();
        }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        protected void appendDetail(final StringBuffer buffer, final String fieldName, Object value) {try{__CLR4_5_200lvha77h6.R.inc(23);
            __CLR4_5_200lvha77h6.R.inc(24);if ((((value instanceof Annotation)&&(__CLR4_5_200lvha77h6.R.iget(25)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(26)==0&false))) {{
                __CLR4_5_200lvha77h6.R.inc(27);value = AnnotationUtils.toString((Annotation) value);
            }
            }__CLR4_5_200lvha77h6.R.inc(28);super.appendDetail(buffer, fieldName, value);
        }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}

    };

    /**
     * <p>{@code AnnotationUtils} instances should NOT be constructed in
     * standard programming. Instead, the class should be used statically.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public AnnotationUtils() {try{__CLR4_5_200lvha77h6.R.inc(29);
    }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks if two annotations are equal using the criteria for equality
     * presented in the {@link Annotation#equals(Object)} API docs.</p>
     *
     * @param a1 the first Annotation to compare, {@code null} returns
     * {@code false} unless both are {@code null}
     * @param a2 the second Annotation to compare, {@code null} returns
     * {@code false} unless both are {@code null}
     * @return {@code true} if the two annotations are {@code equal} or both
     * {@code null}
     */
    public static boolean equals(final Annotation a1, final Annotation a2) {try{__CLR4_5_200lvha77h6.R.inc(30);
        __CLR4_5_200lvha77h6.R.inc(31);if ((((a1 == a2)&&(__CLR4_5_200lvha77h6.R.iget(32)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(33)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(34);return true;
        }
        }__CLR4_5_200lvha77h6.R.inc(35);if ((((a1 == null || a2 == null)&&(__CLR4_5_200lvha77h6.R.iget(36)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(37)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(38);return false;
        }
        }__CLR4_5_200lvha77h6.R.inc(39);final Class<? extends Annotation> type = a1.annotationType();
        __CLR4_5_200lvha77h6.R.inc(40);final Class<? extends Annotation> type2 = a2.annotationType();
        __CLR4_5_200lvha77h6.R.inc(41);Validate.notNull(type, "Annotation %s with null annotationType()", a1);
        __CLR4_5_200lvha77h6.R.inc(42);Validate.notNull(type2, "Annotation %s with null annotationType()", a2);
        __CLR4_5_200lvha77h6.R.inc(43);if ((((!type.equals(type2))&&(__CLR4_5_200lvha77h6.R.iget(44)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(45)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(46);return false;
        }
        }__CLR4_5_200lvha77h6.R.inc(47);try {
            __CLR4_5_200lvha77h6.R.inc(48);for (final Method m : type.getDeclaredMethods()) {{
                __CLR4_5_200lvha77h6.R.inc(49);if ((((m.getParameterTypes().length == 0
                        && isValidAnnotationMemberType(m.getReturnType()))&&(__CLR4_5_200lvha77h6.R.iget(50)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(51)==0&false))) {{
                    __CLR4_5_200lvha77h6.R.inc(52);final Object v1 = m.invoke(a1);
                    __CLR4_5_200lvha77h6.R.inc(53);final Object v2 = m.invoke(a2);
                    __CLR4_5_200lvha77h6.R.inc(54);if ((((!memberEquals(m.getReturnType(), v1, v2))&&(__CLR4_5_200lvha77h6.R.iget(55)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(56)==0&false))) {{
                        __CLR4_5_200lvha77h6.R.inc(57);return false;
                    }
                }}
            }}
        }} catch (final IllegalAccessException | InvocationTargetException ex) {
            __CLR4_5_200lvha77h6.R.inc(58);return false;
        }
        __CLR4_5_200lvha77h6.R.inc(59);return true;
    }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}

    /**
     * <p>Generate a hash code for the given annotation using the algorithm
     * presented in the {@link Annotation#hashCode()} API docs.</p>
     *
     * @param a the Annotation for a hash code calculation is desired, not
     * {@code null}
     * @return the calculated hash code
     * @throws RuntimeException if an {@code Exception} is encountered during
     * annotation member access
     * @throws IllegalStateException if an annotation method invocation returns
     * {@code null}
     */
    public static int hashCode(final Annotation a) {try{__CLR4_5_200lvha77h6.R.inc(60);
        __CLR4_5_200lvha77h6.R.inc(61);int result = 0;
        __CLR4_5_200lvha77h6.R.inc(62);final Class<? extends Annotation> type = a.annotationType();
        __CLR4_5_200lvha77h6.R.inc(63);for (final Method m : type.getDeclaredMethods()) {{
            __CLR4_5_200lvha77h6.R.inc(64);try {
                __CLR4_5_200lvha77h6.R.inc(65);final Object value = m.invoke(a);
                __CLR4_5_200lvha77h6.R.inc(66);if ((((value == null)&&(__CLR4_5_200lvha77h6.R.iget(67)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(68)==0&false))) {{
                    __CLR4_5_200lvha77h6.R.inc(69);throw new IllegalStateException(
                            String.format("Annotation method %s returned null", m));
                }
                }__CLR4_5_200lvha77h6.R.inc(70);result += hashMember(m.getName(), value);
            } catch (final RuntimeException ex) {
                __CLR4_5_200lvha77h6.R.inc(71);throw ex;
            } catch (final Exception ex) {
                __CLR4_5_200lvha77h6.R.inc(72);throw new RuntimeException(ex);
            }
        }
        }__CLR4_5_200lvha77h6.R.inc(73);return result;
    }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}

    /**
     * <p>Generate a string representation of an Annotation, as suggested by
     * {@link Annotation#toString()}.</p>
     *
     * @param a the annotation of which a string representation is desired
     * @return the standard string representation of an annotation, not
     * {@code null}
     */
    public static String toString(final Annotation a) {try{__CLR4_5_200lvha77h6.R.inc(74);
        __CLR4_5_200lvha77h6.R.inc(75);final ToStringBuilder builder = new ToStringBuilder(a, TO_STRING_STYLE);
        __CLR4_5_200lvha77h6.R.inc(76);for (final Method m : a.annotationType().getDeclaredMethods()) {{
            __CLR4_5_200lvha77h6.R.inc(77);if ((((m.getParameterTypes().length > 0)&&(__CLR4_5_200lvha77h6.R.iget(78)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(79)==0&false))) {{
                __CLR4_5_200lvha77h6.R.inc(80);continue; //wtf?
            }
            }__CLR4_5_200lvha77h6.R.inc(81);try {
                __CLR4_5_200lvha77h6.R.inc(82);builder.append(m.getName(), m.invoke(a));
            } catch (final RuntimeException ex) {
                __CLR4_5_200lvha77h6.R.inc(83);throw ex;
            } catch (final Exception ex) {
                __CLR4_5_200lvha77h6.R.inc(84);throw new RuntimeException(ex);
            }
        }
        }__CLR4_5_200lvha77h6.R.inc(85);return builder.build();
    }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}

    /**
     * <p>Checks if the specified type is permitted as an annotation member.</p>
     *
     * <p>The Java language specification only permits certain types to be used
     * in annotations. These include {@link String}, {@link Class}, primitive
     * types, {@link Annotation}, {@link Enum}, and single-dimensional arrays of
     * these types.</p>
     *
     * @param type the type to check, {@code null}
     * @return {@code true} if the type is a valid type to use in an annotation
     */
    public static boolean isValidAnnotationMemberType(Class<?> type) {try{__CLR4_5_200lvha77h6.R.inc(86);
        __CLR4_5_200lvha77h6.R.inc(87);if ((((type == null)&&(__CLR4_5_200lvha77h6.R.iget(88)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(89)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(90);return false;
        }
        }__CLR4_5_200lvha77h6.R.inc(91);if ((((type.isArray())&&(__CLR4_5_200lvha77h6.R.iget(92)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(93)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(94);type = type.getComponentType();
        }
        }__CLR4_5_200lvha77h6.R.inc(95);return type.isPrimitive() || type.isEnum() || type.isAnnotation()
                || String.class.equals(type) || Class.class.equals(type);
    }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}

    //besides modularity, this has the advantage of autoboxing primitives:
    /**
     * Helper method for generating a hash code for a member of an annotation.
     *
     * @param name the name of the member
     * @param value the value of the member
     * @return a hash code for this member
     */
    private static int hashMember(final String name, final Object value) {try{__CLR4_5_200lvha77h6.R.inc(96);
        __CLR4_5_200lvha77h6.R.inc(97);final int part1 = name.hashCode() * 127;
        __CLR4_5_200lvha77h6.R.inc(98);if ((((value.getClass().isArray())&&(__CLR4_5_200lvha77h6.R.iget(99)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(100)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(101);return part1 ^ arrayMemberHash(value.getClass().getComponentType(), value);
        }
        }__CLR4_5_200lvha77h6.R.inc(102);if ((((value instanceof Annotation)&&(__CLR4_5_200lvha77h6.R.iget(103)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(104)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(105);return part1 ^ hashCode((Annotation) value);
        }
        }__CLR4_5_200lvha77h6.R.inc(106);return part1 ^ value.hashCode();
    }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}

    /**
     * Helper method for checking whether two objects of the given type are
     * equal. This method is used to compare the parameters of two annotation
     * instances.
     *
     * @param type the type of the objects to be compared
     * @param o1 the first object
     * @param o2 the second object
     * @return a flag whether these objects are equal
     */
    private static boolean memberEquals(final Class<?> type, final Object o1, final Object o2) {try{__CLR4_5_200lvha77h6.R.inc(107);
        __CLR4_5_200lvha77h6.R.inc(108);if ((((o1 == o2)&&(__CLR4_5_200lvha77h6.R.iget(109)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(110)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(111);return true;
        }
        }__CLR4_5_200lvha77h6.R.inc(112);if ((((o1 == null || o2 == null)&&(__CLR4_5_200lvha77h6.R.iget(113)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(114)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(115);return false;
        }
        }__CLR4_5_200lvha77h6.R.inc(116);if ((((type.isArray())&&(__CLR4_5_200lvha77h6.R.iget(117)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(118)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(119);return arrayMemberEquals(type.getComponentType(), o1, o2);
        }
        }__CLR4_5_200lvha77h6.R.inc(120);if ((((type.isAnnotation())&&(__CLR4_5_200lvha77h6.R.iget(121)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(122)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(123);return equals((Annotation) o1, (Annotation) o2);
        }
        }__CLR4_5_200lvha77h6.R.inc(124);return o1.equals(o2);
    }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}

    /**
     * Helper method for comparing two objects of an array type.
     *
     * @param componentType the component type of the array
     * @param o1 the first object
     * @param o2 the second object
     * @return a flag whether these objects are equal
     */
    private static boolean arrayMemberEquals(final Class<?> componentType, final Object o1, final Object o2) {try{__CLR4_5_200lvha77h6.R.inc(125);
        __CLR4_5_200lvha77h6.R.inc(126);if ((((componentType.isAnnotation())&&(__CLR4_5_200lvha77h6.R.iget(127)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(128)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(129);return annotationArrayMemberEquals((Annotation[]) o1, (Annotation[]) o2);
        }
        }__CLR4_5_200lvha77h6.R.inc(130);if ((((componentType.equals(Byte.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(131)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(132)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(133);return Arrays.equals((byte[]) o1, (byte[]) o2);
        }
        }__CLR4_5_200lvha77h6.R.inc(134);if ((((componentType.equals(Short.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(135)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(136)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(137);return Arrays.equals((short[]) o1, (short[]) o2);
        }
        }__CLR4_5_200lvha77h6.R.inc(138);if ((((componentType.equals(Integer.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(139)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(140)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(141);return Arrays.equals((int[]) o1, (int[]) o2);
        }
        }__CLR4_5_200lvha77h6.R.inc(142);if ((((componentType.equals(Character.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(143)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(144)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(145);return Arrays.equals((char[]) o1, (char[]) o2);
        }
        }__CLR4_5_200lvha77h6.R.inc(146);if ((((componentType.equals(Long.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(147)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(148)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(149);return Arrays.equals((long[]) o1, (long[]) o2);
        }
        }__CLR4_5_200lvha77h6.R.inc(150);if ((((componentType.equals(Float.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(151)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(152)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(153);return Arrays.equals((float[]) o1, (float[]) o2);
        }
        }__CLR4_5_200lvha77h6.R.inc(154);if ((((componentType.equals(Double.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(155)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(156)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(157);return Arrays.equals((double[]) o1, (double[]) o2);
        }
        }__CLR4_5_200lvha77h6.R.inc(158);if ((((componentType.equals(Boolean.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(159)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(160)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(161);return Arrays.equals((boolean[]) o1, (boolean[]) o2);
        }
        }__CLR4_5_200lvha77h6.R.inc(162);return Arrays.equals((Object[]) o1, (Object[]) o2);
    }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}

    /**
     * Helper method for comparing two arrays of annotations.
     *
     * @param a1 the first array
     * @param a2 the second array
     * @return a flag whether these arrays are equal
     */
    private static boolean annotationArrayMemberEquals(final Annotation[] a1, final Annotation[] a2) {try{__CLR4_5_200lvha77h6.R.inc(163);
        __CLR4_5_200lvha77h6.R.inc(164);if ((((a1.length != a2.length)&&(__CLR4_5_200lvha77h6.R.iget(165)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(166)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(167);return false;
        }
        }__CLR4_5_200lvha77h6.R.inc(168);for (int i = 0; (((i < a1.length)&&(__CLR4_5_200lvha77h6.R.iget(169)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(170)==0&false)); i++) {{
            __CLR4_5_200lvha77h6.R.inc(171);if ((((!equals(a1[i], a2[i]))&&(__CLR4_5_200lvha77h6.R.iget(172)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(173)==0&false))) {{
                __CLR4_5_200lvha77h6.R.inc(174);return false;
            }
        }}
        }__CLR4_5_200lvha77h6.R.inc(175);return true;
    }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}

    /**
     * Helper method for generating a hash code for an array.
     *
     * @param componentType the component type of the array
     * @param o the array
     * @return a hash code for the specified array
     */
    private static int arrayMemberHash(final Class<?> componentType, final Object o) {try{__CLR4_5_200lvha77h6.R.inc(176);
        __CLR4_5_200lvha77h6.R.inc(177);if ((((componentType.equals(Byte.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(178)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(179)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(180);return Arrays.hashCode((byte[]) o);
        }
        }__CLR4_5_200lvha77h6.R.inc(181);if ((((componentType.equals(Short.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(182)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(183)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(184);return Arrays.hashCode((short[]) o);
        }
        }__CLR4_5_200lvha77h6.R.inc(185);if ((((componentType.equals(Integer.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(186)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(187)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(188);return Arrays.hashCode((int[]) o);
        }
        }__CLR4_5_200lvha77h6.R.inc(189);if ((((componentType.equals(Character.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(190)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(191)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(192);return Arrays.hashCode((char[]) o);
        }
        }__CLR4_5_200lvha77h6.R.inc(193);if ((((componentType.equals(Long.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(194)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(195)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(196);return Arrays.hashCode((long[]) o);
        }
        }__CLR4_5_200lvha77h6.R.inc(197);if ((((componentType.equals(Float.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(198)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(199)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(200);return Arrays.hashCode((float[]) o);
        }
        }__CLR4_5_200lvha77h6.R.inc(201);if ((((componentType.equals(Double.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(202)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(203)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(204);return Arrays.hashCode((double[]) o);
        }
        }__CLR4_5_200lvha77h6.R.inc(205);if ((((componentType.equals(Boolean.TYPE))&&(__CLR4_5_200lvha77h6.R.iget(206)!=0|true))||(__CLR4_5_200lvha77h6.R.iget(207)==0&false))) {{
            __CLR4_5_200lvha77h6.R.inc(208);return Arrays.hashCode((boolean[]) o);
        }
        }__CLR4_5_200lvha77h6.R.inc(209);return Arrays.hashCode((Object[]) o);
    }finally{__CLR4_5_200lvha77h6.R.flushNeeded();}}
}
