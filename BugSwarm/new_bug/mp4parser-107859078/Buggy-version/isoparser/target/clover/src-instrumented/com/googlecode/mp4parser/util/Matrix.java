/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.util;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;

import java.nio.ByteBuffer;

/**
 * Transformation Matrix as used in <code>Track-</code> and <code>MovieHeaderBox</code>.
 */
public class Matrix {public static class __CLR4_5_2fo4fo4lvl9el1m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,20419,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    double u, v, w;
    double a, b, c, d, tx, ty;

    public Matrix(double a, double b, double c, double d, double u, double v, double w, double tx, double ty) {try{__CLR4_5_2fo4fo4lvl9el1m.R.inc(20308);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20309);this.u = u;
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20310);this.v = v;
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20311);this.w = w;
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20312);this.a = a;
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20313);this.b = b;
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20314);this.c = c;
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20315);this.d = d;
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20316);this.tx = tx;
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20317);this.ty = ty;
    }finally{__CLR4_5_2fo4fo4lvl9el1m.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2fo4fo4lvl9el1m.R.inc(20318);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20319);if ((((this == o)&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20320)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20321)==0&false))) {__CLR4_5_2fo4fo4lvl9el1m.R.inc(20322);return true;
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20323);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20324)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20325)==0&false))) {__CLR4_5_2fo4fo4lvl9el1m.R.inc(20326);return false;

        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20327);Matrix matrix = (Matrix) o;

        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20328);if ((((Double.compare(matrix.a, a) != 0)&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20329)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20330)==0&false))) {__CLR4_5_2fo4fo4lvl9el1m.R.inc(20331);return false;
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20332);if ((((Double.compare(matrix.b, b) != 0)&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20333)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20334)==0&false))) {__CLR4_5_2fo4fo4lvl9el1m.R.inc(20335);return false;
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20336);if ((((Double.compare(matrix.c, c) != 0)&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20337)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20338)==0&false))) {__CLR4_5_2fo4fo4lvl9el1m.R.inc(20339);return false;
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20340);if ((((Double.compare(matrix.d, d) != 0)&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20341)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20342)==0&false))) {__CLR4_5_2fo4fo4lvl9el1m.R.inc(20343);return false;
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20344);if ((((Double.compare(matrix.tx, tx) != 0)&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20345)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20346)==0&false))) {__CLR4_5_2fo4fo4lvl9el1m.R.inc(20347);return false;
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20348);if ((((Double.compare(matrix.ty, ty) != 0)&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20349)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20350)==0&false))) {__CLR4_5_2fo4fo4lvl9el1m.R.inc(20351);return false;
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20352);if ((((Double.compare(matrix.u, u) != 0)&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20353)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20354)==0&false))) {__CLR4_5_2fo4fo4lvl9el1m.R.inc(20355);return false;
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20356);if ((((Double.compare(matrix.v, v) != 0)&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20357)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20358)==0&false))) {__CLR4_5_2fo4fo4lvl9el1m.R.inc(20359);return false;
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20360);if ((((Double.compare(matrix.w, w) != 0)&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20361)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20362)==0&false))) {__CLR4_5_2fo4fo4lvl9el1m.R.inc(20363);return false;

        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20364);return true;
    }finally{__CLR4_5_2fo4fo4lvl9el1m.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2fo4fo4lvl9el1m.R.inc(20365);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20366);int result;
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20367);long temp;
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20368);temp = Double.doubleToLongBits(u);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20369);result = (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20370);temp = Double.doubleToLongBits(v);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20371);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20372);temp = Double.doubleToLongBits(w);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20373);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20374);temp = Double.doubleToLongBits(a);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20375);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20376);temp = Double.doubleToLongBits(b);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20377);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20378);temp = Double.doubleToLongBits(c);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20379);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20380);temp = Double.doubleToLongBits(d);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20381);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20382);temp = Double.doubleToLongBits(tx);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20383);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20384);temp = Double.doubleToLongBits(ty);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20385);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20386);return result;
    }finally{__CLR4_5_2fo4fo4lvl9el1m.R.flushNeeded();}}


    @Override
    public String toString() {try{__CLR4_5_2fo4fo4lvl9el1m.R.inc(20387);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20388);if ((((this.equals(ROTATE_0))&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20389)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20390)==0&false))) {{
            __CLR4_5_2fo4fo4lvl9el1m.R.inc(20391);return "Rotate 0\u00b0";
        }
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20392);if ((((this.equals(ROTATE_90))&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20393)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20394)==0&false))) {{
            __CLR4_5_2fo4fo4lvl9el1m.R.inc(20395);return "Rotate 90\u00b0";
        }
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20396);if ((((this.equals(ROTATE_180))&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20397)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20398)==0&false))) {{
            __CLR4_5_2fo4fo4lvl9el1m.R.inc(20399);return "Rotate 180\u00b0";
        }
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20400);if ((((this.equals(ROTATE_270))&&(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20401)!=0|true))||(__CLR4_5_2fo4fo4lvl9el1m.R.iget(20402)==0&false))) {{
            __CLR4_5_2fo4fo4lvl9el1m.R.inc(20403);return "Rotate 270\u00b0";
        }
        }__CLR4_5_2fo4fo4lvl9el1m.R.inc(20404);return "Matrix{" +
                "u=" + u +
                ", v=" + v +
                ", w=" + w +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", tx=" + tx +
                ", ty=" + ty +
                '}';
    }finally{__CLR4_5_2fo4fo4lvl9el1m.R.flushNeeded();}}

    public static final Matrix ROTATE_0 = new Matrix(1, 0, 0, 1, 0, 0, 1, 0, 0);
    public static final Matrix ROTATE_90 = new Matrix(0, 1, -1, 0, 0, 0, 1, 0, 0);
    public static final Matrix ROTATE_180 = new Matrix(-1, 0, 0, -1, 0, 0, 1, 0, 0);
    public static final Matrix ROTATE_270 = new Matrix(0, -1, 1, 0, 0, 0, 1, 0, 0);

    public static Matrix fromFileOrder(double a, double b, double u, double c, double d, double v, double tx, double ty, double w) {try{__CLR4_5_2fo4fo4lvl9el1m.R.inc(20405);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20406);return new Matrix(a, b, c, d, u, v, w, tx, ty);
    }finally{__CLR4_5_2fo4fo4lvl9el1m.R.flushNeeded();}}

    public static Matrix fromByteBuffer(ByteBuffer byteBuffer) {try{__CLR4_5_2fo4fo4lvl9el1m.R.inc(20407);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20408);return fromFileOrder(
                IsoTypeReader.readFixedPoint1616(byteBuffer),
                IsoTypeReader.readFixedPoint1616(byteBuffer),
                IsoTypeReader.readFixedPoint0230(byteBuffer),
                IsoTypeReader.readFixedPoint1616(byteBuffer),
                IsoTypeReader.readFixedPoint1616(byteBuffer),
                IsoTypeReader.readFixedPoint0230(byteBuffer),
                IsoTypeReader.readFixedPoint1616(byteBuffer),
                IsoTypeReader.readFixedPoint1616(byteBuffer),
                IsoTypeReader.readFixedPoint0230(byteBuffer)
        );
    }finally{__CLR4_5_2fo4fo4lvl9el1m.R.flushNeeded();}}

    public void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2fo4fo4lvl9el1m.R.inc(20409);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20410);IsoTypeWriter.writeFixedPoint1616(byteBuffer, a);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20411);IsoTypeWriter.writeFixedPoint1616(byteBuffer, b);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20412);IsoTypeWriter.writeFixedPoint0230(byteBuffer, u);

        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20413);IsoTypeWriter.writeFixedPoint1616(byteBuffer, c);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20414);IsoTypeWriter.writeFixedPoint1616(byteBuffer, d);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20415);IsoTypeWriter.writeFixedPoint0230(byteBuffer, v);

        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20416);IsoTypeWriter.writeFixedPoint1616(byteBuffer, tx);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20417);IsoTypeWriter.writeFixedPoint1616(byteBuffer, ty);
        __CLR4_5_2fo4fo4lvl9el1m.R.inc(20418);IsoTypeWriter.writeFixedPoint0230(byteBuffer, w);

    }finally{__CLR4_5_2fo4fo4lvl9el1m.R.flushNeeded();}}


}
