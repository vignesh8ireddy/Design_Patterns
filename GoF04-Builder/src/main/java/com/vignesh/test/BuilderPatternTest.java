package com.vignesh.test;

import com.vignesh.factory.HouseFactory;
import com.vignesh.product.House;

public class BuilderPatternTest {
    public static void main(String[] args) {
        House woodenHouse = HouseFactory.getHouse("Wooden");
        System.out.println(woodenHouse);
        System.out.println("======================================");
        House concreteHouse = HouseFactory.getHouse("Concrete");
        System.out.println(concreteHouse);
    }
}

/*
Output::

WoodenHouseBuilder()
CivilEngineer(HouseBuilder)
CivilEngineer.constructHouse()
WoodenHouseBuilder.buildBasement()
WoodenHouseBuilder.buildStructure()
WoodenHouseBuilder.buildRoofing()
WoodenHouseBuilder.buildInterior()
CivilEngineer.getHouse()
WoodenHouseBuilder.buildHouse()
House [Basement: WoodenBasement, Structure: WoodenStructure, Interior: WoodenInterior, Roofing: WoodenRoofing]
======================================
ConcreteHouseBuilder()
CivilEngineer(HouseBuilder)
CivilEngineer.constructHouse()
ConcreteHouseBuilder.buildBasement()
ConcreteHouseBuilder.buildStructure()
ConcreteHouseBuilder.buildRoofing()
ConcreteHouseBuilder.buildInterior()
CivilEngineer.getHouse()
ConcreteHouseBuilder.buildHouse()
House [Basement: ConcreteBasement, Structure: ConcreteStructure, Interior: ConcreteInterior, Roofing: ConcreteRoofing]
 */