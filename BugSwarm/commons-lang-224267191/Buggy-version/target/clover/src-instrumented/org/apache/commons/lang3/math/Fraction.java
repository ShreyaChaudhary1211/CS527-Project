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
package org.apache.commons.lang3.math;

import java.math.BigInteger;

import org.apache.commons.lang3.Validate;

/**
 * <p><code>Fraction</code> is a <code>Number</code> implementation that
 * stores fractions accurately.</p>
 *
 * <p>This class is immutable, and interoperable with most methods that accept
 * a <code>Number</code>.</p>
 *
 * <p>Note that this class is intended for common use cases, it is <i>int</i>
 * based and thus suffers from various overflow issues. For a BigInteger based 
 * equivalent, please see the Commons Math BigFraction class. </p>
 *
 * @since 2.0
 */
public final class Fraction extends Number implements Comparable<Fraction> {public static class __CLR4_5_2bh4bh4lvha7arz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,15304,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support. Lang version 2.0.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 65382027393090L;

    /**
     * <code>Fraction</code> representation of 0.
     */
    public static final Fraction ZERO = new Fraction(0, 1);
    /**
     * <code>Fraction</code> representation of 1.
     */
    public static final Fraction ONE = new Fraction(1, 1);
    /**
     * <code>Fraction</code> representation of 1/2.
     */
    public static final Fraction ONE_HALF = new Fraction(1, 2);
    /**
     * <code>Fraction</code> representation of 1/3.
     */
    public static final Fraction ONE_THIRD = new Fraction(1, 3);
    /**
     * <code>Fraction</code> representation of 2/3.
     */
    public static final Fraction TWO_THIRDS = new Fraction(2, 3);
    /**
     * <code>Fraction</code> representation of 1/4.
     */
    public static final Fraction ONE_QUARTER = new Fraction(1, 4);
    /**
     * <code>Fraction</code> representation of 2/4.
     */
    public static final Fraction TWO_QUARTERS = new Fraction(2, 4);
    /**
     * <code>Fraction</code> representation of 3/4.
     */
    public static final Fraction THREE_QUARTERS = new Fraction(3, 4);
    /**
     * <code>Fraction</code> representation of 1/5.
     */
    public static final Fraction ONE_FIFTH = new Fraction(1, 5);
    /**
     * <code>Fraction</code> representation of 2/5.
     */
    public static final Fraction TWO_FIFTHS = new Fraction(2, 5);
    /**
     * <code>Fraction</code> representation of 3/5.
     */
    public static final Fraction THREE_FIFTHS = new Fraction(3, 5);
    /**
     * <code>Fraction</code> representation of 4/5.
     */
    public static final Fraction FOUR_FIFTHS = new Fraction(4, 5);


    /**
     * The numerator number part of the fraction (the three in three sevenths).
     */
    private final int numerator;
    /**
     * The denominator number part of the fraction (the seven in three sevenths).
     */
    private final int denominator;

    /**
     * Cached output hashCode (class is immutable).
     */
    private transient int hashCode = 0;
    /**
     * Cached output toString (class is immutable).
     */
    private transient String toString = null;
    /**
     * Cached output toProperString (class is immutable).
     */
    private transient String toProperString = null;

