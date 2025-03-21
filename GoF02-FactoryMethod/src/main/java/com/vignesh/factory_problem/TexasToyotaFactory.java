package com.vignesh.factory_problem;

import com.vignesh.component.Toyota4Runner;
import com.vignesh.component.ToyotaCar;
import com.vignesh.component.ToyotaHighlander;
import com.vignesh.component.ToyotaRAV4;

public class TexasToyotaFactory {

    //The below factory method is not restricted in any way while creating an object
    public static ToyotaCar createCar(String typeOfCar) {
        ToyotaCar car;
        if(typeOfCar.equalsIgnoreCase("rav4")) {
            car = new ToyotaRAV4();
        }
        else if(typeOfCar.equalsIgnoreCase("highlander")) {
            car = new ToyotaHighlander();
        }
        else if(typeOfCar.equalsIgnoreCase("4runner")) {
            car = new Toyota4Runner();
        }
        else throw new RuntimeException("Invalid Car Type");
        car.painting();
        car.assembling();
        car.engineTest();
        car.roadTest();
        return car;
    }

}
