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

/**
 * <p>Thrown to indicate that a block of code has not been implemented.
 * This exception supplements <code>UnsupportedOperationException</code>
 * by providing a more semantically rich description of the problem.</p>
 * 
 * <p><code>NotImplementedException</code> represents the case where the
 * author has yet to implement the logic at this point in the program.
 * This can act as an exception based TODO tag. </p>
 * 
 * <pre>
 * public void foo() {
 *   try {
 *     // do something that throws an Exception
 *   } catch (Exception ex) {
 *     // don't know what to do here yet
 *     throw new NotImplementedException("TODO", ex);
 *   }
 * }
 * </pre>
 *
 * This class was originally added in Lang 2.0, but removed in 3.0.
 *
 * @since 3.2 
 */
public class NotImplementedException extends UnsupportedOperationException {public static class __CLR4_5_2527527lvha794n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,6576,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 20131021L;

    private final String code;

    /**
     * Constructs a NotImplementedException.
     * 
     * @param message description of the exception
     * @since 3.2
     */
    public NotImplementedException(final String message) {
        this(message, (String) null);__CLR4_5_2527527lvha794n.R.inc(6560);try{__CLR4_5_2527527lvha794n.R.inc(6559);
    }finally{__CLR4_5_2527527lvha794n.R.flushNeeded();}}

    /**
     * Constructs a NotImplementedException.
     * 
     * @param cause cause of the exception
     * @since 3.2
     */
    public NotImplementedException(final Throwable cause) {
        this(cause, null);__CLR4_5_2527527lvha794n.R.inc(6562);try{__CLR4_5_2527527lvha794n.R.inc(6561);
    }finally{__CLR4_5_2527527lvha794n.R.flushNeeded();}}

    /**
     * Constructs a NotImplementedException.
     * 
     * @param message description of the exception
     * @param cause cause of the exception
     * @since 3.2
     */
    public NotImplementedException(final String message, final Throwable cause) {
        this(message, cause, null);__CLR4_5_2527527lvha794n.R.inc(6564);try{__CLR4_5_2527527lvha794n.R.inc(6563);
    }finally{__CLR4_5_2527527lvha794n.R.flushNeeded();}}

    /**
     * Constructs a NotImplementedException.
     * 
     * @param message description of the exception
     * @param code code indicating a resource for more information regarding the lack of implementation
     * @since 3.2
     */
    public NotImplementedException(final String message, final String code) {
        super(message);__CLR4_5_2527527lvha794n.R.inc(6566);try{__CLR4_5_2527527lvha794n.R.inc(6565);
        __CLR4_5_2527527lvha794n.R.inc(6567);this.code = code;
    }finally{__CLR4_5_2527527lvha794n.R.flushNeeded();}}

    /**
     * Constructs a NotImplementedException.
     * 
     * @param cause cause of the exception
     * @param code code indicating a resource for more information regarding the lack of implementation
     * @since 3.2
     */
    public NotImplementedException(final Throwable cause, final String code) {
        super(cause);__CLR4_5_2527527lvha794n.R.inc(6569);try{__CLR4_5_2527527lvha794n.R.inc(6568);
        __CLR4_5_2527527lvha794n.R.inc(6570);this.code = code;
    }finally{__CLR4_5_2527527lvha794n.R.flushNeeded();}}

    /**
     * Constructs a NotImplementedException.
     * 
     * @param message description of the exception
     * @param cause cause of the exception
     * @param code code indicating a resource for more information regarding the lack of implementation
     * @since 3.2
     */
    public NotImplementedException(final String message, final Throwable cause, final String code) {
        super(message, cause);__CLR4_5_2527527lvha794n.R.inc(6572);try{__CLR4_5_2527527lvha794n.R.inc(6571);
        __CLR4_5_2527527lvha794n.R.inc(6573);this.code = code;
    }finally{__CLR4_5_2527527lvha794n.R.flushNeeded();}}

    /**
     * Obtain the not implemented code. This is an unformatted piece of text intended to point to 
     * further information regarding the lack of implementation. It might, for example, be an issue 
     * tracker ID or a URL.
     *
     * @return a code indicating a resource for more information regarding the lack of implementation
     */
    public String getCode() {try{__CLR4_5_2527527lvha794n.R.inc(6574);
        __CLR4_5_2527527lvha794n.R.inc(6575);return this.code;
    }finally{__CLR4_5_2527527lvha794n.R.flushNeeded();}}
}
