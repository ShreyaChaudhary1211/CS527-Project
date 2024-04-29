import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl1 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader h264NalUnitHeader1 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.getNalUnitHeader(byteBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl0 = null;
        java.nio.ByteBuffer byteBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.ByteBufferBackedInputStream byteBufferBackedInputStream2 = h264TrackImpl0.new ByteBufferBackedInputStream(byteBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$ByteBufferBackedInputStream with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = '#';
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (short) 1;
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl2 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = 'a';
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl0 = null;
        java.io.InputStream inputStream1 = null;
        com.googlecode.mp4parser.h264.model.SeqParameterSet seqParameterSet2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.SEIMessage sEIMessage3 = h264TrackImpl0.new SEIMessage(inputStream1, seqParameterSet2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$SEIMessage with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int int0 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 97 + "'", int0 == 97);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (-1));
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", 10L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl(1.0d);
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl2 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (short) 10);
        java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = ' ';
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = 1;
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 100L);
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (-1));
        java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (-1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) ' ');
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 1.0f);
        java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = 0;
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 1.0f);
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (short) -1;
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (short) 10;
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (short) 100);
        java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (short) 10);
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (byte) -1);
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (-1.0f));
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (byte) 1;
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 100L);
        java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (-1.0f));
        java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = 97;
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (short) 100);
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (byte) 0);
        java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = 100;
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl(1.0d);
        java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (byte) 0;
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (byte) 10;
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) '4');
        java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (byte) -1);
        java.lang.Class<?> wildcardClass2 = defaultFragmenterImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 97);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) 97, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (-1L));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (byte) 100);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 10L);
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 10.0f);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", 100L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (byte) 0);
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((-1.0d));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 100.0f);
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 10);
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 0);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 1);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", 10L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 0.0f);
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) 0L);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl((double) (byte) 1);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl(0.0d);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "", (long) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl defaultFragmenterImpl1 = new com.googlecode.mp4parser.authoring.builder.DefaultFragmenterImpl(100.0d);
        com.googlecode.mp4parser.authoring.Track track2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = defaultFragmenterImpl1.sampleNumbers(track2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", (long) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = 10;
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER = (short) 0;
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        com.googlecode.mp4parser.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264TrackImpl4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl(dataSource0, "hi!", 100L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

