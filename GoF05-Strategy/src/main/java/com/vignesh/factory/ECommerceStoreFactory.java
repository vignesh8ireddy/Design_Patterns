package com.vignesh.factory;

import com.vignesh.dependant.FedEx;
import com.vignesh.dependant.UPS;
import com.vignesh.target.ECommerceStore;

public class ECommerceStoreFactory {

    public static ECommerceStore getECommerceStore(String mailServiceType) {
        ECommerceStore eCommerceStore;
        if(mailServiceType.equalsIgnoreCase("ups")) {
            eCommerceStore = new ECommerceStore(new UPS());
        }
        else if(mailServiceType.equalsIgnoreCase("fedex")) {
            eCommerceStore = new ECommerceStore(new FedEx());
        }
        else throw new IllegalArgumentException("Invalid Mail Service Type");

        return eCommerceStore;
    }
}
