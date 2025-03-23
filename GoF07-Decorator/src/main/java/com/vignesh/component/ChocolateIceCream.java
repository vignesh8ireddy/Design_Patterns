package com.vignesh.component;

public class ChocolateIceCream implements IceCream {
    @Override
    public void prepare() {
        System.out.println("ChocolateIceCream.prepare()");
    }
}
