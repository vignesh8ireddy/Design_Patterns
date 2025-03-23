package com.vignesh.component;

public class VanillaIceCream implements IceCream {
    @Override
    public void prepare() {
        System.out.println("VanillaIceCream.prepare()");
    }
}
