package org.apache.shiro.web.filter.mgt;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

public class DefaultFilterChainManagerTest
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
@groovy.transform.Generated() @groovy.transform.Internal() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object getProperty(java.lang.String property) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  org.apache.shiro.web.filter.mgt.DefaultFilterChainManager getManager() { return (org.apache.shiro.web.filter.mgt.DefaultFilterChainManager)null;}
public  void setManager(org.apache.shiro.web.filter.mgt.DefaultFilterChainManager value) { }
@org.junit.Before() public  void setUp() { }
@org.junit.Test() public  void testToNameConfigPairNoBrackets() { }
@org.junit.Test() public  void testToNameConfigPairWithEmptyBrackets() { }
@org.junit.Test() public  void testToNameConfigPairWithPopulatedBrackets() { }
@org.junit.Test() public  void testToNameConfigPairWithNestedQuotesInBrackets() { }
@org.junit.Test() public  void testToNameConfigPairWithIndividualNestedQuotesInBrackets() { }
@org.junit.Test() public  void testFilterChainConfigWithNestedCommas() { }
@org.junit.Test() public  void testFilterChainConfigWithNestedQuotedCommas() { }
@org.junit.Test() public  void testNewInstanceDefaultFilters() { }
protected  javax.servlet.FilterConfig createNiceMockFilterConfig() { return (javax.servlet.FilterConfig)null;}
@org.junit.Test() public  void testNewInstanceWithFilterConfig() { }
@org.junit.Test() public  void testCreateChain() { }
@org.junit.Test() public  void testWithGlobalFilters() { }
@org.junit.Test() public  void addDefaultChainWithSameName() { }
@org.junit.Test() public  void testCreateChainWithQuotedInstanceConfig() { }
@org.junit.Test() public  void testBeanMethods() { }
@org.junit.Test() public  void testAddFilter() { }
@org.junit.Test() public  void testAddFilterNoInit() { }
@org.junit.Test() public  void testAddFilterNoFilterConfig() { }
@org.junit.Test() public  void testAddToChain() { }
@org.junit.Test() public  void testAddToChainNotPathProcessor() { }
@org.junit.Test() public  void testProxy() { }
@org.junit.Test() public  void testProxyNoChain() { }
}
