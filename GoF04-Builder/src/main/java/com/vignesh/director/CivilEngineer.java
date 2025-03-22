package com.vignesh.director;

import com.vignesh.builder.HouseBuilder;
import com.vignesh.product.House;

public class CivilEngineer {

    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder) {
        System.out.println("CivilEngineer(HouseBuilder)");
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() {
        System.out.println("CivilEngineer.constructHouse()");
        houseBuilder.buildBasement();
        houseBuilder.buildStructure();
        houseBuilder.buildRoofing();
        houseBuilder.buildInterior();
    }

    public House getHouse() {
        System.out.println("CivilEngineer.getHouse()");
        return houseBuilder.buildHouse();
    }

}
