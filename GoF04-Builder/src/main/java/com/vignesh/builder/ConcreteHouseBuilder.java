package com.vignesh.builder;

import com.vignesh.product.*;

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        System.out.println("ConcreteHouseBuilder()");
        house = new House();
    }

    @Override
    public void buildBasement() {
        System.out.println("ConcreteHouseBuilder.buildBasement()");
        house.setBasement(new ConcreteBasement());
    }

    @Override
    public void buildStructure() {
        System.out.println("ConcreteHouseBuilder.buildStructure()");
        house.setStructure(new ConcreteStructure());
    }

    @Override
    public void buildRoofing() {
        System.out.println("ConcreteHouseBuilder.buildRoofing()");
        house.setRoofing(new ConcreteRoofing());
    }

    @Override
    public void buildInterior() {
        System.out.println("ConcreteHouseBuilder.buildInterior()");
        house.setInterior(new ConcreteInterior());
    }

    @Override
    public House buildHouse() {
        System.out.println("ConcreteHouseBuilder.buildHouse()");
        return house;
    }
}
