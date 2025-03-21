package com.vignesh.component;

public class Toyota4Runner implements ToyotaCar {
    public int pickup;

    @Override
    public void painting() {
        System.out.println("Toyota4Runner.painting()");
    }

    @Override
    public void assembling() {
        System.out.println("Toyota4Runner.assembling()");
    }

    @Override
    public void engineTest() {
        System.out.println("Toyota4Runner.engineTest()");
    }

    @Override
    public void roadTest() {
        System.out.println("Toyota4Runner.roadTest()");
    }

    @Override
    public void drive() {
        System.out.println("Toyota4Runner.drive()");
    }
}
