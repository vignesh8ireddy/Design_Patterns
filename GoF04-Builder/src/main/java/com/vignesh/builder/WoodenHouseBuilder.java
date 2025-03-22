package com.vignesh.builder;

import com.vignesh.product.*;

public class WoodenHouseBuilder implements HouseBuilder {
    private House house;

    public WoodenHouseBuilder() {
        System.out.println("WoodenHouseBuilder()");
        house = new House();
    }

    @Override
    public void buildBasement() {
        System.out.println("WoodenHouseBuilder.buildBasement()");
        house.setBasement(new WoodenBasement());
    }

    @Override
    public void buildStructure() {
        System.out.println("WoodenHouseBuilder.buildStructure()");
        house.setStructure(new WoodenStructure());
    }

    @Override
    public void buildRoofing() {
        System.out.println("WoodenHouseBuilder.buildRoofing()");
        house.setRoofing(new WoodenRoofing());
    }

    @Override
    public void buildInterior() {
        System.out.println("WoodenHouseBuilder.buildInterior()");
        house.setInterior(new WoodenInterior());
    }

    @Override
    public House buildHouse() {
        System.out.println("WoodenHouseBuilder.buildHouse()");
        return house;
    }
}
