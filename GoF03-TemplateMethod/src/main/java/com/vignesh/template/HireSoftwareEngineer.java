package com.vignesh.template;

public class HireSoftwareEngineer extends HireCandidate{

    @Override
    public boolean conductTechnicalTest() {
        System.out.println("HireSoftwareEngineer.conductTechnicalTest()");
        return true;
    }

}
