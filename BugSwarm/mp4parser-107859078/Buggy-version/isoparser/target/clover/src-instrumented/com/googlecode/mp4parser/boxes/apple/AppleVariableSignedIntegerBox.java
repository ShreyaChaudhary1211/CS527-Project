/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriterVariable;

import java.nio.ByteBuffer;

/**
 * Created by sannies on 10/22/13.
 */
public abstract class AppleVariableSignedIntegerBox extends AppleDataBox {public static class __CLR4_5_2b9mb9mlvl9ejqw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,14640,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected AppleVariableSignedIntegerBox(String type) {
        super(type, 15);__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14603);try{__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14602);
    }finally{__CLR4_5_2b9mb9mlvl9ejqw.R.flushNeeded();}}

    long value;
    int intLength = 1;

    public int getIntLength() {try{__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14604);
        __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14605);return intLength;
    }finally{__CLR4_5_2b9mb9mlvl9ejqw.R.flushNeeded();}}

    public void setIntLength(int intLength) {try{__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14606);
        __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14607);this.intLength = intLength;
    }finally{__CLR4_5_2b9mb9mlvl9ejqw.R.flushNeeded();}}

    public long getValue() {try{__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14608);
        //patched by Tobias Bley / UltraMixer (04/25/2014)
        __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14609);if ((((!isParsed())&&(__CLR4_5_2b9mb9mlvl9ejqw.R.iget(14610)!=0|true))||(__CLR4_5_2b9mb9mlvl9ejqw.R.iget(14611)==0&false)))
        {{
            __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14612);parseDetails();
        }
        }__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14613);return value;
    }finally{__CLR4_5_2b9mb9mlvl9ejqw.R.flushNeeded();}}

    public void setValue(long value) {try{__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14614);

        __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14615);if ((((value <= 127 && value > -128)&&(__CLR4_5_2b9mb9mlvl9ejqw.R.iget(14616)!=0|true))||(__CLR4_5_2b9mb9mlvl9ejqw.R.iget(14617)==0&false))) {{
            __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14618);intLength = 1;
        } }else {__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14619);if ((((value <= 32767 && value > -32768 && intLength<2)&&(__CLR4_5_2b9mb9mlvl9ejqw.R.iget(14620)!=0|true))||(__CLR4_5_2b9mb9mlvl9ejqw.R.iget(14621)==0&false))) {{
            __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14622);intLength = 2;
        } }else {__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14623);if ((((value <= 8388607 && value > -8388608&& intLength<3)&&(__CLR4_5_2b9mb9mlvl9ejqw.R.iget(14624)!=0|true))||(__CLR4_5_2b9mb9mlvl9ejqw.R.iget(14625)==0&false))) {{
            __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14626);intLength = 3;
        } }else {{
            __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14627);intLength = 4;
        }

        }}}__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14628);this.value = value;
    }finally{__CLR4_5_2b9mb9mlvl9ejqw.R.flushNeeded();}}

    @Override
    protected byte[] writeData() {try{__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14629);
        __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14630);int dLength = getDataLength();
        __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14631);ByteBuffer b = ByteBuffer.wrap(new byte[dLength]);
        __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14632);IsoTypeWriterVariable.write(value, b, dLength);
        __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14633);return b.array();
    }finally{__CLR4_5_2b9mb9mlvl9ejqw.R.flushNeeded();}}

    @Override
    protected void parseData(ByteBuffer data) {try{__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14634);
        __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14635);int intLength = data.remaining();
        __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14636);value = IsoTypeReaderVariable.read(data, intLength);
        __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14637);this.intLength = intLength;
    }finally{__CLR4_5_2b9mb9mlvl9ejqw.R.flushNeeded();}}

    @Override
    protected int getDataLength() {try{__CLR4_5_2b9mb9mlvl9ejqw.R.inc(14638);
        __CLR4_5_2b9mb9mlvl9ejqw.R.inc(14639);return intLength;
    }finally{__CLR4_5_2b9mb9mlvl9ejqw.R.flushNeeded();}}
}
