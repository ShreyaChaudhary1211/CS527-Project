/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.apple;

import java.nio.ByteBuffer;

import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractBox;

/**
 * Created by marwatk on 02/27/15
 */
public class AppleGPSCoordinatesBox extends AbstractBox {public static class __CLR4_5_2b6rb6rlvl9ejfk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,14520,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "\u00a9xyz";
	private static final int DEFAULT_LANG = 5575; //Empirical
    
    String coords;
    int lang = DEFAULT_LANG; //? Docs says lang, but it doesn't match anything in the traditional language map
	
	public AppleGPSCoordinatesBox() {
        super( TYPE );__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14500);try{__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14499);
    }finally{__CLR4_5_2b6rb6rlvl9ejfk.R.flushNeeded();}}
    
	public String getValue() {try{__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14501);
		__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14502);return coords;
	}finally{__CLR4_5_2b6rb6rlvl9ejfk.R.flushNeeded();}}
	
	public void setValue( String iso6709String ) {try{__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14503);
		__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14504);lang = DEFAULT_LANG;
		__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14505);coords = iso6709String;
	}finally{__CLR4_5_2b6rb6rlvl9ejfk.R.flushNeeded();}}
	
	@Override
	protected long getContentSize() {try{__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14506);
		__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14507);return 4 + Utf8.utf8StringLengthInBytes( coords );
	}finally{__CLR4_5_2b6rb6rlvl9ejfk.R.flushNeeded();}}

	@Override
	protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14508);
		__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14509);byteBuffer.putShort( (short)coords.length( ) );
		__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14510);byteBuffer.putShort( (short)lang );
		__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14511);byteBuffer.put( Utf8.convert( coords ) );
	}finally{__CLR4_5_2b6rb6rlvl9ejfk.R.flushNeeded();}}

	@Override
	protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14512);
		__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14513);int length = content.getShort();
        __CLR4_5_2b6rb6rlvl9ejfk.R.inc(14514);lang = content.getShort(); //Not sure if this is accurate. It always seems to be 15 c7
		__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14515);byte bytes[] = new byte[length];
		__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14516);content.get( bytes );
		__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14517);coords = Utf8.convert( bytes );
	}finally{__CLR4_5_2b6rb6rlvl9ejfk.R.flushNeeded();}}
    
	public String toString() {try{__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14518);
		__CLR4_5_2b6rb6rlvl9ejfk.R.inc(14519);return "AppleGPSCoordinatesBox[" + coords + "]";
	}finally{__CLR4_5_2b6rb6rlvl9ejfk.R.flushNeeded();}}
	
}
