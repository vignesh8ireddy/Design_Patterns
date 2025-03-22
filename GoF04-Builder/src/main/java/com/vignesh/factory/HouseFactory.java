package com.vignesh.factory;

import com.vignesh.builder.ConcreteHouseBuilder;
import com.vignesh.builder.HouseBuilder;
import com.vignesh.builder.WoodenHouseBuilder;
import com.vignesh.director.CivilEngineer;
import com.vignesh.product.House;

public class HouseFactory {

    public static House getHouse(String houseType) {
        House house;
        HouseBuilder houseBuilder;

        if(houseType.equalsIgnoreCase("wooden")) {
            houseBuilder = new WoodenHouseBuilder();
        }
        else if(houseType.equalsIgnoreCase("concrete")) {
            houseBuilder = new ConcreteHouseBuilder();
        }
        else throw new IllegalArgumentException("Invalid type of House");
        CivilEngineer civilEngineer = new CivilEngineer(houseBuilder);
        civilEngineer.constructHouse();
        return civilEngineer.getHouse();
    }
}