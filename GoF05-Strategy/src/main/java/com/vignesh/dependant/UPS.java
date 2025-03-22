package com.vignesh.dependant;

public class UPS implements MailService {
    @Override
    public void deliverOrder(double oId) {
        System.out.println("UPS.deliverOrder():: "+oId);
    }
}
