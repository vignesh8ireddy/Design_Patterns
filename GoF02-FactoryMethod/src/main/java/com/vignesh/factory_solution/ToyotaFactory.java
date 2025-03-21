package com.vignesh.factory_solution;

import com.vignesh.component.ToyotaCar;

public abstract class ToyotaFactory {

    public abstract void painting();
    public abstract void assembling();
    public abstract void engineTesting();
    public abstract void roadTesting();
    public abstract ToyotaCar createCar(String typeOfCar);
    public ToyotaCar orderCar(String typeOfCar) {
        ToyotaCar car = createCar(typeOfCar);
        car.painting();
        car.assembling();
        car.engineTest();
        car.roadTest();
        return car;
    }
}
