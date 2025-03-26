package com.vignesh.cglibDynamic.component;

public class BankServiceImpl implements IBankService {
    @Override
    public void withdraw(long accNo, float amount) {
        System.out.println("BankServiceImpl.withdraw(long,float)");
        System.out.println("Withdrawing Amount $"+amount+" from account number: "+accNo);
    }
}
