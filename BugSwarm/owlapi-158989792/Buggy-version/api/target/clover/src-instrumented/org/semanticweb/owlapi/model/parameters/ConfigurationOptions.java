/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.model.parameters;

import java.io.IOException;
import java.io.InputStream;
import java.util.EnumMap;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.ByName;
import org.semanticweb.owlapi.model.MissingImportHandlingStrategy;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration.MissingOntologyHeaderStrategy;
import org.semanticweb.owlapi.model.PriorityCollectionSorting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This enum handles default values and config file or system property
 * overrides. The config file name is {@code owlapi.properties}; to enable, make
 * sure the file is in the classpath. The property names are
 * {@code "org.semanticweb.owlapi.model.parameters.ConfigurationOptions."+name()}
 * , both in the properties file and in the system properties.
 */
public enum ConfigurationOptions {
    //@formatter:off
    /** True if http compression 
     * should be used. */
    ACCEPT_HTTP_COMPRESSION             (Boolean.TRUE),
    /** Timeout for connections. */
    CONNECTION_TIMEOUT                  (Integer.valueOf(20000)),
    /** True if redirects should be 
     * followed across protocols. */
    FOLLOW_REDIRECTS                    (Boolean.TRUE),
    /** True if annotations should 
     * be loaded, false if skipped. */
    LOAD_ANNOTATIONS                    (Boolean.TRUE),
    /** Missing imports handling 
     * strategy. */
    MISSING_IMPORT_HANDLING_STRATEGY    (MissingImportHandlingStrategy.THROW_EXCEPTION),
    /** Default missing ontology 
     * strategy. */
    MISSING_ONTOLOGY_HEADER_STRATEGY    (MissingOntologyHeaderStrategy.INCLUDE_GRAPH),
    /** Flag to enable stack 
     * traces on parsing exceptions. */
    REPORT_STACK_TRACES                 (Boolean.TRUE),
    /** Number of retries to 
     * attempt when retrieving an 
     * ontology form a remote URL. 
     * Defaults to 5. */
    RETRIES_TO_ATTEMPT                  (Integer.valueOf(5)),
    /** True if strict parsing 
     * should be used. */
    PARSE_WITH_STRICT_CONFIGURATION     (Boolean.FALSE),
    /** True if Dublin Core. */
    TREAT_DUBLINCORE_AS_BUILTIN         (Boolean.TRUE),
    /** sort configuration for 
     * priority collections */
    PRIORITY_COLLECTION_SORTING         (PriorityCollectionSorting.ON_SET_INJECTION_ONLY),
    // Save options
    /** True if ids for blank 
     * nodes should always be 
     * written (axioms and 
     * anonymous individuals 
     * only). */
    SAVE_IDS                            (Boolean.FALSE),
    /** True if all anonymous 
     * individuals should have 
     * their ids remapped after 
     * parsing. */
    REMAP_IDS                           (Boolean.TRUE),
    /** True if entities should 
     * be used for namespace 
     * abbreviations. */
    USE_NAMESPACE_ENTITIES              (Boolean.FALSE),
    /** True if indenting should 
     * be used when writing out 
     * a file. */
    INDENTING                           (Boolean.TRUE),
    /** Size of indentation 
     * between levels. Only used 
     * if indenting is to true. */
    INDENT_SIZE                         (Integer.valueOf(4)),
    /** True if rdfs:label values 
     * are to be used as banners 
     * in text output. */
    LABELS_AS_BANNER                    (Boolean.FALSE),
    /** True if banners for ontology 
     * sections and entity comments 
     * should be outputted. */
    BANNERS_ENABLED                     (Boolean.TRUE),
    /** List of banned 
     * parsers keys. */
    BANNED_PARSERS                      ("");
    //@formatter:on
    private static final String PREFIX = "org.semanticweb.owlapi.model.parameters.ConfigurationOptions.";
    private Object defaultValue;
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationOptions.class);
    private static final EnumMap<ConfigurationOptions, Object> owlapiProperties = loadProperties();

    ConfigurationOptions(Object o) {try{__CLR4_5_22if2iflvickn8u.R.inc(3255);
        __CLR4_5_22if2iflvickn8u.R.inc(3256);defaultValue = o;
    }finally{__CLR4_5_22if2iflvickn8u.R.flushNeeded();}}

    private static EnumMap<ConfigurationOptions, Object> loadProperties() {try{__CLR4_5_22if2iflvickn8u.R.inc(3257);
        __CLR4_5_22if2iflvickn8u.R.inc(3258);EnumMap<ConfigurationOptions, Object> map = new EnumMap<>(ConfigurationOptions.class);
        __CLR4_5_22if2iflvickn8u.R.inc(3259);Properties props = new Properties();
        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_22if2iflvickn8u.R.inc(3260);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_22if2iflvickn8u.R.inc(3261);}};InputStream stream = ConfigurationOptions.class.getResourceAsStream("/owlapi.properties")) {
            __CLR4_5_22if2iflvickn8u.R.inc(3262);if ((((stream != null)&&(__CLR4_5_22if2iflvickn8u.R.iget(3263)!=0|true))||(__CLR4_5_22if2iflvickn8u.R.iget(3264)==0&false))) {{
                __CLR4_5_22if2iflvickn8u.R.inc(3265);props.load(stream);
            }
        }} catch (IOException e) {
            __CLR4_5_22if2iflvickn8u.R.inc(3266);LOGGER.error("Properties cannot be loaded", e);
        }
        __CLR4_5_22if2iflvickn8u.R.inc(3267);for (Map.Entry<Object, Object> e : props.entrySet()) {{
            __CLR4_5_22if2iflvickn8u.R.inc(3268);ConfigurationOptions option = find(e.getKey().toString());
            __CLR4_5_22if2iflvickn8u.R.inc(3269);if ((((option != null)&&(__CLR4_5_22if2iflvickn8u.R.iget(3270)!=0|true))||(__CLR4_5_22if2iflvickn8u.R.iget(3271)==0&false))) {{
                __CLR4_5_22if2iflvickn8u.R.inc(3272);map.put(option, e.getValue());
            }
        }}
        }__CLR4_5_22if2iflvickn8u.R.inc(3273);return map;
    }finally{__CLR4_5_22if2iflvickn8u.R.flushNeeded();}}

    /**
     * @param parameterName
     *        parameter name - by default the full name of this enumeration plus
     *        the enum member name
     * @return ,atching ConfigurationOptions member, or null if none found
     */
    @Nullable
    public static ConfigurationOptions find(String parameterName) {try{__CLR4_5_22if2iflvickn8u.R.inc(3274);
        __CLR4_5_22if2iflvickn8u.R.inc(3275);if ((((!parameterName.startsWith(PREFIX))&&(__CLR4_5_22if2iflvickn8u.R.iget(3276)!=0|true))||(__CLR4_5_22if2iflvickn8u.R.iget(3277)==0&false))) {{
            __CLR4_5_22if2iflvickn8u.R.inc(3278);return null;
        }
        }__CLR4_5_22if2iflvickn8u.R.inc(3279);return valueOf(parameterName.substring(PREFIX.length()));
    }finally{__CLR4_5_22if2iflvickn8u.R.flushNeeded();}}

    /**
     * @param value
     *        value to parse according to the enum default value
     * @param type
     *        type of the returned value
     * @return parsed value
     */
    protected <T> T parse(Object value, Class<T> type) {try{__CLR4_5_22if2iflvickn8u.R.inc(3280);
        __CLR4_5_22if2iflvickn8u.R.inc(3281);if ((((Boolean.class.equals(type))&&(__CLR4_5_22if2iflvickn8u.R.iget(3282)!=0|true))||(__CLR4_5_22if2iflvickn8u.R.iget(3283)==0&false))) {{
            __CLR4_5_22if2iflvickn8u.R.inc(3284);return type.cast(Boolean.valueOf(value.toString()));
        }
        }__CLR4_5_22if2iflvickn8u.R.inc(3285);if ((((Long.class.equals(type))&&(__CLR4_5_22if2iflvickn8u.R.iget(3286)!=0|true))||(__CLR4_5_22if2iflvickn8u.R.iget(3287)==0&false))) {{
            __CLR4_5_22if2iflvickn8u.R.inc(3288);return type.cast(Long.valueOf(value.toString()));
        }
        }__CLR4_5_22if2iflvickn8u.R.inc(3289);if ((((Integer.class.equals(type))&&(__CLR4_5_22if2iflvickn8u.R.iget(3290)!=0|true))||(__CLR4_5_22if2iflvickn8u.R.iget(3291)==0&false))) {{
            __CLR4_5_22if2iflvickn8u.R.inc(3292);return type.cast(Integer.valueOf(value.toString()));
        }
        }__CLR4_5_22if2iflvickn8u.R.inc(3293);if ((((defaultValue instanceof ByName)&&(__CLR4_5_22if2iflvickn8u.R.iget(3294)!=0|true))||(__CLR4_5_22if2iflvickn8u.R.iget(3295)==0&false))) {{
            __CLR4_5_22if2iflvickn8u.R.inc(3296);return type.cast(((ByName<?>) defaultValue).byName(value.toString()));
        }
        }__CLR4_5_22if2iflvickn8u.R.inc(3297);return type.cast(value);
    }finally{__CLR4_5_22if2iflvickn8u.R.flushNeeded();}}

    /**
     * @param type
     *        type for this value
     * @param overrides
     *        local overrides
     * @return value for this configuration option. Values are evaluated as
     *         follows: first, check overrides; if no overrides are present,
     *         check if a system property with the expected name is set; if not,
     *         check the config file; if no value is set in the config file, use
     *         the default defined in this enumeration.
     */
    public <T> T getValue(Class<T> type, EnumMap<ConfigurationOptions, Object> overrides) {try{__CLR4_5_22if2iflvickn8u.R.inc(3298);
        __CLR4_5_22if2iflvickn8u.R.inc(3299);Object override = overrides.get(this);
        __CLR4_5_22if2iflvickn8u.R.inc(3300);if ((((override != null)&&(__CLR4_5_22if2iflvickn8u.R.iget(3301)!=0|true))||(__CLR4_5_22if2iflvickn8u.R.iget(3302)==0&false))) {{
            __CLR4_5_22if2iflvickn8u.R.inc(3303);return parse(override, type);
        }
        // first system properties
        }__CLR4_5_22if2iflvickn8u.R.inc(3304);Object fromSystemProperties = System.getProperty(PREFIX + name());
        __CLR4_5_22if2iflvickn8u.R.inc(3305);if ((((fromSystemProperties != null)&&(__CLR4_5_22if2iflvickn8u.R.iget(3306)!=0|true))||(__CLR4_5_22if2iflvickn8u.R.iget(3307)==0&false))) {{
            __CLR4_5_22if2iflvickn8u.R.inc(3308);return parse(fromSystemProperties, type);
        }
        }__CLR4_5_22if2iflvickn8u.R.inc(3309);Object fromConfigFile = owlapiProperties.get(this);
        __CLR4_5_22if2iflvickn8u.R.inc(3310);if ((((fromConfigFile != null)&&(__CLR4_5_22if2iflvickn8u.R.iget(3311)!=0|true))||(__CLR4_5_22if2iflvickn8u.R.iget(3312)==0&false))) {{
            __CLR4_5_22if2iflvickn8u.R.inc(3313);return parse(fromConfigFile, type);
        }
        }__CLR4_5_22if2iflvickn8u.R.inc(3314);return type.cast(defaultValue);
    }finally{__CLR4_5_22if2iflvickn8u.R.flushNeeded();}}

    /**
     * @param type
     *        type to cast to
     * @return default value
     */
    public <T> T getDefaultValue(Class<T> type) {try{__CLR4_5_22if2iflvickn8u.R.inc(3315);
        __CLR4_5_22if2iflvickn8u.R.inc(3316);return type.cast(defaultValue);
    }finally{__CLR4_5_22if2iflvickn8u.R.flushNeeded();}}
;public static class __CLR4_5_22if2iflvickn8u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,3317,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
