package org.apache.shiro.web.config;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

public class IniFilterChainResolverFactoryTest
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
@groovy.transform.Generated() @groovy.transform.Internal() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object getProperty(java.lang.String property) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setProperty(java.lang.String property, java.lang.Object value) { }
protected  javax.servlet.FilterConfig createNiceMockFilterConfig() { return (javax.servlet.FilterConfig)null;}
@org.junit.Before() public  void setUp() { }
@org.junit.Test() public  void testNewInstance() { }
@org.junit.Test() public  void testGetInstanceNoIni() { }
@org.junit.Test() public  void testNewInstanceWithIni() { }
@org.junit.Test() public  void testGetFiltersWithNullOrEmptySection() { }
@org.junit.Test() public  void testCreateChainsWithNullUrlsSection() { }
@org.junit.Test() public  void testNewInstanceWithNonFilter() { }
@org.junit.Test() public  void testNewInstanceWithFilterConfig() { }
@org.junit.Test() public  void testGetFilters() { }
@org.junit.Test() public  void testGetFiltersWithoutSectionWithDefaults() { }
@org.junit.Test() public  void testGetFiltersWithSectionWithoutDefaults() { }
@org.junit.Test() public  void testGetFiltersWithSectionAndDefaults() { }
@org.junit.Test() public  void testConfigureInvalidRequestFilter() { }
}
