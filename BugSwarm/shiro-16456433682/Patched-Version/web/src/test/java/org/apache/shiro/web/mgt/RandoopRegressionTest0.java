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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[16, -49, -38, 115, -116, 103, -102, -47, 120, -74, -48, 38, 39, -70, -90, -41]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-85, -35, 105, 17, -97, -55, -33, 95, -49, 12, 59, -89, 92, 107, -90, 51]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[91, -95, 63, 100, -18, 112, 29, 22, -82, 113, -92, -75, 114, -86, -89, -99]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-84, 118, 40, -39, -16, -75, -87, 104, -100, 74, 45, 108, -108, 27, 2, 106]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-84, 118, 40, -39, -16, -75, -87, 104, -100, 74, 45, 108, -108, 27, 2, 106]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-53, 127, -82, -123, -65, 99, 73, -80, -23, -94, 115, 21, -76, 52, -52, -66]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-99, -25, 31, 60, -54, 27, -95, -121, 0, 112, 41, 50, 51, -16, -118, 4]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[120, -47, 40, 37, -57, 66, 96, -109, -114, -40, -124, -46, -125, -33, 118, 110]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-8, 106, 7, 68, -9, 48, -78, -105, 10, 51, -115, 33, 39, -104, -61, -84]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-3, 7, 86, 80, 104, -23, -16, -58, 16, -29, -16, -83, -42, -8, -73, 114]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-126, 111, -64, -13, -47, -29, -66, 94, -61, -65, -13, -39, -4, -60, -1, 73]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[83, 23, -75, -119, 29, -88, 98, 88, 53, -127, -26, -101, -21, 113, -10, 11]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-58, -43, -20, 88, 112, -9, -99, -94, -124, 91, -5, 55, 92, -100, -80, -13]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[68, 71, -54, 21, -110, 72, 15, 2, 42, 62, -118, -44, -73, 54, 107, -123]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-126, 38, 90, 27, 115, -47, 21, -25, 98, -87, 13, 32, -66, 93, 88, -11]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[99, 79, -8, 23, 43, -55, 5, 58, -20, -48, 33, -17, -123, 35, -35, -94]");
        org.junit.Assert.assertNotNull(cookie3);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[75, 27, 98, -29, 26, -14, -96, -16, 67, -6, -45, -55, 43, 43, -64, 86]");
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-25, 116, -17, -90, -79, -40, -78, -95, 25, -127, 33, -83, -87, 65, 120, -50]");
        org.junit.Assert.assertNotNull(cipherService12);
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-116, -64, 23, -44, -103, 57, 13, -2, -126, -27, 101, -43, 35, 99, 7, -88]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -125, 16, -68, 110, 87, 125, -85, -13, -96, 82, -112, 58, -6, 66, -116]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-110, -58, 105, 59, 116, 38, -76, 108, -99, 16, -73, 99, 45, 6, 67, -99]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-110, -58, 105, 59, 116, 38, -76, 108, -99, 16, -73, 99, 45, 6, 67, -99]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-46, -117, 45, -7, 124, -55, 17, -49, 113, -3, 12, -61, -68, -62, 126, -25]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[14, 32, -60, 105, 110, -95, 7, 83, 15, -88, -110, 98, -78, -86, -80, -48]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-11, -95, 117, -60, -27, 117, -53, -69, 104, 126, -13, -38, -120, 8, -119, 59]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[86, 49, 43, -43, 43, 86, -97, -107, -81, 3, 83, -1, -10, -102, -97, 96]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-83, 74, -93, 22, -85, 118, -12, -45, 25, -38, -124, -59, -96, -118, 42, 17]");
        org.junit.Assert.assertNotNull(byteArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[67, -122, 126, 85, 75, 20, 123, -89, -9, 69, 93, 104, -107, 77, 95, -100]");
        org.junit.Assert.assertNotNull(byteArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-111, 20, -68, -84, 64, 125, -104, -118, -49, 39, -110, -72, 62, -72, 80, 118]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-7, 10, -44, -116, 8, -1, -86, -7, 66, 105, -26, 30, -84, -96, -54, 20]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[92, -124, 50, 34, -79, 19, 77, 42, 94, -4, 81, -58, -56, -59, 105, 23]");
        org.junit.Assert.assertNotNull(cipherService7);
        org.junit.Assert.assertNotNull(byteArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[60, -2, -73, -72, -1, -3, -25, 93, 26, 10, 9, -9, -59, 111, 87, 44]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-3, 99, 88, -116, 96, 103, 57, 101, 123, -95, 35, 25, -36, -87, 2, 56]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-3, 99, 88, -116, 96, 103, 57, 101, 123, -95, 35, 25, -36, -87, 2, 56]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[116, -54, -1, -72, 75, -90, 35, 104, 77, -71, -44, 61, 126, -34, -37, 97]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[116, -54, -1, -72, 75, -90, 35, 104, 77, -71, -44, 61, 126, -34, -37, 97]");
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[112, -83, -7, -25, 15, 64, -128, -39, -42, -62, -1, 113, 25, -61, -23, -1]");
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-3, -118, 118, -44, 1, -46, 20, -92, -3, -65, -73, 45, 124, -84, -39, -114]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-4, -26, 118, -79, 93, -116, -8, 94, -27, 118, 4, 36, -3, -60, 109, 68]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[81, -15, 51, -64, 93, 42, -52, 122, 16, 47, -57, -112, 104, 81, 107, -77]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-120, -122, -88, 58, 54, 89, 122, 107, 1, 121, -55, -14, 49, 64, 90, -86]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-62, -6, -13, 35, -84, 41, 65, -94, -35, -127, 107, 72, 71, 99, 93, -41]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-62, -6, -13, 35, -84, 41, 65, -94, -35, -127, 107, 72, 71, 99, 93, -41]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-20, -73, 67, 88, 121, 14, 23, 50, 16, 59, -23, 62, -13, 116, 20, -24]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-16, -26, 79, 53, -4, -31, -52, -76, -19, 36, 125, 53, 45, -74, 74, -77]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-4, -70, -71, -113, -117, -88, -75, -104, -98, -24, 8, -65, 76, 34, 125, -110]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[86, -100, 97, 16, 102, 82, 111, 17, -43, -25, 123, -85, 19, -24, 65, -93]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-10, -125, 121, 40, 84, 28, 45, 115, -9, -77, -4, 51, 104, -39, 60, -32]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-10, -125, 121, 40, 84, 28, 45, 115, -9, -77, -4, 51, 104, -39, 60, -32]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-49, 66, 38, 25, -91, 92, -28, 5, 1, 55, -70, -121, 123, -7, 42, -45]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-49, 66, 38, 25, -91, 92, -28, 5, 1, 55, -70, -121, 123, -7, 42, -45]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-26, 109, 25, 75, -74, -86, -4, -60, 76, 50, 112, -112, 120, 42, 72, 66]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[20, -30, -84, -41, 33, 28, -42, 96, 105, 107, 77, 83, -93, -93, 121, -98]");
        org.junit.Assert.assertNotNull(cipherService7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, -30, 33, -78, -80, -80, 21, 112, 51, 120, 14, 6, -43, -97, -85, -46]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[30, 26, 68, -73, -90, -87, 119, -24, 15, 73, 56, -40, 42, -96, -108, 4]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[30, 26, 68, -73, -90, -87, 119, -24, 15, 73, 56, -40, 42, -96, -108, 4]");
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[30, 26, 68, -73, -90, -87, 119, -24, 15, 73, 56, -40, 42, -96, -108, 4]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-112, -75, -24, -35, 109, 119, 105, -32, -72, 103, 39, -121, -95, 23, 120, -91]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-112, -75, -24, -35, 109, 119, 105, -32, -72, 103, 39, -121, -95, 23, 120, -91]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-110, 64, -38, 64, -30, 115, -104, -26, 81, -43, -66, 121, 13, -57, -97, -101]");
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-60, -96, 26, -60, -78, -16, 38, -36, 114, 26, 98, -82, 56, 23, -39, 127]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -6, -126, 58, 123, 51, -2, -44, 36, -50, 8, -54, -105, 18, -33, 108]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -6, -126, 58, 123, 51, -2, -44, 36, -50, 8, -54, -105, 18, -33, 108]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-6, -81, 97, 87, -23, 92, 32, -45, -56, -99, -119, -83, -75, -21, 10, 115]");
        org.junit.Assert.assertNotNull(cookie3);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-94, 9, 90, 75, 50, -58, 26, 26, -86, -75, 59, -54, -67, -60, -108, -53]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[92, -103, 117, 7, -88, -22, -3, -118, -5, -66, -96, -83, -43, 21, -38, 40]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[92, -103, 117, 7, -88, -22, -3, -118, -5, -66, -96, -83, -43, 21, -38, 40]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[73, 18, 104, 56, 104, 92, -67, -22, -82, 116, -89, -1, 100, 118, -121, 24]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer7);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[73, 18, 104, 56, 104, 92, -67, -22, -82, 116, -89, -1, 100, 118, -121, 24]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[73, 17, -68, 64, 67, 107, -79, -80, 36, 18, 51, 60, 16, 98, -76, -80]");
        org.junit.Assert.assertNotNull(byteArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[73, 17, -68, 64, 67, 107, -79, -80, 36, 18, 51, 60, 16, 98, -76, -80]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-15, -102, -57, 6, 112, -47, 34, -69, -3, -52, 120, 104, -57, -34, -8, 37]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-15, -102, -57, 6, 112, -47, 34, -69, -3, -52, 120, 104, -57, -34, -8, 37]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-61, -56, 44, 126, -49, 123, -58, -113, 22, 95, -123, 88, 33, -28, 38, 122]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-61, -56, 44, 126, -49, 123, -58, -113, 22, 95, -123, 88, 33, -28, 38, 122]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[41, 14, -42, -29, -51, -105, -125, 9, -83, 38, 22, 73, 29, -121, 82, 112]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-101, 9, -108, -77, -126, -16, -70, 83, -80, 92, -128, -61, -77, 127, -114, -20]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-101, 9, -108, -77, -126, -16, -70, 83, -80, 92, -128, -61, -77, 127, -114, -20]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[65, 127, 34, 83, 17, 22, 87, 92, 47, 117, -103, 83, -122, 6, 28, 11]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[65, 127, 34, 83, 17, 22, 87, 92, 47, 117, -103, 83, -122, 6, 28, 11]");
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[65, 127, 34, 83, 17, 22, 87, 92, 47, 117, -103, 83, -122, 6, 28, 11]");
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[111, 103, -95, -93, -37, -80, -78, -109, -128, -66, -6, -62, -50, 105, 9, -35]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[111, 103, -95, -93, -37, -80, -78, -109, -128, -66, -6, -62, -50, 105, 9, -35]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[77, -87, 7, 25, -17, 40, 78, 77, 21, 17, 115, -38, 1, -120, -4, -95]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-74, -84, -16, 24, 81, -89, -95, -111, 7, 110, -27, 119, -112, 125, -40, -29]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-74, -84, -16, 24, 81, -89, -95, -111, 7, 110, -27, 119, -112, 125, -40, -29]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[126, 30, 73, -31, 40, 82, -127, -87, 36, 84, 103, -8, -110, -31, 25, -116]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer7);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[126, 30, 73, -31, 40, 82, -127, -87, 36, 84, 103, -8, -110, -31, 25, -116]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[47, 126, -86, 43, -112, 101, -77, -69, -114, 104, -26, 97, -93, -92, 96, -44]");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-32, 108, 16, 102, -9, 18, -95, -61, 31, -98, 100, 31, 50, 96, 22, -56]");
    }
}
