package com.vignesh.test;

import com.vignesh.component.ToyotaCar;
import com.vignesh.factory_problem.IndianaToyotaFactory;
import com.vignesh.factory_problem.TexasToyotaFactory;

public class FactoryMethodPatternTest1 {


    public static void main(String args[]) {
        ToyotaCar car1 = TexasToyotaFactory.createCar("Highlander");
        car1.drive();
        System.out.println("==============================");
        ToyotaCar car2 = IndianaToyotaFactory.createCar("Highlander");
        car2.drive();
    }
}
