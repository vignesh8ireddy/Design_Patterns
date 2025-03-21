package com.vignesh.test;

import com.vignesh.component.Car;
import com.vignesh.factory_problem.CarFactory;
import com.vignesh.util.CarType;

//A client app using factory class to create object of Car type
public class FactoryTest2 {

    public static void main(String[] args) {
        Car sportsCar = CarFactory.createCar(CarType.MODEL_SPORTS);
        Car luxuryCar = CarFactory.createCar(CarType.MODEL_LUXURY);
        Car budgetCar = CarFactory.createCar(CarType.MODEL_BUDGET);

        sportsCar.drive();
        luxuryCar.drive();
        budgetCar.drive();
    }
}