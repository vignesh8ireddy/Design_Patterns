package com.vignesh.manual.proxy;

import com.vignesh.cglibDynamic.component.BankServiceImpl;
import com.vignesh.cglibDynamic.component.IBankService;

public class BankServiceProxy implements IBankService {
    private BankServiceImpl bankService;

    public BankServiceProxy() {
        bankService = new BankServiceImpl();
    }

    @Override
    public void withdraw(long accNo, float amount) {
        System.out.println("BankServiceProxy.withdraw(long,float)");
        if(amount < 5000.0) bankService.withdraw(accNo, amount);
        else throw new RuntimeException("You Cannot withdraw more than $5000.00");
    }
}
