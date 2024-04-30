/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {static class __CLR4_5_2ib2ib2lvl9emll{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,24409,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23yt33uib2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test01",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23726,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23yt33uib2() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23726);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23727);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23728)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23729)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23730);System.out.format("%n%s%n", "RegressionTest0.test01");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23731);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23732);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23733);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl1 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23734);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test02() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_277t1wbibb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test02",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23735,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_277t1wbibb() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23735);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23736);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23737)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23738)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23739);System.out.format("%n%s%n", "RegressionTest0.test02");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23740);java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23741);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23742);com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader h264NalUnitHeader1 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.getNalUnitHeader(byteBuffer0);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23743);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test03() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2agt0osibk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test03",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23744,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2agt0osibk() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23744);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23745);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23746)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23747)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23748);System.out.format("%n%s%n", "RegressionTest0.test03");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23749);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl0 = null;
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23750);java.nio.ByteBuffer byteBuffer1 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23751);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23752);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.ByteBufferBackedInputStream byteBufferBackedInputStream2 = h264TrackImpl0.new ByteBufferBackedInputStream(byteBuffer1);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23753);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$ByteBufferBackedInputStream with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test04() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dpszh9ibu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test04",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23754,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dpszh9ibu() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23754);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23755);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23756)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23757)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23758);System.out.format("%n%s%n", "RegressionTest0.test04");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23759);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = '#';
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test05() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gysy9qic0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test05",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gysy9qic0() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23760);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23761);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23762)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23763)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23764);System.out.format("%n%s%n", "RegressionTest0.test05");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23765);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (short) 1;
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test06() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k7sx27ic6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test06",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23766,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k7sx27ic6() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23766);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23767);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23768)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23769)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23770);System.out.format("%n%s%n", "RegressionTest0.test06");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23771);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23772);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23773);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl2 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!");
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23774);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test07() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ngsvuoicf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test07",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ngsvuoicf() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23775);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23776);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23777)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23778)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23779);System.out.format("%n%s%n", "RegressionTest0.test07");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23780);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = 'a';
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test08() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qpsun5icl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test08",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23781,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qpsun5icl() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23781);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23782);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23783)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23784)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23785);System.out.format("%n%s%n", "RegressionTest0.test08");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23786);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl0 = null;
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23787);java.io.InputStream inputStream1 = null;
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23788);com.googlecode.mp4parser.h264.model.SeqParameterSet seqParameterSet2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23789);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23790);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.SEIMessage sEIMessage3 = h264TrackImpl0.new SEIMessage(inputStream1, seqParameterSet2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23791);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$SEIMessage with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test09() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tystfmicw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test09",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23792,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tystfmicw() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23792);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23793);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23794)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23795)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23796);System.out.format("%n%s%n", "RegressionTest0.test09");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23797);int int0 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER;
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23798);org.junit.Assert.assertTrue("'" + int0 + "' != '" + 97 + "'", int0 == 97);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test10() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufo0uwid3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23799,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufo0uwid3() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23799);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23800);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23801)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23802)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23803);System.out.format("%n%s%n", "RegressionTest0.test10");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23804);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (-1));
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23805);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23806);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23807);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23808);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test11() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xonzndidd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23809,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xonzndidd() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23809);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23810);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23811)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23812)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23813);System.out.format("%n%s%n", "RegressionTest0.test11");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23814);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23815);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23816);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", 10L, (int) (short) 1);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23817);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test12() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3g3jaidm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23818,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3g3jaidm() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23818);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23819);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23820)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23821)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23822);System.out.format("%n%s%n", "RegressionTest0.test12");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23823);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl(1.0d);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23824);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23825);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23826);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23827);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test13() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uug4qtidw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23828,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uug4qtidw() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23828);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23829);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23830)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23831)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23832);System.out.format("%n%s%n", "RegressionTest0.test13");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23833);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23834);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23835);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) 'a', (-1));
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23836);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test14() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rlg5ycie5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23837,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rlg5ycie5() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23837);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23838);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23839)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23840)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23841);System.out.format("%n%s%n", "RegressionTest0.test14");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23842);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23843);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23844);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl2 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "");
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23845);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test15() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocg75viee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocg75viee() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23846);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23847);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23848)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23849)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23850);System.out.format("%n%s%n", "RegressionTest0.test15");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23851);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (short) 10);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23852);java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23853);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test16() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l3g8deiem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23854,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l3g8deiem() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23854);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23855);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23856)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23857)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23858);System.out.format("%n%s%n", "RegressionTest0.test16");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23859);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23860);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23861);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) (byte) -1, 1);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23862);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test17() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hug9kxiev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23863,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hug9kxiev() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23863);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23864);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23865)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23866)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23867);System.out.format("%n%s%n", "RegressionTest0.test17");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23868);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = ' ';
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test18() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2elgasgif1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23869,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2elgasgif1() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23869);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23870);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23871)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23872)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23873);System.out.format("%n%s%n", "RegressionTest0.test18");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23874);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = 1;
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test19() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcgbzzif7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test19",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23875,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcgbzzif7() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23875);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23876);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23877)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23878)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23879);System.out.format("%n%s%n", "RegressionTest0.test19");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23880);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23881);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23882);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) (short) -1, (int) (short) 0);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23883);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test20() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2avl4kpifg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test20",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23884,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2avl4kpifg() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23884);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23885);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23886)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23887)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23888);System.out.format("%n%s%n", "RegressionTest0.test20");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23889);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 100L);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23890);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23891);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23892);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23893);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test21() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ml5s8ifq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test21",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23894,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ml5s8ifq() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23894);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23895);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23896)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23897)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23898);System.out.format("%n%s%n", "RegressionTest0.test21");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23899);java.lang.Object obj0 = new java.lang.Object();
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23900);java.lang.Class<?> wildcardClass1 = obj0.getClass();
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23901);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test22() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24dl6zrify();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test22",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23902,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24dl6zrify() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23902);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23903);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23904)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23905)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23906);System.out.format("%n%s%n", "RegressionTest0.test22");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23907);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (-1));
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23908);java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23909);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test23() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_214l87aig6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test23",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_214l87aig6() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23910);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23911);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23912)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23913)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23914);System.out.format("%n%s%n", "RegressionTest0.test23");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23915);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (-1);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test24() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224eql7igc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test24",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224eql7igc() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23916);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23917);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23918)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23919)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23920);System.out.format("%n%s%n", "RegressionTest0.test24");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23921);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) ' ');
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23922);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23923);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23924);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23925);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test25() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25depdoigm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test25",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23926,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25depdoigm() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23926);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23927);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23928)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23929)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23930);System.out.format("%n%s%n", "RegressionTest0.test25");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23931);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 1.0f);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23932);java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23933);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test26() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28meo65igu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test26",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23934,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28meo65igu() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23934);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23935);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23936)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23937)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23938);System.out.format("%n%s%n", "RegressionTest0.test26");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23939);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = 0;
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test27() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bvemymih0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test27",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23940,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bvemymih0() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23940);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23941);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23942)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23943)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23944);System.out.format("%n%s%n", "RegressionTest0.test27");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23945);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23946);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23947);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) '#', 1);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23948);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test28() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4elr3ih9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test28",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23949,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4elr3ih9() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23949);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23950);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23951)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23952)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23953);System.out.format("%n%s%n", "RegressionTest0.test28");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23954);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 1.0f);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23955);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23956);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23957);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23958);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test29() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idekjkihj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test29",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23959,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idekjkihj() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23959);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23960);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23961)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23962)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23963);System.out.format("%n%s%n", "RegressionTest0.test29");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23964);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23965);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23966);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) (byte) 100, 1);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23967);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test30() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iu9ryuihs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test30",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23968,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iu9ryuihs() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23968);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23969);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23970)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23971)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23972);System.out.format("%n%s%n", "RegressionTest0.test30");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23973);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (short) -1;
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test31() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m39qrbihy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test31",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23974,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m39qrbihy() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23974);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23975);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23976)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23977)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23978);System.out.format("%n%s%n", "RegressionTest0.test31");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23979);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23980);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23981);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) (short) 0, (int) (short) 0);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23982);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test32() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pc9pjsii7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test32",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23983,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pc9pjsii7() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23983);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23984);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23985)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23986)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23987);System.out.format("%n%s%n", "RegressionTest0.test32");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23988);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23989);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23990);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) '#', (int) '4');
            __CLR4_5_2ib2ib2lvl9emll.R.inc(23991);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test33() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sl9oc9iig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test33",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23992,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sl9oc9iig() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23992);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23993);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(23994)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(23995)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(23996);System.out.format("%n%s%n", "RegressionTest0.test33");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(23997);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (short) 10;
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test34() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),23998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vu9n4qiim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test34",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23998,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vu9n4qiim() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(23998);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(23999);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24000)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24001)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24002);System.out.format("%n%s%n", "RegressionTest0.test34");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24003);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24004);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24005);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) (short) 10, (int) (byte) 100);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24006);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test35() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z39lx7iiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test35",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24007,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z39lx7iiv() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24007);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24008);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24009)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24010)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24011);System.out.format("%n%s%n", "RegressionTest0.test35");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24012);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (short) 100);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24013);java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24014);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test36() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wouh9gij3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test36",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wouh9gij3() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24015);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24016);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24017)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24018)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24019);System.out.format("%n%s%n", "RegressionTest0.test36");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24020);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (short) 10);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24021);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24022);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24023);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24024);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test37() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tfuigzijd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test37",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24025,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tfuigzijd() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24025);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24026);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24027)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24028)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24029);System.out.format("%n%s%n", "RegressionTest0.test37");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24030);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (byte) -1);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24031);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24032);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24033);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24034);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test38() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q6ujoiijn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test38",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24035,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q6ujoiijn() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24035);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24036);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24037)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24038)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24039);System.out.format("%n%s%n", "RegressionTest0.test38");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24040);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (-1.0f));
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24041);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24042);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24043);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24044);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test39() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mxukw1ijx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test39",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mxukw1ijx() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24045);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24046);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24047)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24048)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24049);System.out.format("%n%s%n", "RegressionTest0.test39");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24050);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (byte) 1;
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test40() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mgzdgrik3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test40",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24051,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mgzdgrik3() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24051);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24052);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24053)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24054)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24055);System.out.format("%n%s%n", "RegressionTest0.test40");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24056);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 100L);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24057);java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24058);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test41() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j7zeoaikb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test41",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j7zeoaikb() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24059);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24060);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24061)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24062)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24063);System.out.format("%n%s%n", "RegressionTest0.test41");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24064);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (-1.0f));
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24065);java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24066);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test42() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fyzfvtikj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test42",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24067,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fyzfvtikj() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24067);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24068);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24069)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24070)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24071);System.out.format("%n%s%n", "RegressionTest0.test42");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24072);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24073);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24074);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) (short) 100, (int) 'a');
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24075);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test43() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cpzh3ciks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test43",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24076,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cpzh3ciks() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24076);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24077);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24078)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24079)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24080);System.out.format("%n%s%n", "RegressionTest0.test43");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24081);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = 97;
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test44() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29gziaviky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test44",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24082,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29gziaviky() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24082);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24083);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24084)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24085)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24086);System.out.format("%n%s%n", "RegressionTest0.test44");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24087);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (short) 100);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24088);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24089);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24090);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24091);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test45() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_267zjieil8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test45",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24092,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_267zjieil8() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24092);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24093);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24094)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24095)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24096);System.out.format("%n%s%n", "RegressionTest0.test45");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24097);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (byte) 0);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24098);java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24099);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test46() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22yzkpxilg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test46",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22yzkpxilg() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24100);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24101);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24102)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24103)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24104);System.out.format("%n%s%n", "RegressionTest0.test46");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24105);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24106);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24107);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) (short) 10, (int) (byte) 1);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24108);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test47() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a0e2kilp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test47",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24109,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a0e2kilp() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24109);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24110);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24111)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24112)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24113);System.out.format("%n%s%n", "RegressionTest0.test47");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24114);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = 100;
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test48() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23j0cv1ilv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test48",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24115,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23j0cv1ilv() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24115);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24116);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24117)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24118)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24119);System.out.format("%n%s%n", "RegressionTest0.test48");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24120);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl(1.0d);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24121);java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24122);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test49() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s0bniim3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test49",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24123,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s0bniim3() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24123);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24124);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24125)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24126)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24127);System.out.format("%n%s%n", "RegressionTest0.test49");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24128);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (byte) 0;
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test50() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_278vj2sim9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test50",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_278vj2sim9() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24129);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24130);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24131)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24132)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24133);System.out.format("%n%s%n", "RegressionTest0.test50");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24134);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (byte) 10;
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test51() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ahvhv9imf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test51",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24135,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ahvhv9imf() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24135);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24136);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24137)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24138)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24139);System.out.format("%n%s%n", "RegressionTest0.test51");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24140);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24141);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24142);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) 10, (int) (byte) 100);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24143);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test52() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dqvgnqimo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test52",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dqvgnqimo() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24144);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24145);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24146)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24147)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24148);System.out.format("%n%s%n", "RegressionTest0.test52");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24149);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) '4');
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24150);java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24151);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test53() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gzvfg7imw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test53",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24152,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gzvfg7imw() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24152);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24153);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24154)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24155)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24156);System.out.format("%n%s%n", "RegressionTest0.test53");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24157);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24158);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24159);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) 10, (int) ' ');
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24160);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test54() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8ve8oin5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test54",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24161,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8ve8oin5() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24161);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24162);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24163)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24164)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24165);System.out.format("%n%s%n", "RegressionTest0.test54");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24166);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (byte) -1);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24167);java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24168);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test55() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhvd15ind();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test55",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhvd15ind() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24169);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24170);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24171)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24172)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24173);System.out.format("%n%s%n", "RegressionTest0.test55");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24174);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 97);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test56() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qqvbtminj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test56",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24175,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qqvbtminj() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24175);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24176);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24177)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24178)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24179);System.out.format("%n%s%n", "RegressionTest0.test56");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24180);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24181);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24182);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) 97, (int) (short) 1);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24183);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test57() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tzvam3ins();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test57",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tzvam3ins() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24184);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24185);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24186)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24187)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24188);System.out.format("%n%s%n", "RegressionTest0.test57");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24189);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24190);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24191);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) 10, (-1));
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24192);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test58() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x8v9ekio1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test58",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24193,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x8v9ekio1() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24193);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24194);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24195)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24196)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24197);System.out.format("%n%s%n", "RegressionTest0.test58");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24198);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (-1L));
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test59() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yj8ts3io7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test59",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yj8ts3io7() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24199);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24200);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24201)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24202)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24203);System.out.format("%n%s%n", "RegressionTest0.test59");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24204);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (byte) 100);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test60() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y2dmctiod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test60",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y2dmctiod() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24205);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24206);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24207)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24208)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24209);System.out.format("%n%s%n", "RegressionTest0.test60");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24210);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 10L);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24211);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24212);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24213);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24214);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test61() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utdnkcion();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test61",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utdnkcion() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24215);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24216);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24217)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24218)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24219);System.out.format("%n%s%n", "RegressionTest0.test61");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24220);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 10.0f);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test62() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rkdorviot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test62",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24221,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rkdorviot() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24221);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24222);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24223)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24224)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24225);System.out.format("%n%s%n", "RegressionTest0.test62");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24226);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24227);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24228);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", 100L, (int) (byte) 0);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24229);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test63() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2obdpzeip2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test63",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24230,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2obdpzeip2() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24230);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24231);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24232)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24233)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24234);System.out.format("%n%s%n", "RegressionTest0.test63");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24235);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (byte) 0);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24236);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24237);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24238);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24239);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test64() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2dr6xipc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test64",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24240,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2dr6xipc() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24240);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24241);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24242)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24243)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24244);System.out.format("%n%s%n", "RegressionTest0.test64");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24245);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24246);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24247);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) (byte) 0, (int) (short) 1);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24248);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test65() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2htdsegipl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test65",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24249,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2htdsegipl() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24249);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24250);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24251)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24252)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24253);System.out.format("%n%s%n", "RegressionTest0.test65");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24254);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((-1.0d));
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test66() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ekdtlzipr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test66",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ekdtlzipr() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24255);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24256);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24257)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24258)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24259);System.out.format("%n%s%n", "RegressionTest0.test66");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24260);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24261);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24262);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", 0L, (int) (short) 0);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24263);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test67() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bbdutiiq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test67",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bbdutiiq0() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24264);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24265);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24266)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24267)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24268);System.out.format("%n%s%n", "RegressionTest0.test67");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24269);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 100.0f);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24270);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24271);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24272);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24273);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test68() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_282dw11iqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test68",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24274,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_282dw11iqa() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24274);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24275);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24276)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24277)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24278);System.out.format("%n%s%n", "RegressionTest0.test68");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24279);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 10);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24280);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24281);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24282);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24283);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test69() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24tdx8kiqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test69",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24tdx8kiqk() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24284);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24285);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24286)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24287)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24288);System.out.format("%n%s%n", "RegressionTest0.test69");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24289);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 0);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test70() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ciptaiqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test70",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24290,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ciptaiqq() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24290);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24291);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24292)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24293)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24294);System.out.format("%n%s%n", "RegressionTest0.test70");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24295);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 1);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test71() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_213ir0tiqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test71",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_213ir0tiqw() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24296);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24297);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24298)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24299)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24300);System.out.format("%n%s%n", "RegressionTest0.test71");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24301);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24302);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24303);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", 10L, (int) (short) -1);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24304);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test72() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_225h7roir5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test72",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24305,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_225h7roir5() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24305);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24306);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24307)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24308)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24309);System.out.format("%n%s%n", "RegressionTest0.test72");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24310);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 0.0f);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24311);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24312);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24313);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24314);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test73() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25eh6k5irf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test73",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24315,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25eh6k5irf() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24315);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24316);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24317)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24318)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24319);System.out.format("%n%s%n", "RegressionTest0.test73");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24320);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 0L);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test74() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28nh5cmirl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test74",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28nh5cmirl() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24321);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24322);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24323)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24324)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24325);System.out.format("%n%s%n", "RegressionTest0.test74");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24326);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24327);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24328);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) (short) 0, (int) (byte) 1);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24329);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test75() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bwh453iru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test75",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24330,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bwh453iru() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24330);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24331);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24332)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24333)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24334);System.out.format("%n%s%n", "RegressionTest0.test75");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24335);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24336);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24337);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) 100, (int) ' ');
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24338);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test76() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f5h2xkis3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test76",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24339,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f5h2xkis3() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24339);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24340);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24341)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24342)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24343);System.out.format("%n%s%n", "RegressionTest0.test76");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24344);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (byte) 1);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test77() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ieh1q1is9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test77",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24345,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ieh1q1is9() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24345);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24346);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24347)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24348)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24349);System.out.format("%n%s%n", "RegressionTest0.test77");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24350);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl(0.0d);
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test78() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lnh0iiisf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test78",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24351,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lnh0iiisf() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24351);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24352);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24353)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24354)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24355);System.out.format("%n%s%n", "RegressionTest0.test78");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24356);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24357);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24358);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) 'a', 100);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24359);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test79() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2owgzaziso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test79",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2owgzaziso() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24360);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24361);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24362)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24363)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24364);System.out.format("%n%s%n", "RegressionTest0.test79");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24365);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24366);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24367);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) 1, (int) ' ');
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24368);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test80() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pdc6q9isx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test80",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pdc6q9isx() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24369);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24370);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24371)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24372)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24373);System.out.format("%n%s%n", "RegressionTest0.test80");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24374);com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl(100.0d);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24375);com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24376);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24377);long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24378);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test81() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2smc5iqit7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test81",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24379,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2smc5iqit7() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24379);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24380);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24381)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24382)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24383);System.out.format("%n%s%n", "RegressionTest0.test81");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24384);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24385);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24386);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) (short) -1, (int) (short) 1);
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24387);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test82() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vvc4b7itg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test82",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24388,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vvc4b7itg() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24388);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24389);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24390)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24391)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24392);System.out.format("%n%s%n", "RegressionTest0.test82");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24393);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = 10;
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test83() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z4c33oitm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test83",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24394,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z4c33oitm() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24394);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24395);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24396)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24397)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24398);System.out.format("%n%s%n", "RegressionTest0.test83");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24399);com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (short) 0;
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}

    @Test
    public void test84() throws Throwable {__CLR4_5_2ib2ib2lvl9emll.R.globalSliceStart(getClass().getName(),24400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wns02zits();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib2ib2lvl9emll.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib2ib2lvl9emll.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test84",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24400,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wns02zits() throws Throwable{try{__CLR4_5_2ib2ib2lvl9emll.R.inc(24400);
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24401);if ((((debug)&&(__CLR4_5_2ib2ib2lvl9emll.R.iget(24402)!=0|true))||(__CLR4_5_2ib2ib2lvl9emll.R.iget(24403)==0&false)))
            {__CLR4_5_2ib2ib2lvl9emll.R.inc(24404);System.out.format("%n%s%n", "RegressionTest0.test84");
        }__CLR4_5_2ib2ib2lvl9emll.R.inc(24405);com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ib2ib2lvl9emll.R.inc(24406);try {
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24407);com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", 100L, (int) '4');
            __CLR4_5_2ib2ib2lvl9emll.R.inc(24408);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ib2ib2lvl9emll.R.flushNeeded();}}
}

