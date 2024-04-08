package org.apache.shiro.web.filter.authc;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.hamcrest.MatcherAssert.assertThat;

public class BearerHttpFilterAuthenticationTest
  extends org.apache.shiro.test.SecurityManagerTestSupport  implements
    groovy.lang.GroovyObject {
;
public static  javax.servlet.http.HttpServletRequest mockRequest(java.lang.String token, java.lang.String host) { return (javax.servlet.http.HttpServletRequest)null;}
public static  javax.servlet.http.HttpServletRequest mockRequest(java.lang.String token) { return (javax.servlet.http.HttpServletRequest)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object getProperty(java.lang.String property) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.junit.Test() public  void createTokenNoAuthorizationHeader()throws java.lang.Exception { }
@org.junit.Test() public  void createTokenNoValue()throws java.lang.Exception { }
@org.junit.Test() public  void createTokenWithValue()throws java.lang.Exception { }
@org.junit.Test() public  void createTokenJustSpaces()throws java.lang.Exception { }
@org.junit.Test() public  void httpMethodDoesNotRequireAuthentication()throws java.lang.Exception { }
@org.junit.Test() public  void httpMethodRequiresAuthentication()throws java.lang.Exception { }
@org.junit.Test() public  void permissiveEnabledWithLoginTest() { }
@org.junit.Test() public  void permissiveEnabledTest() { }
@org.junit.Test() public  void httpMethodRequiresAuthenticationWithPermissive()throws java.lang.Exception { }
public static  javax.servlet.http.HttpServletRequest mockRequest() { return (javax.servlet.http.HttpServletRequest)null;}
public static  javax.servlet.http.HttpServletRequest mockRequest(java.lang.String token, java.lang.String host, groovy.lang.Closure<javax.servlet.http.HttpServletRequest> additionalMockConfig) { return (javax.servlet.http.HttpServletRequest)null;}
public static  javax.servlet.http.HttpServletResponse mockResponse() { return (javax.servlet.http.HttpServletResponse)null;}
}
