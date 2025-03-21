package com.vignesh.factory_solution;

import com.vignesh.component.Toyota4Runner;
import com.vignesh.component.ToyotaCar;
import com.vignesh.component.ToyotaHighlander;
import com.vignesh.component.ToyotaRAV4;

public class TexasToyotaFactory extends ToyotaFactory {

    @Override
    public void painting() {
        System.out.println("TexasToyotaFactory.painting()");
    }

    @Override
    public void assembling() {
        System.out.println("TexasToyotaFactory.assembling()");
    }

    @Override
    public void engineTesting() {
        System.out.println("TexasToyotaFactory.engineTesting()");
    }

    @Override
    public void roadTesting() {
        System.out.println("TexasToyotaFactory.roadTesting()");
    }

    @Override
    public ToyotaCar createCar(String typeOfCar) {
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
        return car;
    }

}
