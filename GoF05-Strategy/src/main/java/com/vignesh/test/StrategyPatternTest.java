package com.vignesh.test;

import com.vignesh.factory.ECommerceStoreFactory;
import com.vignesh.target.ECommerceStore;

public class StrategyPatternTest {
    public static void main(String[] args) {
        ECommerceStore store = ECommerceStoreFactory.getECommerceStore("Fedex");
        store.shopping(new String[] {"T-shirt","Jeans","Hat"}, new double[] {20.0, 50.0, 10.0});
    }
}

/*
Output::

[T-shirt, Jeans, Hat] with prices [20.0, 50.0, 10.0] Total Bill Amount: 80.0
FedEx.deliverOrder():: 1154.0
 */