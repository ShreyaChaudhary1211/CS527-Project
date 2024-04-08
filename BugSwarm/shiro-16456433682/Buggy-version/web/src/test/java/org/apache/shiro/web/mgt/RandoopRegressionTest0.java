import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str0 = org.apache.shiro.web.mgt.CookieRememberMeManager.DEFAULT_REMEMBER_ME_COOKIE_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "rememberMe" + "'", str0, "rememberMe");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        org.apache.shiro.web.servlet.Cookie cookie4 = cookieRememberMeManager0.getCookie();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 57, -21, -19, 71, -12, -117, -52, -81, -19, -128, 13, 60, 81, -21, 11]");
        org.junit.Assert.assertNull(cookie4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray7 = new byte[] { (byte) -1 };
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray7);
        org.apache.shiro.subject.SubjectContext subjectContext9 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection10 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext9);
        org.apache.shiro.subject.SubjectContext subjectContext11 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext11);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-125, 12, -30, -34, -69, -4, -34, -39, 4, -8, -119, -71, -94, -82, 88, -78]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertNull(principalCollection10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        byte[] byteArray5 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -99, 113, -2, -122, 111, 114, 88, -26, 66, -31, -61, 65, -9, -53, 16]");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray6 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.subject.SubjectContext subjectContext7 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection8 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext7);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-98, -125, -43, -36, -125, -128, -2, 100, -18, -120, -58, 26, -14, -62, 44, -61]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-98, -125, -43, -36, -125, -128, -2, 100, -18, -120, -58, 26, -14, -62, 44, -61]");
        org.junit.Assert.assertNull(principalCollection8);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.subject.SubjectContext subjectContext7 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection8 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext7);
        org.apache.shiro.subject.Subject subject9 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken10 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cookieRememberMeManager0.rememberIdentity(subject9, authenticationToken10, authenticationInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(principalCollection8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.web.servlet.Cookie cookie7 = cookieRememberMeManager0.getCookie();
        org.junit.Assert.assertNull(cookie7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.subject.Subject subject7 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken8 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cookieRememberMeManager0.rememberIdentity(subject7, authenticationToken8, authenticationInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[65, -81, -53, -42, 53, 25, -117, 9, 19, -62, -122, -76, 120, 42, 86, -25]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-125, -74, -82, -86, -69, 63, -113, -96, 17, 74, 115, -88, -119, 108, 42, 70]");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer1 = cookieRememberMeManager0.getSerializer();
        org.apache.shiro.subject.SubjectContext subjectContext2 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext2);
        org.junit.Assert.assertNotNull(principalCollectionSerializer1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.subject.SubjectContext subjectContext1 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection2 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext1);
        java.lang.Class<?> wildcardClass3 = cookieRememberMeManager0.getClass();
        org.junit.Assert.assertNull(principalCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        org.apache.shiro.web.servlet.Cookie cookie4 = null;
        cookieRememberMeManager0.setCookie(cookie4);
        org.apache.shiro.subject.Subject subject6 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
        org.apache.shiro.authc.AuthenticationException authenticationException8 = null;
        cookieRememberMeManager0.onFailedLogin(subject6, authenticationToken7, authenticationException8);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[101, -112, -99, 44, 40, 58, -52, 88, 43, -48, -100, 65, -113, 38, -73, 82]");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer5 = cookieRememberMeManager3.getSerializer();
        cookieRememberMeManager0.setSerializer(principalCollectionSerializer5);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-14, -92, -96, -113, 44, -55, 53, -61, 34, 15, 0, 55, 127, -80, 102, 18]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[117, 40, 71, 7, 41, 67, -118, 94, -95, -69, 114, 95, -78, -83, 65, 33]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        org.apache.shiro.subject.Subject subject3 = null;
        cookieRememberMeManager0.onLogout(subject3);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer7 = cookieRememberMeManager5.getSerializer();
        cookieRememberMeManager0.setSerializer(principalCollectionSerializer7);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[3, 41, 52, 20, -112, -87, 87, 107, 84, 28, 91, -77, -36, 44, 101, -122]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-31, 85, 85, 109, -109, -122, 70, -84, -74, -35, 120, -91, 12, 124, 64, 112]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.crypto.CipherService cipherService7 = cookieRememberMeManager0.getCipherService();
        org.apache.shiro.subject.Subject subject8 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken9 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cookieRememberMeManager0.rememberIdentity(subject8, authenticationToken9, authenticationInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[108, -67, 108, 84, 107, -98, -120, -74, 93, 23, 31, 50, 70, 27, 38, -95]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[122, -38, 5, -87, -91, 119, -127, -10, -119, 44, -90, -40, -82, 125, 13, -53]");
        org.junit.Assert.assertNotNull(cipherService7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.subject.SubjectContext subjectContext1 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection2 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie5 = cookieRememberMeManager3.getCookie();
        cookieRememberMeManager0.setCookie(cookie5);
        org.junit.Assert.assertNull(principalCollection2);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-13, 60, 93, -82, 76, 74, 32, -100, -65, -18, -57, -75, -59, 38, 68, -80]");
        org.junit.Assert.assertNotNull(cookie5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager1 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray2 = cookieRememberMeManager1.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie3 = cookieRememberMeManager1.getCookie();
        cookieRememberMeManager0.setCookie(cookie3);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager7 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray8 = cookieRememberMeManager7.getDecryptionCipherKey();
        cookieRememberMeManager5.setDecryptionCipherKey(byteArray8);
        org.apache.shiro.subject.Subject subject10 = null;
        cookieRememberMeManager5.onLogout(subject10);
        org.apache.shiro.crypto.CipherService cipherService12 = cookieRememberMeManager5.getCipherService();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager13 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager14 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray15 = cookieRememberMeManager14.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie16 = cookieRememberMeManager14.getCookie();
        cookieRememberMeManager13.setCookie(cookie16);
        cookieRememberMeManager5.setCookie(cookie16);
        cookieRememberMeManager0.setCookie(cookie16);
        org.junit.Assert.assertNotNull(byteArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-8, 114, -84, -3, 124, 40, -28, 121, 76, 125, -109, 106, 9, 4, -41, -7]");
        org.junit.Assert.assertNotNull(cookie3);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[20, 42, -21, 80, -77, 15, 2, -92, 125, 46, -40, 56, 124, 64, 116, -77]");
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-62, -6, 18, -101, 15, 107, 104, -123, 64, 71, 114, 19, -112, -45, -28, -114]");
        org.junit.Assert.assertNotNull(cipherService12);
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-87, 119, 46, 12, -28, 61, 85, -109, -64, 56, -57, -67, 36, 94, -56, 107]");
        org.junit.Assert.assertNotNull(cookie16);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie7 = null;
        cookieRememberMeManager5.setCookie(cookie7);
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer9 = cookieRememberMeManager5.getSerializer();
        cookieRememberMeManager0.setSerializer(principalCollectionSerializer9);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-57, -56, 22, 22, -89, 114, 89, -81, -19, 5, -21, -79, 126, 19, 108, 17]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        byte[] byteArray3 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager4 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie6 = null;
        cookieRememberMeManager5.setCookie(cookie6);
        org.apache.shiro.subject.SubjectContext subjectContext8 = null;
        cookieRememberMeManager5.forgetIdentity(subjectContext8);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager5.setEncryptionCipherKey(byteArray16);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager18 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray19 = cookieRememberMeManager18.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie20 = cookieRememberMeManager18.getCookie();
        cookieRememberMeManager5.setCookie(cookie20);
        cookieRememberMeManager4.setCookie(cookie20);
        cookieRememberMeManager0.setCookie(cookie20);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-25, 57, 67, -62, -80, 33, -50, 58, -48, -113, -103, -29, -120, -20, 120, 58]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-25, 57, 67, -62, -80, 33, -50, 58, -48, -113, -103, -29, -120, -20, 120, 58]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[55, -119, 78, -6, -4, 15, -107, -34, 52, -80, 105, 44, 30, -121, -11, 32]");
        org.junit.Assert.assertNotNull(cookie20);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        byte[] byteArray7 = null;
        cookieRememberMeManager0.setCipherKey(byteArray7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.crypto.CipherService cipherService7 = cookieRememberMeManager0.getCipherService();
        org.apache.shiro.subject.Subject subject8 = null;
        cookieRememberMeManager0.onLogout(subject8);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-25, -69, 47, 111, -120, -5, 72, 118, 6, 116, -52, 47, -22, 3, -124, 110]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-4, 69, -43, -37, -66, 112, -39, -24, 75, 7, -2, -42, 96, -18, -42, -44]");
        org.junit.Assert.assertNotNull(cipherService7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager7 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray8 = cookieRememberMeManager7.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray10 = cookieRememberMeManager9.getDecryptionCipherKey();
        cookieRememberMeManager7.setDecryptionCipherKey(byteArray10);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray10);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager13 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray14 = cookieRememberMeManager13.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager15 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray16 = cookieRememberMeManager15.getDecryptionCipherKey();
        cookieRememberMeManager13.setDecryptionCipherKey(byteArray16);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray16);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[18, -12, -119, 60, -125, 116, -91, 33, -3, 36, -57, -30, 22, -106, -11, 36]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[104, 112, -32, -82, 51, 0, -10, 3, -18, 51, -120, -103, 90, 35, 2, -59]");
        org.junit.Assert.assertNotNull(byteArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[47, -85, 110, -89, 117, -38, -97, -17, -59, 92, -124, 27, -56, 60, 55, 90]");
        org.junit.Assert.assertNotNull(byteArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[58, 57, -120, 93, -41, -60, -110, -106, 96, -98, -30, 23, 24, -84, -1, 102]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cookieRememberMeManager0.rememberIdentity(subject5, authenticationToken6, authenticationInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.crypto.CipherService cipherService7 = cookieRememberMeManager0.getCipherService();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager8 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray9 = cookieRememberMeManager8.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie10 = cookieRememberMeManager8.getCookie();
        cookieRememberMeManager0.setCookie(cookie10);
        org.apache.shiro.subject.Subject subject12 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken13 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo14 = null;
        cookieRememberMeManager0.onSuccessfulLogin(subject12, authenticationToken13, authenticationInfo14);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[60, -46, 58, -82, -116, -73, -76, -102, -24, 127, -75, 33, -61, -121, -22, 87]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-55, 2, 33, -38, -40, 75, 115, -100, 6, 124, 120, -93, -104, 22, 101, -57]");
        org.junit.Assert.assertNotNull(cipherService7);
        org.junit.Assert.assertNotNull(byteArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[44, 87, 9, 97, -8, 69, 27, 59, 79, 88, -84, 19, 60, -90, 90, 105]");
        org.junit.Assert.assertNotNull(cookie10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray6 = cookieRememberMeManager0.getDecryptionCipherKey();
        java.lang.Class<?> wildcardClass7 = cookieRememberMeManager0.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[33, 22, 28, -64, 19, 40, 13, 4, -40, -90, -31, -65, -54, 107, -31, 89]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[33, 22, 28, -64, 19, 40, 13, 4, -40, -90, -31, -65, -54, 107, -31, 89]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer2 = cookieRememberMeManager0.getSerializer();
        byte[] byteArray3 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager4 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray5 = cookieRememberMeManager4.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager6 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray7 = cookieRememberMeManager6.getDecryptionCipherKey();
        cookieRememberMeManager4.setDecryptionCipherKey(byteArray7);
        cookieRememberMeManager0.setCipherKey(byteArray7);
        org.apache.shiro.subject.SubjectContext subjectContext10 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext10);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[91, -37, 78, 107, -49, -117, 121, -76, -51, -73, -11, 57, -115, -16, 42, 41]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[91, -37, 78, 107, -49, -117, 121, -76, -51, -73, -11, 57, -115, -16, 42, 41]");
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[84, 111, -104, 11, -43, 42, -45, 88, -65, 37, 83, 94, -77, 58, -52, -42]");
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[11, 59, 69, 81, 41, -13, 18, -41, 39, 60, 68, -21, 104, 89, -110, 34]");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        org.apache.shiro.subject.Subject subject3 = null;
        cookieRememberMeManager0.onLogout(subject3);
        java.lang.Class<?> wildcardClass5 = cookieRememberMeManager0.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[85, -14, -18, -52, 112, 87, -16, 126, 125, 47, -4, 99, 15, 81, 34, 63]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager7 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray8 = cookieRememberMeManager7.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray10 = cookieRememberMeManager9.getDecryptionCipherKey();
        cookieRememberMeManager7.setDecryptionCipherKey(byteArray10);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray10);
        org.apache.shiro.subject.SubjectContext subjectContext13 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection14 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext13);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-54, -84, 43, 103, 39, 7, 44, 78, -51, -120, -27, 91, -38, -91, 110, -43]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[31, -33, -97, -93, -112, 44, 13, 24, -46, -53, 88, -119, -29, -15, -37, -119]");
        org.junit.Assert.assertNull(principalCollection14);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        byte[] byteArray4 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.subject.Subject subject5 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
        org.apache.shiro.authc.AuthenticationException authenticationException7 = null;
        cookieRememberMeManager0.onFailedLogin(subject5, authenticationToken6, authenticationException7);
        byte[] byteArray9 = new byte[] {};
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray9);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-20, -65, -3, 88, -70, 66, 85, 102, 21, 40, -100, -62, 42, 95, -72, -9]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-20, -65, -3, 88, -70, 66, 85, 102, 21, 40, -100, -62, 42, 95, -72, -9]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-67, -1, 120, 5, 77, -59, 27, 35, -95, -16, -99, 107, 97, 29, 30, 4]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager1 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager1.setCookie(cookie2);
        org.apache.shiro.subject.SubjectContext subjectContext4 = null;
        cookieRememberMeManager1.forgetIdentity(subjectContext4);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager1.setEncryptionCipherKey(byteArray12);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager14 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray15 = cookieRememberMeManager14.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie16 = cookieRememberMeManager14.getCookie();
        cookieRememberMeManager1.setCookie(cookie16);
        cookieRememberMeManager0.setCookie(cookie16);
        org.apache.shiro.subject.SubjectContext subjectContext19 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection20 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext19);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[74, 82, 109, -41, -23, -92, -56, -82, 101, 16, 8, 39, -27, 66, -57, 99]");
        org.junit.Assert.assertNotNull(cookie16);
        org.junit.Assert.assertNull(principalCollection20);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        org.apache.shiro.subject.SubjectContext subjectContext4 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext4);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-68, -11, 97, 8, 119, -112, -124, -44, 79, 19, -68, 40, -76, 50, 45, 7]");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer2 = cookieRememberMeManager0.getSerializer();
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection4 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext3);
        org.apache.shiro.subject.SubjectContext subjectContext5 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection6 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext5);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[107, 3, -86, 57, -95, -82, 19, 83, 89, 40, -40, -109, 4, 57, 103, 16]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer2);
        org.junit.Assert.assertNull(principalCollection4);
        org.junit.Assert.assertNull(principalCollection6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        byte[] byteArray3 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.subject.Subject subject4 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken5 = null;
        org.apache.shiro.authc.AuthenticationException authenticationException6 = null;
        cookieRememberMeManager0.onFailedLogin(subject4, authenticationToken5, authenticationException6);
        org.apache.shiro.subject.Subject subject8 = null;
        cookieRememberMeManager0.onLogout(subject8);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-8, 85, 43, -120, -65, 16, -25, -73, 82, -5, 112, -42, 51, -125, 24, 14]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-8, 85, 43, -120, -65, 16, -25, -73, 82, -5, 112, -42, 51, -125, 24, 14]");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        byte[] byteArray3 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.subject.SubjectContext subjectContext4 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext4);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[67, 95, 48, -24, -67, 85, -57, -90, -128, 96, -53, -124, 53, -1, 44, -117]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 95, 48, -24, -67, 85, -57, -90, -128, 96, -53, -124, 53, -1, 44, -117]");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.crypto.CipherService cipherService7 = cookieRememberMeManager0.getCipherService();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager8 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray10 = cookieRememberMeManager9.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie11 = cookieRememberMeManager9.getCookie();
        cookieRememberMeManager8.setCookie(cookie11);
        cookieRememberMeManager0.setCookie(cookie11);
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer14 = cookieRememberMeManager0.getSerializer();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-89, -17, 114, 47, 124, -105, 58, -120, 122, 88, 79, -120, -105, 36, -100, 80]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-42, -56, 54, 88, -33, 8, -91, -122, -98, 80, 125, -83, 60, 69, -26, 30]");
        org.junit.Assert.assertNotNull(cipherService7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[123, 68, 20, -69, -46, -4, 7, -57, -114, 102, 47, -121, 24, 99, 104, -105]");
        org.junit.Assert.assertNotNull(cookie11);
        org.junit.Assert.assertNotNull(principalCollectionSerializer14);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        byte[] byteArray4 = cookieRememberMeManager0.getCipherKey();
        byte[] byteArray5 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-93, 69, -10, -118, 46, 44, -116, 106, -28, -55, 16, -19, 117, -104, 79, 36]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-93, 69, -10, -118, 46, 44, -116, 106, -28, -55, 16, -19, 117, -104, 79, 36]");
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-93, 69, -10, -118, 46, 44, -116, 106, -28, -55, 16, -19, 117, -104, 79, 36]");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        byte[] byteArray4 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.subject.Subject subject5 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
        org.apache.shiro.authc.AuthenticationException authenticationException7 = null;
        cookieRememberMeManager0.onFailedLogin(subject5, authenticationToken6, authenticationException7);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray10 = cookieRememberMeManager9.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager11 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray12 = cookieRememberMeManager11.getDecryptionCipherKey();
        cookieRememberMeManager9.setDecryptionCipherKey(byteArray12);
        org.apache.shiro.subject.Subject subject14 = null;
        cookieRememberMeManager9.onLogout(subject14);
        org.apache.shiro.crypto.CipherService cipherService16 = cookieRememberMeManager9.getCipherService();
        cookieRememberMeManager0.setCipherService(cipherService16);
        org.apache.shiro.subject.SubjectContext subjectContext18 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext18);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[6, 123, 5, 86, 115, -41, -109, 11, -90, 58, -67, -76, 12, 37, 44, 29]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[6, 123, 5, 86, 115, -41, -109, 11, -90, 58, -67, -76, 12, 37, 44, 29]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-94, 36, 3, -23, 113, 38, -93, 121, 95, -9, -3, -65, 57, 105, -28, -19]");
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[93, 35, 118, 40, 4, 4, -59, 33, -62, 106, -123, -53, -127, -90, -65, 40]");
        org.junit.Assert.assertNotNull(cipherService16);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray6 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie7 = cookieRememberMeManager0.getCookie();
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[53, 53, 34, -94, 22, 76, 127, 56, -15, -68, 31, -113, 52, 26, 7, 72]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[53, 53, 34, -94, 22, 76, 127, 56, -15, -68, 31, -113, 52, 26, 7, 72]");
        org.junit.Assert.assertNull(cookie7);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager1 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray2 = cookieRememberMeManager1.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie3 = cookieRememberMeManager1.getCookie();
        cookieRememberMeManager0.setCookie(cookie3);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getDecryptionCipherKey();
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray6);
        org.junit.Assert.assertNotNull(byteArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[107, 114, 42, 78, 127, -31, 23, 103, -67, -9, -67, 48, 103, 35, -18, 95]");
        org.junit.Assert.assertNotNull(cookie3);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-109, 46, -76, -42, 63, 63, 1, -63, 100, -60, 13, 118, 105, -128, 82, 4]");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        byte[] byteArray4 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer7 = cookieRememberMeManager5.getSerializer();
        byte[] byteArray8 = cookieRememberMeManager5.getEncryptionCipherKey();
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray8);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager10 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie11 = null;
        cookieRememberMeManager10.setCookie(cookie11);
        org.apache.shiro.subject.SubjectContext subjectContext13 = null;
        cookieRememberMeManager10.forgetIdentity(subjectContext13);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager10.setEncryptionCipherKey(byteArray21);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray21);
        org.apache.shiro.subject.Subject subject24 = null;
        cookieRememberMeManager0.onLogout(subject24);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager26 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray27 = cookieRememberMeManager26.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie28 = null;
        cookieRememberMeManager26.setCookie(cookie28);
        byte[] byteArray30 = cookieRememberMeManager26.getEncryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray30);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[49, 2, 45, -97, 53, -2, -68, 33, -67, 123, 69, -38, 19, 22, -124, -92]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[49, 2, 45, -97, 53, -2, -68, 33, -67, 123, 69, -38, 19, 22, -124, -92]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-6, 34, -105, -100, -12, 8, -95, -85, 80, -72, -112, -26, 120, -105, -37, 17]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer7);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-6, 34, -105, -100, -12, 8, -95, -85, 80, -72, -112, -26, 120, -105, -37, 17]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-2, -27, 16, 82, -16, 70, 127, 5, 52, -102, -118, -107, 108, -115, -43, -6]");
        org.junit.Assert.assertNotNull(byteArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-2, -27, 16, 82, -16, 70, 127, 5, 52, -102, -118, -107, 108, -115, -43, -6]");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray6 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.subject.Subject subject7 = null;
        cookieRememberMeManager0.onLogout(subject7);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie10 = null;
        cookieRememberMeManager9.setCookie(cookie10);
        org.apache.shiro.subject.SubjectContext subjectContext12 = null;
        cookieRememberMeManager9.forgetIdentity(subjectContext12);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager9.setEncryptionCipherKey(byteArray20);
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray20);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-88, -54, 89, 8, 61, -11, 54, 12, 66, -68, 73, 78, -103, -38, 39, 73]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-88, -54, 89, 8, 61, -11, 54, 12, 66, -68, 73, 78, -103, -38, 39, 73]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 10, 1, 10, 0, 1]");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer2 = cookieRememberMeManager0.getSerializer();
        byte[] byteArray3 = cookieRememberMeManager0.getEncryptionCipherKey();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0 };
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray6);
        byte[] byteArray8 = cookieRememberMeManager0.getCipherKey();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1, 28, -63, -103, 81, 8, -61, -54, 56, -59, 76, 126, -117, -25, -20, -72]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 28, -63, -103, 81, 8, -61, -54, 56, -59, 76, 126, -117, -25, -20, -72]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0]");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer1 = cookieRememberMeManager0.getSerializer();
        byte[] byteArray2 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.junit.Assert.assertNotNull(principalCollectionSerializer1);
        org.junit.Assert.assertNotNull(byteArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[78, 29, 121, 114, -125, -65, -98, -18, 65, -31, -6, -34, -84, 23, 69, -74]");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.subject.SubjectContext subjectContext7 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection8 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext7);
        byte[] byteArray9 = cookieRememberMeManager0.getCipherKey();
        byte[] byteArray10 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.junit.Assert.assertNull(principalCollection8);
        org.junit.Assert.assertNotNull(byteArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-108, -116, 92, -24, 108, -72, -23, -78, -6, -27, 81, 78, -10, -33, -34, 3]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-108, -116, 92, -24, 108, -72, -23, -78, -6, -27, 81, 78, -10, -33, -34, 3]");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        byte[] byteArray4 = cookieRememberMeManager0.getCipherKey();
        byte[] byteArray5 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager6 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray7 = cookieRememberMeManager6.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie8 = null;
        cookieRememberMeManager6.setCookie(cookie8);
        byte[] byteArray10 = cookieRememberMeManager6.getEncryptionCipherKey();
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray10);
        org.apache.shiro.crypto.CipherService cipherService12 = cookieRememberMeManager0.getCipherService();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-32, -17, 116, -65, 102, 7, -34, -123, -79, 13, 97, 23, -94, -19, -51, 18]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-32, -17, 116, -65, 102, 7, -34, -123, -79, 13, 97, 23, -94, -19, -51, 18]");
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-32, -17, 116, -65, 102, 7, -34, -123, -79, 13, 97, 23, -94, -19, -51, 18]");
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-3, -62, -127, -14, -83, -30, 29, -35, -43, -101, -127, 57, -49, 4, 5, -19]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-3, -62, -127, -14, -83, -30, 29, -35, -43, -101, -127, 57, -49, 4, 5, -19]");
        org.junit.Assert.assertNotNull(cipherService12);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.subject.SubjectContext subjectContext7 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection8 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext7);
        org.apache.shiro.subject.Subject subject9 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken10 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo11 = null;
        cookieRememberMeManager0.onSuccessfulLogin(subject9, authenticationToken10, authenticationInfo11);
        byte[] byteArray13 = cookieRememberMeManager0.getCipherKey();
        org.junit.Assert.assertNull(principalCollection8);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[31, 47, -57, 108, 122, 101, 41, 49, -22, 17, -106, -69, 84, -93, 58, -38]");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        byte[] byteArray4 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer7 = cookieRememberMeManager5.getSerializer();
        byte[] byteArray8 = cookieRememberMeManager5.getEncryptionCipherKey();
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray8);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager10 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie11 = null;
        cookieRememberMeManager10.setCookie(cookie11);
        org.apache.shiro.subject.SubjectContext subjectContext13 = null;
        cookieRememberMeManager10.forgetIdentity(subjectContext13);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager10.setEncryptionCipherKey(byteArray21);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray21);
        org.apache.shiro.subject.Subject subject24 = null;
        cookieRememberMeManager0.onLogout(subject24);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager26 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie27 = null;
        cookieRememberMeManager26.setCookie(cookie27);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager29 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray30 = cookieRememberMeManager29.getDecryptionCipherKey();
        cookieRememberMeManager26.setDecryptionCipherKey(byteArray30);
        cookieRememberMeManager0.setCipherKey(byteArray30);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[117, -29, -28, -6, 102, 60, 75, -3, -59, -13, -6, 3, 120, -18, -88, -107]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[117, -29, -28, -6, 102, 60, 75, -3, -59, -13, -6, 3, 120, -18, -88, -107]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[123, 65, -23, 97, 113, 100, -24, 74, 113, -111, -19, 32, 4, -43, 46, 123]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer7);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[123, 65, -23, 97, 113, 100, -24, 74, 113, -111, -19, 32, 4, -43, 46, 123]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-22, -88, -47, 12, -7, 71, 81, -76, -41, 44, -78, -101, -120, 46, -20, 1]");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        org.apache.shiro.web.servlet.Cookie cookie4 = null;
        cookieRememberMeManager0.setCookie(cookie4);
        org.apache.shiro.subject.Subject subject6 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo8 = null;
        cookieRememberMeManager0.onSuccessfulLogin(subject6, authenticationToken7, authenticationInfo8);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[37, -115, -110, 47, -126, -63, -61, -64, 70, 79, 85, -66, -112, -84, 14, 124]");
    }
}
