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

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

/**
 * Substitutes variables within a string by values.
 * <p>
 * This class takes a piece of text and substitutes all the variables within it.
 * The default definition of a variable is <code>${variableName}</code>.
 * The prefix and suffix can be changed via constructors and set methods.
 * <p>
 * Variable values are typically resolved from a map, but could also be resolved
 * from system properties, or by supplying a custom variable resolver.
 * <p>
 * The simplest example is to use this class to replace Java System properties. For example:
 * <pre>
 * StrSubstitutor.replaceSystemProperties(
 *      "You are running with java.version = ${java.version} and os.name = ${os.name}.");
 * </pre>
 * <p>
 * Typical usage of this class follows the following pattern: First an instance is created
 * and initialized with the map that contains the values for the available variables.
 * If a prefix and/or suffix for variables should be used other than the default ones,
 * the appropriate settings can be performed. After that the <code>replace()</code>
 * method can be called passing in the source text for interpolation. In the returned
 * text all variable references (as long as their values are known) will be resolved.
 * The following example demonstrates this:
 * <pre>
 * Map valuesMap = HashMap();
 * valuesMap.put(&quot;animal&quot;, &quot;quick brown fox&quot;);
 * valuesMap.put(&quot;target&quot;, &quot;lazy dog&quot;);
 * String templateString = &quot;The ${animal} jumps over the ${target}.&quot;;
 * StrSubstitutor sub = new StrSubstitutor(valuesMap);
 * String resolvedString = sub.replace(templateString);
 * </pre>
 * yielding:
 * <pre>
 *      The quick brown fox jumps over the lazy dog.
 * </pre>
 * <p>
 * Also, this class allows to set a default value for unresolved variables.
 * The default value for a variable can be appended to the variable name after the variable
 * default value delimiter. The default value of the variable default value delimiter is ':-',
 * as in bash and other *nix shells, as those are arguably where the default ${} delimiter set originated.
 * The variable default value delimiter can be manually set by calling {@link #setValueDelimiterMatcher(StrMatcher)},
 * {@link #setValueDelimiter(char)} or {@link #setValueDelimiter(String)}.
 * The following shows an example with variable default value settings:
 * <pre>
 * Map valuesMap = HashMap();
 * valuesMap.put(&quot;animal&quot;, &quot;quick brown fox&quot;);
 * valuesMap.put(&quot;target&quot;, &quot;lazy dog&quot;);
 * String templateString = &quot;The ${animal} jumps over the ${target}. ${undefined.number:-1234567890}.&quot;;
 * StrSubstitutor sub = new StrSubstitutor(valuesMap);
 * String resolvedString = sub.replace(templateString);
 * </pre>
 * yielding:
 * <pre>
 *      The quick brown fox jumps over the lazy dog. 1234567890.
 * </pre>
 * <p>
 * In addition to this usage pattern there are some static convenience methods that
 * cover the most common use cases. These methods can be used without the need of
 * manually creating an instance. However if multiple replace operations are to be
 * performed, creating and reusing an instance of this class will be more efficient.
 * <p>
 * Variable replacement works in a recursive way. Thus, if a variable value contains
 * a variable then that variable will also be replaced. Cyclic replacements are
 * detected and will cause an exception to be thrown.
 * <p>
 * Sometimes the interpolation's result must contain a variable prefix. As an example
 * take the following source text:
 * <pre>
 *   The variable ${${name}} must be used.
 * </pre>
 * Here only the variable's name referred to in the text should be replaced resulting
 * in the text (assuming that the value of the <code>name</code> variable is <code>x</code>):
 * <pre>
 *   The variable ${x} must be used.
 * </pre>
 * To achieve this effect there are two possibilities: Either set a different prefix
 * and suffix for variables which do not conflict with the result text you want to
 * produce. The other possibility is to use the escape character, by default '$'.
 * If this character is placed before a variable reference, this reference is ignored
 * and won't be replaced. For example:
 * <pre>
 *   The variable $${${name}} must be used.
 * </pre>
 * <p>
 * In some complex scenarios you might even want to perform substitution in the
 * names of variables, for instance
 * <pre>
 * ${jre-${java.specification.version}}
 * </pre>
 * <code>StrSubstitutor</code> supports this recursive substitution in variable
 * names, but it has to be enabled explicitly by setting the
 * {@link #setEnableSubstitutionInVariables(boolean) enableSubstitutionInVariables}
 * property to <b>true</b>.
 * <p>This class is <b>not</b> thread safe.</p>
 *
 * @since 2.2
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/StrSubstitutor.html">
 * StrSubstitutor</a> instead
 */
@Deprecated
public class StrSubstitutor {public static class __CLR4_5_2fkqfkqlvha7bqf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,20580,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constant for the default escape character.
     */
    public static final char DEFAULT_ESCAPE = '$';
    /**
     * Constant for the default variable prefix.
     */
    public static final StrMatcher DEFAULT_PREFIX = StrMatcher.stringMatcher("${");
    /**
     * Constant for the default variable suffix.
     */
    public static final StrMatcher DEFAULT_SUFFIX = StrMatcher.stringMatcher("}");
    /**
     * Constant for the default value delimiter of a variable.
     * @since 3.2
     */
    public static final StrMatcher DEFAULT_VALUE_DELIMITER = StrMatcher.stringMatcher(":-");

