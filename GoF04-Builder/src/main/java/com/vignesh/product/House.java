package com.vignesh.product;

public class House {
    private Basement basement;
    private Structure structure;
    private Interior interior;
    private Roofing roofing;

    public Basement getBasement() {
        return basement;
    }

    public void setBasement(Basement basement) {
        this.basement = basement;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public Roofing getRoofing() {
        return roofing;
    }

    public void setRoofing(Roofing roofing) {
        this.roofing = roofing;
    }

    @Override
    public String toString() {
        return "House [Basement: "+ getBasement()+", Structure: "+ getStructure()+", Interior: "+ getInterior()+", " +
                "Roofing: "+getRoofing()+"]";
    }
}
