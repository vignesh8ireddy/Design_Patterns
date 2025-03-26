package com.vignesh.cglibDynamic.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class BankServiceProxyHelper implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("BankServiceProxyHelper.intercept(Object, Method, Object[], MethodProxy)");
        if(method.getName().equalsIgnoreCase("withdraw")) {
            if((Float)args[1] <= 5000.0f) {
                Object returnObj = proxy.invokeSuper(obj, args);
                return returnObj;
            }
            else throw new RuntimeException("You cannot withdraw more than $5000.00");
        }
        else {
            Object returnObj = proxy.invokeSuper(obj, args);
            return returnObj;
        }
    }
}
