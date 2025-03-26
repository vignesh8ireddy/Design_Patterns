package com.vignesh.cglibDynamic.test;

import com.vignesh.cglibDynamic.component.IBankService;
import com.vignesh.cglibDynamic.factory.BankServiceFactory;

public class DynamicProxyPatternTest {
    public static void main(String[] args) {
        System.out.println("Withdrawing during the Federal Reserve System Monitoring: ");
        IBankService bankService = BankServiceFactory.getInstance(true);
        try{
            bankService.withdraw(365111004, 4200.0f);
            bankService.withdraw(365111004, 5000.02f);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Not withdrawing during the Federal Reserve System Monitoring: ");
        IBankService bankService2 = BankServiceFactory.getInstance(false);
        bankService2.withdraw(365111004, 4200.0f);
        bankService2.withdraw(365111004, 5000.02f);
    }
}


/*
Output::

Withdrawing during the Federal Reserve System Monitoring:
Exception in thread "main" java.lang.ExceptionInInitializerError
	at com.vignesh.dynamic.factory.BankServiceFactory.getInstance(BankServiceFactory.java:11)
	at com.vignesh.dynamic.test.DynamicProxyPatternTest.main(DynamicProxyPatternTest.java:9)
Caused by: net.sf.cglib.core.CodeGenerationException: java.lang.reflect.InaccessibleObjectException-->Unable to make protected final java.lang.Class java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain) throws java.lang.ClassFormatError accessible: module java.base does not "opens java.lang" to unnamed module @22927a81
	at net.sf.cglib.core.ReflectUtils.defineClass(ReflectUtils.java:464)
	at net.sf.cglib.core.AbstractClassGenerator.generate(AbstractClassGenerator.java:339)
	at net.sf.cglib.core.AbstractClassGenerator$ClassLoaderData$3.apply(AbstractClassGenerator.java:96)
	at net.sf.cglib.core.AbstractClassGenerator$ClassLoaderData$3.apply(AbstractClassGenerator.java:94)
	at net.sf.cglib.core.internal.LoadingCache$2.call(LoadingCache.java:54)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at net.sf.cglib.core.internal.LoadingCache.createEntry(LoadingCache.java:61)
	at net.sf.cglib.core.internal.LoadingCache.get(LoadingCache.java:34)
	at net.sf.cglib.core.AbstractClassGenerator$ClassLoaderData.get(AbstractClassGenerator.java:119)
	at net.sf.cglib.core.AbstractClassGenerator.create(AbstractClassGenerator.java:294)
	at net.sf.cglib.core.KeyFactory$Generator.create(KeyFactory.java:221)
	at net.sf.cglib.core.KeyFactory.create(KeyFactory.java:174)
	at net.sf.cglib.core.KeyFactory.create(KeyFactory.java:153)
	at net.sf.cglib.proxy.Enhancer.<clinit>(Enhancer.java:73)
	... 2 more
Caused by: java.lang.reflect.InaccessibleObjectException: Unable to make protected final java.lang.Class java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain) throws java.lang.ClassFormatError accessible: module java.base does not "opens java.lang" to unnamed module @22927a81
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:354)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:297)
	at java.base/java.lang.reflect.Method.checkCanSetAccessible(Method.java:199)
	at java.base/java.lang.reflect.Method.setAccessible(Method.java:193)
	at net.sf.cglib.core.ReflectUtils$1.run(ReflectUtils.java:61)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:569)
	at net.sf.cglib.core.ReflectUtils.<clinit>(ReflectUtils.java:52)
	at net.sf.cglib.core.KeyFactory$Generator.generateClass(KeyFactory.java:243)
	at net.sf.cglib.core.DefaultGeneratorStrategy.generate(DefaultGeneratorStrategy.java:25)
	at net.sf.cglib.core.AbstractClassGenerator.generate(AbstractClassGenerator.java:332)
	... 14 more

 */

/*
The error encountered above is related to the Java module system introduced in Java 9, which enforces stricter access
controls to certain classes and methods.
The specific error java.lang.reflect.InaccessibleObjectException suggests that the code is attempting to access a method
(defineClass in this case) that is not accessible because the module system does not allow it.
This particular issue arises because the code is trying to use CGLIB (a code generation library) to dynamically generate
classes or proxies, and it is attempting to access a protected method in java.lang.ClassLoader that is restricted in
newer versions of Java.

To resolve the above problem add the following command:
--add-opens java.base/java.lang=ALL-UNNAMED
in VM options field (in Edit Configuration), if you are using Intellij IDE.
in VM arguments field (in Run Configurations>Java Application>Arguments>VM Arguments), if you are using Eclipse IDE.


Output::

Withdrawing during the Federal Reserve System Monitoring:
BankServiceProxyHelper.intercept(Object, Method, Object[], MethodProxy)
BankServiceImpl.withdraw(long,float)
Withdrawing Amount $4200.0 from account number: 365111004
BankServiceProxyHelper.intercept(Object, Method, Object[], MethodProxy)
You cannot withdraw more than $5000.00
Not withdrawing during the Federal Reserve System Monitoring:
BankServiceImpl.withdraw(long,float)
Withdrawing Amount $4200.0 from account number: 365111004
BankServiceImpl.withdraw(long,float)
Withdrawing Amount $5000.02 from account number: 365111004
 */