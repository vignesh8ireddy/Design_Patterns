package com.vignesh.template;

public abstract class HireCandidate {

    public boolean conductAptitudeTest() {
        System.out.println("HireCandidate.conductAptitudeTest()");
        return true;
    }
    public boolean conductGDTest() {
        System.out.println("HireCandidate.conductGDTest()");
        return true;
    }
    public abstract boolean conductTechnicalTest();
    public boolean conductHRTest() {
        System.out.println("HireCandidate.conductHRTest()");
        return true;
    }

    public boolean CandidateRecruitmentDrive() {
        boolean flag = true;
        if(conductAptitudeTest()) {
            flag = false;
        }
        if(conductGDTest()) {
            flag = false;
        }
        if(conductTechnicalTest()) {
            flag = false;
        }
        if(conductHRTest()) {
            flag = false;
        }
        return flag;
    }

}
