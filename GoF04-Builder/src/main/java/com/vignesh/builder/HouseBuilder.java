package com.vignesh.builder;

import com.vignesh.product.House;

public interface HouseBuilder {
    void buildBasement();
    void buildStructure();
    void buildRoofing();
    void buildInterior();
    House buildHouse();
}