    /**
     * Stores the escape character.
     */
    private char escapeChar;
    /**
     * Stores the variable prefix.
     */
    private StrMatcher prefixMatcher;
    /**
     * Stores the variable suffix.
     */
    private StrMatcher suffixMatcher;
    /**
     * Stores the default variable value delimiter
     */
    private StrMatcher valueDelimiterMatcher;
    /**
     * Variable resolution is delegated to an implementor of VariableResolver.
     */
    private StrLookup<?> variableResolver;
    /**
     * The flag whether substitution in variable names is enabled.
     */
    private boolean enableSubstitutionInVariables;
    /**
     * Whether escapes should be preserved.  Default is false;
     */
    private boolean preserveEscapes = false;

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables in the given source object with
     * their matching values from the map.
     *
     * @param <V> the type of the values in the map
     * @param source  the source text containing the variables to substitute, null returns null
     * @param valueMap  the map with the values, may be null
     * @return the result of the replace operation
     */
    public static <V> String replace(final Object source, final Map<String, V> valueMap) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20186);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20187);return new StrSubstitutor(valueMap).replace(source);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables in the given source object with
     * their matching values from the map. This method allows to specify a
     * custom variable prefix and suffix
     *
     * @param <V> the type of the values in the map
     * @param source  the source text containing the variables to substitute, null returns null
     * @param valueMap  the map with the values, may be null
     * @param prefix  the prefix of variables, not null
     * @param suffix  the suffix of variables, not null
     * @return the result of the replace operation
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public static <V> String replace(final Object source, final Map<String, V> valueMap, final String prefix, final String suffix) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20188);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20189);return new StrSubstitutor(valueMap, prefix, suffix).replace(source);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables in the given source object with their matching
     * values from the properties.
     *
     * @param source the source text containing the variables to substitute, null returns null
     * @param valueProperties the properties with values, may be null
     * @return the result of the replace operation
     */
    public static String replace(final Object source, final Properties valueProperties) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20190);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20191);if ((((valueProperties == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20192)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20193)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20194);return source.toString();
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20195);final Map<String,String> valueMap = new HashMap<>();
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20196);final Enumeration<?> propNames = valueProperties.propertyNames();
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20197);while ((((propNames.hasMoreElements())&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20198)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20199)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20200);final String propName = (String)propNames.nextElement();
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20201);final String propValue = valueProperties.getProperty(propName);
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20202);valueMap.put(propName, propValue);
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20203);return StrSubstitutor.replace(source, valueMap);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables in the given source object with
     * their matching values from the system properties.
     *
     * @param source  the source text containing the variables to substitute, null returns null
     * @return the result of the replace operation
     */
    public static String replaceSystemProperties(final Object source) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20204);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20205);return new StrSubstitutor(StrLookup.systemPropertiesLookup()).replace(source);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new instance with defaults for variable prefix and suffix
     * and the escaping character.
     */
    public StrSubstitutor() {
        this(null, DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ESCAPE);__CLR4_5_2fkqfkqlvha7bqf.R.inc(20207);try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20206);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it. Uses defaults for variable
     * prefix and suffix and the escaping character.
     *
     * @param <V> the type of the values in the map
     * @param valueMap  the map with the variables' values, may be null
     */
    public <V> StrSubstitutor(final Map<String, V> valueMap) {
        this(StrLookup.mapLookup(valueMap), DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ESCAPE);__CLR4_5_2fkqfkqlvha7bqf.R.inc(20209);try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20208);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it. Uses a default escaping character.
     *
     * @param <V> the type of the values in the map
     * @param valueMap  the map with the variables' values, may be null
     * @param prefix  the prefix for variables, not null
     * @param suffix  the suffix for variables, not null
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public <V> StrSubstitutor(final Map<String, V> valueMap, final String prefix, final String suffix) {
        this(StrLookup.mapLookup(valueMap), prefix, suffix, DEFAULT_ESCAPE);__CLR4_5_2fkqfkqlvha7bqf.R.inc(20211);try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20210);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param <V> the type of the values in the map
     * @param valueMap  the map with the variables' values, may be null
     * @param prefix  the prefix for variables, not null
     * @param suffix  the suffix for variables, not null
     * @param escape  the escape character
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public <V> StrSubstitutor(final Map<String, V> valueMap, final String prefix, final String suffix,
                              final char escape) {
        this(StrLookup.mapLookup(valueMap), prefix, suffix, escape);__CLR4_5_2fkqfkqlvha7bqf.R.inc(20213);try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20212);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param <V> the type of the values in the map
     * @param valueMap  the map with the variables' values, may be null
     * @param prefix  the prefix for variables, not null
     * @param suffix  the suffix for variables, not null
     * @param escape  the escape character
     * @param valueDelimiter  the variable default value delimiter, may be null
     * @throws IllegalArgumentException if the prefix or suffix is null
     * @since 3.2
     */
    public <V> StrSubstitutor(final Map<String, V> valueMap, final String prefix, final String suffix,
                              final char escape, final String valueDelimiter) {
        this(StrLookup.mapLookup(valueMap), prefix, suffix, escape, valueDelimiter);__CLR4_5_2fkqfkqlvha7bqf.R.inc(20215);try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20214);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param variableResolver  the variable resolver, may be null
     */
    public StrSubstitutor(final StrLookup<?> variableResolver) {
        this(variableResolver, DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ESCAPE);__CLR4_5_2fkqfkqlvha7bqf.R.inc(20217);try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20216);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param variableResolver  the variable resolver, may be null
     * @param prefix  the prefix for variables, not null
     * @param suffix  the suffix for variables, not null
     * @param escape  the escape character
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public StrSubstitutor(final StrLookup<?> variableResolver, final String prefix, final String suffix,
                          final char escape) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20218);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20219);this.setVariableResolver(variableResolver);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20220);this.setVariablePrefix(prefix);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20221);this.setVariableSuffix(suffix);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20222);this.setEscapeChar(escape);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20223);this.setValueDelimiterMatcher(DEFAULT_VALUE_DELIMITER);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param variableResolver  the variable resolver, may be null
     * @param prefix  the prefix for variables, not null
     * @param suffix  the suffix for variables, not null
     * @param escape  the escape character
     * @param valueDelimiter  the variable default value delimiter string, may be null
     * @throws IllegalArgumentException if the prefix or suffix is null
     * @since 3.2
     */
    public StrSubstitutor(final StrLookup<?> variableResolver, final String prefix, final String suffix,
                          final char escape, final String valueDelimiter) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20224);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20225);this.setVariableResolver(variableResolver);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20226);this.setVariablePrefix(prefix);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20227);this.setVariableSuffix(suffix);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20228);this.setEscapeChar(escape);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20229);this.setValueDelimiter(valueDelimiter);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param variableResolver  the variable resolver, may be null
     * @param prefixMatcher  the prefix for variables, not null
     * @param suffixMatcher  the suffix for variables, not null
     * @param escape  the escape character
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public StrSubstitutor(
            final StrLookup<?> variableResolver, final StrMatcher prefixMatcher, final StrMatcher suffixMatcher,
            final char escape) {
        this(variableResolver, prefixMatcher, suffixMatcher, escape, DEFAULT_VALUE_DELIMITER);__CLR4_5_2fkqfkqlvha7bqf.R.inc(20231);try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20230);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param variableResolver  the variable resolver, may be null
     * @param prefixMatcher  the prefix for variables, not null
     * @param suffixMatcher  the suffix for variables, not null
     * @param escape  the escape character
     * @param valueDelimiterMatcher  the variable default value delimiter matcher, may be null
     * @throws IllegalArgumentException if the prefix or suffix is null
     * @since 3.2
     */
    public StrSubstitutor(
            final StrLookup<?> variableResolver, final StrMatcher prefixMatcher, final StrMatcher suffixMatcher,
            final char escape, final StrMatcher valueDelimiterMatcher) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20232);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20233);this.setVariableResolver(variableResolver);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20234);this.setVariablePrefixMatcher(prefixMatcher);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20235);this.setVariableSuffixMatcher(suffixMatcher);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20236);this.setEscapeChar(escape);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20237);this.setValueDelimiterMatcher(valueDelimiterMatcher);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source string as a template.
     *
     * @param source  the string to replace in, null returns null
     * @return the result of the replace operation
     */
    public String replace(final String source) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20238);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20239);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20240)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20241)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20242);return null;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20243);final StrBuilder buf = new StrBuilder(source);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20244);if ((((substitute(buf, 0, source.length()) == false)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20245)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20246)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20247);return source;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20248);return buf.toString();
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source string as a template.
     * <p>
     * Only the specified portion of the string will be processed.
     * The rest of the string is not processed, and is not returned.
     *
     * @param source  the string to replace in, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     */
    public String replace(final String source, final int offset, final int length) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20249);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20250);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20251)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20252)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20253);return null;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20254);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20255);if ((((substitute(buf, 0, length) == false)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20256)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20257)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20258);return source.substring(offset, offset + length);
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20259);return buf.toString();
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source array as a template.
     * The array is not altered by this method.
     *
     * @param source  the character array to replace in, not altered, null returns null
     * @return the result of the replace operation
     */
    public String replace(final char[] source) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20260);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20261);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20262)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20263)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20264);return null;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20265);final StrBuilder buf = new StrBuilder(source.length).append(source);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20266);substitute(buf, 0, source.length);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20267);return buf.toString();
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source array as a template.
     * The array is not altered by this method.
     * <p>
     * Only the specified portion of the array will be processed.
     * The rest of the array is not processed, and is not returned.
     *
     * @param source  the character array to replace in, not altered, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     */
    public String replace(final char[] source, final int offset, final int length) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20268);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20269);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20270)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20271)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20272);return null;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20273);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20274);substitute(buf, 0, length);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20275);return buf.toString();
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source buffer as a template.
     * The buffer is not altered by this method.
     *
     * @param source  the buffer to use as a template, not changed, null returns null
     * @return the result of the replace operation
     */
    public String replace(final StringBuffer source) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20276);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20277);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20278)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20279)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20280);return null;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20281);final StrBuilder buf = new StrBuilder(source.length()).append(source);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20282);substitute(buf, 0, buf.length());
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20283);return buf.toString();
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source buffer as a template.
     * The buffer is not altered by this method.
     * <p>
     * Only the specified portion of the buffer will be processed.
     * The rest of the buffer is not processed, and is not returned.
     *
     * @param source  the buffer to use as a template, not changed, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     */
    public String replace(final StringBuffer source, final int offset, final int length) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20284);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20285);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20286)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20287)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20288);return null;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20289);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20290);substitute(buf, 0, length);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20291);return buf.toString();
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source as a template.
     * The source is not altered by this method.
     *
     * @param source  the buffer to use as a template, not changed, null returns null
     * @return the result of the replace operation
     * @since 3.2
     */
    public String replace(final CharSequence source) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20292);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20293);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20294)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20295)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20296);return null;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20297);return replace(source, 0, source.length());
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source as a template.
     * The source is not altered by this method.
     * <p>
     * Only the specified portion of the buffer will be processed.
     * The rest of the buffer is not processed, and is not returned.
     *
     * @param source  the buffer to use as a template, not changed, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     * @since 3.2
     */
    public String replace(final CharSequence source, final int offset, final int length) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20298);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20299);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20300)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20301)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20302);return null;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20303);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20304);substitute(buf, 0, length);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20305);return buf.toString();
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source builder as a template.
     * The builder is not altered by this method.
     *
     * @param source  the builder to use as a template, not changed, null returns null
     * @return the result of the replace operation
     */
    public String replace(final StrBuilder source) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20306);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20307);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20308)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20309)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20310);return null;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20311);final StrBuilder buf = new StrBuilder(source.length()).append(source);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20312);substitute(buf, 0, buf.length());
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20313);return buf.toString();
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source builder as a template.
     * The builder is not altered by this method.
     * <p>
     * Only the specified portion of the builder will be processed.
     * The rest of the builder is not processed, and is not returned.
     *
     * @param source  the builder to use as a template, not changed, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     */
    public String replace(final StrBuilder source, final int offset, final int length) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20314);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20315);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20316)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20317)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20318);return null;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20319);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20320);substitute(buf, 0, length);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20321);return buf.toString();
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables in the given source object with
     * their matching values from the resolver. The input source object is
     * converted to a string using <code>toString</code> and is not altered.
     *
     * @param source  the source to replace in, null returns null
     * @return the result of the replace operation
     */
    public String replace(final Object source) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20322);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20323);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20324)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20325)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20326);return null;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20327);final StrBuilder buf = new StrBuilder().append(source);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20328);substitute(buf, 0, buf.length());
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20329);return buf.toString();
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables within the given source buffer
     * with their matching values from the resolver.
     * The buffer is updated with the result.
     *
     * @param source  the buffer to replace in, updated, null returns zero
     * @return true if altered
     */
    public boolean replaceIn(final StringBuffer source) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20330);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20331);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20332)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20333)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20334);return false;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20335);return replaceIn(source, 0, source.length());
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables within the given source buffer
     * with their matching values from the resolver.
     * The buffer is updated with the result.
     * <p>
     * Only the specified portion of the buffer will be processed.
     * The rest of the buffer is not processed, but it is not deleted.
     *
     * @param source  the buffer to replace in, updated, null returns zero
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the buffer to be processed, must be valid
     * @return true if altered
     */
    public boolean replaceIn(final StringBuffer source, final int offset, final int length) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20336);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20337);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20338)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20339)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20340);return false;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20341);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20342);if ((((substitute(buf, 0, length) == false)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20343)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20344)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20345);return false;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20346);source.replace(offset, offset + length, buf.toString());
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20347);return true;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

  //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables within the given source buffer
     * with their matching values from the resolver.
     * The buffer is updated with the result.
     *
     * @param source  the buffer to replace in, updated, null returns zero
     * @return true if altered
     * @since 3.2
     */
    public boolean replaceIn(final StringBuilder source) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20348);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20349);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20350)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20351)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20352);return false;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20353);return replaceIn(source, 0, source.length());
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables within the given source builder
     * with their matching values from the resolver.
     * The builder is updated with the result.
     * <p>
     * Only the specified portion of the buffer will be processed.
     * The rest of the buffer is not processed, but it is not deleted.
     *
     * @param source  the buffer to replace in, updated, null returns zero
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the buffer to be processed, must be valid
     * @return true if altered
     * @since 3.2
     */
    public boolean replaceIn(final StringBuilder source, final int offset, final int length) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20354);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20355);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20356)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20357)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20358);return false;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20359);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20360);if ((((substitute(buf, 0, length) == false)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20361)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20362)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20363);return false;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20364);source.replace(offset, offset + length, buf.toString());
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20365);return true;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables within the given source
     * builder with their matching values from the resolver.
     *
     * @param source  the builder to replace in, updated, null returns zero
     * @return true if altered
     */
    public boolean replaceIn(final StrBuilder source) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20366);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20367);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20368)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20369)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20370);return false;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20371);return substitute(source, 0, source.length());
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables within the given source
     * builder with their matching values from the resolver.
     * <p>
     * Only the specified portion of the builder will be processed.
     * The rest of the builder is not processed, but it is not deleted.
     *
     * @param source  the builder to replace in, null returns zero
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the builder to be processed, must be valid
     * @return true if altered
     */
    public boolean replaceIn(final StrBuilder source, final int offset, final int length) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20372);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20373);if ((((source == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20374)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20375)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20376);return false;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20377);return substitute(source, offset, length);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Internal method that substitutes the variables.
     * <p>
     * Most users of this class do not need to call this method. This method will
     * be called automatically by another (public) method.
     * <p>
     * Writers of subclasses can override this method if they need access to
     * the substitution process at the start or end.
     *
     * @param buf  the string builder to substitute into, not null
     * @param offset  the start offset within the builder, must be valid
     * @param length  the length within the builder to be processed, must be valid
     * @return true if altered
     */
    protected boolean substitute(final StrBuilder buf, final int offset, final int length) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20378);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20379);return substitute(buf, offset, length, null) > 0;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Recursive handler for multiple levels of interpolation. This is the main
     * interpolation method, which resolves the values of all variable references
     * contained in the passed in text.
     *
     * @param buf  the string builder to substitute into, not null
     * @param offset  the start offset within the builder, must be valid
     * @param length  the length within the builder to be processed, must be valid
     * @param priorVariables  the stack keeping track of the replaced variables, may be null
     * @return the length change that occurs, unless priorVariables is null when the int
     *  represents a boolean flag as to whether any change occurred.
     */
    private int substitute(final StrBuilder buf, final int offset, final int length, List<String> priorVariables) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20380);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20381);final StrMatcher pfxMatcher = getVariablePrefixMatcher();
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20382);final StrMatcher suffMatcher = getVariableSuffixMatcher();
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20383);final char escape = getEscapeChar();
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20384);final StrMatcher valueDelimMatcher = getValueDelimiterMatcher();
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20385);final boolean substitutionInVariablesEnabled = isEnableSubstitutionInVariables();

        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20386);final boolean top = priorVariables == null;
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20387);boolean altered = false;
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20388);int lengthChange = 0;
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20389);char[] chars = buf.buffer;
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20390);int bufEnd = offset + length;
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20391);int pos = offset;
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20392);while ((((pos < bufEnd)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20393)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20394)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20395);final int startMatchLen = pfxMatcher.isMatch(chars, pos, offset,
                    bufEnd);
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20396);if ((((startMatchLen == 0)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20397)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20398)==0&false))) {{
                __CLR4_5_2fkqfkqlvha7bqf.R.inc(20399);pos++;
            } }else {{
                // found variable start marker
                __CLR4_5_2fkqfkqlvha7bqf.R.inc(20400);if ((((pos > offset && chars[pos - 1] == escape)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20401)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20402)==0&false))) {{
                    // escaped
                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20403);if ((((preserveEscapes)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20404)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20405)==0&false))) {{
                        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20406);pos++;
                        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20407);continue;
                    }
                    }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20408);buf.deleteCharAt(pos - 1);
                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20409);chars = buf.buffer; // in case buffer was altered
                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20410);lengthChange--;
                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20411);altered = true;
                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20412);bufEnd--;
                } }else {{
                    // find suffix
                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20413);final int startPos = pos;
                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20414);pos += startMatchLen;
                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20415);int endMatchLen = 0;
                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20416);int nestedVarCount = 0;
                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20417);while ((((pos < bufEnd)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20418)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20419)==0&false))) {{
                        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20420);if (substitutionInVariablesEnabled
                                && (endMatchLen = pfxMatcher.isMatch(chars,
                                        pos, offset, bufEnd)) != 0) {{
                            // found a nested variable start
                            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20423);nestedVarCount++;
                            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20424);pos += endMatchLen;
                            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20425);continue;
                        }

                        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20426);endMatchLen = suffMatcher.isMatch(chars, pos, offset,
                                bufEnd);
                        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20427);if ((((endMatchLen == 0)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20428)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20429)==0&false))) {{
                            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20430);pos++;
                        } }else {{
                            // found variable end marker
                            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20431);if ((((nestedVarCount == 0)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20432)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20433)==0&false))) {{
                                __CLR4_5_2fkqfkqlvha7bqf.R.inc(20434);String varNameExpr = new String(chars, startPos
                                        + startMatchLen, pos - startPos
                                        - startMatchLen);
                                __CLR4_5_2fkqfkqlvha7bqf.R.inc(20435);if ((((substitutionInVariablesEnabled)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20436)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20437)==0&false))) {{
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20438);final StrBuilder bufName = new StrBuilder(varNameExpr);
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20439);substitute(bufName, 0, bufName.length());
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20440);varNameExpr = bufName.toString();
                                }
                                }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20441);pos += endMatchLen;
                                __CLR4_5_2fkqfkqlvha7bqf.R.inc(20442);final int endPos = pos;

                                __CLR4_5_2fkqfkqlvha7bqf.R.inc(20443);String varName = varNameExpr;
                                __CLR4_5_2fkqfkqlvha7bqf.R.inc(20444);String varDefaultValue = null;

                                __CLR4_5_2fkqfkqlvha7bqf.R.inc(20445);if ((((valueDelimMatcher != null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20446)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20447)==0&false))) {{
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20448);final char [] varNameExprChars = varNameExpr.toCharArray();
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20449);int valueDelimiterMatchLen = 0;
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20450);for (int i = 0; (((i < varNameExprChars.length)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20451)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20452)==0&false)); i++) {{
                                        // if there's any nested variable when nested variable substitution disabled, then stop resolving name and default value.
                                        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20453);if ((((!substitutionInVariablesEnabled
                                                && pfxMatcher.isMatch(varNameExprChars, i, i, varNameExprChars.length) != 0)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20454)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20455)==0&false))) {{
                                            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20456);break;
                                        }
                                        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20457);if ((valueDelimiterMatchLen = valueDelimMatcher.isMatch(varNameExprChars, i)) != 0) {{
                                            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20460);varName = varNameExpr.substring(0, i);
                                            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20461);varDefaultValue = varNameExpr.substring(i + valueDelimiterMatchLen);
                                            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20462);break;
                                        }
                                    }}
                                }}

                                // on the first call initialize priorVariables
                                }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20463);if ((((priorVariables == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20464)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20465)==0&false))) {{
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20466);priorVariables = new ArrayList<>();
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20467);priorVariables.add(new String(chars,
                                            offset, length));
                                }

                                // handle cyclic substitution
                                }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20468);checkCyclicSubstitution(varName, priorVariables);
                                __CLR4_5_2fkqfkqlvha7bqf.R.inc(20469);priorVariables.add(varName);

                                // resolve the variable
                                __CLR4_5_2fkqfkqlvha7bqf.R.inc(20470);String varValue = resolveVariable(varName, buf,
                                        startPos, endPos);
                                __CLR4_5_2fkqfkqlvha7bqf.R.inc(20471);if ((((varValue == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20472)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20473)==0&false))) {{
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20474);varValue = varDefaultValue;
                                }
                                }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20475);if ((((varValue != null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20476)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20477)==0&false))) {{
                                    // recursive replace
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20478);final int varLen = varValue.length();
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20479);buf.replace(startPos, endPos, varValue);
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20480);altered = true;
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20481);int change = substitute(buf, startPos,
                                            varLen, priorVariables);
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20482);change = change
                                            + varLen - (endPos - startPos);
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20483);pos += change;
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20484);bufEnd += change;
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20485);lengthChange += change;
                                    __CLR4_5_2fkqfkqlvha7bqf.R.inc(20486);chars = buf.buffer; // in case buffer was
                                                        // altered
                                }

                                // remove variable from the cyclic stack
                                }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20487);priorVariables
                                        .remove(priorVariables.size() - 1);
                                __CLR4_5_2fkqfkqlvha7bqf.R.inc(20488);break;
                            }
                            }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20489);nestedVarCount--;
                            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20490);pos += endMatchLen;
                        }
                    }}
                }}
            }}
        }}
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20491);if ((((top)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20492)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20493)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20494);return (((altered )&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20495)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20496)==0&false))? 1 : 0;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20497);return lengthChange;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Checks if the specified variable is already in the stack (list) of variables.
     *
     * @param varName  the variable name to check
     * @param priorVariables  the list of prior variables
     */
    private void checkCyclicSubstitution(final String varName, final List<String> priorVariables) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20498);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20499);if ((((priorVariables.contains(varName) == false)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20500)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20501)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20502);return;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20503);final StrBuilder buf = new StrBuilder(256);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20504);buf.append("Infinite loop in property interpolation of ");
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20505);buf.append(priorVariables.remove(0));
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20506);buf.append(": ");
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20507);buf.appendWithSeparators(priorVariables, "->");
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20508);throw new IllegalStateException(buf.toString());
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Internal method that resolves the value of a variable.
     * <p>
     * Most users of this class do not need to call this method. This method is
     * called automatically by the substitution process.
     * <p>
     * Writers of subclasses can override this method if they need to alter
     * how each substitution occurs. The method is passed the variable's name
     * and must return the corresponding value. This implementation uses the
     * {@link #getVariableResolver()} with the variable's name as the key.
     *
     * @param variableName  the name of the variable, not null
     * @param buf  the buffer where the substitution is occurring, not null
     * @param startPos  the start position of the variable including the prefix, valid
     * @param endPos  the end position of the variable including the suffix, valid
     * @return the variable's value or <b>null</b> if the variable is unknown
     */
    protected String resolveVariable(final String variableName, final StrBuilder buf, final int startPos, final int endPos) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20509);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20510);final StrLookup<?> resolver = getVariableResolver();
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20511);if ((((resolver == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20512)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20513)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20514);return null;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20515);return resolver.lookup(variableName);
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    // Escape
    //-----------------------------------------------------------------------
    /**
     * Returns the escape character.
     *
     * @return the character used for escaping variable references
     */
    public char getEscapeChar() {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20516);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20517);return this.escapeChar;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets the escape character.
     * If this character is placed before a variable reference in the source
     * text, this variable will be ignored.
     *
     * @param escapeCharacter  the escape character (0 for disabling escaping)
     */
    public void setEscapeChar(final char escapeCharacter) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20518);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20519);this.escapeChar = escapeCharacter;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    // Prefix
    //-----------------------------------------------------------------------
    /**
     * Gets the variable prefix matcher currently in use.
     * <p>
     * The variable prefix is the character or characters that identify the
     * start of a variable. This prefix is expressed in terms of a matcher
     * allowing advanced prefix matches.
     *
     * @return the prefix matcher in use
     */
    public StrMatcher getVariablePrefixMatcher() {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20520);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20521);return prefixMatcher;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets the variable prefix matcher currently in use.
     * <p>
     * The variable prefix is the character or characters that identify the
     * start of a variable. This prefix is expressed in terms of a matcher
     * allowing advanced prefix matches.
     *
     * @param prefixMatcher  the prefix matcher to use, null ignored
     * @return this, to enable chaining
     * @throws IllegalArgumentException if the prefix matcher is null
     */
    public StrSubstitutor setVariablePrefixMatcher(final StrMatcher prefixMatcher) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20522);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20523);if ((((prefixMatcher == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20524)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20525)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20526);throw new IllegalArgumentException("Variable prefix matcher must not be null!");
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20527);this.prefixMatcher = prefixMatcher;
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20528);return this;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets the variable prefix to use.
     * <p>
     * The variable prefix is the character or characters that identify the
     * start of a variable. This method allows a single character prefix to
     * be easily set.
     *
     * @param prefix  the prefix character to use
     * @return this, to enable chaining
     */
    public StrSubstitutor setVariablePrefix(final char prefix) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20529);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20530);return setVariablePrefixMatcher(StrMatcher.charMatcher(prefix));
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets the variable prefix to use.
     * <p>
     * The variable prefix is the character or characters that identify the
     * start of a variable. This method allows a string prefix to be easily set.
     *
     * @param prefix  the prefix for variables, not null
     * @return this, to enable chaining
     * @throws IllegalArgumentException if the prefix is null
     */
    public StrSubstitutor setVariablePrefix(final String prefix) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20531);
       __CLR4_5_2fkqfkqlvha7bqf.R.inc(20532);if ((((prefix == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20533)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20534)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20535);throw new IllegalArgumentException("Variable prefix must not be null!");
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20536);return setVariablePrefixMatcher(StrMatcher.stringMatcher(prefix));
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    // Suffix
    //-----------------------------------------------------------------------
    /**
     * Gets the variable suffix matcher currently in use.
     * <p>
     * The variable suffix is the character or characters that identify the
     * end of a variable. This suffix is expressed in terms of a matcher
     * allowing advanced suffix matches.
     *
     * @return the suffix matcher in use
     */
    public StrMatcher getVariableSuffixMatcher() {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20537);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20538);return suffixMatcher;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets the variable suffix matcher currently in use.
     * <p>
     * The variable suffix is the character or characters that identify the
     * end of a variable. This suffix is expressed in terms of a matcher
     * allowing advanced suffix matches.
     *
     * @param suffixMatcher  the suffix matcher to use, null ignored
     * @return this, to enable chaining
     * @throws IllegalArgumentException if the suffix matcher is null
     */
    public StrSubstitutor setVariableSuffixMatcher(final StrMatcher suffixMatcher) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20539);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20540);if ((((suffixMatcher == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20541)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20542)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20543);throw new IllegalArgumentException("Variable suffix matcher must not be null!");
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20544);this.suffixMatcher = suffixMatcher;
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20545);return this;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets the variable suffix to use.
     * <p>
     * The variable suffix is the character or characters that identify the
     * end of a variable. This method allows a single character suffix to
     * be easily set.
     *
     * @param suffix  the suffix character to use
     * @return this, to enable chaining
     */
    public StrSubstitutor setVariableSuffix(final char suffix) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20546);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20547);return setVariableSuffixMatcher(StrMatcher.charMatcher(suffix));
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets the variable suffix to use.
     * <p>
     * The variable suffix is the character or characters that identify the
     * end of a variable. This method allows a string suffix to be easily set.
     *
     * @param suffix  the suffix for variables, not null
     * @return this, to enable chaining
     * @throws IllegalArgumentException if the suffix is null
     */
    public StrSubstitutor setVariableSuffix(final String suffix) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20548);
       __CLR4_5_2fkqfkqlvha7bqf.R.inc(20549);if ((((suffix == null)&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20550)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20551)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20552);throw new IllegalArgumentException("Variable suffix must not be null!");
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20553);return setVariableSuffixMatcher(StrMatcher.stringMatcher(suffix));
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    // Variable Default Value Delimiter
    //-----------------------------------------------------------------------
    /**
     * Gets the variable default value delimiter matcher currently in use.
     * <p>
     * The variable default value delimiter is the character or characters that delimit the
     * variable name and the variable default value. This delimiter is expressed in terms of a matcher
     * allowing advanced variable default value delimiter matches.
     * <p>
     * If it returns null, then the variable default value resolution is disabled.
     *
     * @return the variable default value delimiter matcher in use, may be null
     * @since 3.2
     */
    public StrMatcher getValueDelimiterMatcher() {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20554);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20555);return valueDelimiterMatcher;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets the variable default value delimiter matcher to use.
     * <p>
     * The variable default value delimiter is the character or characters that delimit the
     * variable name and the variable default value. This delimiter is expressed in terms of a matcher
     * allowing advanced variable default value delimiter matches.
     * <p>
     * If the <code>valueDelimiterMatcher</code> is null, then the variable default value resolution
     * becomes disabled.
     *
     * @param valueDelimiterMatcher  variable default value delimiter matcher to use, may be null
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrSubstitutor setValueDelimiterMatcher(final StrMatcher valueDelimiterMatcher) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20556);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20557);this.valueDelimiterMatcher = valueDelimiterMatcher;
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20558);return this;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets the variable default value delimiter to use.
     * <p>
     * The variable default value delimiter is the character or characters that delimit the
     * variable name and the variable default value. This method allows a single character
     * variable default value delimiter to be easily set.
     *
     * @param valueDelimiter  the variable default value delimiter character to use
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrSubstitutor setValueDelimiter(final char valueDelimiter) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20559);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20560);return setValueDelimiterMatcher(StrMatcher.charMatcher(valueDelimiter));
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets the variable default value delimiter to use.
     * <p>
     * The variable default value delimiter is the character or characters that delimit the
     * variable name and the variable default value. This method allows a string
     * variable default value delimiter to be easily set.
     * <p>
     * If the <code>valueDelimiter</code> is null or empty string, then the variable default
     * value resolution becomes disabled.
     *
     * @param valueDelimiter  the variable default value delimiter string to use, may be null or empty
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrSubstitutor setValueDelimiter(final String valueDelimiter) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20561);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20562);if ((((StringUtils.isEmpty(valueDelimiter))&&(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20563)!=0|true))||(__CLR4_5_2fkqfkqlvha7bqf.R.iget(20564)==0&false))) {{
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20565);setValueDelimiterMatcher(null);
            __CLR4_5_2fkqfkqlvha7bqf.R.inc(20566);return this;
        }
        }__CLR4_5_2fkqfkqlvha7bqf.R.inc(20567);return setValueDelimiterMatcher(StrMatcher.stringMatcher(valueDelimiter));
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    // Resolver
    //-----------------------------------------------------------------------
    /**
     * Gets the VariableResolver that is used to lookup variables.
     *
     * @return the VariableResolver
     */
    public StrLookup<?> getVariableResolver() {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20568);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20569);return this.variableResolver;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets the VariableResolver that is used to lookup variables.
     *
     * @param variableResolver  the VariableResolver
     */
    public void setVariableResolver(final StrLookup<?> variableResolver) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20570);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20571);this.variableResolver = variableResolver;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    // Substitution support in variable names
    //-----------------------------------------------------------------------
    /**
     * Returns a flag whether substitution is done in variable names.
     *
     * @return the substitution in variable names flag
     * @since 3.0
     */
    public boolean isEnableSubstitutionInVariables() {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20572);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20573);return enableSubstitutionInVariables;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets a flag whether substitution is done in variable names. If set to
     * <b>true</b>, the names of variables can contain other variables which are
     * processed first before the original variable is evaluated, e.g.
     * <code>${jre-${java.version}}</code>. The default value is <b>false</b>.
     *
     * @param enableSubstitutionInVariables the new value of the flag
     * @since 3.0
     */
    public void setEnableSubstitutionInVariables(
            final boolean enableSubstitutionInVariables) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20574);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20575);this.enableSubstitutionInVariables = enableSubstitutionInVariables;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Returns the flag controlling whether escapes are preserved during
     * substitution.
     * 
     * @return the preserve escape flag
     * @since 3.5
     */
    public boolean isPreserveEscapes() {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20576);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20577);return preserveEscapes;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}

    /**
     * Sets a flag controlling whether escapes are preserved during
     * substitution.  If set to <b>true</b>, the escape character is retained
     * during substitution (e.g. <code>$${this-is-escaped}</code> remains
     * <code>$${this-is-escaped}</code>).  If set to <b>false</b>, the escape
     * character is removed during substitution (e.g.
     * <code>$${this-is-escaped}</code> becomes
     * <code>${this-is-escaped}</code>).  The default value is <b>false</b>
     * 
     * @param preserveEscapes true if escapes are to be preserved
     * @since 3.5
     */
    public void setPreserveEscapes(final boolean preserveEscapes) {try{__CLR4_5_2fkqfkqlvha7bqf.R.inc(20578);
        __CLR4_5_2fkqfkqlvha7bqf.R.inc(20579);this.preserveEscapes = preserveEscapes;
    }finally{__CLR4_5_2fkqfkqlvha7bqf.R.flushNeeded();}}
}
