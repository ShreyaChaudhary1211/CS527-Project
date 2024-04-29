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
package org.apache.commons.lang3.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Default implementation of the context storing the label-value pairs for contexted exceptions.
 * <p>
 * This implementation is serializable, however this is dependent on the values that
 * are added also being serializable.
 * </p>
 * 
 * @see ContextedException
 * @see ContextedRuntimeException
 * @since 3.0
 */
public class DefaultExceptionContext implements ExceptionContext, Serializable {public static class __CLR4_5_2b8hb8hlvha7alp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,14631,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The serialization version. */
    private static final long serialVersionUID = 20110706L;

    /** The list storing the label-data pairs. */
    private final List<Pair<String, Object>> contextValues = new ArrayList<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public DefaultExceptionContext addContextValue(final String label, final Object value) {try{__CLR4_5_2b8hb8hlvha7alp.R.inc(14561);
        __CLR4_5_2b8hb8hlvha7alp.R.inc(14562);contextValues.add(new ImmutablePair<>(label, value));
        __CLR4_5_2b8hb8hlvha7alp.R.inc(14563);return this;
    }finally{__CLR4_5_2b8hb8hlvha7alp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public DefaultExceptionContext setContextValue(final String label, final Object value) {try{__CLR4_5_2b8hb8hlvha7alp.R.inc(14564);
        __CLR4_5_2b8hb8hlvha7alp.R.inc(14565);for (final Iterator<Pair<String, Object>> iter = contextValues.iterator(); (((iter.hasNext())&&(__CLR4_5_2b8hb8hlvha7alp.R.iget(14566)!=0|true))||(__CLR4_5_2b8hb8hlvha7alp.R.iget(14567)==0&false));) {{
            __CLR4_5_2b8hb8hlvha7alp.R.inc(14568);final Pair<String, Object> p = iter.next();
            __CLR4_5_2b8hb8hlvha7alp.R.inc(14569);if ((((StringUtils.equals(label, p.getKey()))&&(__CLR4_5_2b8hb8hlvha7alp.R.iget(14570)!=0|true))||(__CLR4_5_2b8hb8hlvha7alp.R.iget(14571)==0&false))) {{
                __CLR4_5_2b8hb8hlvha7alp.R.inc(14572);iter.remove();
            }
        }}
        }__CLR4_5_2b8hb8hlvha7alp.R.inc(14573);addContextValue(label, value);
        __CLR4_5_2b8hb8hlvha7alp.R.inc(14574);return this;
    }finally{__CLR4_5_2b8hb8hlvha7alp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Object> getContextValues(final String label) {try{__CLR4_5_2b8hb8hlvha7alp.R.inc(14575);
        __CLR4_5_2b8hb8hlvha7alp.R.inc(14576);final List<Object> values = new ArrayList<>();
        __CLR4_5_2b8hb8hlvha7alp.R.inc(14577);for (final Pair<String, Object> pair : contextValues) {{
            __CLR4_5_2b8hb8hlvha7alp.R.inc(14578);if ((((StringUtils.equals(label, pair.getKey()))&&(__CLR4_5_2b8hb8hlvha7alp.R.iget(14579)!=0|true))||(__CLR4_5_2b8hb8hlvha7alp.R.iget(14580)==0&false))) {{
                __CLR4_5_2b8hb8hlvha7alp.R.inc(14581);values.add(pair.getValue());
            }
        }}
        }__CLR4_5_2b8hb8hlvha7alp.R.inc(14582);return values;
    }finally{__CLR4_5_2b8hb8hlvha7alp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getFirstContextValue(final String label) {try{__CLR4_5_2b8hb8hlvha7alp.R.inc(14583);
        __CLR4_5_2b8hb8hlvha7alp.R.inc(14584);for (final Pair<String, Object> pair : contextValues) {{
            __CLR4_5_2b8hb8hlvha7alp.R.inc(14585);if ((((StringUtils.equals(label, pair.getKey()))&&(__CLR4_5_2b8hb8hlvha7alp.R.iget(14586)!=0|true))||(__CLR4_5_2b8hb8hlvha7alp.R.iget(14587)==0&false))) {{
                __CLR4_5_2b8hb8hlvha7alp.R.inc(14588);return pair.getValue();
            }
        }}
        }__CLR4_5_2b8hb8hlvha7alp.R.inc(14589);return null;
    }finally{__CLR4_5_2b8hb8hlvha7alp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<String> getContextLabels() {try{__CLR4_5_2b8hb8hlvha7alp.R.inc(14590);
        __CLR4_5_2b8hb8hlvha7alp.R.inc(14591);final Set<String> labels = new HashSet<>();
        __CLR4_5_2b8hb8hlvha7alp.R.inc(14592);for (final Pair<String, Object> pair : contextValues) {{
            __CLR4_5_2b8hb8hlvha7alp.R.inc(14593);labels.add(pair.getKey());
        }
        }__CLR4_5_2b8hb8hlvha7alp.R.inc(14594);return labels;
    }finally{__CLR4_5_2b8hb8hlvha7alp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Pair<String, Object>> getContextEntries() {try{__CLR4_5_2b8hb8hlvha7alp.R.inc(14595);
        __CLR4_5_2b8hb8hlvha7alp.R.inc(14596);return contextValues;
    }finally{__CLR4_5_2b8hb8hlvha7alp.R.flushNeeded();}}

    /**
     * Builds the message containing the contextual information.
     * 
     * @param baseMessage  the base exception message <b>without</b> context information appended
     * @return the exception message <b>with</b> context information appended, never null
     */
    @Override
    public String getFormattedExceptionMessage(final String baseMessage){try{__CLR4_5_2b8hb8hlvha7alp.R.inc(14597);
        __CLR4_5_2b8hb8hlvha7alp.R.inc(14598);final StringBuilder buffer = new StringBuilder(256);
        __CLR4_5_2b8hb8hlvha7alp.R.inc(14599);if ((((baseMessage != null)&&(__CLR4_5_2b8hb8hlvha7alp.R.iget(14600)!=0|true))||(__CLR4_5_2b8hb8hlvha7alp.R.iget(14601)==0&false))) {{
            __CLR4_5_2b8hb8hlvha7alp.R.inc(14602);buffer.append(baseMessage);
        }
        
        }__CLR4_5_2b8hb8hlvha7alp.R.inc(14603);if ((((contextValues.size() > 0)&&(__CLR4_5_2b8hb8hlvha7alp.R.iget(14604)!=0|true))||(__CLR4_5_2b8hb8hlvha7alp.R.iget(14605)==0&false))) {{
            __CLR4_5_2b8hb8hlvha7alp.R.inc(14606);if ((((buffer.length() > 0)&&(__CLR4_5_2b8hb8hlvha7alp.R.iget(14607)!=0|true))||(__CLR4_5_2b8hb8hlvha7alp.R.iget(14608)==0&false))) {{
                __CLR4_5_2b8hb8hlvha7alp.R.inc(14609);buffer.append('\n');
            }
            }__CLR4_5_2b8hb8hlvha7alp.R.inc(14610);buffer.append("Exception Context:\n");
            
            __CLR4_5_2b8hb8hlvha7alp.R.inc(14611);int i = 0;
            __CLR4_5_2b8hb8hlvha7alp.R.inc(14612);for (final Pair<String, Object> pair : contextValues) {{
                __CLR4_5_2b8hb8hlvha7alp.R.inc(14613);buffer.append("\t[");
                __CLR4_5_2b8hb8hlvha7alp.R.inc(14614);buffer.append(++i);
                __CLR4_5_2b8hb8hlvha7alp.R.inc(14615);buffer.append(':');
                __CLR4_5_2b8hb8hlvha7alp.R.inc(14616);buffer.append(pair.getKey());
                __CLR4_5_2b8hb8hlvha7alp.R.inc(14617);buffer.append("=");
                __CLR4_5_2b8hb8hlvha7alp.R.inc(14618);final Object value = pair.getValue();
                __CLR4_5_2b8hb8hlvha7alp.R.inc(14619);if ((((value == null)&&(__CLR4_5_2b8hb8hlvha7alp.R.iget(14620)!=0|true))||(__CLR4_5_2b8hb8hlvha7alp.R.iget(14621)==0&false))) {{
                    __CLR4_5_2b8hb8hlvha7alp.R.inc(14622);buffer.append("null");
                } }else {{
                    __CLR4_5_2b8hb8hlvha7alp.R.inc(14623);String valueStr;
                    __CLR4_5_2b8hb8hlvha7alp.R.inc(14624);try {
                        __CLR4_5_2b8hb8hlvha7alp.R.inc(14625);valueStr = value.toString();
                    } catch (final Exception e) {
                        __CLR4_5_2b8hb8hlvha7alp.R.inc(14626);valueStr = "Exception thrown on toString(): " + ExceptionUtils.getStackTrace(e);
                    }
                    __CLR4_5_2b8hb8hlvha7alp.R.inc(14627);buffer.append(valueStr);
                }
                }__CLR4_5_2b8hb8hlvha7alp.R.inc(14628);buffer.append("]\n");
            }
            }__CLR4_5_2b8hb8hlvha7alp.R.inc(14629);buffer.append("---------------------------------");
        }
        }__CLR4_5_2b8hb8hlvha7alp.R.inc(14630);return buffer.toString();
    }finally{__CLR4_5_2b8hb8hlvha7alp.R.flushNeeded();}}

}
