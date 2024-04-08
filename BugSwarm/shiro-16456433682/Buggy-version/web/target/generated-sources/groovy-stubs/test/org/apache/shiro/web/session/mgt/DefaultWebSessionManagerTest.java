package org.apache.shiro.web.session.mgt;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.easymock.EasyMock.*;

public class DefaultWebSessionManagerTest
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
@groovy.transform.Generated() @groovy.transform.Internal() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object getProperty(java.lang.String property) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  org.apache.shiro.web.session.mgt.DefaultWebSessionManager getMgr() { return (org.apache.shiro.web.session.mgt.DefaultWebSessionManager)null;}
public  void setMgr(org.apache.shiro.web.session.mgt.DefaultWebSessionManager value) { }
@org.junit.Before() public  void setUp() { }
@org.junit.After() public  void clearThread() { }
@org.junit.Test() public  void testOnStart() { }
@org.junit.Test() public  void testOnStartWithSessionIdCookieDisabled() { }
@org.junit.Test() public  void testGetSessionIdWithSessionIdCookieEnabled() { }
@org.junit.Test() public  void testGetSessionIdWithSessionIdCookieDisabled() { }
@org.junit.Test() public  void testGetSessionIdWithSessionIdCookieDisabledAndLowercaseRequestParam() { }
@org.junit.Test() public  void testGetSessionIdFromRequestUriPathSegmentParam() { }
@org.junit.Test() public  void testSessionIDRequestPathParameterWithNonHttpRequest() { }
@org.junit.Test() public  void testSessionIDRequestPathParameterWithoutARequestURI() { }
@org.junit.Test() public  void testSessionIDRequestPathParameterWithoutPathParameters() { }
@org.junit.Test() public  void testSessionIDRequestPathParameterWithoutJSESSIONID() { }
@org.junit.Test() public  void testSessionIDRequestPathParameter() { }
}
