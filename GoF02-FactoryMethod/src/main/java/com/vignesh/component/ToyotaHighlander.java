package com.vignesh.component;

public class ToyotaHighlander implements ToyotaCar {
    public int mpg;

    @Override
    public void painting() {
        System.out.println("ToyotaHighlander.painting()");
    }

    @Override
    public void assembling() {
        System.out.println("ToyotaHighlander.assembling()");
    }

    @Override
    public void engineTest() {
        System.out.println("ToyotaHighlander.engineTest()");
    }

    @Override
    public void roadTest() {
        System.out.println("ToyotaHighlander.roadTest()");
    }

    @Override
    public void drive() {
        System.out.println("ToyotaHighlander.drive()");
    }
}
