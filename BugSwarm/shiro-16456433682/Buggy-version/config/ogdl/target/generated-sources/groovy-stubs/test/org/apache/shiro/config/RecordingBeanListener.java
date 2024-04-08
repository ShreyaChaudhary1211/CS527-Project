package org.apache.shiro.config;

import org.apache.shiro.config.event.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class RecordingBeanListener
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
@groovy.transform.Generated() @groovy.transform.Internal() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object getProperty(java.lang.String property) { return (java.lang.Object)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setProperty(java.lang.String property, java.lang.Object value) { }
@java.lang.SuppressWarnings(value="UnusedDeclaration") @org.apache.shiro.event.Subscribe() public  void onUnhandledBeanEvent(org.apache.shiro.config.event.BeanEvent beanEvent) { }
@java.lang.SuppressWarnings(value="UnusedDeclaration") @org.apache.shiro.event.Subscribe() public  void onInstantiatedBeanEvent(org.apache.shiro.config.event.InstantiatedBeanEvent beanEvent) { }
@java.lang.SuppressWarnings(value="UnusedDeclaration") @org.apache.shiro.event.Subscribe() public  void onConfiguredBeanEvent(org.apache.shiro.config.event.ConfiguredBeanEvent beanEvent) { }
@java.lang.SuppressWarnings(value="UnusedDeclaration") @org.apache.shiro.event.Subscribe() public  void onInitializedBeanEvent(org.apache.shiro.config.event.InitializedBeanEvent beanEvent) { }
@java.lang.SuppressWarnings(value="UnusedDeclaration") @org.apache.shiro.event.Subscribe() public  void onDestroyedBeanEvent(org.apache.shiro.config.event.DestroyedBeanEvent beanEvent) { }
public  java.util.List<org.apache.shiro.config.event.InstantiatedBeanEvent> getInstantiatedEvents() { return (java.util.List<org.apache.shiro.config.event.InstantiatedBeanEvent>)null;}
public  java.util.List<org.apache.shiro.config.event.ConfiguredBeanEvent> getConfiguredEvents() { return (java.util.List<org.apache.shiro.config.event.ConfiguredBeanEvent>)null;}
public  java.util.List<org.apache.shiro.config.event.InitializedBeanEvent> getInitializedEvents() { return (java.util.List<org.apache.shiro.config.event.InitializedBeanEvent>)null;}
public  java.util.List<org.apache.shiro.config.event.DestroyedBeanEvent> getDestroyedEvents() { return (java.util.List<org.apache.shiro.config.event.DestroyedBeanEvent>)null;}
public  java.util.List<org.apache.shiro.config.event.BeanEvent> getUnhandledEvents() { return (java.util.List<org.apache.shiro.config.event.BeanEvent>)null;}
}
