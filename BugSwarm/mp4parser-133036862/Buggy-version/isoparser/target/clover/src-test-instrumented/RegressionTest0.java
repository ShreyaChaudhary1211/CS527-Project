/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {static class __CLR4_5_2ifxifxlvlulqb4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,25091,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),23901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23yt33uifx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test01",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23yt33uifx() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(23901);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23902);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(23903)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(23904)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(23905);System.out.format("%n%s%n", "RegressionTest0.test01");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(23906);java.lang.String str0 = com.coremedia.iso.boxes.MetaBox.TYPE;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23907);org.junit.Assert.assertEquals("'" + str0 + "' != '" + "meta" + "'", str0, "meta");
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test02() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),23908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_277t1wbig4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test02",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23908,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_277t1wbig4() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(23908);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23909);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(23910)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(23911)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(23912);System.out.format("%n%s%n", "RegressionTest0.test02");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(23913);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23914);com.googlecode.mp4parser.DataSource dataSource1 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23915);java.nio.ByteBuffer byteBuffer2 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23916);com.coremedia.iso.BoxParser boxParser4 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23917);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(23918);metaBox0.parse(dataSource1, byteBuffer2, (long) '#', boxParser4);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(23919);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test03() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),23920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2agt0osigg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test03",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23920,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2agt0osigg() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(23920);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23921);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(23922)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(23923)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(23924);System.out.format("%n%s%n", "RegressionTest0.test03");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(23925);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23926);java.lang.Class<?> wildcardClass1 = metaBox0.getClass();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23927);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test04() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),23928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dpszh9igo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test04",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dpszh9igo() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(23928);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23929);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(23930)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(23931)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(23932);System.out.format("%n%s%n", "RegressionTest0.test04");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(23933);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23934);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(23935);metaBox0.remove();
            __CLR4_5_2ifxifxlvlulqb4.R.inc(23936);org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test05() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),23937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gysy9qigx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test05",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23937,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gysy9qigx() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(23937);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23938);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(23939)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(23940)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(23941);System.out.format("%n%s%n", "RegressionTest0.test05");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(23942);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23943);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23944);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23945);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(23946);com.coremedia.iso.boxes.Box box3 = metaBox1.next();
            __CLR4_5_2ifxifxlvlulqb4.R.inc(23947);org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test06() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),23948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k7sx27ih8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test06",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k7sx27ih8() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(23948);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23949);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(23950)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(23951)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(23952);System.out.format("%n%s%n", "RegressionTest0.test06");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(23953);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23954);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23955);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23956);java.lang.Class<?> wildcardClass3 = metaBox0.getClass();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23957);org.junit.Assert.assertNotNull(wildcardClass3);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test07() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),23958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ngsvuoihi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test07",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ngsvuoihi() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(23958);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23959);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(23960)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(23961)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(23962);System.out.format("%n%s%n", "RegressionTest0.test07");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(23963);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23964);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23965);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23966);com.googlecode.mp4parser.DataSource dataSource3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23967);java.nio.ByteBuffer byteBuffer4 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23968);com.coremedia.iso.BoxParser boxParser6 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23969);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(23970);metaBox1.parse(dataSource3, byteBuffer4, 100L, boxParser6);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(23971);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test08() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),23972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qpsun5ihw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test08",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23972,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qpsun5ihw() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(23972);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23973);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(23974)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(23975)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(23976);System.out.format("%n%s%n", "RegressionTest0.test08");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(23977);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23978);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23979);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23980);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23981);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23982);java.nio.channels.WritableByteChannel writableByteChannel5 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23983);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(23984);metaBox1.getBox(writableByteChannel5);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(23985);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test09() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),23986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tystfmiia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test09",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23986,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tystfmiia() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(23986);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23987);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(23988)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(23989)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(23990);System.out.format("%n%s%n", "RegressionTest0.test09");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(23991);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23992);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23993);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23994);com.googlecode.mp4parser.DataSource dataSource3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23995);java.nio.ByteBuffer byteBuffer4 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23996);com.coremedia.iso.BoxParser boxParser6 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(23997);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(23998);metaBox1.parse(dataSource3, byteBuffer4, 10L, boxParser6);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(23999);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test10() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufo0uwiio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24000,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufo0uwiio() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24000);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24001);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24002)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24003)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24004);System.out.format("%n%s%n", "RegressionTest0.test10");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24005);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24006);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24007);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24008);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24009);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24010);java.util.List<com.coremedia.iso.boxes.Box> boxList5 = metaBox1.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24011);com.googlecode.mp4parser.DataSource dataSource6 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24012);com.coremedia.iso.BoxParser boxParser8 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24013);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24014);metaBox1.initContainer(dataSource6, (-1L), boxParser8);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24015);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24016);org.junit.Assert.assertNotNull(boxList5);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test11() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xonzndij5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24017,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xonzndij5() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24017);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24018);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24019)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24020)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24021);System.out.format("%n%s%n", "RegressionTest0.test11");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24022);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24023);com.googlecode.mp4parser.DataSource dataSource1 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24024);com.coremedia.iso.BoxParser boxParser3 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24025);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24026);metaBox0.initContainer(dataSource1, (long) (-1), boxParser3);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24027);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test12() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3g3jaijg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24028,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3g3jaijg() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24028);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24029);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24030)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24031)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24032);System.out.format("%n%s%n", "RegressionTest0.test12");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24033);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24034);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24035);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24036);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24037);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24038);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24039);java.util.List<com.coremedia.iso.boxes.Box> boxList6 = metaBox1.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24040);java.nio.channels.WritableByteChannel writableByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24041);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24042);metaBox1.getBox(writableByteChannel7);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24043);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24044);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24045);org.junit.Assert.assertNotNull(boxList6);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test13() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uug4qtijy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24046,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uug4qtijy() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24046);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24047);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24048)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24049)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24050);System.out.format("%n%s%n", "RegressionTest0.test13");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24051);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24052);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24053);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24054);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24055);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24056);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24057);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24058);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24059);com.googlecode.mp4parser.DataSource dataSource8 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24060);com.coremedia.iso.BoxParser boxParser10 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24061);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24062);metaBox1.initContainer(dataSource8, (long) (short) 0, boxParser10);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24063);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24064);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test14() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rlg5ycikh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24065,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rlg5ycikh() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24065);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24066);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24067)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24068)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24069);System.out.format("%n%s%n", "RegressionTest0.test14");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24070);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24071);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24072);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24073);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24074);long long4 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24075);java.lang.Class<?> wildcardClass5 = metaBox1.getClass();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24076);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24077);org.junit.Assert.assertTrue("'" + long4 + "' != '" + 12L + "'", long4 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24078);org.junit.Assert.assertNotNull(wildcardClass5);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test15() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocg75vikv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocg75vikv() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24079);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24080);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24081)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24082)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24083);System.out.format("%n%s%n", "RegressionTest0.test15");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24084);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24085);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24086);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24087);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24088);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24089);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24090);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24091);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24092);com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24093);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24094);metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24095);long long11 = metaBox9.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24096);com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24097);com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24098);metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24099);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24100);metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24101);int int17 = metaBox5.getFlags();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24102);java.nio.channels.WritableByteChannel writableByteChannel18 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24103);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24104);metaBox5.getBox(writableByteChannel18);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24105);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24106);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24107);org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24108);org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test16() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l3g8deilp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24109,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l3g8deilp() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24109);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24110);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24111)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24112)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24113);System.out.format("%n%s%n", "RegressionTest0.test16");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24114);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24115);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24116);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24117);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24118);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24119);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24120);java.util.List<com.coremedia.iso.boxes.Box> boxList6 = metaBox1.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24121);metaBox1.setFlags((int) (byte) 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24122);java.nio.channels.WritableByteChannel writableByteChannel9 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24123);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24124);metaBox1.getBox(writableByteChannel9);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24125);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24126);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24127);org.junit.Assert.assertNotNull(boxList6);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test17() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hug9kxim8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24128,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hug9kxim8() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24128);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24129);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24130)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24131)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24132);System.out.format("%n%s%n", "RegressionTest0.test17");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24133);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24134);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24135);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24136);int int3 = metaBox0.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24137);com.coremedia.iso.boxes.Container container4 = metaBox0.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24138);java.lang.String str5 = metaBox0.toString();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24139);com.googlecode.mp4parser.DataSource dataSource6 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24140);com.coremedia.iso.boxes.MetaBox metaBox7 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24141);com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24142);metaBox7.setParent((com.coremedia.iso.boxes.Container) metaBox8);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24143);int int10 = metaBox7.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24144);java.nio.ByteBuffer byteBuffer13 = metaBox7.getByteBuffer(0L, 0L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24145);com.coremedia.iso.BoxParser boxParser15 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24146);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24147);metaBox0.parse(dataSource6, byteBuffer13, (long) (byte) 1, boxParser15);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24148);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24149);org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24150);org.junit.Assert.assertNotNull(container4);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24151);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MetaBox[]" + "'", str5, "MetaBox[]");
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24152);org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24153);org.junit.Assert.assertNotNull(byteBuffer13);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test18() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2elgasgimy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24154,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2elgasgimy() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24154);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24155);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24156)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24157)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24158);System.out.format("%n%s%n", "RegressionTest0.test18");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24159);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24160);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24161);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24162);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24163);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24164);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24165);com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24166);java.lang.String str7 = metaBox1.toString();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24167);long long8 = metaBox1.getOffset();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24168);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24169);org.junit.Assert.assertNull(container6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24170);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MetaBox[]" + "'", str7, "MetaBox[]");
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24171);org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test19() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcgbzzing();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test19",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24172,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcgbzzing() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24172);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24173);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24174)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24175)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24176);System.out.format("%n%s%n", "RegressionTest0.test19");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24177);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24178);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24179);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24180);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24181);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24182);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24183);com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24184);java.util.List<com.coremedia.iso.boxes.Box> boxList7 = metaBox1.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24185);com.googlecode.mp4parser.DataSource dataSource8 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24186);com.coremedia.iso.BoxParser boxParser10 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24187);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24188);metaBox1.initContainer(dataSource8, 10L, boxParser10);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24189);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24190);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24191);org.junit.Assert.assertNull(container6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24192);org.junit.Assert.assertNotNull(boxList7);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test20() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2avl4kpio1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test20",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24193,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2avl4kpio1() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24193);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24194);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24195)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24196)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24197);System.out.format("%n%s%n", "RegressionTest0.test20");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24198);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24199);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24200);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24201);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24202);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24203);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24204);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24205);long long7 = metaBox5.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24206);int int8 = metaBox5.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24207);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24208);com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24209);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24210);int int12 = metaBox9.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24211);metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24212);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24213);com.googlecode.mp4parser.DataSource dataSource15 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24214);com.coremedia.iso.boxes.MetaBox metaBox16 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24215);com.coremedia.iso.boxes.MetaBox metaBox17 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24216);metaBox16.setParent((com.coremedia.iso.boxes.Container) metaBox17);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24217);int int19 = metaBox16.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24218);java.nio.ByteBuffer byteBuffer22 = metaBox16.getByteBuffer(0L, 0L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24219);com.coremedia.iso.BoxParser boxParser24 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24220);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24221);metaBox9.parse(dataSource15, byteBuffer22, (long) 'a', boxParser24);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24222);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24223);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24224);org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24225);org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24226);org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24227);org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24228);org.junit.Assert.assertNotNull(byteBuffer22);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test21() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ml5s8ip1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test21",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24229,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ml5s8ip1() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24229);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24230);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24231)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24232)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24233);System.out.format("%n%s%n", "RegressionTest0.test21");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24234);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24235);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24236);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24237);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24238);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24239);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24240);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24241);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24242);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24243);metaBox1.remove();
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24244);org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24245);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test22() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24dl6zripi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test22",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24246,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24dl6zripi() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24246);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24247);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24248)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24249)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24250);System.out.format("%n%s%n", "RegressionTest0.test22");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24251);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24252);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24253);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24254);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24255);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24256);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24257);com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24258);long long7 = metaBox1.getOffset();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24259);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24260);org.junit.Assert.assertNull(container6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24261);org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test23() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_214l87aipy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test23",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24262,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_214l87aipy() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24262);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24263);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24264)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24265)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24266);System.out.format("%n%s%n", "RegressionTest0.test23");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24267);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24268);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24269);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24270);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24271);int int4 = metaBox1.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24272);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24273);com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24274);metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24275);int int8 = metaBox5.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24276);metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24277);java.nio.channels.WritableByteChannel writableByteChannel10 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24278);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24279);metaBox1.writeContainer(writableByteChannel10);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24280);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24281);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24282);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24283);org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test24() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224eql7iqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test24",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224eql7iqk() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24284);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24285);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24286)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24287)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24288);System.out.format("%n%s%n", "RegressionTest0.test24");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24289);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24290);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24291);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24292);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24293);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24294);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24295);com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24296);java.util.List<com.coremedia.iso.boxes.Box> boxList7 = metaBox1.getBoxes();
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24297);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24298);java.nio.ByteBuffer byteBuffer10 = metaBox1.getByteBuffer((long) (short) -1, (long) (short) -1);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24299);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24300);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24301);org.junit.Assert.assertNull(container6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24302);org.junit.Assert.assertNotNull(boxList7);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test25() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25depdoir3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test25",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25depdoir3() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24303);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24304);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24305)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24306)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24307);System.out.format("%n%s%n", "RegressionTest0.test25");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24308);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24309);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24310);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24311);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24312);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24313);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24314);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24315);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24316);com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24317);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24318);metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24319);long long11 = metaBox9.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24320);com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24321);com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24322);metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24323);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24324);metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24325);int int17 = metaBox5.getFlags();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24326);com.googlecode.mp4parser.DataSource dataSource18 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24327);com.coremedia.iso.boxes.MetaBox metaBox19 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24328);com.coremedia.iso.boxes.MetaBox metaBox20 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24329);metaBox19.setParent((com.coremedia.iso.boxes.Container) metaBox20);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24330);int int22 = metaBox19.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24331);java.nio.ByteBuffer byteBuffer25 = metaBox19.getByteBuffer(0L, 0L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24332);com.coremedia.iso.BoxParser boxParser27 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24333);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24334);metaBox5.parse(dataSource18, byteBuffer25, (long) '4', boxParser27);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24335);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24336);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24337);org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24338);org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24339);org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24340);org.junit.Assert.assertNotNull(byteBuffer25);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test26() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28meo65is5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test26",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24341,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28meo65is5() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24341);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24342);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24343)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24344)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24345);System.out.format("%n%s%n", "RegressionTest0.test26");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24346);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24347);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24348);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24349);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24350);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24351);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24352);com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24353);java.lang.String str7 = metaBox1.toString();
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24354);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24355);metaBox1.remove();
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24356);org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24357);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24358);org.junit.Assert.assertNull(container6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24359);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MetaBox[]" + "'", str7, "MetaBox[]");
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test27() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bvemymiso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test27",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bvemymiso() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24360);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24361);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24362)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24363)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24364);System.out.format("%n%s%n", "RegressionTest0.test27");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24365);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24366);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24367);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24368);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24369);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24370);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24371);com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24372);java.lang.String str7 = metaBox1.toString();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24373);java.lang.String str8 = metaBox1.getType();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24374);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24375);org.junit.Assert.assertNull(container6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24376);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MetaBox[]" + "'", str7, "MetaBox[]");
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24377);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "meta" + "'", str8, "meta");
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test28() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4elr3it6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test28",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24378,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4elr3it6() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24378);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24379);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24380)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24381)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24382);System.out.format("%n%s%n", "RegressionTest0.test28");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24383);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24384);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24385);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24386);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24387);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24388);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24389);com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24390);java.util.List<com.coremedia.iso.boxes.Box> boxList7 = metaBox1.getBoxes();
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24391);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24392);metaBox1.remove();
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24393);org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24394);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24395);org.junit.Assert.assertNull(container6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24396);org.junit.Assert.assertNotNull(boxList7);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test29() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idekjkitp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test29",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24397,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idekjkitp() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24397);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24398);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24399)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24400)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24401);System.out.format("%n%s%n", "RegressionTest0.test29");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24402);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24403);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24404);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24405);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24406);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24407);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24408);com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24409);java.lang.String str7 = metaBox1.toString();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24410);int int8 = metaBox1.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24411);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24412);org.junit.Assert.assertNull(container6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24413);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MetaBox[]" + "'", str7, "MetaBox[]");
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24414);org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test30() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iu9ryuiu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test30",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24415,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iu9ryuiu7() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24415);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24416);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24417)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24418)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24419);System.out.format("%n%s%n", "RegressionTest0.test30");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24420);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24421);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24422);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24423);int int3 = metaBox0.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24424);java.nio.ByteBuffer byteBuffer6 = metaBox0.getByteBuffer(0L, 0L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24425);metaBox0.setVersion((int) (short) -1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24426);org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24427);org.junit.Assert.assertNotNull(byteBuffer6);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test31() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m39qrbiuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test31",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24428,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m39qrbiuk() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24428);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24429);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24430)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24431)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24432);System.out.format("%n%s%n", "RegressionTest0.test31");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24433);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24434);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24435);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24436);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24437);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24438);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24439);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24440);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24441);com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24442);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24443);metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24444);long long11 = metaBox9.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24445);com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24446);com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24447);metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24448);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24449);metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24450);com.coremedia.iso.boxes.Container container17 = metaBox5.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24451);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24452);org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24453);org.junit.Assert.assertNull(container17);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test32() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pc9pjsiva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test32",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24454,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pc9pjsiva() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24454);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24455);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24456)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24457)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24458);System.out.format("%n%s%n", "RegressionTest0.test32");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24459);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24460);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24461);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24462);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24463);int int4 = metaBox1.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24464);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24465);com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24466);metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24467);int int8 = metaBox5.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24468);metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24469);com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24470);com.coremedia.iso.boxes.MetaBox metaBox11 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24471);metaBox10.setParent((com.coremedia.iso.boxes.Container) metaBox11);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24472);com.coremedia.iso.boxes.Container container13 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24473);metaBox11.setParent(container13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24474);boolean boolean15 = metaBox11.hasNext();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24475);metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox11);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24476);java.util.List<com.coremedia.iso.boxes.Box> boxList17 = metaBox11.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24477);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24478);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24479);org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24480);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24481);org.junit.Assert.assertNotNull(boxList17);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test33() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sl9oc9iw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test33",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sl9oc9iw2() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24482);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24483);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24484)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24485)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24486);System.out.format("%n%s%n", "RegressionTest0.test33");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24487);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24488);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24489);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24490);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24491);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24492);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24493);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24494);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24495);com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24496);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24497);metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24498);long long11 = metaBox9.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24499);com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24500);com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24501);metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24502);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24503);metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24504);boolean boolean17 = metaBox13.hasNext();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24505);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24506);org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24507);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test34() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vu9n4qiws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test34",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24508,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vu9n4qiws() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24508);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24509);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24510)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24511)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24512);System.out.format("%n%s%n", "RegressionTest0.test34");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24513);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24514);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24515);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24516);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24517);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24518);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24519);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24520);long long7 = metaBox5.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24521);int int8 = metaBox5.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24522);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24523);com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24524);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24525);int int12 = metaBox9.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24526);metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24527);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24528);boolean boolean15 = metaBox9.hasNext();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24529);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24530);org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24531);org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24532);org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24533);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test35() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z39lx7ixi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test35",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z39lx7ixi() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24534);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24535);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24536)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24537)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24538);System.out.format("%n%s%n", "RegressionTest0.test35");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24539);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24540);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24541);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24542);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24543);int int4 = metaBox1.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24544);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24545);com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24546);metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24547);int int8 = metaBox5.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24548);metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24549);boolean boolean10 = metaBox1.hasNext();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24550);java.lang.String str11 = metaBox1.getType();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24551);com.googlecode.mp4parser.DataSource dataSource12 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24552);com.coremedia.iso.BoxParser boxParser14 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24553);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24554);metaBox1.initContainer(dataSource12, (long) 'a', boxParser14);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24555);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24556);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24557);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24558);org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24559);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24560);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "meta" + "'", str11, "meta");
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test36() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wouh9giy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test36",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24561,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wouh9giy9() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24561);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24562);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24563)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24564)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24565);System.out.format("%n%s%n", "RegressionTest0.test36");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24566);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24567);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24568);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24569);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24570);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24571);boolean boolean5 = metaBox1.hasNext();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24572);com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24573);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24574);java.nio.ByteBuffer byteBuffer9 = metaBox1.getByteBuffer((long) (short) 100, (long) (short) -1);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24575);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24576);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24577);org.junit.Assert.assertNull(container6);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test37() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tfuigziyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test37",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tfuigziyq() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24578);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24579);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24580)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24581)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24582);System.out.format("%n%s%n", "RegressionTest0.test37");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24583);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24584);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24585);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24586);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24587);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24588);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24589);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24590);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24591);com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24592);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24593);metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24594);long long11 = metaBox9.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24595);com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24596);com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24597);metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24598);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24599);metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24600);metaBox13.setFlags(100);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24601);java.lang.String str19 = metaBox13.toString();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24602);long long20 = metaBox13.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24603);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24604);org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24605);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MetaBox[]" + "'", str19, "MetaBox[]");
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24606);org.junit.Assert.assertTrue("'" + long20 + "' != '" + 12L + "'", long20 == 12L);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test38() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q6ujoiizj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test38",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q6ujoiizj() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24607);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24608);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24609)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24610)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24611);System.out.format("%n%s%n", "RegressionTest0.test38");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24612);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24613);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24614);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24615);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24616);int int4 = metaBox1.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24617);int int5 = metaBox1.getFlags();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24618);int int6 = metaBox1.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24619);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24620);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24621);org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24622);org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test39() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mxukw1izz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test39",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24623,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mxukw1izz() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24623);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24624);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24625)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24626)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24627);System.out.format("%n%s%n", "RegressionTest0.test39");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24628);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24629);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24630);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24631);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24632);int int4 = metaBox1.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24633);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24634);com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24635);metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24636);int int8 = metaBox5.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24637);metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24638);com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24639);com.coremedia.iso.boxes.MetaBox metaBox11 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24640);metaBox10.setParent((com.coremedia.iso.boxes.Container) metaBox11);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24641);com.coremedia.iso.boxes.Container container13 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24642);metaBox11.setParent(container13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24643);boolean boolean15 = metaBox11.hasNext();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24644);metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox11);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24645);com.googlecode.mp4parser.DataSource dataSource17 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24646);com.coremedia.iso.BoxParser boxParser19 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24647);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24648);metaBox1.initContainer(dataSource17, (long) '#', boxParser19);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24649);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24650);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24651);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24652);org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24653);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test40() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mgzdgrj0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test40",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mgzdgrj0u() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24654);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24655);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24656)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24657)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24658);System.out.format("%n%s%n", "RegressionTest0.test40");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24659);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24660);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24661);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24662);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24663);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24664);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24665);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24666);long long7 = metaBox5.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24667);int int8 = metaBox5.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24668);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24669);com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24670);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24671);int int12 = metaBox9.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24672);metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24673);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24674);java.lang.String str15 = metaBox9.toString();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24675);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24676);org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24677);org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24678);org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24679);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MetaBox[]" + "'", str15, "MetaBox[]");
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test41() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j7zeoaj1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test41",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24680,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j7zeoaj1k() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24680);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24681);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24682)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24683)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24684);System.out.format("%n%s%n", "RegressionTest0.test41");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24685);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24686);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24687);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24688);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24689);int int4 = metaBox1.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24690);int int5 = metaBox1.getFlags();
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24691);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24692);metaBox1.remove();
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24693);org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24694);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24695);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24696);org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test42() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fyzfvtj21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test42",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fyzfvtj21() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24697);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24698);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24699)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24700)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24701);System.out.format("%n%s%n", "RegressionTest0.test42");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24702);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24703);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24704);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24705);int int3 = metaBox0.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24706);com.coremedia.iso.boxes.Container container4 = metaBox0.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24707);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24708);com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24709);metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24710);com.coremedia.iso.boxes.Container container8 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24711);metaBox6.setParent(container8);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24712);boolean boolean10 = metaBox6.hasNext();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24713);com.coremedia.iso.boxes.Container container11 = metaBox6.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24714);metaBox0.setParent(container11);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24715);org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24716);org.junit.Assert.assertNotNull(container4);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24717);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24718);org.junit.Assert.assertNull(container11);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test43() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cpzh3cj2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test43",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24719,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cpzh3cj2n() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24719);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24720);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24721)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24722)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24723);System.out.format("%n%s%n", "RegressionTest0.test43");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24724);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24725);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24726);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24727);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24728);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24729);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24730);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24731);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24732);com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24733);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24734);metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24735);long long11 = metaBox9.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24736);com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24737);com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24738);metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24739);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24740);metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24741);java.nio.channels.WritableByteChannel writableByteChannel17 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24742);metaBox13.writeContainer(writableByteChannel17);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24743);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24744);org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test44() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29gziavj3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test44",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29gziavj3d() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24745);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24746);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24747)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24748)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24749);System.out.format("%n%s%n", "RegressionTest0.test44");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24750);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24751);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24752);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24753);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24754);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24755);boolean boolean5 = metaBox1.hasNext();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24756);java.nio.ByteBuffer byteBuffer8 = metaBox1.getByteBuffer((long) (byte) 1, (long) (short) 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24757);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24758);com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24759);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24760);int int12 = metaBox9.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24761);long long13 = metaBox9.getOffset();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24762);java.nio.ByteBuffer byteBuffer16 = metaBox9.getByteBuffer((long) (byte) 100, (long) 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24763);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24764);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24765);org.junit.Assert.assertNotNull(byteBuffer8);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24766);org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24767);org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24768);org.junit.Assert.assertNotNull(byteBuffer16);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test45() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_267zjiej41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test45",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24769,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_267zjiej41() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24769);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24770);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24771)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24772)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24773);System.out.format("%n%s%n", "RegressionTest0.test45");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24774);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24775);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24776);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24777);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24778);int int4 = metaBox1.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24779);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24780);com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24781);metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24782);int int8 = metaBox5.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24783);metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24784);metaBox1.setFlags((int) (byte) 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24785);java.nio.channels.WritableByteChannel writableByteChannel12 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24786);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24787);metaBox1.writeContainer(writableByteChannel12);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24788);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24789);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24790);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24791);org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test46() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22yzkpxj4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test46",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24792,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22yzkpxj4o() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24792);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24793);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24794)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24795)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24796);System.out.format("%n%s%n", "RegressionTest0.test46");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24797);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24798);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24799);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24800);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24801);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24802);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24803);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24804);com.coremedia.iso.boxes.Container container7 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24805);metaBox5.setParent(container7);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24806);com.coremedia.iso.boxes.Container container9 = metaBox5.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24807);java.util.List<com.coremedia.iso.boxes.Box> boxList10 = metaBox5.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24808);metaBox5.setFlags((int) (byte) 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24809);java.nio.channels.WritableByteChannel writableByteChannel13 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24810);metaBox5.writeContainer(writableByteChannel13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24811);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24812);com.coremedia.iso.boxes.MetaBox metaBox16 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24813);com.coremedia.iso.boxes.MetaBox metaBox17 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24814);metaBox16.setParent((com.coremedia.iso.boxes.Container) metaBox17);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24815);com.coremedia.iso.boxes.Container container19 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24816);metaBox17.setParent(container19);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24817);com.coremedia.iso.boxes.Container container21 = metaBox17.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24818);java.util.List<com.coremedia.iso.boxes.Box> boxList22 = metaBox17.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24819);metaBox17.setFlags((int) (byte) 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24820);java.nio.channels.WritableByteChannel writableByteChannel25 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24821);metaBox17.writeContainer(writableByteChannel25);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24822);metaBox17.setFlags((int) (byte) 100);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24823);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox17);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24824);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24825);org.junit.Assert.assertNull(container9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24826);org.junit.Assert.assertNotNull(boxList10);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24827);org.junit.Assert.assertNull(container21);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24828);org.junit.Assert.assertNotNull(boxList22);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test47() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a0e2kj5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test47",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24829,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a0e2kj5p() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24829);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24830);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24831)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24832)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24833);System.out.format("%n%s%n", "RegressionTest0.test47");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24834);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24835);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24836);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24837);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24838);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24839);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24840);java.util.List<com.coremedia.iso.boxes.Box> boxList6 = metaBox1.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24841);metaBox1.setFlags((int) (byte) 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24842);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24843);com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24844);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24845);com.coremedia.iso.boxes.Container container12 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24846);metaBox10.setParent(container12);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24847);com.coremedia.iso.boxes.Container container14 = metaBox10.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24848);int int15 = metaBox10.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24849);metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox10);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24850);long long17 = metaBox10.getOffset();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24851);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24852);org.junit.Assert.assertNotNull(boxList6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24853);org.junit.Assert.assertNull(container14);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24854);org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24855);org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test48() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23j0cv1j6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test48",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23j0cv1j6g() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24856);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24857);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24858)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24859)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24860);System.out.format("%n%s%n", "RegressionTest0.test48");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24861);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24862);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24863);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24864);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24865);long long4 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24866);long long5 = metaBox1.getOffset();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24867);java.lang.String str6 = metaBox1.getType();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24868);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24869);org.junit.Assert.assertTrue("'" + long4 + "' != '" + 12L + "'", long4 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24870);org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24871);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "meta" + "'", str6, "meta");
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test49() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s0bnij6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test49",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24872,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s0bnij6w() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24872);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24873);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24874)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24875)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24876);System.out.format("%n%s%n", "RegressionTest0.test49");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24877);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24878);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24879);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24880);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24881);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24882);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24883);com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24884);java.util.List<com.coremedia.iso.boxes.Box> boxList7 = metaBox1.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24885);com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24886);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24887);metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24888);int int11 = metaBox8.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24889);com.coremedia.iso.boxes.Container container12 = metaBox8.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24890);metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox8);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24891);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24892);org.junit.Assert.assertNull(container6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24893);org.junit.Assert.assertNotNull(boxList7);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24894);org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24895);org.junit.Assert.assertNotNull(container12);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test50() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_278vj2sj7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test50",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24896,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_278vj2sj7k() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24896);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24897);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24898)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24899)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24900);System.out.format("%n%s%n", "RegressionTest0.test50");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24901);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24902);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24903);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24904);int int3 = metaBox0.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24905);long long4 = metaBox0.getOffset();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24906);metaBox0.setFlags(0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24907);org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24908);org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test51() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ahvhv9j7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test51",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24909,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ahvhv9j7x() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24909);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24910);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24911)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24912)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24913);System.out.format("%n%s%n", "RegressionTest0.test51");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24914);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24915);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24916);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24917);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24918);int int4 = metaBox1.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24919);int int5 = metaBox1.getFlags();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24920);java.util.List<com.coremedia.iso.boxes.Box> boxList6 = metaBox1.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24921);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24922);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24923);org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24924);org.junit.Assert.assertNotNull(boxList6);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test52() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dqvgnqj8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test52",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24925,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dqvgnqj8d() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24925);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24926);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24927)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24928)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24929);System.out.format("%n%s%n", "RegressionTest0.test52");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24930);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24931);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24932);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24933);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24934);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24935);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24936);java.util.List<com.coremedia.iso.boxes.Box> boxList6 = metaBox1.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24937);metaBox1.setFlags((int) (byte) 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24938);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24939);com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24940);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24941);com.coremedia.iso.boxes.Container container12 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24942);metaBox10.setParent(container12);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24943);com.coremedia.iso.boxes.Container container14 = metaBox10.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24944);int int15 = metaBox10.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24945);metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox10);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24946);java.lang.Class<?> wildcardClass17 = metaBox10.getClass();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24947);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24948);org.junit.Assert.assertNotNull(boxList6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24949);org.junit.Assert.assertNull(container14);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24950);org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24951);org.junit.Assert.assertNotNull(wildcardClass17);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test53() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gzvfg7j94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test53",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gzvfg7j94() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24952);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24953);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24954)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24955)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24956);System.out.format("%n%s%n", "RegressionTest0.test53");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24957);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24958);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24959);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24960);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24961);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24962);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24963);java.util.List<com.coremedia.iso.boxes.Box> boxList6 = metaBox1.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24964);int int7 = metaBox1.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24965);com.googlecode.mp4parser.DataSource dataSource8 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24966);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24967);com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24968);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24969);com.coremedia.iso.boxes.Container container12 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24970);metaBox10.setParent(container12);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24971);boolean boolean14 = metaBox10.hasNext();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24972);java.nio.ByteBuffer byteBuffer17 = metaBox10.getByteBuffer((long) (byte) 1, (long) (short) 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24973);com.coremedia.iso.BoxParser boxParser19 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24974);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24975);metaBox1.parse(dataSource8, byteBuffer17, 0L, boxParser19);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(24976);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24977);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24978);org.junit.Assert.assertNotNull(boxList6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24979);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24980);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24981);org.junit.Assert.assertNotNull(byteBuffer17);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test54() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),24982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8ve8oj9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test54",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24982,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8ve8oj9y() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(24982);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24983);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(24984)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(24985)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(24986);System.out.format("%n%s%n", "RegressionTest0.test54");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(24987);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24988);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24989);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24990);int int3 = metaBox0.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24991);long long4 = metaBox0.getOffset();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24992);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24993);com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24994);metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24995);com.coremedia.iso.boxes.Container container8 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24996);metaBox6.setParent(container8);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24997);com.coremedia.iso.boxes.Container container10 = metaBox6.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24998);com.coremedia.iso.boxes.Container container11 = metaBox6.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(24999);java.lang.String str12 = metaBox6.toString();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25000);metaBox0.addBox((com.coremedia.iso.boxes.Box) metaBox6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25001);org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25002);org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25003);org.junit.Assert.assertNull(container10);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25004);org.junit.Assert.assertNull(container11);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25005);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MetaBox[]" + "'", str12, "MetaBox[]");
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test55() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),25006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhvd15jam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test55",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25006,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhvd15jam() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(25006);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25007);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(25008)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(25009)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(25010);System.out.format("%n%s%n", "RegressionTest0.test55");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(25011);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25012);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25013);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25014);int int3 = metaBox0.getVersion();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25015);long long4 = metaBox0.getOffset();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25016);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25017);com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25018);metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25019);com.coremedia.iso.boxes.Container container8 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25020);metaBox6.setParent(container8);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25021);com.coremedia.iso.boxes.Container container10 = metaBox6.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25022);java.util.List<com.coremedia.iso.boxes.Box> boxList11 = metaBox6.getBoxes();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25023);metaBox0.setBoxes(boxList11);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25024);org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25025);org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25026);org.junit.Assert.assertNull(container10);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25027);org.junit.Assert.assertNotNull(boxList11);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test56() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),25028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qqvbtmjb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test56",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25028,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qqvbtmjb8() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(25028);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25029);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(25030)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(25031)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(25032);System.out.format("%n%s%n", "RegressionTest0.test56");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(25033);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25034);java.lang.String str1 = metaBox0.toString();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25035);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MetaBox[]" + "'", str1, "MetaBox[]");
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test57() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),25036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tzvam3jbg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test57",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25036,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tzvam3jbg() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(25036);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25037);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(25038)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(25039)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(25040);System.out.format("%n%s%n", "RegressionTest0.test57");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(25041);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25042);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25043);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25044);long long3 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25045);com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25046);com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25047);metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25048);metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25049);com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25050);com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25051);metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25052);long long11 = metaBox9.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25053);com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25054);com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25055);metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25056);metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25057);metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25058);metaBox13.setFlags(100);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25059);java.lang.String str19 = metaBox13.toString();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25060);com.googlecode.mp4parser.DataSource dataSource20 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25061);com.coremedia.iso.boxes.MetaBox metaBox21 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25062);com.coremedia.iso.boxes.MetaBox metaBox22 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25063);metaBox21.setParent((com.coremedia.iso.boxes.Container) metaBox22);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25064);com.coremedia.iso.boxes.Container container24 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25065);metaBox22.setParent(container24);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25066);boolean boolean26 = metaBox22.hasNext();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25067);java.nio.ByteBuffer byteBuffer29 = metaBox22.getByteBuffer((long) (byte) 1, (long) (short) 0);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25068);com.coremedia.iso.BoxParser boxParser31 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25069);try {
            __CLR4_5_2ifxifxlvlulqb4.R.inc(25070);metaBox13.parse(dataSource20, byteBuffer29, (long) (byte) 100, boxParser31);
            __CLR4_5_2ifxifxlvlulqb4.R.inc(25071);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25072);org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25073);org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25074);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MetaBox[]" + "'", str19, "MetaBox[]");
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25075);org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25076);org.junit.Assert.assertNotNull(byteBuffer29);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}

    @Test
    public void test58() throws Throwable {__CLR4_5_2ifxifxlvlulqb4.R.globalSliceStart(getClass().getName(),25077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x8v9ekjcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ifxifxlvlulqb4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ifxifxlvlulqb4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test58",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x8v9ekjcl() throws Throwable{try{__CLR4_5_2ifxifxlvlulqb4.R.inc(25077);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25078);if ((((debug)&&(__CLR4_5_2ifxifxlvlulqb4.R.iget(25079)!=0|true))||(__CLR4_5_2ifxifxlvlulqb4.R.iget(25080)==0&false)))
            {__CLR4_5_2ifxifxlvlulqb4.R.inc(25081);System.out.format("%n%s%n", "RegressionTest0.test58");
        }__CLR4_5_2ifxifxlvlulqb4.R.inc(25082);com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25083);com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25084);metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25085);com.coremedia.iso.boxes.Container container3 = null;
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25086);metaBox1.setParent(container3);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25087);com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25088);long long6 = metaBox1.getSize();
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25089);org.junit.Assert.assertNull(container5);
        __CLR4_5_2ifxifxlvlulqb4.R.inc(25090);org.junit.Assert.assertTrue("'" + long6 + "' != '" + 12L + "'", long6 == 12L);
    }finally{__CLR4_5_2ifxifxlvlulqb4.R.flushNeeded();}}
}

