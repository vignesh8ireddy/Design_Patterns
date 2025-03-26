package com.vignesh.jdkDynamic.factory;

import com.vignesh.jdkDynamic.component.BankServiceImpl;
import com.vignesh.jdkDynamic.component.IBankService;
import com.vignesh.jdkDynamic.proxy.BankServiceProxyHelper;

import java.lang.reflect.Proxy;

public class BankServiceFactory {
    public static IBankService getInstance(boolean FedReserveMonitoring) {
        if(FedReserveMonitoring) {
            return (IBankService) Proxy.newProxyInstance(IBankService.class.getClassLoader(),
                    new Class[] {IBankService.class}, new BankServiceProxyHelper());
        }
        else return new BankServiceImpl();
    }
}
