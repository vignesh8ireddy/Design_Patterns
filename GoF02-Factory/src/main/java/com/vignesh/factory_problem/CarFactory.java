package com.vignesh.factory_problem;

import com.vignesh.component.BudgetCar;
import com.vignesh.component.Car;
import com.vignesh.component.LuxuryCar;
import com.vignesh.component.SportsCar;
import com.vignesh.util.CarType;

//factory class for Car type
public class CarFactory {

    //factory method
    public static Car createCar(String type) {
        Car newCar = null;
        if(type.equalsIgnoreCase(CarType.MODEL_BUDGET)) {
            newCar = new BudgetCar();
        }
        else if(type.equalsIgnoreCase(CarType.MODEL_LUXURY)) {
            newCar = new LuxuryCar();
        }
        else if(type.equalsIgnoreCase(CarType.MODEL_SPORTS)) {
            newCar = new SportsCar();
        }
        else throw new RuntimeException("Invalid Car Details");

        newCar.assembleCar();
        newCar.roadTest();
        return newCar;
    }
}
