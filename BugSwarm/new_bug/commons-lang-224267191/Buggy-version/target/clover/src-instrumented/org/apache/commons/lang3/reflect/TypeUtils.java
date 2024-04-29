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

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.Builder;

/**
 * <p> Utility methods focusing on type inspection, particularly with regard to
 * generics. </p>
 *
 * @since 3.0
 */
public class TypeUtils {public static class __CLR4_5_2dh0dh0lvha7bdw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,18324,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * {@link WildcardType} builder.
     * @since 3.2
     */
    public static class WildcardTypeBuilder implements Builder<WildcardType> {
        /**
         * Constructor
         */
        private WildcardTypeBuilder() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17460);
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}
        
        private Type[] upperBounds;
        private Type[] lowerBounds;

        /**
         * Specify upper bounds of the wildcard type to build.
         * @param bounds to set
         * @return {@code this}
         */
        public WildcardTypeBuilder withUpperBounds(final Type... bounds) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17461);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17462);this.upperBounds = bounds;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17463);return this;
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * Specify lower bounds of the wildcard type to build.
         * @param bounds to set
         * @return {@code this}
         */
        public WildcardTypeBuilder withLowerBounds(final Type... bounds) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17464);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17465);this.lowerBounds = bounds;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17466);return this;
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public WildcardType build() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17467);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17468);return new WildcardTypeImpl(upperBounds, lowerBounds);
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}
    }

    /**
     * GenericArrayType implementation class.
     * @since 3.2 
     */
    private static final class GenericArrayTypeImpl implements GenericArrayType {
        private final Type componentType;

        /**
         * Constructor
         * @param componentType of this array type
         */
        private GenericArrayTypeImpl(final Type componentType) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17469);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17470);this.componentType = componentType;
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public Type getGenericComponentType() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17471);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17472);return componentType;
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17473);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17474);return TypeUtils.toString(this);
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(final Object obj) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17475);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17476);return obj == this || obj instanceof GenericArrayType && TypeUtils.equals(this, (GenericArrayType) obj);
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17477);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17478);int result = 67 << 4;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17479);result |= componentType.hashCode();
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17480);return result;
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}
    }

    /**
     * ParameterizedType implementation class.
     * @since 3.2 
     */
    private static final class ParameterizedTypeImpl implements ParameterizedType {
        private final Class<?> raw;
        private final Type useOwner;
        private final Type[] typeArguments;

        /**
         * Constructor
         * @param raw type
         * @param useOwner owner type to use, if any
         * @param typeArguments formal type arguments
         */
        private ParameterizedTypeImpl(final Class<?> raw, final Type useOwner, final Type[] typeArguments) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17481);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17482);this.raw = raw;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17483);this.useOwner = useOwner;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17484);this.typeArguments = typeArguments.clone();
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public Type getRawType() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17485);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17486);return raw;
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public Type getOwnerType() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17487);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17488);return useOwner;
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public Type[] getActualTypeArguments() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17489);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17490);return typeArguments.clone();
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17491);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17492);return TypeUtils.toString(this);
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(final Object obj) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17493);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17494);return obj == this || obj instanceof ParameterizedType && TypeUtils.equals(this, ((ParameterizedType) obj));
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17495);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17496);int result = 71 << 4;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17497);result |= raw.hashCode();
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17498);result <<= 4;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17499);result |= Objects.hashCode(useOwner);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17500);result <<= 8;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17501);result |= Arrays.hashCode(typeArguments);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17502);return result;
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}
    }

    /**
     * WildcardType implementation class.
     * @since 3.2 
     */
    private static final class WildcardTypeImpl implements WildcardType {
        private static final Type[] EMPTY_BOUNDS = new Type[0];

        private final Type[] upperBounds;
        private final Type[] lowerBounds;

        /**
         * Constructor
         * @param upperBounds of this type
         * @param lowerBounds of this type
         */
        private WildcardTypeImpl(final Type[] upperBounds, final Type[] lowerBounds) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17503);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17504);this.upperBounds = ObjectUtils.defaultIfNull(upperBounds, EMPTY_BOUNDS);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17505);this.lowerBounds = ObjectUtils.defaultIfNull(lowerBounds, EMPTY_BOUNDS);
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public Type[] getUpperBounds() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17506);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17507);return upperBounds.clone();
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public Type[] getLowerBounds() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17508);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17509);return lowerBounds.clone();
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17510);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17511);return TypeUtils.toString(this);
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(final Object obj) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17512);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17513);return obj == this || obj instanceof WildcardType && TypeUtils.equals(this, (WildcardType) obj);
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17514);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17515);int result = 73 << 8;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17516);result |= Arrays.hashCode(upperBounds);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17517);result <<= 8;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17518);result |= Arrays.hashCode(lowerBounds);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17519);return result;
        }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}
    }

    /**
     * A wildcard instance matching {@code ?}.
     * @since 3.2
     */
    public static final WildcardType WILDCARD_ALL = wildcardType().withUpperBounds(Object.class).build();

    /**
     * <p>{@code TypeUtils} instances should NOT be constructed in standard
     * programming. Instead, the class should be used as
     * {@code TypeUtils.isAssignable(cls, toClass)}.</p> <p>This
     * constructor is public to permit tools that require a JavaBean instance to
     * operate.</p>
     */
    public TypeUtils() {
        super();__CLR4_5_2dh0dh0lvha7bdw.R.inc(17521);try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17520);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Checks if the subject type may be implicitly cast to the target type
     * following the Java generics rules. If both types are {@link Class}
     * objects, the method returns the result of
     * {@link ClassUtils#isAssignable(Class, Class)}.</p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toType the target type
     * @return {@code true} if {@code type} is assignable to {@code toType}.
     */
    public static boolean isAssignable(final Type type, final Type toType) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17522);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17523);return isAssignable(type, toType, null);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Checks if the subject type may be implicitly cast to the target type
     * following the Java generics rules.</p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toType the target type
     * @param typeVarAssigns optional map of type variable assignments
     * @return {@code true} if {@code type} is assignable to {@code toType}.
     */
    private static boolean isAssignable(final Type type, final Type toType,
            final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17524);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17525);if ((((toType == null || toType instanceof Class<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17526)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17527)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17528);return isAssignable(type, (Class<?>) toType);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17529);if ((((toType instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17530)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17531)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17532);return isAssignable(type, (ParameterizedType) toType, typeVarAssigns);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17533);if ((((toType instanceof GenericArrayType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17534)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17535)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17536);return isAssignable(type, (GenericArrayType) toType, typeVarAssigns);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17537);if ((((toType instanceof WildcardType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17538)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17539)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17540);return isAssignable(type, (WildcardType) toType, typeVarAssigns);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17541);if ((((toType instanceof TypeVariable<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17542)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17543)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17544);return isAssignable(type, (TypeVariable<?>) toType, typeVarAssigns);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17545);throw new IllegalStateException("found an unhandled type: " + toType);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Checks if the subject type may be implicitly cast to the target class
     * following the Java generics rules.</p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toClass the target class
     * @return {@code true} if {@code type} is assignable to {@code toClass}.
     */
    private static boolean isAssignable(final Type type, final Class<?> toClass) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17546);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17547);if ((((type == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17548)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17549)==0&false))) {{
            // consistency with ClassUtils.isAssignable() behavior
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17550);return toClass == null || !toClass.isPrimitive();
        }

        // only a null type can be assigned to null type which
        // would have cause the previous to return true
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17551);if ((((toClass == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17552)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17553)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17554);return false;
        }

        // all types are assignable to themselves
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17555);if ((((toClass.equals(type))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17556)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17557)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17558);return true;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17559);if ((((type instanceof Class<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17560)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17561)==0&false))) {{
            // just comparing two classes
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17562);return ClassUtils.isAssignable((Class<?>) type, toClass);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17563);if ((((type instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17564)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17565)==0&false))) {{
            // only have to compare the raw type to the class
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17566);return isAssignable(getRawType((ParameterizedType) type), toClass);
        }

        // *
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17567);if ((((type instanceof TypeVariable<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17568)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17569)==0&false))) {{
            // if any of the bounds are assignable to the class, then the
            // type is assignable to the class.
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17570);for (final Type bound : ((TypeVariable<?>) type).getBounds()) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17571);if ((((isAssignable(bound, toClass))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17572)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17573)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17574);return true;
                }
            }}

            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17575);return false;
        }

        // the only classes to which a generic array type can be assigned
        // are class Object and array classes
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17576);if ((((type instanceof GenericArrayType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17577)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17578)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17579);return toClass.equals(Object.class)
                    || toClass.isArray()
                    && isAssignable(((GenericArrayType) type).getGenericComponentType(), toClass
                            .getComponentType());
        }

        // wildcard types are not assignable to a class (though one would think
        // "? super Object" would be assignable to Object)
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17580);if ((((type instanceof WildcardType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17581)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17582)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17583);return false;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17584);throw new IllegalStateException("found an unhandled type: " + type);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Checks if the subject type may be implicitly cast to the target
     * parameterized type following the Java generics rules.</p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toParameterizedType the target parameterized type
     * @param typeVarAssigns a map with type variables
     * @return {@code true} if {@code type} is assignable to {@code toType}.
     */
    private static boolean isAssignable(final Type type, final ParameterizedType toParameterizedType,
            final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17585);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17586);if ((((type == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17587)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17588)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17589);return true;
        }

        // only a null type can be assigned to null type which
        // would have cause the previous to return true
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17590);if ((((toParameterizedType == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17591)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17592)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17593);return false;
        }

        // all types are assignable to themselves
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17594);if ((((toParameterizedType.equals(type))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17595)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17596)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17597);return true;
        }

        // get the target type's raw type
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17598);final Class<?> toClass = getRawType(toParameterizedType);
        // get the subject type's type arguments including owner type arguments
        // and supertype arguments up to and including the target class.
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17599);final Map<TypeVariable<?>, Type> fromTypeVarAssigns = getTypeArguments(type, toClass, null);

        // null means the two types are not compatible
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17600);if ((((fromTypeVarAssigns == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17601)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17602)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17603);return false;
        }

        // compatible types, but there's no type arguments. this is equivalent
        // to comparing Map< ?, ? > to Map, and raw types are always assignable
        // to parameterized types.
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17604);if ((((fromTypeVarAssigns.isEmpty())&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17605)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17606)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17607);return true;
        }

        // get the target type's type arguments including owner type arguments
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17608);final Map<TypeVariable<?>, Type> toTypeVarAssigns = getTypeArguments(toParameterizedType,
                toClass, typeVarAssigns);

        // now to check each type argument
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17609);for (final TypeVariable<?> var : toTypeVarAssigns.keySet()) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17610);final Type toTypeArg = unrollVariableAssignments(var, toTypeVarAssigns);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17611);final Type fromTypeArg = unrollVariableAssignments(var, fromTypeVarAssigns);

            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17612);if ((((toTypeArg == null && fromTypeArg instanceof Class)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17613)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17614)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17615);continue;
            }

            // parameters must either be absent from the subject type, within
            // the bounds of the wildcard type, or be an exact match to the
            // parameters of the target type.
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17616);if ((((fromTypeArg != null
                    && !toTypeArg.equals(fromTypeArg)
                    && !(toTypeArg instanceof WildcardType && isAssignable(fromTypeArg, toTypeArg,
                            typeVarAssigns)))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17617)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17618)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17619);return false;
            }
        }}
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17620);return true;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Look up {@code var} in {@code typeVarAssigns} <em>transitively</em>,
     * i.e. keep looking until the value found is <em>not</em> a type variable.
     * @param var the type variable to look up
     * @param typeVarAssigns the map used for the look up
     * @return Type or {@code null} if some variable was not in the map
     * @since 3.2
     */
    private static Type unrollVariableAssignments(TypeVariable<?> var, final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17621);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17622);Type result;
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17623);do {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17624);result = typeVarAssigns.get(var);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17625);if ((((result instanceof TypeVariable<?> && !result.equals(var))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17626)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17627)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17628);var = (TypeVariable<?>) result;
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17629);continue;
            }
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17630);break;
        } }while (true);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17631);return result;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Checks if the subject type may be implicitly cast to the target
     * generic array type following the Java generics rules.</p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toGenericArrayType the target generic array type
     * @param typeVarAssigns a map with type variables
     * @return {@code true} if {@code type} is assignable to
     * {@code toGenericArrayType}.
     */
    private static boolean isAssignable(final Type type, final GenericArrayType toGenericArrayType,
            final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17632);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17633);if ((((type == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17634)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17635)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17636);return true;
        }

        // only a null type can be assigned to null type which
        // would have cause the previous to return true
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17637);if ((((toGenericArrayType == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17638)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17639)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17640);return false;
        }

        // all types are assignable to themselves
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17641);if ((((toGenericArrayType.equals(type))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17642)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17643)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17644);return true;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17645);final Type toComponentType = toGenericArrayType.getGenericComponentType();

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17646);if ((((type instanceof Class<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17647)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17648)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17649);final Class<?> cls = (Class<?>) type;

            // compare the component types
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17650);return cls.isArray()
                    && isAssignable(cls.getComponentType(), toComponentType, typeVarAssigns);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17651);if ((((type instanceof GenericArrayType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17652)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17653)==0&false))) {{
            // compare the component types
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17654);return isAssignable(((GenericArrayType) type).getGenericComponentType(),
                    toComponentType, typeVarAssigns);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17655);if ((((type instanceof WildcardType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17656)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17657)==0&false))) {{
            // so long as one of the upper bounds is assignable, it's good
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17658);for (final Type bound : getImplicitUpperBounds((WildcardType) type)) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17659);if ((((isAssignable(bound, toGenericArrayType))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17660)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17661)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17662);return true;
                }
            }}

            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17663);return false;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17664);if ((((type instanceof TypeVariable<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17665)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17666)==0&false))) {{
            // probably should remove the following logic and just return false.
            // type variables cannot specify arrays as bounds.
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17667);for (final Type bound : getImplicitBounds((TypeVariable<?>) type)) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17668);if ((((isAssignable(bound, toGenericArrayType))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17669)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17670)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17671);return true;
                }
            }}

            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17672);return false;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17673);if ((((type instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17674)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17675)==0&false))) {{
            // the raw type of a parameterized type is never an array or
            // generic array, otherwise the declaration would look like this:
            // Collection[]< ? extends String > collection;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17676);return false;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17677);throw new IllegalStateException("found an unhandled type: " + type);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Checks if the subject type may be implicitly cast to the target
     * wildcard type following the Java generics rules.</p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toWildcardType the target wildcard type
     * @param typeVarAssigns a map with type variables
     * @return {@code true} if {@code type} is assignable to
     * {@code toWildcardType}.
     */
    private static boolean isAssignable(final Type type, final WildcardType toWildcardType,
            final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17678);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17679);if ((((type == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17680)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17681)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17682);return true;
        }

        // only a null type can be assigned to null type which
        // would have cause the previous to return true
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17683);if ((((toWildcardType == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17684)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17685)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17686);return false;
        }

        // all types are assignable to themselves
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17687);if ((((toWildcardType.equals(type))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17688)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17689)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17690);return true;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17691);final Type[] toUpperBounds = getImplicitUpperBounds(toWildcardType);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17692);final Type[] toLowerBounds = getImplicitLowerBounds(toWildcardType);

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17693);if ((((type instanceof WildcardType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17694)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17695)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17696);final WildcardType wildcardType = (WildcardType) type;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17697);final Type[] upperBounds = getImplicitUpperBounds(wildcardType);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17698);final Type[] lowerBounds = getImplicitLowerBounds(wildcardType);

            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17699);for (Type toBound : toUpperBounds) {{
                // if there are assignments for unresolved type variables,
                // now's the time to substitute them.
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17700);toBound = substituteTypeVariables(toBound, typeVarAssigns);

                // each upper bound of the subject type has to be assignable to
                // each
                // upper bound of the target type
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17701);for (final Type bound : upperBounds) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17702);if ((((!isAssignable(bound, toBound, typeVarAssigns))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17703)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17704)==0&false))) {{
                        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17705);return false;
                    }
                }}
            }}

            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17706);for (Type toBound : toLowerBounds) {{
                // if there are assignments for unresolved type variables,
                // now's the time to substitute them.
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17707);toBound = substituteTypeVariables(toBound, typeVarAssigns);

                // each lower bound of the target type has to be assignable to
                // each
                // lower bound of the subject type
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17708);for (final Type bound : lowerBounds) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17709);if ((((!isAssignable(toBound, bound, typeVarAssigns))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17710)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17711)==0&false))) {{
                        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17712);return false;
                    }
                }}
            }}
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17713);return true;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17714);for (final Type toBound : toUpperBounds) {{
            // if there are assignments for unresolved type variables,
            // now's the time to substitute them.
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17715);if ((((!isAssignable(type, substituteTypeVariables(toBound, typeVarAssigns),
                    typeVarAssigns))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17716)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17717)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17718);return false;
            }
        }}

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17719);for (final Type toBound : toLowerBounds) {{
            // if there are assignments for unresolved type variables,
            // now's the time to substitute them.
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17720);if ((((!isAssignable(substituteTypeVariables(toBound, typeVarAssigns), type,
                    typeVarAssigns))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17721)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17722)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17723);return false;
            }
        }}
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17724);return true;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Checks if the subject type may be implicitly cast to the target type
     * variable following the Java generics rules.</p>
     *
     * @param type the subject type to be assigned to the target type
     * @param toTypeVariable the target type variable
     * @param typeVarAssigns a map with type variables
     * @return {@code true} if {@code type} is assignable to
     * {@code toTypeVariable}.
     */
    private static boolean isAssignable(final Type type, final TypeVariable<?> toTypeVariable,
            final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17725);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17726);if ((((type == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17727)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17728)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17729);return true;
        }

        // only a null type can be assigned to null type which
        // would have cause the previous to return true
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17730);if ((((toTypeVariable == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17731)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17732)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17733);return false;
        }

        // all types are assignable to themselves
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17734);if ((((toTypeVariable.equals(type))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17735)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17736)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17737);return true;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17738);if ((((type instanceof TypeVariable<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17739)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17740)==0&false))) {{
            // a type variable is assignable to another type variable, if
            // and only if the former is the latter, extends the latter, or
            // is otherwise a descendant of the latter.
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17741);final Type[] bounds = getImplicitBounds((TypeVariable<?>) type);

            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17742);for (final Type bound : bounds) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17743);if ((((isAssignable(bound, toTypeVariable, typeVarAssigns))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17744)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17745)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17746);return true;
                }
            }}
        }}

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17747);if ((((type instanceof Class<?> || type instanceof ParameterizedType
                || type instanceof GenericArrayType || type instanceof WildcardType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17748)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17749)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17750);return false;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17751);throw new IllegalStateException("found an unhandled type: " + type);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Find the mapping for {@code type} in {@code typeVarAssigns}.</p>
     *
     * @param type the type to be replaced
     * @param typeVarAssigns the map with type variables
     * @return the replaced type
     * @throws IllegalArgumentException if the type cannot be substituted
     */
    private static Type substituteTypeVariables(final Type type, final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17752);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17753);if ((((type instanceof TypeVariable<?> && typeVarAssigns != null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17754)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17755)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17756);final Type replacementType = typeVarAssigns.get(type);

            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17757);if ((((replacementType == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17758)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17759)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17760);throw new IllegalArgumentException("missing assignment type for type variable "
                        + type);
            }
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17761);return replacementType;
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17762);return type;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Retrieves all the type arguments for this parameterized type
     * including owner hierarchy arguments such as
     * {@code Outer<K,V>.Inner<T>.DeepInner<E>} .
     * The arguments are returned in a
     * {@link Map} specifying the argument type for each {@link TypeVariable}.
     * </p>
     *
     * @param type specifies the subject parameterized type from which to
     *             harvest the parameters.
     * @return a {@code Map} of the type arguments to their respective type
     * variables.
     */
    public static Map<TypeVariable<?>, Type> getTypeArguments(final ParameterizedType type) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17763);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17764);return getTypeArguments(type, getRawType(type), null);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Gets the type arguments of a class/interface based on a subtype. For
     * instance, this method will determine that both of the parameters for the
     * interface {@link Map} are {@link Object} for the subtype
     * {@link java.util.Properties Properties} even though the subtype does not
     * directly implement the {@code Map} interface.</p>
     * <p>This method returns {@code null} if {@code type} is not assignable to
     * {@code toClass}. It returns an empty map if none of the classes or
     * interfaces in its inheritance hierarchy specify any type arguments.</p>
     * <p>A side effect of this method is that it also retrieves the type
     * arguments for the classes and interfaces that are part of the hierarchy
     * between {@code type} and {@code toClass}. So with the above
     * example, this method will also determine that the type arguments for
     * {@link java.util.Hashtable Hashtable} are also both {@code Object}.
     * In cases where the interface specified by {@code toClass} is
     * (indirectly) implemented more than once (e.g. where {@code toClass}
     * specifies the interface {@link java.lang.Iterable Iterable} and
     * {@code type} specifies a parameterized type that implements both
     * {@link java.util.Set Set} and {@link java.util.Collection Collection}),
     * this method will look at the inheritance hierarchy of only one of the
     * implementations/subclasses; the first interface encountered that isn't a
     * subinterface to one of the others in the {@code type} to
     * {@code toClass} hierarchy.</p>
     *
     * @param type the type from which to determine the type parameters of
     * {@code toClass}
     * @param toClass the class whose type parameters are to be determined based
     * on the subtype {@code type}
     * @return a {@code Map} of the type assignments for the type variables in
     * each type in the inheritance hierarchy from {@code type} to
     * {@code toClass} inclusive.
     */
    public static Map<TypeVariable<?>, Type> getTypeArguments(final Type type, final Class<?> toClass) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17765);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17766);return getTypeArguments(type, toClass, null);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Return a map of the type arguments of {@code type} in the context of {@code toClass}.</p>
     *
     * @param type the type in question
     * @param toClass the class
     * @param subtypeVarAssigns a map with type variables
     * @return the {@code Map} with type arguments
     */
    private static Map<TypeVariable<?>, Type> getTypeArguments(final Type type, final Class<?> toClass,
            final Map<TypeVariable<?>, Type> subtypeVarAssigns) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17767);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17768);if ((((type instanceof Class<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17769)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17770)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17771);return getTypeArguments((Class<?>) type, toClass, subtypeVarAssigns);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17772);if ((((type instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17773)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17774)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17775);return getTypeArguments((ParameterizedType) type, toClass, subtypeVarAssigns);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17776);if ((((type instanceof GenericArrayType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17777)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17778)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17779);return getTypeArguments(((GenericArrayType) type).getGenericComponentType(), (((toClass
                    .isArray() )&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17780)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17781)==0&false))? toClass.getComponentType() : toClass, subtypeVarAssigns);
        }

        // since wildcard types are not assignable to classes, should this just
        // return null?
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17782);if ((((type instanceof WildcardType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17783)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17784)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17785);for (final Type bound : getImplicitUpperBounds((WildcardType) type)) {{
                // find the first bound that is assignable to the target class
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17786);if ((((isAssignable(bound, toClass))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17787)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17788)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17789);return getTypeArguments(bound, toClass, subtypeVarAssigns);
                }
            }}

            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17790);return null;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17791);if ((((type instanceof TypeVariable<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17792)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17793)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17794);for (final Type bound : getImplicitBounds((TypeVariable<?>) type)) {{
                // find the first bound that is assignable to the target class
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17795);if ((((isAssignable(bound, toClass))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17796)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17797)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17798);return getTypeArguments(bound, toClass, subtypeVarAssigns);
                }
            }}

            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17799);return null;
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17800);throw new IllegalStateException("found an unhandled type: " + type);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Return a map of the type arguments of a parameterized type in the context of {@code toClass}.</p>
     *
     * @param parameterizedType the parameterized type
     * @param toClass the class
     * @param subtypeVarAssigns a map with type variables
     * @return the {@code Map} with type arguments
     */
    private static Map<TypeVariable<?>, Type> getTypeArguments(
            final ParameterizedType parameterizedType, final Class<?> toClass,
            final Map<TypeVariable<?>, Type> subtypeVarAssigns) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17801);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17802);final Class<?> cls = getRawType(parameterizedType);

        // make sure they're assignable
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17803);if ((((!isAssignable(cls, toClass))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17804)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17805)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17806);return null;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17807);final Type ownerType = parameterizedType.getOwnerType();
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17808);Map<TypeVariable<?>, Type> typeVarAssigns;

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17809);if ((((ownerType instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17810)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17811)==0&false))) {{
            // get the owner type arguments first
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17812);final ParameterizedType parameterizedOwnerType = (ParameterizedType) ownerType;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17813);typeVarAssigns = getTypeArguments(parameterizedOwnerType,
                    getRawType(parameterizedOwnerType), subtypeVarAssigns);
        } }else {{
            // no owner, prep the type variable assignments map
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17814);typeVarAssigns = (((subtypeVarAssigns == null )&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17815)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17816)==0&false))? new HashMap<TypeVariable<?>, Type>()
                    : new HashMap<>(subtypeVarAssigns);
        }

        // get the subject parameterized type's arguments
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17817);final Type[] typeArgs = parameterizedType.getActualTypeArguments();
        // and get the corresponding type variables from the raw class
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17818);final TypeVariable<?>[] typeParams = cls.getTypeParameters();

        // map the arguments to their respective type variables
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17819);for (int i = 0; (((i < typeParams.length)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17820)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17821)==0&false)); i++) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17822);final Type typeArg = typeArgs[i];
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17823);typeVarAssigns.put(typeParams[i], (((typeVarAssigns.containsKey(typeArg) )&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17824)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17825)==0&false))? typeVarAssigns
                    .get(typeArg) : typeArg);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17826);if ((((toClass.equals(cls))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17827)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17828)==0&false))) {{
            // target class has been reached. Done.
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17829);return typeVarAssigns;
        }

        // walk the inheritance hierarchy until the target class is reached
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17830);return getTypeArguments(getClosestParentType(cls, toClass), toClass, typeVarAssigns);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Return a map of the type arguments of a class in the context of {@code toClass}.</p>
     *
     * @param cls the class in question
     * @param toClass the context class
     * @param subtypeVarAssigns a map with type variables
     * @return the {@code Map} with type arguments
     */
    private static Map<TypeVariable<?>, Type> getTypeArguments(Class<?> cls, final Class<?> toClass,
            final Map<TypeVariable<?>, Type> subtypeVarAssigns) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17831);
        // make sure they're assignable
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17832);if ((((!isAssignable(cls, toClass))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17833)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17834)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17835);return null;
        }

        // can't work with primitives
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17836);if ((((cls.isPrimitive())&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17837)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17838)==0&false))) {{
            // both classes are primitives?
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17839);if ((((toClass.isPrimitive())&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17840)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17841)==0&false))) {{
                // dealing with widening here. No type arguments to be
                // harvested with these two types.
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17842);return new HashMap<>();
            }

            // work with wrapper the wrapper class instead of the primitive
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17843);cls = ClassUtils.primitiveToWrapper(cls);
        }

        // create a copy of the incoming map, or an empty one if it's null
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17844);final HashMap<TypeVariable<?>, Type> typeVarAssigns = (((subtypeVarAssigns == null )&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17845)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17846)==0&false))? new HashMap<TypeVariable<?>, Type>()
                : new HashMap<>(subtypeVarAssigns);

        // has target class been reached?
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17847);if ((((toClass.equals(cls))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17848)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17849)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17850);return typeVarAssigns;
        }

        // walk the inheritance hierarchy until the target class is reached
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17851);return getTypeArguments(getClosestParentType(cls, toClass), toClass, typeVarAssigns);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Tries to determine the type arguments of a class/interface based on a
     * super parameterized type's type arguments. This method is the inverse of
     * {@link #getTypeArguments(Type, Class)} which gets a class/interface's
     * type arguments based on a subtype. It is far more limited in determining
     * the type arguments for the subject class's type variables in that it can
     * only determine those parameters that map from the subject {@link Class}
     * object to the supertype.</p> <p>Example: {@link java.util.TreeSet
     * TreeSet} sets its parameter as the parameter for
     * {@link java.util.NavigableSet NavigableSet}, which in turn sets the
     * parameter of {@link java.util.SortedSet}, which in turn sets the
     * parameter of {@link Set}, which in turn sets the parameter of
     * {@link java.util.Collection}, which in turn sets the parameter of
     * {@link java.lang.Iterable}. Since {@code TreeSet}'s parameter maps
     * (indirectly) to {@code Iterable}'s parameter, it will be able to
     * determine that based on the super type {@code Iterable<? extends
     * Map<Integer, ? extends Collection<?>>>}, the parameter of
     * {@code TreeSet} is {@code ? extends Map<Integer, ? extends
     * Collection<?>>}.</p>
     *
     * @param cls the class whose type parameters are to be determined, not {@code null}
     * @param superType the super type from which {@code cls}'s type
     * arguments are to be determined, not {@code null}
     * @return a {@code Map} of the type assignments that could be determined
     * for the type variables in each type in the inheritance hierarchy from
     * {@code type} to {@code toClass} inclusive.
     */
    public static Map<TypeVariable<?>, Type> determineTypeArguments(final Class<?> cls,
            final ParameterizedType superType) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17852);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17853);Validate.notNull(cls, "cls is null");
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17854);Validate.notNull(superType, "superType is null");

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17855);final Class<?> superClass = getRawType(superType);

        // compatibility check
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17856);if ((((!isAssignable(cls, superClass))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17857)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17858)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17859);return null;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17860);if ((((cls.equals(superClass))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17861)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17862)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17863);return getTypeArguments(superType, superClass, null);
        }

        // get the next class in the inheritance hierarchy
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17864);final Type midType = getClosestParentType(cls, superClass);

        // can only be a class or a parameterized type
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17865);if ((((midType instanceof Class<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17866)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17867)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17868);return determineTypeArguments((Class<?>) midType, superType);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17869);final ParameterizedType midParameterizedType = (ParameterizedType) midType;
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17870);final Class<?> midClass = getRawType(midParameterizedType);
        // get the type variables of the mid class that map to the type
        // arguments of the super class
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17871);final Map<TypeVariable<?>, Type> typeVarAssigns = determineTypeArguments(midClass, superType);
        // map the arguments of the mid type to the class type variables
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17872);mapTypeVariablesToArguments(cls, midParameterizedType, typeVarAssigns);

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17873);return typeVarAssigns;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Performs a mapping of type variables.</p>
     *
     * @param <T> the generic type of the class in question
     * @param cls the class in question
     * @param parameterizedType the parameterized type
     * @param typeVarAssigns the map to be filled
     */
    private static <T> void mapTypeVariablesToArguments(final Class<T> cls,
            final ParameterizedType parameterizedType, final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17874);
        // capture the type variables from the owner type that have assignments
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17875);final Type ownerType = parameterizedType.getOwnerType();

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17876);if ((((ownerType instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17877)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17878)==0&false))) {{
            // recursion to make sure the owner's owner type gets processed
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17879);mapTypeVariablesToArguments(cls, (ParameterizedType) ownerType, typeVarAssigns);
        }

        // parameterizedType is a generic interface/class (or it's in the owner
        // hierarchy of said interface/class) implemented/extended by the class
        // cls. Find out which type variables of cls are type arguments of
        // parameterizedType:
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17880);final Type[] typeArgs = parameterizedType.getActualTypeArguments();

        // of the cls's type variables that are arguments of parameterizedType,
        // find out which ones can be determined from the super type's arguments
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17881);final TypeVariable<?>[] typeVars = getRawType(parameterizedType).getTypeParameters();

        // use List view of type parameters of cls so the contains() method can be used:
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17882);final List<TypeVariable<Class<T>>> typeVarList = Arrays.asList(cls
                .getTypeParameters());

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17883);for (int i = 0; (((i < typeArgs.length)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17884)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17885)==0&false)); i++) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17886);final TypeVariable<?> typeVar = typeVars[i];
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17887);final Type typeArg = typeArgs[i];

            // argument of parameterizedType is a type variable of cls
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17888);if ((((typeVarList.contains(typeArg)
            // type variable of parameterizedType has an assignment in
                    // the super type.
                    && typeVarAssigns.containsKey(typeVar))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17889)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17890)==0&false))) {{
                // map the assignment to the cls's type variable
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17891);typeVarAssigns.put((TypeVariable<?>) typeArg, typeVarAssigns.get(typeVar));
            }
        }}
    }}finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Get the closest parent type to the
     * super class specified by {@code superClass}.</p>
     *
     * @param cls the class in question
     * @param superClass the super class
     * @return the closes parent type
     */
    private static Type getClosestParentType(final Class<?> cls, final Class<?> superClass) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17892);
        // only look at the interfaces if the super class is also an interface
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17893);if ((((superClass.isInterface())&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17894)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17895)==0&false))) {{
            // get the generic interfaces of the subject class
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17896);final Type[] interfaceTypes = cls.getGenericInterfaces();
            // will hold the best generic interface match found
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17897);Type genericInterface = null;

            // find the interface closest to the super class
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17898);for (final Type midType : interfaceTypes) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17899);Class<?> midClass = null;

                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17900);if ((((midType instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17901)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17902)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17903);midClass = getRawType((ParameterizedType) midType);
                } }else {__CLR4_5_2dh0dh0lvha7bdw.R.inc(17904);if ((((midType instanceof Class<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17905)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17906)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17907);midClass = (Class<?>) midType;
                } }else {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17908);throw new IllegalStateException("Unexpected generic"
                            + " interface type found: " + midType);
                }

                // check if this interface is further up the inheritance chain
                // than the previously found match
                }}__CLR4_5_2dh0dh0lvha7bdw.R.inc(17909);if ((((isAssignable(midClass, superClass)
                        && isAssignable(genericInterface, (Type) midClass))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17910)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17911)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17912);genericInterface = midType;
                }
            }}

            // found a match?
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17913);if ((((genericInterface != null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17914)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17915)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17916);return genericInterface;
            }
        }}

        // none of the interfaces were descendants of the target class, so the
        // super class has to be one, instead
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17917);return cls.getGenericSuperclass();
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Checks if the given value can be assigned to the target type
     * following the Java generics rules.</p>
     *
     * @param value the value to be checked
     * @param type the target type
     * @return {@code true} if {@code value} is an instance of {@code type}.
     */
    public static boolean isInstance(final Object value, final Type type) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17918);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17919);if ((((type == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17920)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17921)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17922);return false;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17923);return (((value == null )&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17924)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17925)==0&false))? !(type instanceof Class<?>) || !((Class<?>) type).isPrimitive()
                : isAssignable(value.getClass(), type, null);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>This method strips out the redundant upper bound types in type
     * variable types and wildcard types (or it would with wildcard types if
     * multiple upper bounds were allowed).</p> <p>Example, with the variable
     * type declaration:
     *
     * <pre>&lt;K extends java.util.Collection&lt;String&gt; &amp;
     * java.util.List&lt;String&gt;&gt;</pre>
     *
     * <p>
     * since {@code List} is a subinterface of {@code Collection},
     * this method will return the bounds as if the declaration had been:
     * </p>
     *
     * <pre>&lt;K extends java.util.List&lt;String&gt;&gt;</pre>
     *
     * @param bounds an array of types representing the upper bounds of either
     * {@link WildcardType} or {@link TypeVariable}, not {@code null}.
     * @return an array containing the values from {@code bounds} minus the
     * redundant types.
     */
    public static Type[] normalizeUpperBounds(final Type[] bounds) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17926);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17927);Validate.notNull(bounds, "null value specified for bounds array");
        // don't bother if there's only one (or none) type
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17928);if ((((bounds.length < 2)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17929)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17930)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17931);return bounds;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17932);final Set<Type> types = new HashSet<>(bounds.length);

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17933);for (final Type type1 : bounds) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17934);boolean subtypeFound = false;

            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17935);for (final Type type2 : bounds) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17936);if ((((type1 != type2 && isAssignable(type2, type1, null))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17937)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17938)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17939);subtypeFound = true;
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17940);break;
                }
            }}

            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17941);if ((((!subtypeFound)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17942)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17943)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17944);types.add(type1);
            }
        }}

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17945);return types.toArray(new Type[types.size()]);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Returns an array containing the sole type of {@link Object} if
     * {@link TypeVariable#getBounds()} returns an empty array. Otherwise, it
     * returns the result of {@link TypeVariable#getBounds()} passed into
     * {@link #normalizeUpperBounds}.</p>
     *
     * @param typeVariable the subject type variable, not {@code null}
     * @return a non-empty array containing the bounds of the type variable.
     */
    public static Type[] getImplicitBounds(final TypeVariable<?> typeVariable) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17946);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17947);Validate.notNull(typeVariable, "typeVariable is null");
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17948);final Type[] bounds = typeVariable.getBounds();

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17949);return (((bounds.length == 0 )&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17950)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17951)==0&false))? new Type[] { Object.class } : normalizeUpperBounds(bounds);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Returns an array containing the sole value of {@link Object} if
     * {@link WildcardType#getUpperBounds()} returns an empty array. Otherwise,
     * it returns the result of {@link WildcardType#getUpperBounds()}
     * passed into {@link #normalizeUpperBounds}.</p>
     *
     * @param wildcardType the subject wildcard type, not {@code null}
     * @return a non-empty array containing the upper bounds of the wildcard
     * type.
     */
    public static Type[] getImplicitUpperBounds(final WildcardType wildcardType) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17952);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17953);Validate.notNull(wildcardType, "wildcardType is null");
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17954);final Type[] bounds = wildcardType.getUpperBounds();

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17955);return (((bounds.length == 0 )&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17956)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17957)==0&false))? new Type[] { Object.class } : normalizeUpperBounds(bounds);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Returns an array containing a single value of {@code null} if
     * {@link WildcardType#getLowerBounds()} returns an empty array. Otherwise,
     * it returns the result of {@link WildcardType#getLowerBounds()}.</p>
     *
     * @param wildcardType the subject wildcard type, not {@code null}
     * @return a non-empty array containing the lower bounds of the wildcard
     * type.
     */
    public static Type[] getImplicitLowerBounds(final WildcardType wildcardType) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17958);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17959);Validate.notNull(wildcardType, "wildcardType is null");
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17960);final Type[] bounds = wildcardType.getLowerBounds();

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17961);return (((bounds.length == 0 )&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17962)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17963)==0&false))? new Type[] { null } : bounds;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Determines whether or not specified types satisfy the bounds of their
     * mapped type variables. When a type parameter extends another (such as
     * {@code <T, S extends T>}), uses another as a type parameter (such as
     * {@code <T, S extends Comparable>>}), or otherwise depends on
     * another type variable to be specified, the dependencies must be included
     * in {@code typeVarAssigns}.</p>
     *
     * @param typeVarAssigns specifies the potential types to be assigned to the
     * type variables, not {@code null}.
     * @return whether or not the types can be assigned to their respective type
     * variables.
     */
    public static boolean typesSatisfyVariables(final Map<TypeVariable<?>, Type> typeVarAssigns) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17964);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17965);Validate.notNull(typeVarAssigns, "typeVarAssigns is null");
        // all types must be assignable to all the bounds of the their mapped
        // type variable.
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17966);for (final Map.Entry<TypeVariable<?>, Type> entry : typeVarAssigns.entrySet()) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17967);final TypeVariable<?> typeVar = entry.getKey();
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17968);final Type type = entry.getValue();

            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17969);for (final Type bound : getImplicitBounds(typeVar)) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17970);if ((((!isAssignable(type, substituteTypeVariables(bound, typeVarAssigns),
                        typeVarAssigns))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17971)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17972)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(17973);return false;
                }
            }}
        }}
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17974);return true;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Transforms the passed in type to a {@link Class} object. Type-checking method of convenience.</p>
     *
     * @param parameterizedType the type to be converted
     * @return the corresponding {@code Class} object
     * @throws IllegalStateException if the conversion fails
     */
    private static Class<?> getRawType(final ParameterizedType parameterizedType) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17975);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17976);final Type rawType = parameterizedType.getRawType();

        // check if raw type is a Class object
        // not currently necessary, but since the return type is Type instead of
        // Class, there's enough reason to believe that future versions of Java
        // may return other Type implementations. And type-safety checking is
        // rarely a bad idea.
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17977);if ((((!(rawType instanceof Class<?>))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17978)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17979)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17980);throw new IllegalStateException("Wait... What!? Type of rawType: " + rawType);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17981);return (Class<?>) rawType;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * <p>Get the raw type of a Java type, given its context. Primarily for use
     * with {@link TypeVariable}s and {@link GenericArrayType}s, or when you do
     * not know the runtime type of {@code type}: if you know you have a
     * {@link Class} instance, it is already raw; if you know you have a
     * {@link ParameterizedType}, its raw type is only a method call away.</p>
     *
     * @param type to resolve
     * @param assigningType type to be resolved against
     * @return the resolved {@link Class} object or {@code null} if
     * the type could not be resolved
     */
    public static Class<?> getRawType(final Type type, final Type assigningType) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(17982);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(17983);if ((((type instanceof Class<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17984)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17985)==0&false))) {{
            // it is raw, no problem
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17986);return (Class<?>) type;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17987);if ((((type instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17988)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17989)==0&false))) {{
            // simple enough to get the raw type of a ParameterizedType
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17990);return getRawType((ParameterizedType) type);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17991);if ((((type instanceof TypeVariable<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17992)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17993)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17994);if ((((assigningType == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17995)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(17996)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(17997);return null;
            }

            // get the entity declaring this type variable
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(17998);final Object genericDeclaration = ((TypeVariable<?>) type).getGenericDeclaration();

            // can't get the raw type of a method- or constructor-declared type
            // variable
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(17999);if ((((!(genericDeclaration instanceof Class<?>))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18000)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18001)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18002);return null;
            }

            // get the type arguments for the declaring class/interface based
            // on the enclosing type
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18003);final Map<TypeVariable<?>, Type> typeVarAssigns = getTypeArguments(assigningType,
                    (Class<?>) genericDeclaration);

            // enclosingType has to be a subclass (or subinterface) of the
            // declaring type
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18004);if ((((typeVarAssigns == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18005)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18006)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18007);return null;
            }

            // get the argument assigned to this type variable
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18008);final Type typeArgument = typeVarAssigns.get(type);

            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18009);if ((((typeArgument == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18010)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18011)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18012);return null;
            }

            // get the argument for this type variable
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18013);return getRawType(typeArgument, assigningType);
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18014);if ((((type instanceof GenericArrayType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18015)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18016)==0&false))) {{
            // get raw component type
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18017);final Class<?> rawComponentType = getRawType(((GenericArrayType) type)
                    .getGenericComponentType(), assigningType);

            // create array type from raw component type and return its class
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18018);return Array.newInstance(rawComponentType, 0).getClass();
        }

        // (hand-waving) this is not the method you're looking for
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18019);if ((((type instanceof WildcardType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18020)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18021)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18022);return null;
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18023);throw new IllegalArgumentException("unknown type: " + type);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Learn whether the specified type denotes an array type.
     * @param type the type to be checked
     * @return {@code true} if {@code type} is an array class or a {@link GenericArrayType}.
     */
    public static boolean isArrayType(final Type type) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18024);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18025);return type instanceof GenericArrayType || type instanceof Class<?> && ((Class<?>) type).isArray();
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Get the array component type of {@code type}.
     * @param type the type to be checked
     * @return component type or null if type is not an array type
     */
    public static Type getArrayComponentType(final Type type) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18026);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18027);if ((((type instanceof Class<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18028)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18029)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18030);final Class<?> clazz = (Class<?>) type;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18031);return (((clazz.isArray() )&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18032)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18033)==0&false))? clazz.getComponentType() : null;
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18034);if ((((type instanceof GenericArrayType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18035)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18036)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18037);return ((GenericArrayType) type).getGenericComponentType();
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18038);return null;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Get a type representing {@code type} with variable assignments "unrolled."
     *
     * @param typeArguments as from {@link TypeUtils#getTypeArguments(Type, Class)}
     * @param type the type to unroll variable assignments for
     * @return Type
     * @since 3.2
     */
    public static Type unrollVariables(Map<TypeVariable<?>, Type> typeArguments, final Type type) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18039);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18040);if ((((typeArguments == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18041)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18042)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18043);typeArguments = Collections.<TypeVariable<?>, Type> emptyMap();
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18044);if ((((containsTypeVariables(type))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18045)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18046)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18047);if ((((type instanceof TypeVariable<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18048)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18049)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18050);return unrollVariables(typeArguments, typeArguments.get(type));
            }
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18051);if ((((type instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18052)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18053)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18054);final ParameterizedType p = (ParameterizedType) type;
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18055);final Map<TypeVariable<?>, Type> parameterizedTypeArguments;
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18056);if ((((p.getOwnerType() == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18057)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18058)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(18059);parameterizedTypeArguments = typeArguments;
                } }else {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(18060);parameterizedTypeArguments = new HashMap<>(typeArguments);
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(18061);parameterizedTypeArguments.putAll(TypeUtils.getTypeArguments(p));
                }
                }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18062);final Type[] args = p.getActualTypeArguments();
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18063);for (int i = 0; (((i < args.length)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18064)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18065)==0&false)); i++) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(18066);final Type unrolled = unrollVariables(parameterizedTypeArguments, args[i]);
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(18067);if ((((unrolled != null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18068)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18069)==0&false))) {{
                        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18070);args[i] = unrolled;
                    }
                }}
                }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18071);return parameterizeWithOwner(p.getOwnerType(), (Class<?>) p.getRawType(), args);
            }
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18072);if ((((type instanceof WildcardType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18073)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18074)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18075);final WildcardType wild = (WildcardType) type;
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18076);return wildcardType().withUpperBounds(unrollBounds(typeArguments, wild.getUpperBounds()))
                    .withLowerBounds(unrollBounds(typeArguments, wild.getLowerBounds())).build();
            }
        }}
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18077);return type;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Local helper method to unroll variables in a type bounds array.
     * 
     * @param typeArguments assignments {@link Map}
     * @param bounds in which to expand variables
     * @return {@code bounds} with any variables reassigned
     * @since 3.2
     */
    private static Type[] unrollBounds(final Map<TypeVariable<?>, Type> typeArguments, final Type[] bounds) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18078);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18079);Type[] result = bounds;
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18080);int i = 0;
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18081);for (; (((i < result.length)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18082)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18083)==0&false)); i++) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18084);final Type unrolled = unrollVariables(typeArguments, result[i]);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18085);if ((((unrolled == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18086)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18087)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18088);result = ArrayUtils.remove(result, i--);
            } }else {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18089);result[i] = unrolled;
            }
        }}
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18090);return result;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Learn, recursively, whether any of the type parameters associated with {@code type} are bound to variables.
     *
     * @param type the type to check for type variables
     * @return boolean
     * @since 3.2
     */
    public static boolean containsTypeVariables(final Type type) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18091);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18092);if ((((type instanceof TypeVariable<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18093)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18094)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18095);return true;
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18096);if ((((type instanceof Class<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18097)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18098)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18099);return ((Class<?>) type).getTypeParameters().length > 0;
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18100);if ((((type instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18101)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18102)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18103);for (final Type arg : ((ParameterizedType) type).getActualTypeArguments()) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18104);if ((((containsTypeVariables(arg))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18105)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18106)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(18107);return true;
                }
            }}
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18108);return false;
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18109);if ((((type instanceof WildcardType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18110)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18111)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18112);final WildcardType wild = (WildcardType) type;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18113);return containsTypeVariables(TypeUtils.getImplicitLowerBounds(wild)[0])
                || containsTypeVariables(TypeUtils.getImplicitUpperBounds(wild)[0]);
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18114);return false;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Create a parameterized type instance.
     *
     * @param raw the raw class to create a parameterized type instance for
     * @param typeArguments the types used for parameterization
     * @return {@link ParameterizedType}
     * @since 3.2
     */
    public static final ParameterizedType parameterize(final Class<?> raw, final Type... typeArguments) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18115);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18116);return parameterizeWithOwner(null, raw, typeArguments);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Create a parameterized type instance.
     *
     * @param raw the raw class to create a parameterized type instance for
     * @param typeArgMappings the mapping used for parameterization
     * @return {@link ParameterizedType}
     * @since 3.2
     */
    public static final ParameterizedType parameterize(final Class<?> raw,
        final Map<TypeVariable<?>, Type> typeArgMappings) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18117);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18118);Validate.notNull(raw, "raw class is null");
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18119);Validate.notNull(typeArgMappings, "typeArgMappings is null");
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18120);return parameterizeWithOwner(null, raw, extractTypeArgumentsFrom(typeArgMappings, raw.getTypeParameters()));
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Create a parameterized type instance.
     *
     * @param owner the owning type
     * @param raw the raw class to create a parameterized type instance for
     * @param typeArguments the types used for parameterization
     *
     * @return {@link ParameterizedType}
     * @since 3.2
     */
    public static final ParameterizedType parameterizeWithOwner(final Type owner, final Class<?> raw,
        final Type... typeArguments) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18121);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18122);Validate.notNull(raw, "raw class is null");
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18123);final Type useOwner;
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18124);if ((((raw.getEnclosingClass() == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18125)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18126)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18127);Validate.isTrue(owner == null, "no owner allowed for top-level %s", raw);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18128);useOwner = null;
        } }else {__CLR4_5_2dh0dh0lvha7bdw.R.inc(18129);if ((((owner == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18130)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18131)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18132);useOwner = raw.getEnclosingClass();
        } }else {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18133);Validate.isTrue(TypeUtils.isAssignable(owner, raw.getEnclosingClass()),
                "%s is invalid owner type for parameterized %s", owner, raw);
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18134);useOwner = owner;
        }
        }}__CLR4_5_2dh0dh0lvha7bdw.R.inc(18135);Validate.noNullElements(typeArguments, "null type argument at index %s");
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18136);Validate.isTrue(raw.getTypeParameters().length == typeArguments.length,
            "invalid number of type parameters specified: expected %d, got %d", raw.getTypeParameters().length,
            typeArguments.length);

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18137);return new ParameterizedTypeImpl(raw, useOwner, typeArguments);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Create a parameterized type instance.
     *
     * @param owner the owning type
     * @param raw the raw class to create a parameterized type instance for
     * @param typeArgMappings the mapping used for parameterization
     * @return {@link ParameterizedType}
     * @since 3.2
     */
    public static final ParameterizedType parameterizeWithOwner(final Type owner, final Class<?> raw,
        final Map<TypeVariable<?>, Type> typeArgMappings) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18138);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18139);Validate.notNull(raw, "raw class is null");
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18140);Validate.notNull(typeArgMappings, "typeArgMappings is null");
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18141);return parameterizeWithOwner(owner, raw, extractTypeArgumentsFrom(typeArgMappings, raw.getTypeParameters()));
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Helper method to establish the formal parameters for a parameterized type.
     * @param mappings map containing the assignments
     * @param variables expected map keys
     * @return array of map values corresponding to specified keys
     */
    private static Type[] extractTypeArgumentsFrom(final Map<TypeVariable<?>, Type> mappings, final TypeVariable<?>[] variables) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18142);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18143);final Type[] result = new Type[variables.length];
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18144);int index = 0;
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18145);for (final TypeVariable<?> var : variables) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18146);Validate.isTrue(mappings.containsKey(var), "missing argument mapping for %s", toString(var));
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18147);result[index++] = mappings.get(var);
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18148);return result;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Get a {@link WildcardTypeBuilder}.
     * @return {@link WildcardTypeBuilder}
     * @since 3.2
     */
    public static WildcardTypeBuilder wildcardType() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18149);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18150);return new WildcardTypeBuilder();
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Create a generic array type instance.
     *
     * @param componentType the type of the elements of the array. For example the component type of {@code boolean[]}
     *                      is {@code boolean}
     * @return {@link GenericArrayType}
     * @since 3.2
     */
    public static GenericArrayType genericArrayType(final Type componentType) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18151);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18152);return new GenericArrayTypeImpl(Validate.notNull(componentType, "componentType is null"));
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Check equality of types.
     *
     * @param t1 the first type
     * @param t2 the second type
     * @return boolean
     * @since 3.2
     */
    public static boolean equals(final Type t1, final Type t2) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18153);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18154);if ((((Objects.equals(t1, t2))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18155)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18156)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18157);return true;
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18158);if ((((t1 instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18159)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18160)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18161);return equals((ParameterizedType) t1, t2);
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18162);if ((((t1 instanceof GenericArrayType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18163)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18164)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18165);return equals((GenericArrayType) t1, t2);
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18166);if ((((t1 instanceof WildcardType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18167)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18168)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18169);return equals((WildcardType) t1, t2);
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18170);return false;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Learn whether {@code t} equals {@code p}.
     * @param p LHS
     * @param t RHS
     * @return boolean
     * @since 3.2
     */
    private static boolean equals(final ParameterizedType p, final Type t) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18171);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18172);if ((((t instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18173)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18174)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18175);final ParameterizedType other = (ParameterizedType) t;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18176);if ((((equals(p.getRawType(), other.getRawType()) && equals(p.getOwnerType(), other.getOwnerType()))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18177)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18178)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18179);return equals(p.getActualTypeArguments(), other.getActualTypeArguments());
            }
        }}
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18180);return false;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Learn whether {@code t} equals {@code a}.
     * @param a LHS
     * @param t RHS
     * @return boolean
     * @since 3.2
     */
    private static boolean equals(final GenericArrayType a, final Type t) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18181);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18182);return t instanceof GenericArrayType
            && equals(a.getGenericComponentType(), ((GenericArrayType) t).getGenericComponentType());
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Learn whether {@code t} equals {@code w}.
     * @param w LHS
     * @param t RHS
     * @return boolean
     * @since 3.2
     */
    private static boolean equals(final WildcardType w, final Type t) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18183);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18184);if ((((t instanceof WildcardType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18185)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18186)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18187);final WildcardType other = (WildcardType) t;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18188);return equals(getImplicitLowerBounds(w), getImplicitLowerBounds(other))
                && equals(getImplicitUpperBounds(w), getImplicitUpperBounds(other));
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18189);return false;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Learn whether {@code t1} equals {@code t2}.
     * @param t1 LHS
     * @param t2 RHS
     * @return boolean
     * @since 3.2
     */
    private static boolean equals(final Type[] t1, final Type[] t2) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18190);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18191);if ((((t1.length == t2.length)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18192)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18193)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18194);for (int i = 0; (((i < t1.length)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18195)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18196)==0&false)); i++) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18197);if ((((!equals(t1[i], t2[i]))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18198)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18199)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(18200);return false;
                }
            }}
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18201);return true;
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18202);return false;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Present a given type as a Java-esque String.
     *
     * @param type the type to create a String representation for, not {@code null}
     * @return String
     * @since 3.2
     */
    public static String toString(final Type type) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18203);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18204);Validate.notNull(type);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18205);if ((((type instanceof Class<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18206)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18207)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18208);return classToString((Class<?>) type);
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18209);if ((((type instanceof ParameterizedType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18210)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18211)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18212);return parameterizedTypeToString((ParameterizedType) type);
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18213);if ((((type instanceof WildcardType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18214)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18215)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18216);return wildcardTypeToString((WildcardType) type);
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18217);if ((((type instanceof TypeVariable<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18218)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18219)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18220);return typeVariableToString((TypeVariable<?>) type);
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18221);if ((((type instanceof GenericArrayType)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18222)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18223)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18224);return genericArrayTypeToString((GenericArrayType) type);
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18225);throw new IllegalArgumentException(ObjectUtils.identityToString(type));
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Format a {@link TypeVariable} including its {@link GenericDeclaration}.
     *
     * @param var the type variable to create a String representation for, not {@code null}
     * @return String
     * @since 3.2
     */
    public static String toLongString(final TypeVariable<?> var) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18226);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18227);Validate.notNull(var, "var is null");
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18228);final StringBuilder buf = new StringBuilder();
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18229);final GenericDeclaration d = var.getGenericDeclaration();
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18230);if ((((d instanceof Class<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18231)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18232)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18233);Class<?> c = (Class<?>) d;
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18234);while (true) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18235);if ((((c.getEnclosingClass() == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18236)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18237)==0&false))) {{
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(18238);buf.insert(0, c.getName());
                    __CLR4_5_2dh0dh0lvha7bdw.R.inc(18239);break;
                }
                }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18240);buf.insert(0, c.getSimpleName()).insert(0, '.');
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18241);c = c.getEnclosingClass();
            }
        }} }else {__CLR4_5_2dh0dh0lvha7bdw.R.inc(18242);if ((((d instanceof Type)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18243)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18244)==0&false))) {{// not possible as of now
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18245);buf.append(toString((Type) d));
        } }else {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18246);buf.append(d);
        }
        }}__CLR4_5_2dh0dh0lvha7bdw.R.inc(18247);return buf.append(':').append(typeVariableToString(var)).toString();
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Wrap the specified {@link Type} in a {@link Typed} wrapper.
     *
     * @param <T> inferred generic type
     * @param type to wrap
     * @return Typed&lt;T&gt;
     * @since 3.2
     */
    public static <T> Typed<T> wrap(final Type type) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18248);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18249);return new Typed<T>() {
            @Override
            public Type getType() {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18250);
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18251);return type;
            }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}
        };
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Wrap the specified {@link Class} in a {@link Typed} wrapper.
     *
     * @param <T> generic type
     * @param type to wrap
     * @return Typed&lt;T&gt;
     * @since 3.2
     */
    public static <T> Typed<T> wrap(final Class<T> type) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18252);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18253);return TypeUtils.<T> wrap((Type) type);
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Format a {@link Class} as a {@link String}.
     * @param c {@code Class} to format
     * @return String
     * @since 3.2
     */
    private static String classToString(final Class<?> c) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18254);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18255);if ((((c.isArray())&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18256)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18257)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18258);return toString(c.getComponentType()) + "[]";
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18259);final StringBuilder buf = new StringBuilder();

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18260);if ((((c.getEnclosingClass() != null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18261)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18262)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18263);buf.append(classToString(c.getEnclosingClass())).append('.').append(c.getSimpleName());
        } }else {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18264);buf.append(c.getName());
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18265);if ((((c.getTypeParameters().length > 0)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18266)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18267)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18268);buf.append('<');
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18269);appendAllTo(buf, ", ", c.getTypeParameters());
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18270);buf.append('>');
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18271);return buf.toString();
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Format a {@link TypeVariable} as a {@link String}.
     * @param v {@code TypeVariable} to format
     * @return String
     * @since 3.2
     */
    private static String typeVariableToString(final TypeVariable<?> v) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18272);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18273);final StringBuilder buf = new StringBuilder(v.getName());
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18274);final Type[] bounds = v.getBounds();
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18275);if ((((bounds.length > 0 && !(bounds.length == 1 && Object.class.equals(bounds[0])))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18276)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18277)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18278);buf.append(" extends ");
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18279);appendAllTo(buf, " & ", v.getBounds());
        }
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18280);return buf.toString();
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Format a {@link ParameterizedType} as a {@link String}.
     * @param p {@code ParameterizedType} to format
     * @return String
     * @since 3.2
     */
    private static String parameterizedTypeToString(final ParameterizedType p) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18281);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18282);final StringBuilder buf = new StringBuilder();

        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18283);final Type useOwner = p.getOwnerType();
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18284);final Class<?> raw = (Class<?>) p.getRawType();
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18285);final Type[] typeArguments = p.getActualTypeArguments();
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18286);if ((((useOwner == null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18287)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18288)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18289);buf.append(raw.getName());
        } }else {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18290);if ((((useOwner instanceof Class<?>)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18291)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18292)==0&false))) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18293);buf.append(((Class<?>) useOwner).getName());
            } }else {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18294);buf.append(useOwner.toString());
            }
            }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18295);buf.append('.').append(raw.getSimpleName());
        }

        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18296);appendAllTo(buf.append('<'), ", ", typeArguments).append('>');
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18297);return buf.toString();
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Format a {@link WildcardType} as a {@link String}.
     * @param w {@code WildcardType} to format
     * @return String
     * @since 3.2
     */
    private static String wildcardTypeToString(final WildcardType w) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18298);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18299);final StringBuilder buf = new StringBuilder().append('?');
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18300);final Type[] lowerBounds = w.getLowerBounds();
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18301);final Type[] upperBounds = w.getUpperBounds();
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18302);if ((((lowerBounds.length > 1 || lowerBounds.length == 1 && lowerBounds[0] != null)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18303)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18304)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18305);appendAllTo(buf.append(" super "), " & ", lowerBounds);
        } }else {__CLR4_5_2dh0dh0lvha7bdw.R.inc(18306);if ((((upperBounds.length > 1 || upperBounds.length == 1 && !Object.class.equals(upperBounds[0]))&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18307)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18308)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18309);appendAllTo(buf.append(" extends "), " & ", upperBounds);
        }
        }}__CLR4_5_2dh0dh0lvha7bdw.R.inc(18310);return buf.toString();
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Format a {@link GenericArrayType} as a {@link String}.
     * @param g {@code GenericArrayType} to format
     * @return String
     * @since 3.2
     */
    private static String genericArrayTypeToString(final GenericArrayType g) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18311);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18312);return String.format("%s[]", toString(g.getGenericComponentType()));
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

    /**
     * Append {@code types} to {@code buf} with separator {@code sep}.
     * @param buf destination
     * @param sep separator
     * @param types to append
     * @return {@code buf}
     * @since 3.2
     */
    private static StringBuilder appendAllTo(final StringBuilder buf, final String sep, final Type... types) {try{__CLR4_5_2dh0dh0lvha7bdw.R.inc(18313);
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18314);Validate.notEmpty(Validate.noNullElements(types));
        __CLR4_5_2dh0dh0lvha7bdw.R.inc(18315);if ((((types.length > 0)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18316)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18317)==0&false))) {{
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18318);buf.append(toString(types[0]));
            __CLR4_5_2dh0dh0lvha7bdw.R.inc(18319);for (int i = 1; (((i < types.length)&&(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18320)!=0|true))||(__CLR4_5_2dh0dh0lvha7bdw.R.iget(18321)==0&false)); i++) {{
                __CLR4_5_2dh0dh0lvha7bdw.R.inc(18322);buf.append(sep).append(toString(types[i]));
            }
        }}
        }__CLR4_5_2dh0dh0lvha7bdw.R.inc(18323);return buf;
    }finally{__CLR4_5_2dh0dh0lvha7bdw.R.flushNeeded();}}

}
