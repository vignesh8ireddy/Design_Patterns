package com.vignesh.manual.factory;

import com.vignesh.cglibDynamic.component.BankServiceImpl;
import com.vignesh.cglibDynamic.component.IBankService;
import com.vignesh.manual.proxy.BankServiceProxy;

public class BankServiceFactory {
    public static IBankService getInstance(boolean FedReserveMonitoring) {
        if(FedReserveMonitoring) {
            return new BankServiceProxy();
        }
        else return new BankServiceImpl();
    }
}
