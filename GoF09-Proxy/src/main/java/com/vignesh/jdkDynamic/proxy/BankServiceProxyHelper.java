package com.vignesh.jdkDynamic.proxy;

import com.vignesh.jdkDynamic.component.BankServiceImpl;
import com.vignesh.jdkDynamic.component.IBankService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BankServiceProxyHelper implements InvocationHandler {
    IBankService bankService;
    public BankServiceProxyHelper() {
        bankService = new BankServiceImpl();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnObj = null;
        if(method.getName().equalsIgnoreCase("withdraw")) {
            if((Float) args[1] < 5000.0f) {
                returnObj = method.invoke(bankService, args);
            }
            else throw new RuntimeException("You cannot withdraw more than $5000.00");
        }
        return returnObj;
    }
}
