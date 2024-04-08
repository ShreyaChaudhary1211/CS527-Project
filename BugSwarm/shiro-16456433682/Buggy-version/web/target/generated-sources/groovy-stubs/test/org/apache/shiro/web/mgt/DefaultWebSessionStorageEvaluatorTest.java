package org.apache.shiro.web.mgt;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;
import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

public class DefaultWebSessionStorageEvaluatorTest
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
@groovy.transform.Generated() @groovy.transform.Internal() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object getProperty(java.lang.String property) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.junit.Test() public  void testWithSession() { }
@org.junit.Test() public  void testWithoutSessionAndNonWebSubject() { }
@org.junit.Test() public  void testWithoutSessionAndGenerallyDisabled() { }
@org.junit.Test() public  void testWebSubjectWithoutSessionAndGenerallyEnabled() { }
@org.junit.Test() public  void testWebSubjectWithoutSessionAndGenerallyEnabledButRequestDisabled() { }
@org.junit.Test() public  void testWebSubjectWithoutSessionAndGenerallyEnabledWithNonBooleanRequestAttribute() { }
private interface RequestPairWebSubject
  extends
    org.apache.shiro.web.util.RequestPairSource,    org.apache.shiro.web.subject.WebSubject {
}
}
