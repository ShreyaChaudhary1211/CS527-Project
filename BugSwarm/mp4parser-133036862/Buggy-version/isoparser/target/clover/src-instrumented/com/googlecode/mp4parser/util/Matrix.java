/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.util;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;

import java.nio.ByteBuffer;

/**
 * Transformation Matrix as used in <code>Track-</code> and <code>MovieHeaderBox</code>.
 */
public class Matrix {public static class __CLR4_5_2fqrfqrlvlulngj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,20514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    double u, v, w;
    double a, b, c, d, tx, ty;

    public Matrix(double a, double b, double c, double d, double u, double v, double w, double tx, double ty) {try{__CLR4_5_2fqrfqrlvlulngj.R.inc(20403);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20404);this.u = u;
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20405);this.v = v;
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20406);this.w = w;
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20407);this.a = a;
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20408);this.b = b;
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20409);this.c = c;
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20410);this.d = d;
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20411);this.tx = tx;
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20412);this.ty = ty;
    }finally{__CLR4_5_2fqrfqrlvlulngj.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2fqrfqrlvlulngj.R.inc(20413);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20414);if ((((this == o)&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20415)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20416)==0&false))) {__CLR4_5_2fqrfqrlvlulngj.R.inc(20417);return true;
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20418);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20419)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20420)==0&false))) {__CLR4_5_2fqrfqrlvlulngj.R.inc(20421);return false;

        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20422);Matrix matrix = (Matrix) o;

        __CLR4_5_2fqrfqrlvlulngj.R.inc(20423);if ((((Double.compare(matrix.a, a) != 0)&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20424)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20425)==0&false))) {__CLR4_5_2fqrfqrlvlulngj.R.inc(20426);return false;
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20427);if ((((Double.compare(matrix.b, b) != 0)&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20428)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20429)==0&false))) {__CLR4_5_2fqrfqrlvlulngj.R.inc(20430);return false;
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20431);if ((((Double.compare(matrix.c, c) != 0)&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20432)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20433)==0&false))) {__CLR4_5_2fqrfqrlvlulngj.R.inc(20434);return false;
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20435);if ((((Double.compare(matrix.d, d) != 0)&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20436)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20437)==0&false))) {__CLR4_5_2fqrfqrlvlulngj.R.inc(20438);return false;
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20439);if ((((Double.compare(matrix.tx, tx) != 0)&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20440)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20441)==0&false))) {__CLR4_5_2fqrfqrlvlulngj.R.inc(20442);return false;
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20443);if ((((Double.compare(matrix.ty, ty) != 0)&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20444)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20445)==0&false))) {__CLR4_5_2fqrfqrlvlulngj.R.inc(20446);return false;
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20447);if ((((Double.compare(matrix.u, u) != 0)&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20448)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20449)==0&false))) {__CLR4_5_2fqrfqrlvlulngj.R.inc(20450);return false;
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20451);if ((((Double.compare(matrix.v, v) != 0)&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20452)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20453)==0&false))) {__CLR4_5_2fqrfqrlvlulngj.R.inc(20454);return false;
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20455);if ((((Double.compare(matrix.w, w) != 0)&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20456)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20457)==0&false))) {__CLR4_5_2fqrfqrlvlulngj.R.inc(20458);return false;

        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20459);return true;
    }finally{__CLR4_5_2fqrfqrlvlulngj.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2fqrfqrlvlulngj.R.inc(20460);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20461);int result;
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20462);long temp;
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20463);temp = Double.doubleToLongBits(u);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20464);result = (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20465);temp = Double.doubleToLongBits(v);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20466);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20467);temp = Double.doubleToLongBits(w);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20468);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20469);temp = Double.doubleToLongBits(a);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20470);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20471);temp = Double.doubleToLongBits(b);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20472);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20473);temp = Double.doubleToLongBits(c);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20474);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20475);temp = Double.doubleToLongBits(d);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20476);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20477);temp = Double.doubleToLongBits(tx);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20478);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20479);temp = Double.doubleToLongBits(ty);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20480);result = 31 * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20481);return result;
    }finally{__CLR4_5_2fqrfqrlvlulngj.R.flushNeeded();}}


    @Override
    public String toString() {try{__CLR4_5_2fqrfqrlvlulngj.R.inc(20482);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20483);if ((((this.equals(ROTATE_0))&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20484)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20485)==0&false))) {{
            __CLR4_5_2fqrfqrlvlulngj.R.inc(20486);return "Rotate 0\u00b0";
        }
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20487);if ((((this.equals(ROTATE_90))&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20488)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20489)==0&false))) {{
            __CLR4_5_2fqrfqrlvlulngj.R.inc(20490);return "Rotate 90\u00b0";
        }
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20491);if ((((this.equals(ROTATE_180))&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20492)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20493)==0&false))) {{
            __CLR4_5_2fqrfqrlvlulngj.R.inc(20494);return "Rotate 180\u00b0";
        }
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20495);if ((((this.equals(ROTATE_270))&&(__CLR4_5_2fqrfqrlvlulngj.R.iget(20496)!=0|true))||(__CLR4_5_2fqrfqrlvlulngj.R.iget(20497)==0&false))) {{
            __CLR4_5_2fqrfqrlvlulngj.R.inc(20498);return "Rotate 270\u00b0";
        }
        }__CLR4_5_2fqrfqrlvlulngj.R.inc(20499);return "Matrix{" +
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
    }finally{__CLR4_5_2fqrfqrlvlulngj.R.flushNeeded();}}

    public static final Matrix ROTATE_0 = new Matrix(1, 0, 0, 1, 0, 0, 1, 0, 0);
    public static final Matrix ROTATE_90 = new Matrix(0, 1, -1, 0, 0, 0, 1, 0, 0);
    public static final Matrix ROTATE_180 = new Matrix(-1, 0, 0, -1, 0, 0, 1, 0, 0);
    public static final Matrix ROTATE_270 = new Matrix(0, -1, 1, 0, 0, 0, 1, 0, 0);

    public static Matrix fromFileOrder(double a, double b, double u, double c, double d, double v, double tx, double ty, double w) {try{__CLR4_5_2fqrfqrlvlulngj.R.inc(20500);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20501);return new Matrix(a, b, c, d, u, v, w, tx, ty);
    }finally{__CLR4_5_2fqrfqrlvlulngj.R.flushNeeded();}}

    public static Matrix fromByteBuffer(ByteBuffer byteBuffer) {try{__CLR4_5_2fqrfqrlvlulngj.R.inc(20502);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20503);return fromFileOrder(
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
    }finally{__CLR4_5_2fqrfqrlvlulngj.R.flushNeeded();}}

    public void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2fqrfqrlvlulngj.R.inc(20504);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20505);IsoTypeWriter.writeFixedPoint1616(byteBuffer, a);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20506);IsoTypeWriter.writeFixedPoint1616(byteBuffer, b);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20507);IsoTypeWriter.writeFixedPoint0230(byteBuffer, u);

        __CLR4_5_2fqrfqrlvlulngj.R.inc(20508);IsoTypeWriter.writeFixedPoint1616(byteBuffer, c);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20509);IsoTypeWriter.writeFixedPoint1616(byteBuffer, d);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20510);IsoTypeWriter.writeFixedPoint0230(byteBuffer, v);

        __CLR4_5_2fqrfqrlvlulngj.R.inc(20511);IsoTypeWriter.writeFixedPoint1616(byteBuffer, tx);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20512);IsoTypeWriter.writeFixedPoint1616(byteBuffer, ty);
        __CLR4_5_2fqrfqrlvlulngj.R.inc(20513);IsoTypeWriter.writeFixedPoint0230(byteBuffer, w);

    }finally{__CLR4_5_2fqrfqrlvlulngj.R.flushNeeded();}}


}
