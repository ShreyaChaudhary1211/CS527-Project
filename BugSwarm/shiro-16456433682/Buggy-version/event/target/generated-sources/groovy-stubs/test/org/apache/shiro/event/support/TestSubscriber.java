package org.apache.shiro.event.support;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class TestSubscriber
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
public TestSubscriber
() {}
@groovy.transform.Generated() @groovy.transform.Internal() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object getProperty(java.lang.String property) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  int getFooCount() { return (int)0;}
public  void setFooCount(int value) { }
public  int getBarCount() { return (int)0;}
public  void setBarCount(int value) { }
public  java.lang.Object getLastEvent() { return (java.lang.Object)null;}
public  void setLastEvent(java.lang.Object value) { }
@org.apache.shiro.event.Subscribe() public  void onFooEvent(org.apache.shiro.event.support.FooEvent event) { }
@org.apache.shiro.event.Subscribe() public  void onBarEvent(org.apache.shiro.event.support.BarEvent event) { }
public  int getCount() { return (int)0;}
}
