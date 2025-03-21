package com.vignesh.template;

public class HireDataEngineer extends HireCandidate{

    @Override
    public boolean conductTechnicalTest() {
        System.out.println("HireDataEngineer.conductTechnicalTest()");
        return true;
    }

}
