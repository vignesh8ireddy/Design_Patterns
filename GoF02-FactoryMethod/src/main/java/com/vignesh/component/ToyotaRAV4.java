package com.vignesh.component;

public class ToyotaRAV4 implements ToyotaCar {
    public float price;

    @Override
    public void painting() {
        System.out.println("ToyotaRAV4.painting()");
    }

    @Override
    public void assembling() {
        System.out.println("ToyotaRAV4.assembling()");
    }

    @Override
    public void engineTest() {
        System.out.println("ToyotaRAV4.engineTest()");
    }

    @Override
    public void roadTest() {
        System.out.println("ToyotaRAV4.roadTest()");
    }

    @Override
    public void drive() {
        System.out.println("ToyotaRAV4.drive()");
    }
}
