package com.vignesh.component;

public class LuxuryCar extends Car {

    private int bootSpace;
    private int security;

    @Override
    public void assembleCar() {
        System.out.println("LuxuryCar.assembleCar()");
    }

    @Override
    public void roadTest() {
        System.out.println("LuxuryCar.roadTest()");
    }

    @Override
    public void drive() {
        System.out.println("LuxuryCar.drive()");
    }
}
