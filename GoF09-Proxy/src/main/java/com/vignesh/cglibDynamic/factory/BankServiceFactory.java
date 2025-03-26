package com.vignesh.cglibDynamic.factory;

import com.vignesh.cglibDynamic.component.BankServiceImpl;
import com.vignesh.cglibDynamic.component.IBankService;
import com.vignesh.cglibDynamic.proxy.BankServiceProxyHelper;
import net.sf.cglib.proxy.Enhancer;

public class BankServiceFactory {
    public static IBankService getInstance(boolean FedReserveMonitoring) {
        if(FedReserveMonitoring) {
            return (BankServiceImpl) Enhancer.create(BankServiceImpl.class, new BankServiceProxyHelper());
        }
        else return new BankServiceImpl();
    }
}
