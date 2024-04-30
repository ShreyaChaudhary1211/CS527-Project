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
        java.lang.String str0 = com.coremedia.iso.boxes.MetaBox.TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "meta" + "'", str0, "meta");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.googlecode.mp4parser.DataSource dataSource1 = null;
        java.nio.ByteBuffer byteBuffer2 = null;
        com.coremedia.iso.BoxParser boxParser4 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox0.parse(dataSource1, byteBuffer2, (long) '#', boxParser4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        java.lang.Class<?> wildcardClass1 = metaBox0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        // The following exception was thrown during execution in test generation
        try {
            metaBox0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        // The following exception was thrown during execution in test generation
        try {
            com.coremedia.iso.boxes.Box box3 = metaBox1.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        java.lang.Class<?> wildcardClass3 = metaBox0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.googlecode.mp4parser.DataSource dataSource3 = null;
        java.nio.ByteBuffer byteBuffer4 = null;
        com.coremedia.iso.BoxParser boxParser6 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.parse(dataSource3, byteBuffer4, 100L, boxParser6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        java.nio.channels.WritableByteChannel writableByteChannel5 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.getBox(writableByteChannel5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.googlecode.mp4parser.DataSource dataSource3 = null;
        java.nio.ByteBuffer byteBuffer4 = null;
        com.coremedia.iso.BoxParser boxParser6 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.parse(dataSource3, byteBuffer4, 10L, boxParser6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        java.util.List<com.coremedia.iso.boxes.Box> boxList5 = metaBox1.getBoxes();
        com.googlecode.mp4parser.DataSource dataSource6 = null;
        com.coremedia.iso.BoxParser boxParser8 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.initContainer(dataSource6, (-1L), boxParser8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boxList5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.googlecode.mp4parser.DataSource dataSource1 = null;
        com.coremedia.iso.BoxParser boxParser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox0.initContainer(dataSource1, (long) (-1), boxParser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        java.util.List<com.coremedia.iso.boxes.Box> boxList6 = metaBox1.getBoxes();
        java.nio.channels.WritableByteChannel writableByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.getBox(writableByteChannel7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNotNull(boxList6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        com.googlecode.mp4parser.DataSource dataSource8 = null;
        com.coremedia.iso.BoxParser boxParser10 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.initContainer(dataSource8, (long) (short) 0, boxParser10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        long long4 = metaBox1.getSize();
        java.lang.Class<?> wildcardClass5 = metaBox1.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 12L + "'", long4 == 12L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        long long11 = metaBox9.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        int int17 = metaBox5.getFlags();
        java.nio.channels.WritableByteChannel writableByteChannel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox5.getBox(writableByteChannel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        java.util.List<com.coremedia.iso.boxes.Box> boxList6 = metaBox1.getBoxes();
        metaBox1.setFlags((int) (byte) 0);
        java.nio.channels.WritableByteChannel writableByteChannel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.getBox(writableByteChannel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNotNull(boxList6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        int int3 = metaBox0.getVersion();
        com.coremedia.iso.boxes.Container container4 = metaBox0.getParent();
        java.lang.String str5 = metaBox0.toString();
        com.googlecode.mp4parser.DataSource dataSource6 = null;
        com.coremedia.iso.boxes.MetaBox metaBox7 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        metaBox7.setParent((com.coremedia.iso.boxes.Container) metaBox8);
        int int10 = metaBox7.getVersion();
        java.nio.ByteBuffer byteBuffer13 = metaBox7.getByteBuffer(0L, 0L);
        com.coremedia.iso.BoxParser boxParser15 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox0.parse(dataSource6, byteBuffer13, (long) (byte) 1, boxParser15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MetaBox[]" + "'", str5, "MetaBox[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        java.lang.String str7 = metaBox1.toString();
        long long8 = metaBox1.getOffset();
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MetaBox[]" + "'", str7, "MetaBox[]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        java.util.List<com.coremedia.iso.boxes.Box> boxList7 = metaBox1.getBoxes();
        com.googlecode.mp4parser.DataSource dataSource8 = null;
        com.coremedia.iso.BoxParser boxParser10 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.initContainer(dataSource8, 10L, boxParser10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNotNull(boxList7);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        long long7 = metaBox5.getSize();
        int int8 = metaBox5.getVersion();
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        int int12 = metaBox9.getVersion();
        metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox9);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        com.googlecode.mp4parser.DataSource dataSource15 = null;
        com.coremedia.iso.boxes.MetaBox metaBox16 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox17 = new com.coremedia.iso.boxes.MetaBox();
        metaBox16.setParent((com.coremedia.iso.boxes.Container) metaBox17);
        int int19 = metaBox16.getVersion();
        java.nio.ByteBuffer byteBuffer22 = metaBox16.getByteBuffer(0L, 0L);
        com.coremedia.iso.BoxParser boxParser24 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox9.parse(dataSource15, byteBuffer22, (long) 'a', boxParser24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        long long7 = metaBox1.getOffset();
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        int int4 = metaBox1.getVersion();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        int int8 = metaBox5.getVersion();
        metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox5);
        java.nio.channels.WritableByteChannel writableByteChannel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.writeContainer(writableByteChannel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        java.util.List<com.coremedia.iso.boxes.Box> boxList7 = metaBox1.getBoxes();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = metaBox1.getByteBuffer((long) (short) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNotNull(boxList7);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        long long11 = metaBox9.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        int int17 = metaBox5.getFlags();
        com.googlecode.mp4parser.DataSource dataSource18 = null;
        com.coremedia.iso.boxes.MetaBox metaBox19 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox20 = new com.coremedia.iso.boxes.MetaBox();
        metaBox19.setParent((com.coremedia.iso.boxes.Container) metaBox20);
        int int22 = metaBox19.getVersion();
        java.nio.ByteBuffer byteBuffer25 = metaBox19.getByteBuffer(0L, 0L);
        com.coremedia.iso.BoxParser boxParser27 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox5.parse(dataSource18, byteBuffer25, (long) '4', boxParser27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteBuffer25);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        java.lang.String str7 = metaBox1.toString();
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MetaBox[]" + "'", str7, "MetaBox[]");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        java.lang.String str7 = metaBox1.toString();
        java.lang.String str8 = metaBox1.getType();
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MetaBox[]" + "'", str7, "MetaBox[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "meta" + "'", str8, "meta");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        java.util.List<com.coremedia.iso.boxes.Box> boxList7 = metaBox1.getBoxes();
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNotNull(boxList7);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        java.lang.String str7 = metaBox1.toString();
        int int8 = metaBox1.getVersion();
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MetaBox[]" + "'", str7, "MetaBox[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        int int3 = metaBox0.getVersion();
        java.nio.ByteBuffer byteBuffer6 = metaBox0.getByteBuffer(0L, 0L);
        metaBox0.setVersion((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        long long11 = metaBox9.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        com.coremedia.iso.boxes.Container container17 = metaBox5.getParent();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        org.junit.Assert.assertNull(container17);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        int int4 = metaBox1.getVersion();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        int int8 = metaBox5.getVersion();
        metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox5);
        com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox11 = new com.coremedia.iso.boxes.MetaBox();
        metaBox10.setParent((com.coremedia.iso.boxes.Container) metaBox11);
        com.coremedia.iso.boxes.Container container13 = null;
        metaBox11.setParent(container13);
        boolean boolean15 = metaBox11.hasNext();
        metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox11);
        java.util.List<com.coremedia.iso.boxes.Box> boxList17 = metaBox11.getBoxes();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(boxList17);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        long long11 = metaBox9.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        boolean boolean17 = metaBox13.hasNext();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        long long7 = metaBox5.getSize();
        int int8 = metaBox5.getVersion();
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        int int12 = metaBox9.getVersion();
        metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox9);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        boolean boolean15 = metaBox9.hasNext();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        int int4 = metaBox1.getVersion();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        int int8 = metaBox5.getVersion();
        metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox5);
        boolean boolean10 = metaBox1.hasNext();
        java.lang.String str11 = metaBox1.getType();
        com.googlecode.mp4parser.DataSource dataSource12 = null;
        com.coremedia.iso.BoxParser boxParser14 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.initContainer(dataSource12, (long) 'a', boxParser14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "meta" + "'", str11, "meta");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        boolean boolean5 = metaBox1.hasNext();
        com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = metaBox1.getByteBuffer((long) (short) 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(container6);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        long long11 = metaBox9.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        metaBox13.setFlags(100);
        java.lang.String str19 = metaBox13.toString();
        long long20 = metaBox13.getSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MetaBox[]" + "'", str19, "MetaBox[]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 12L + "'", long20 == 12L);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        int int4 = metaBox1.getVersion();
        int int5 = metaBox1.getFlags();
        int int6 = metaBox1.getVersion();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        int int4 = metaBox1.getVersion();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        int int8 = metaBox5.getVersion();
        metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox5);
        com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox11 = new com.coremedia.iso.boxes.MetaBox();
        metaBox10.setParent((com.coremedia.iso.boxes.Container) metaBox11);
        com.coremedia.iso.boxes.Container container13 = null;
        metaBox11.setParent(container13);
        boolean boolean15 = metaBox11.hasNext();
        metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox11);
        com.googlecode.mp4parser.DataSource dataSource17 = null;
        com.coremedia.iso.BoxParser boxParser19 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.initContainer(dataSource17, (long) '#', boxParser19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        long long7 = metaBox5.getSize();
        int int8 = metaBox5.getVersion();
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        int int12 = metaBox9.getVersion();
        metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox9);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        java.lang.String str15 = metaBox9.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MetaBox[]" + "'", str15, "MetaBox[]");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        int int4 = metaBox1.getVersion();
        int int5 = metaBox1.getFlags();
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        int int3 = metaBox0.getVersion();
        com.coremedia.iso.boxes.Container container4 = metaBox0.getParent();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        com.coremedia.iso.boxes.Container container8 = null;
        metaBox6.setParent(container8);
        boolean boolean10 = metaBox6.hasNext();
        com.coremedia.iso.boxes.Container container11 = metaBox6.getParent();
        metaBox0.setParent(container11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(container4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(container11);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        long long11 = metaBox9.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        java.nio.channels.WritableByteChannel writableByteChannel17 = null;
        metaBox13.writeContainer(writableByteChannel17);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        boolean boolean5 = metaBox1.hasNext();
        java.nio.ByteBuffer byteBuffer8 = metaBox1.getByteBuffer((long) (byte) 1, (long) (short) 0);
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        int int12 = metaBox9.getVersion();
        long long13 = metaBox9.getOffset();
        java.nio.ByteBuffer byteBuffer16 = metaBox9.getByteBuffer((long) (byte) 100, (long) 0);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        int int4 = metaBox1.getVersion();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        int int8 = metaBox5.getVersion();
        metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox5);
        metaBox1.setFlags((int) (byte) 0);
        java.nio.channels.WritableByteChannel writableByteChannel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.writeContainer(writableByteChannel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        com.coremedia.iso.boxes.Container container7 = null;
        metaBox5.setParent(container7);
        com.coremedia.iso.boxes.Container container9 = metaBox5.getParent();
        java.util.List<com.coremedia.iso.boxes.Box> boxList10 = metaBox5.getBoxes();
        metaBox5.setFlags((int) (byte) 0);
        java.nio.channels.WritableByteChannel writableByteChannel13 = null;
        metaBox5.writeContainer(writableByteChannel13);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        com.coremedia.iso.boxes.MetaBox metaBox16 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox17 = new com.coremedia.iso.boxes.MetaBox();
        metaBox16.setParent((com.coremedia.iso.boxes.Container) metaBox17);
        com.coremedia.iso.boxes.Container container19 = null;
        metaBox17.setParent(container19);
        com.coremedia.iso.boxes.Container container21 = metaBox17.getParent();
        java.util.List<com.coremedia.iso.boxes.Box> boxList22 = metaBox17.getBoxes();
        metaBox17.setFlags((int) (byte) 0);
        java.nio.channels.WritableByteChannel writableByteChannel25 = null;
        metaBox17.writeContainer(writableByteChannel25);
        metaBox17.setFlags((int) (byte) 100);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox17);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertNull(container9);
        org.junit.Assert.assertNotNull(boxList10);
        org.junit.Assert.assertNull(container21);
        org.junit.Assert.assertNotNull(boxList22);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        java.util.List<com.coremedia.iso.boxes.Box> boxList6 = metaBox1.getBoxes();
        metaBox1.setFlags((int) (byte) 0);
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        com.coremedia.iso.boxes.Container container12 = null;
        metaBox10.setParent(container12);
        com.coremedia.iso.boxes.Container container14 = metaBox10.getParent();
        int int15 = metaBox10.getVersion();
        metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox10);
        long long17 = metaBox10.getOffset();
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNotNull(boxList6);
        org.junit.Assert.assertNull(container14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        long long4 = metaBox1.getSize();
        long long5 = metaBox1.getOffset();
        java.lang.String str6 = metaBox1.getType();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 12L + "'", long4 == 12L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "meta" + "'", str6, "meta");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        com.coremedia.iso.boxes.Container container6 = metaBox1.getParent();
        java.util.List<com.coremedia.iso.boxes.Box> boxList7 = metaBox1.getBoxes();
        com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        int int11 = metaBox8.getVersion();
        com.coremedia.iso.boxes.Container container12 = metaBox8.getParent();
        metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox8);
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNotNull(boxList7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(container12);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        int int3 = metaBox0.getVersion();
        long long4 = metaBox0.getOffset();
        metaBox0.setFlags(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        int int4 = metaBox1.getVersion();
        int int5 = metaBox1.getFlags();
        java.util.List<com.coremedia.iso.boxes.Box> boxList6 = metaBox1.getBoxes();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(boxList6);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        java.util.List<com.coremedia.iso.boxes.Box> boxList6 = metaBox1.getBoxes();
        metaBox1.setFlags((int) (byte) 0);
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        com.coremedia.iso.boxes.Container container12 = null;
        metaBox10.setParent(container12);
        com.coremedia.iso.boxes.Container container14 = metaBox10.getParent();
        int int15 = metaBox10.getVersion();
        metaBox1.addBox((com.coremedia.iso.boxes.Box) metaBox10);
        java.lang.Class<?> wildcardClass17 = metaBox10.getClass();
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNotNull(boxList6);
        org.junit.Assert.assertNull(container14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        java.util.List<com.coremedia.iso.boxes.Box> boxList6 = metaBox1.getBoxes();
        int int7 = metaBox1.getVersion();
        com.googlecode.mp4parser.DataSource dataSource8 = null;
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox10 = new com.coremedia.iso.boxes.MetaBox();
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox10);
        com.coremedia.iso.boxes.Container container12 = null;
        metaBox10.setParent(container12);
        boolean boolean14 = metaBox10.hasNext();
        java.nio.ByteBuffer byteBuffer17 = metaBox10.getByteBuffer((long) (byte) 1, (long) (short) 0);
        com.coremedia.iso.BoxParser boxParser19 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox1.parse(dataSource8, byteBuffer17, 0L, boxParser19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNotNull(boxList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        int int3 = metaBox0.getVersion();
        long long4 = metaBox0.getOffset();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        com.coremedia.iso.boxes.Container container8 = null;
        metaBox6.setParent(container8);
        com.coremedia.iso.boxes.Container container10 = metaBox6.getParent();
        com.coremedia.iso.boxes.Container container11 = metaBox6.getParent();
        java.lang.String str12 = metaBox6.toString();
        metaBox0.addBox((com.coremedia.iso.boxes.Box) metaBox6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(container10);
        org.junit.Assert.assertNull(container11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MetaBox[]" + "'", str12, "MetaBox[]");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        int int3 = metaBox0.getVersion();
        long long4 = metaBox0.getOffset();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox6 = new com.coremedia.iso.boxes.MetaBox();
        metaBox5.setParent((com.coremedia.iso.boxes.Container) metaBox6);
        com.coremedia.iso.boxes.Container container8 = null;
        metaBox6.setParent(container8);
        com.coremedia.iso.boxes.Container container10 = metaBox6.getParent();
        java.util.List<com.coremedia.iso.boxes.Box> boxList11 = metaBox6.getBoxes();
        metaBox0.setBoxes(boxList11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(container10);
        org.junit.Assert.assertNotNull(boxList11);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        java.lang.String str1 = metaBox0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MetaBox[]" + "'", str1, "MetaBox[]");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        long long3 = metaBox1.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox4 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox5 = new com.coremedia.iso.boxes.MetaBox();
        metaBox4.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        metaBox1.setParent((com.coremedia.iso.boxes.Container) metaBox5);
        com.coremedia.iso.boxes.MetaBox metaBox8 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox9 = new com.coremedia.iso.boxes.MetaBox();
        metaBox8.setParent((com.coremedia.iso.boxes.Container) metaBox9);
        long long11 = metaBox9.getSize();
        com.coremedia.iso.boxes.MetaBox metaBox12 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox13 = new com.coremedia.iso.boxes.MetaBox();
        metaBox12.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox9.setParent((com.coremedia.iso.boxes.Container) metaBox13);
        metaBox5.addBox((com.coremedia.iso.boxes.Box) metaBox13);
        metaBox13.setFlags(100);
        java.lang.String str19 = metaBox13.toString();
        com.googlecode.mp4parser.DataSource dataSource20 = null;
        com.coremedia.iso.boxes.MetaBox metaBox21 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox22 = new com.coremedia.iso.boxes.MetaBox();
        metaBox21.setParent((com.coremedia.iso.boxes.Container) metaBox22);
        com.coremedia.iso.boxes.Container container24 = null;
        metaBox22.setParent(container24);
        boolean boolean26 = metaBox22.hasNext();
        java.nio.ByteBuffer byteBuffer29 = metaBox22.getByteBuffer((long) (byte) 1, (long) (short) 0);
        com.coremedia.iso.BoxParser boxParser31 = null;
        // The following exception was thrown during execution in test generation
        try {
            metaBox13.parse(dataSource20, byteBuffer29, (long) (byte) 100, boxParser31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MetaBox[]" + "'", str19, "MetaBox[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.coremedia.iso.boxes.MetaBox metaBox0 = new com.coremedia.iso.boxes.MetaBox();
        com.coremedia.iso.boxes.MetaBox metaBox1 = new com.coremedia.iso.boxes.MetaBox();
        metaBox0.setParent((com.coremedia.iso.boxes.Container) metaBox1);
        com.coremedia.iso.boxes.Container container3 = null;
        metaBox1.setParent(container3);
        com.coremedia.iso.boxes.Container container5 = metaBox1.getParent();
        long long6 = metaBox1.getSize();
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 12L + "'", long6 == 12L);
    }
}

