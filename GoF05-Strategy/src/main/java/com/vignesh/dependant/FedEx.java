package com.vignesh.dependant;

public class FedEx implements MailService {
    @Override
    public void deliverOrder(double oId) {
        System.out.println("FedEx.deliverOrder():: "+oId);
    }
}
