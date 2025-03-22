package com.vignesh.target;

import com.vignesh.dependant.MailService;

import java.util.Arrays;
import java.util.Random;

// final class : closing for modification
public final class ECommerceStore {

    //Loose coupling and Composition
    MailService mailService;

    public ECommerceStore(MailService mailService) {
        this.mailService = mailService;
    }

    public void shopping(String[] items, double[] prices) {
        double billAmt=0.0;
        for(double price : prices){
            billAmt+=price;
        }
        String billMsg = Arrays.toString(items)+" with prices "+Arrays.toString(prices)+" Total Bill Amount: "+billAmt;
        int oId = new Random().nextInt(800,1800);

        System.out.println(billMsg);
        mailService.deliverOrder(oId);
    }
}