    /**
     * <p>Constructs a <code>Fraction</code> instance with the 2 parts
     * of a fraction Y/Z.</p>
     *
     * @param numerator  the numerator, for example the three in 'three sevenths'
     * @param denominator  the denominator, for example the seven in 'three sevenths'
     */
    private Fraction(final int numerator, final int denominator) {
        super();__CLR4_5_2bh4bh4lvha7arz.R.inc(14873);try{__CLR4_5_2bh4bh4lvha7arz.R.inc(14872);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14874);this.numerator = numerator;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14875);this.denominator = denominator;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Creates a <code>Fraction</code> instance with the 2 parts
     * of a fraction Y/Z.</p>
     *
     * <p>Any negative signs are resolved to be on the numerator.</p>
     *
     * @param numerator  the numerator, for example the three in 'three sevenths'
     * @param denominator  the denominator, for example the seven in 'three sevenths'
     * @return a new fraction instance
     * @throws ArithmeticException if the denominator is <code>zero</code>
     * or the denominator is {@code negative} and the numerator is {@code Integer#MIN_VALUE}
     */
    public static Fraction getFraction(int numerator, int denominator) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(14876);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14877);if ((((denominator == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14878)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14879)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14880);throw new ArithmeticException("The denominator must not be zero");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14881);if ((((denominator < 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14882)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14883)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14884);if ((((numerator == Integer.MIN_VALUE || denominator == Integer.MIN_VALUE)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14885)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14886)==0&false))) {{
                __CLR4_5_2bh4bh4lvha7arz.R.inc(14887);throw new ArithmeticException("overflow: can't negate");
            }
            }__CLR4_5_2bh4bh4lvha7arz.R.inc(14888);numerator = -numerator;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14889);denominator = -denominator;
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14890);return new Fraction(numerator, denominator);
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Creates a <code>Fraction</code> instance with the 3 parts
     * of a fraction X Y/Z.</p>
     *
     * <p>The negative sign must be passed in on the whole number part.</p>
     *
     * @param whole  the whole number, for example the one in 'one and three sevenths'
     * @param numerator  the numerator, for example the three in 'one and three sevenths'
     * @param denominator  the denominator, for example the seven in 'one and three sevenths'
     * @return a new fraction instance
     * @throws ArithmeticException if the denominator is <code>zero</code>
     * @throws ArithmeticException if the denominator is negative
     * @throws ArithmeticException if the numerator is negative
     * @throws ArithmeticException if the resulting numerator exceeds 
     *  <code>Integer.MAX_VALUE</code>
     */
    public static Fraction getFraction(final int whole, final int numerator, final int denominator) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(14891);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14892);if ((((denominator == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14893)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14894)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14895);throw new ArithmeticException("The denominator must not be zero");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14896);if ((((denominator < 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14897)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14898)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14899);throw new ArithmeticException("The denominator must not be negative");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14900);if ((((numerator < 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14901)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14902)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14903);throw new ArithmeticException("The numerator must not be negative");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14904);long numeratorValue;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14905);if ((((whole < 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14906)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14907)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14908);numeratorValue = whole * (long) denominator - numerator;
        } }else {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14909);numeratorValue = whole * (long) denominator + numerator;
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14910);if ((((numeratorValue < Integer.MIN_VALUE || numeratorValue > Integer.MAX_VALUE)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14911)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14912)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14913);throw new ArithmeticException("Numerator too large to represent as an Integer.");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14914);return new Fraction((int) numeratorValue, denominator);
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Creates a reduced <code>Fraction</code> instance with the 2 parts
     * of a fraction Y/Z.</p>
     *
     * <p>For example, if the input parameters represent 2/4, then the created
     * fraction will be 1/2.</p>
     *
     * <p>Any negative signs are resolved to be on the numerator.</p>
     *
     * @param numerator  the numerator, for example the three in 'three sevenths'
     * @param denominator  the denominator, for example the seven in 'three sevenths'
     * @return a new fraction instance, with the numerator and denominator reduced
     * @throws ArithmeticException if the denominator is <code>zero</code>
     */
    public static Fraction getReducedFraction(int numerator, int denominator) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(14915);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14916);if ((((denominator == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14917)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14918)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14919);throw new ArithmeticException("The denominator must not be zero");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14920);if ((((numerator == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14921)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14922)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14923);return ZERO; // normalize zero.
        }
        // allow 2^k/-2^31 as a valid fraction (where k>0)
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14924);if ((((denominator == Integer.MIN_VALUE && (numerator & 1) == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14925)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14926)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14927);numerator /= 2;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14928);denominator /= 2;
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14929);if ((((denominator < 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14930)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14931)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14932);if ((((numerator == Integer.MIN_VALUE || denominator == Integer.MIN_VALUE)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14933)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14934)==0&false))) {{
                __CLR4_5_2bh4bh4lvha7arz.R.inc(14935);throw new ArithmeticException("overflow: can't negate");
            }
            }__CLR4_5_2bh4bh4lvha7arz.R.inc(14936);numerator = -numerator;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14937);denominator = -denominator;
        }
        // simplify fraction.
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14938);final int gcd = greatestCommonDivisor(numerator, denominator);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14939);numerator /= gcd;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14940);denominator /= gcd;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14941);return new Fraction(numerator, denominator);
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Creates a <code>Fraction</code> instance from a <code>double</code> value.</p>
     *
     * <p>This method uses the <a href="http://archives.math.utk.edu/articles/atuyl/confrac/">
     *  continued fraction algorithm</a>, computing a maximum of
     *  25 convergents and bounding the denominator by 10,000.</p>
     *
     * @param value  the double value to convert
     * @return a new fraction instance that is close to the value
     * @throws ArithmeticException if <code>|value| &gt; Integer.MAX_VALUE</code> 
     *  or <code>value = NaN</code>
     * @throws ArithmeticException if the calculated denominator is <code>zero</code>
     * @throws ArithmeticException if the the algorithm does not converge
     */
    public static Fraction getFraction(double value) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(14942);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14943);final int sign = (((value < 0 )&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14944)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14945)==0&false))? -1 : 1;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14946);value = Math.abs(value);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14947);if ((((value > Integer.MAX_VALUE || Double.isNaN(value))&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14948)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14949)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14950);throw new ArithmeticException("The value must not be greater than Integer.MAX_VALUE or NaN");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14951);final int wholeNumber = (int) value;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14952);value -= wholeNumber;

        __CLR4_5_2bh4bh4lvha7arz.R.inc(14953);int numer0 = 0; // the pre-previous
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14954);int denom0 = 1; // the pre-previous
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14955);int numer1 = 1; // the previous
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14956);int denom1 = 0; // the previous
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14957);int numer2 = 0; // the current, setup in calculation
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14958);int denom2 = 0; // the current, setup in calculation
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14959);int a1 = (int) value;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14960);int a2 = 0;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14961);double x1 = 1;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14962);double x2 = 0;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14963);double y1 = value - a1;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14964);double y2 = 0;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14965);double delta1, delta2 = Double.MAX_VALUE;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14966);double fraction;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14967);int i = 1;
        // System.out.println("---");
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14968);do {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14969);delta1 = delta2;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14970);a2 = (int) (x1 / y1);
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14971);x2 = y1;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14972);y2 = x1 - a2 * y1;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14973);numer2 = a1 * numer1 + numer0;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14974);denom2 = a1 * denom1 + denom0;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14975);fraction = (double) numer2 / (double) denom2;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14976);delta2 = Math.abs(value - fraction);
            // System.out.println(numer2 + " " + denom2 + " " + fraction + " " + delta2 + " " + y1);
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14977);a1 = a2;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14978);x1 = x2;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14979);y1 = y2;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14980);numer0 = numer1;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14981);denom0 = denom1;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14982);numer1 = numer2;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14983);denom1 = denom2;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14984);i++;
            // System.out.println(">>" + delta1 +" "+ delta2+" "+(delta1 > delta2)+" "+i+" "+denom2);
        } }while ((((delta1 > delta2 && denom2 <= 10000 && denom2 > 0 && i < 25)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14985)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14986)==0&false)));
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14987);if ((((i == 25)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14988)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14989)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14990);throw new ArithmeticException("Unable to convert double to fraction");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14991);return getReducedFraction((numer0 + wholeNumber * denom0) * sign, denom0);
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Creates a Fraction from a <code>String</code>.</p>
     *
     * <p>The formats accepted are:</p>
     *
     * <ol>
     *  <li><code>double</code> String containing a dot</li>
     *  <li>'X Y/Z'</li>
     *  <li>'Y/Z'</li>
     *  <li>'X' (a simple whole number)</li>
     * </ol>
     * <p>and a .</p>
     *
     * @param str  the string to parse, must not be <code>null</code>
     * @return the new <code>Fraction</code> instance
     * @throws IllegalArgumentException if the string is <code>null</code>
     * @throws NumberFormatException if the number format is invalid
     */
    public static Fraction getFraction(String str) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(14992);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14993);Validate.isTrue(str != null, "The string must not be null");
        // parse double format
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14994);int pos = str.indexOf('.');
        __CLR4_5_2bh4bh4lvha7arz.R.inc(14995);if ((((pos >= 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(14996)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(14997)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(14998);return getFraction(Double.parseDouble(str));
        }

        // parse X Y/Z format
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(14999);pos = str.indexOf(' ');
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15000);if ((((pos > 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15001)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15002)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15003);final int whole = Integer.parseInt(str.substring(0, pos));
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15004);str = str.substring(pos + 1);
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15005);pos = str.indexOf('/');
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15006);if ((((pos < 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15007)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15008)==0&false))) {{
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15009);throw new NumberFormatException("The fraction could not be parsed as the format X Y/Z");
            }
            }__CLR4_5_2bh4bh4lvha7arz.R.inc(15010);final int numer = Integer.parseInt(str.substring(0, pos));
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15011);final int denom = Integer.parseInt(str.substring(pos + 1));
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15012);return getFraction(whole, numer, denom);
        }

        // parse Y/Z format
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15013);pos = str.indexOf('/');
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15014);if ((((pos < 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15015)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15016)==0&false))) {{
            // simple whole number
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15017);return getFraction(Integer.parseInt(str), 1);
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15018);final int numer = Integer.parseInt(str.substring(0, pos));
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15019);final int denom = Integer.parseInt(str.substring(pos + 1));
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15020);return getFraction(numer, denom);
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    // Accessors
    //-------------------------------------------------------------------

    /**
     * <p>Gets the numerator part of the fraction.</p>
     *
     * <p>This method may return a value greater than the denominator, an
     * improper fraction, such as the seven in 7/4.</p>
     *
     * @return the numerator fraction part
     */
    public int getNumerator() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15021);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15022);return numerator;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets the denominator part of the fraction.</p>
     *
     * @return the denominator fraction part
     */
    public int getDenominator() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15023);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15024);return denominator;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets the proper numerator, always positive.</p>
     *
     * <p>An improper fraction 7/4 can be resolved into a proper one, 1 3/4.
     * This method returns the 3 from the proper fraction.</p>
     *
     * <p>If the fraction is negative such as -7/4, it can be resolved into
     * -1 3/4, so this method returns the positive proper numerator, 3.</p>
     *
     * @return the numerator fraction part of a proper fraction, always positive
     */
    public int getProperNumerator() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15025);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15026);return Math.abs(numerator % denominator);
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets the proper whole part of the fraction.</p>
     *
     * <p>An improper fraction 7/4 can be resolved into a proper one, 1 3/4.
     * This method returns the 1 from the proper fraction.</p>
     *
     * <p>If the fraction is negative such as -7/4, it can be resolved into
     * -1 3/4, so this method returns the positive whole part -1.</p>
     *
     * @return the whole fraction part of a proper fraction, that includes the sign
     */
    public int getProperWhole() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15027);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15028);return numerator / denominator;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    // Number methods
    //-------------------------------------------------------------------

    /**
     * <p>Gets the fraction as an <code>int</code>. This returns the whole number
     * part of the fraction.</p>
     *
     * @return the whole number fraction part
     */
    @Override
    public int intValue() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15029);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15030);return numerator / denominator;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a <code>long</code>. This returns the whole number
     * part of the fraction.</p>
     *
     * @return the whole number fraction part
     */
    @Override
    public long longValue() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15031);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15032);return (long) numerator / denominator;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a <code>float</code>. This calculates the fraction
     * as the numerator divided by denominator.</p>
     *
     * @return the fraction as a <code>float</code>
     */
    @Override
    public float floatValue() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15033);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15034);return (float) numerator / (float) denominator;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a <code>double</code>. This calculates the fraction
     * as the numerator divided by denominator.</p>
     *
     * @return the fraction as a <code>double</code>
     */
    @Override
    public double doubleValue() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15035);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15036);return (double) numerator / (double) denominator;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    // Calculations
    //-------------------------------------------------------------------

    /**
     * <p>Reduce the fraction to the smallest values for the numerator and
     * denominator, returning the result.</p>
     * 
     * <p>For example, if this fraction represents 2/4, then the result
     * will be 1/2.</p>
     *
     * @return a new reduced fraction instance, or this if no simplification possible
     */
    public Fraction reduce() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15037);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15038);if ((((numerator == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15039)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15040)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15041);return (((equals(ZERO) )&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15042)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15043)==0&false))? this : ZERO;
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15044);final int gcd = greatestCommonDivisor(Math.abs(numerator), denominator);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15045);if ((((gcd == 1)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15046)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15047)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15048);return this;
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15049);return Fraction.getFraction(numerator / gcd, denominator / gcd);
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets a fraction that is the inverse (1/fraction) of this one.</p>
     * 
     * <p>The returned fraction is not reduced.</p>
     *
     * @return a new fraction instance with the numerator and denominator
     *         inverted.
     * @throws ArithmeticException if the fraction represents zero.
     */
    public Fraction invert() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15050);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15051);if ((((numerator == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15052)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15053)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15054);throw new ArithmeticException("Unable to invert zero.");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15055);if ((((numerator==Integer.MIN_VALUE)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15056)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15057)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15058);throw new ArithmeticException("overflow: can't negate numerator");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15059);if ((((numerator<0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15060)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15061)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15062);return new Fraction(-denominator, -numerator);
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15063);return new Fraction(denominator, numerator);
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets a fraction that is the negative (-fraction) of this one.</p>
     *
     * <p>The returned fraction is not reduced.</p>
     *
     * @return a new fraction instance with the opposite signed numerator
     */
    public Fraction negate() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15064);
        // the positive range is one smaller than the negative range of an int.
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15065);if ((((numerator==Integer.MIN_VALUE)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15066)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15067)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15068);throw new ArithmeticException("overflow: too large to negate");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15069);return new Fraction(-numerator, denominator);
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets a fraction that is the positive equivalent of this one.</p>
     * <p>More precisely: <code>(fraction &gt;= 0 ? this : -fraction)</code></p>
     *
     * <p>The returned fraction is not reduced.</p>
     *
     * @return <code>this</code> if it is positive, or a new positive fraction
     *  instance with the opposite signed numerator
     */
    public Fraction abs() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15070);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15071);if ((((numerator >= 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15072)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15073)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15074);return this;
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15075);return negate();
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets a fraction that is raised to the passed in power.</p>
     *
     * <p>The returned fraction is in reduced form.</p>
     *
     * @param power  the power to raise the fraction to
     * @return <code>this</code> if the power is one, <code>ONE</code> if the power
     * is zero (even if the fraction equals ZERO) or a new fraction instance 
     * raised to the appropriate power
     * @throws ArithmeticException if the resulting numerator or denominator exceeds
     *  <code>Integer.MAX_VALUE</code>
     */
    public Fraction pow(final int power) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15076);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15077);if ((((power == 1)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15078)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15079)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15080);return this;
        } }else {__CLR4_5_2bh4bh4lvha7arz.R.inc(15081);if ((((power == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15082)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15083)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15084);return ONE;
        } }else {__CLR4_5_2bh4bh4lvha7arz.R.inc(15085);if ((((power < 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15086)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15087)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15088);if ((((power == Integer.MIN_VALUE)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15089)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15090)==0&false))) {{ // MIN_VALUE can't be negated.
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15091);return this.invert().pow(2).pow(-(power / 2));
            }
            }__CLR4_5_2bh4bh4lvha7arz.R.inc(15092);return this.invert().pow(-power);
        } }else {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15093);final Fraction f = this.multiplyBy(this);
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15094);if ((((power % 2 == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15095)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15096)==0&false))) {{ // if even...
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15097);return f.pow(power / 2);
            }
            }__CLR4_5_2bh4bh4lvha7arz.R.inc(15098);return f.pow(power / 2).multiplyBy(this);
        }
    }}}}finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets the greatest common divisor of the absolute value of
     * two numbers, using the "binary gcd" method which avoids
     * division and modulo operations.  See Knuth 4.5.2 algorithm B.
     * This algorithm is due to Josef Stein (1961).</p>
     *
     * @param u  a non-zero number
     * @param v  a non-zero number
     * @return the greatest common divisor, never zero
     */
    private static int greatestCommonDivisor(int u, int v) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15099);
        // From Commons Math:
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15100);if ((((u == 0 || v == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15101)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15102)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15103);if ((((u == Integer.MIN_VALUE || v == Integer.MIN_VALUE)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15104)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15105)==0&false))) {{
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15106);throw new ArithmeticException("overflow: gcd is 2^31");
            }
            }__CLR4_5_2bh4bh4lvha7arz.R.inc(15107);return Math.abs(u) + Math.abs(v);
        }
        // if either operand is abs 1, return 1:
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15108);if ((((Math.abs(u) == 1 || Math.abs(v) == 1)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15109)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15110)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15111);return 1;
        }
        // keep u and v negative, as negative integers range down to
        // -2^31, while positive numbers can only be as large as 2^31-1
        // (i.e. we can't necessarily negate a negative number without
        // overflow)
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15112);if ((((u > 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15113)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15114)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15115);u = -u;
        } // make u negative
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15116);if ((((v > 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15117)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15118)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15119);v = -v;
        } // make v negative
        // B1. [Find power of 2]
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15120);int k = 0;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15121);while (((((u & 1) == 0 && (v & 1) == 0 && k < 31)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15122)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15123)==0&false))) {{ // while u and v are both even...
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15124);u /= 2;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15125);v /= 2;
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15126);k++; // cast out twos.
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15127);if ((((k == 31)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15128)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15129)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15130);throw new ArithmeticException("overflow: gcd is 2^31");
        }
        // B2. Initialize: u and v have been divided by 2^k and at least
        // one is odd.
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15131);int t = ((((u & 1) == 1 )&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15132)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15133)==0&false))? v : -(u / 2)/* B3 */;
        // t negative: u was odd, v may be even (t replaces v)
        // t positive: u was even, v is odd (t replaces u)
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15134);do {{
            /* assert u<0 && v<0; */
            // B4/B3: cast out twos from t.
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15135);while (((((t & 1) == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15136)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15137)==0&false))) {{ // while t is even..
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15138);t /= 2; // cast out twos
            }
            // B5 [reset max(u,v)]
            }__CLR4_5_2bh4bh4lvha7arz.R.inc(15139);if ((((t > 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15140)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15141)==0&false))) {{
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15142);u = -t;
            } }else {{
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15143);v = t;
            }
            // B6/B3. at this point both u and v should be odd.
            }__CLR4_5_2bh4bh4lvha7arz.R.inc(15144);t = (v - u) / 2;
            // |u| larger: t positive (replace u)
            // |v| larger: t negative (replace v)
        } }while ((((t != 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15145)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15146)==0&false)));
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15147);return -u * (1 << k); // gcd is u*2^k
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    // Arithmetic
    //-------------------------------------------------------------------

    /** 
     * Multiply two integers, checking for overflow.
     * 
     * @param x a factor
     * @param y a factor
     * @return the product <code>x*y</code>
     * @throws ArithmeticException if the result can not be represented as
     *                             an int
     */
    private static int mulAndCheck(final int x, final int y) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15148);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15149);final long m = (long) x * (long) y;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15150);if ((((m < Integer.MIN_VALUE || m > Integer.MAX_VALUE)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15151)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15152)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15153);throw new ArithmeticException("overflow: mul");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15154);return (int) m;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}
    
    /**
     *  Multiply two non-negative integers, checking for overflow.
     * 
     * @param x a non-negative factor
     * @param y a non-negative factor
     * @return the product <code>x*y</code>
     * @throws ArithmeticException if the result can not be represented as
     * an int
     */
    private static int mulPosAndCheck(final int x, final int y) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15155);
        /* assert x>=0 && y>=0; */
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15156);final long m = (long) x * (long) y;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15157);if ((((m > Integer.MAX_VALUE)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15158)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15159)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15160);throw new ArithmeticException("overflow: mulPos");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15161);return (int) m;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}
    
    /** 
     * Add two integers, checking for overflow.
     * 
     * @param x an addend
     * @param y an addend
     * @return the sum <code>x+y</code>
     * @throws ArithmeticException if the result can not be represented as
     * an int
     */
    private static int addAndCheck(final int x, final int y) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15162);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15163);final long s = (long) x + (long) y;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15164);if ((((s < Integer.MIN_VALUE || s > Integer.MAX_VALUE)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15165)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15166)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15167);throw new ArithmeticException("overflow: add");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15168);return (int) s;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}
    
    /** 
     * Subtract two integers, checking for overflow.
     * 
     * @param x the minuend
     * @param y the subtrahend
     * @return the difference <code>x-y</code>
     * @throws ArithmeticException if the result can not be represented as
     * an int
     */
    private static int subAndCheck(final int x, final int y) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15169);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15170);final long s = (long) x - (long) y;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15171);if ((((s < Integer.MIN_VALUE || s > Integer.MAX_VALUE)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15172)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15173)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15174);throw new ArithmeticException("overflow: add");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15175);return (int) s;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}
    
    /**
     * <p>Adds the value of this fraction to another, returning the result in reduced form.
     * The algorithm follows Knuth, 4.5.1.</p>
     *
     * @param fraction  the fraction to add, must not be <code>null</code>
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the resulting numerator or denominator exceeds
     *  <code>Integer.MAX_VALUE</code>
     */
    public Fraction add(final Fraction fraction) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15176);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15177);return addSub(fraction, true /* add */);
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Subtracts the value of another fraction from the value of this one, 
     * returning the result in reduced form.</p>
     *
     * @param fraction  the fraction to subtract, must not be <code>null</code>
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the resulting numerator or denominator
     *   cannot be represented in an <code>int</code>.
     */
    public Fraction subtract(final Fraction fraction) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15178);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15179);return addSub(fraction, false /* subtract */);
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /** 
     * Implement add and subtract using algorithm described in Knuth 4.5.1.
     * 
     * @param fraction the fraction to subtract, must not be <code>null</code>
     * @param isAdd true to add, false to subtract
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the resulting numerator or denominator
     *   cannot be represented in an <code>int</code>.
     */
    private Fraction addSub(final Fraction fraction, final boolean isAdd) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15180);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15181);Validate.isTrue(fraction != null, "The fraction must not be null");
        // zero is identity for addition.
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15182);if ((((numerator == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15183)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15184)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15185);return (((isAdd )&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15186)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15187)==0&false))? fraction : fraction.negate();
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15188);if ((((fraction.numerator == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15189)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15190)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15191);return this;
        }
        // if denominators are randomly distributed, d1 will be 1 about 61%
        // of the time.
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15192);final int d1 = greatestCommonDivisor(denominator, fraction.denominator);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15193);if ((((d1 == 1)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15194)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15195)==0&false))) {{
            // result is ( (u*v' +/- u'v) / u'v')
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15196);final int uvp = mulAndCheck(numerator, fraction.denominator);
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15197);final int upv = mulAndCheck(fraction.numerator, denominator);
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15198);return new Fraction((((isAdd )&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15199)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15200)==0&false))? addAndCheck(uvp, upv) : subAndCheck(uvp, upv), mulPosAndCheck(denominator,
                    fraction.denominator));
        }
        // the quantity 't' requires 65 bits of precision; see knuth 4.5.1
        // exercise 7. we're going to use a BigInteger.
        // t = u(v'/d1) +/- v(u'/d1)
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15201);final BigInteger uvp = BigInteger.valueOf(numerator).multiply(BigInteger.valueOf(fraction.denominator / d1));
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15202);final BigInteger upv = BigInteger.valueOf(fraction.numerator).multiply(BigInteger.valueOf(denominator / d1));
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15203);final BigInteger t = (((isAdd )&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15204)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15205)==0&false))? uvp.add(upv) : uvp.subtract(upv);
        // but d2 doesn't need extra precision because
        // d2 = gcd(t,d1) = gcd(t mod d1, d1)
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15206);final int tmodd1 = t.mod(BigInteger.valueOf(d1)).intValue();
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15207);final int d2 = (((tmodd1 == 0 )&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15208)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15209)==0&false))? d1 : greatestCommonDivisor(tmodd1, d1);

        // result is (t/d2) / (u'/d1)(v'/d2)
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15210);final BigInteger w = t.divide(BigInteger.valueOf(d2));
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15211);if ((((w.bitLength() > 31)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15212)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15213)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15214);throw new ArithmeticException("overflow: numerator too large after multiply");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15215);return new Fraction(w.intValue(), mulPosAndCheck(denominator / d1, fraction.denominator / d2));
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Multiplies the value of this fraction by another, returning the 
     * result in reduced form.</p>
     *
     * @param fraction  the fraction to multiply by, must not be <code>null</code>
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the resulting numerator or denominator exceeds
     *  <code>Integer.MAX_VALUE</code>
     */
    public Fraction multiplyBy(final Fraction fraction) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15216);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15217);Validate.isTrue(fraction != null, "The fraction must not be null");
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15218);if ((((numerator == 0 || fraction.numerator == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15219)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15220)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15221);return ZERO;
        }
        // knuth 4.5.1
        // make sure we don't overflow unless the result *must* overflow.
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15222);final int d1 = greatestCommonDivisor(numerator, fraction.denominator);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15223);final int d2 = greatestCommonDivisor(fraction.numerator, denominator);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15224);return getReducedFraction(mulAndCheck(numerator / d1, fraction.numerator / d2),
                mulPosAndCheck(denominator / d2, fraction.denominator / d1));
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Divide the value of this fraction by another.</p>
     *
     * @param fraction  the fraction to divide by, must not be <code>null</code>
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the fraction to divide by is zero
     * @throws ArithmeticException if the resulting numerator or denominator exceeds
     *  <code>Integer.MAX_VALUE</code>
     */
    public Fraction divideBy(final Fraction fraction) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15225);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15226);Validate.isTrue(fraction != null, "The fraction must not be null");
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15227);if ((((fraction.numerator == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15228)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15229)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15230);throw new ArithmeticException("The fraction to divide by must not be zero");
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15231);return multiplyBy(fraction.invert());
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    // Basics
    //-------------------------------------------------------------------

    /**
     * <p>Compares this fraction to another object to test if they are equal.</p>.
     *
     * <p>To be equal, both values must be equal. Thus 2/4 is not equal to 1/2.</p>
     *
     * @param obj the reference object with which to compare
     * @return <code>true</code> if this object is equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15232);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15233);if ((((obj == this)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15234)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15235)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15236);return true;
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15237);if ((((obj instanceof Fraction == false)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15238)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15239)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15240);return false;
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15241);final Fraction other = (Fraction) obj;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15242);return getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator();
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets a hashCode for the fraction.</p>
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15243);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15244);if ((((hashCode == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15245)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15246)==0&false))) {{
            // hash code update should be atomic.
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15247);hashCode = 37 * (37 * 17 + getNumerator()) + getDenominator();
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15248);return hashCode;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Compares this object to another based on size.</p>
     *
     * <p>Note: this class has a natural ordering that is inconsistent
     * with equals, because, for example, equals treats 1/2 and 2/4 as
     * different, whereas compareTo treats them as equal.
     *
     * @param other  the object to compare to
     * @return -1 if this is less, 0 if equal, +1 if greater
     * @throws ClassCastException if the object is not a <code>Fraction</code>
     * @throws NullPointerException if the object is <code>null</code>
     */
    @Override
    public int compareTo(final Fraction other) {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15249);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15250);if ((((this == other)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15251)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15252)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15253);return 0;
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15254);if ((((numerator == other.numerator && denominator == other.denominator)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15255)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15256)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15257);return 0;
        }

        // otherwise see which is less
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15258);final long first = (long) numerator * (long) other.denominator;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15259);final long second = (long) other.numerator * (long) denominator;
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15260);if ((((first == second)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15261)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15262)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15263);return 0;
        } }else {__CLR4_5_2bh4bh4lvha7arz.R.inc(15264);if ((((first < second)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15265)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15266)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15267);return -1;
        } }else {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15268);return 1;
        }
    }}}finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a <code>String</code>.</p>
     *
     * <p>The format used is '<i>numerator</i>/<i>denominator</i>' always.
     *
     * @return a <code>String</code> form of the fraction
     */
    @Override
    public String toString() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15269);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15270);if ((((toString == null)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15271)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15272)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15273);toString = getNumerator() + "/" + getDenominator();
        }
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15274);return toString;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a proper <code>String</code> in the format X Y/Z.</p>
     *
     * <p>The format used in '<i>wholeNumber</i> <i>numerator</i>/<i>denominator</i>'.
     * If the whole number is zero it will be omitted. If the numerator is zero,
     * only the whole number is returned.</p>
     *
     * @return a <code>String</code> form of the fraction
     */
    public String toProperString() {try{__CLR4_5_2bh4bh4lvha7arz.R.inc(15275);
        __CLR4_5_2bh4bh4lvha7arz.R.inc(15276);if ((((toProperString == null)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15277)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15278)==0&false))) {{
            __CLR4_5_2bh4bh4lvha7arz.R.inc(15279);if ((((numerator == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15280)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15281)==0&false))) {{
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15282);toProperString = "0";
            } }else {__CLR4_5_2bh4bh4lvha7arz.R.inc(15283);if ((((numerator == denominator)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15284)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15285)==0&false))) {{
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15286);toProperString = "1";
            } }else {__CLR4_5_2bh4bh4lvha7arz.R.inc(15287);if ((((numerator == -1 * denominator)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15288)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15289)==0&false))) {{
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15290);toProperString = "-1";
            } }else {__CLR4_5_2bh4bh4lvha7arz.R.inc(15291);if ((((((((numerator > 0 )&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15292)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15293)==0&false))? -numerator : numerator) < -denominator)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15294)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15295)==0&false))) {{
                // note that we do the magnitude comparison test above with
                // NEGATIVE (not positive) numbers, since negative numbers
                // have a larger range. otherwise numerator==Integer.MIN_VALUE
                // is handled incorrectly.
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15296);final int properNumerator = getProperNumerator();
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15297);if ((((properNumerator == 0)&&(__CLR4_5_2bh4bh4lvha7arz.R.iget(15298)!=0|true))||(__CLR4_5_2bh4bh4lvha7arz.R.iget(15299)==0&false))) {{
                    __CLR4_5_2bh4bh4lvha7arz.R.inc(15300);toProperString = Integer.toString(getProperWhole());
                } }else {{
                    __CLR4_5_2bh4bh4lvha7arz.R.inc(15301);toProperString = getProperWhole() + " " + properNumerator + "/" + getDenominator();
                }
            }} }else {{
                __CLR4_5_2bh4bh4lvha7arz.R.inc(15302);toProperString = getNumerator() + "/" + getDenominator();
            }
        }}}}}
        }__CLR4_5_2bh4bh4lvha7arz.R.inc(15303);return toProperString;
    }finally{__CLR4_5_2bh4bh4lvha7arz.R.flushNeeded();}}
}
