package com.vignesh.component;

public class BudgetCar extends Car {

    private int fuelEconomy;
    private float price;

    @Override
    public void assembleCar() {
        System.out.println("BudgetCar.assembleCar()");
    }

    @Override
    public void roadTest() {
        System.out.println("BudgetCar.roadTest()");
    }

    @Override
    public void drive() {
        System.out.println("BudgetCar.drive()");
    }
}
