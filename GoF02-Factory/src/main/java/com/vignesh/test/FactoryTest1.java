package com.vignesh.test;

import com.vignesh.component.BudgetCar;
import com.vignesh.component.Car;
import com.vignesh.component.LuxuryCar;
import com.vignesh.component.SportsCar;

//A client app with bad practice of creating objects for the abstract class Car type
public class FactoryTest1 {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar();
        Car luxuryCar = new LuxuryCar();
        Car budgetCar = new BudgetCar();

        sportsCar.assembleCar();
        sportsCar.roadTest();
        sportsCar.drive();

        luxuryCar.assembleCar();
        luxuryCar.roadTest();
        luxuryCar.drive();

        budgetCar.assembleCar();
        budgetCar.roadTest();
        budgetCar.drive();
    }
}

/*
Here client app i.e main() is expected to know various subclasses extending the abstract class Car.
This is not a good practice.
 */