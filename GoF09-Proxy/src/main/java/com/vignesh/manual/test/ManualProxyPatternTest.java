package com.vignesh.manual.test;

import com.vignesh.cglibDynamic.component.IBankService;
import com.vignesh.manual.factory.BankServiceFactory;

public class ManualProxyPatternTest {
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
BankServiceProxy.withdraw(long,float)
BankServiceImpl.withdraw(long,float)
Withdrawing Amount $4200.0 from account number: 365111004
BankServiceProxy.withdraw(long,float)
You Cannot withdraw more than $5000.00
Not withdrawing during the Federal Reserve System Monitoring:
BankServiceImpl.withdraw(long,float)
Withdrawing Amount $4200.0 from account number: 365111004
BankServiceImpl.withdraw(long,float)
Withdrawing Amount $5000.02 from account number: 365111004
 */