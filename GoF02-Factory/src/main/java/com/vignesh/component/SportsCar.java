package com.vignesh.component;

public class SportsCar extends Car {

    private int speed;
    private int pickup;

    @Override
    public void assembleCar() {
        System.out.println("SportsCar.assembleCar()");
    }

    @Override
    public void roadTest() {
        System.out.println("SportsCar.roadTest()");
    }

    @Override
    public void drive() {
        System.out.println("SportsCar.drive()");
    }
}
