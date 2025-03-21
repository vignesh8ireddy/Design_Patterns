package com.vignesh.test;

import com.vignesh.component.ToyotaCar;
import com.vignesh.factory_solution.IndianaToyotaFactory;
import com.vignesh.factory_solution.TexasToyotaFactory;
import com.vignesh.factory_solution.ToyotaFactory;

public class FactoryMethodPatternTest2 {


    public static void main(String[] args) {

        ToyotaFactory factory1 = new TexasToyotaFactory();
        ToyotaCar car1 = factory1.orderCar("highlander");
        car1.drive();
        System.out.println("======================================");
        ToyotaFactory factory2 = new IndianaToyotaFactory();
        ToyotaCar car2 = factory2.orderCar("highlander");
        car2.drive();
    }
}
