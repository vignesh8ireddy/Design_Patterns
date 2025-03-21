package com.vignesh.test;

import com.vignesh.recruit.HireSoftwareEngineer;

public class TemplateMethodPatternTest1 {

    public static void main(String[] args) {
        HireSoftwareEngineer hireSoftwareEngineer = new HireSoftwareEngineer();
        boolean flag = true;
        if(!hireSoftwareEngineer.conductAptitudeTest()) {
            flag = false;
        }
        if(!hireSoftwareEngineer.conductGDTest()) {
            flag = false;
        }
        if(!hireSoftwareEngineer.conductTechnicalTest()) {
            flag = false;
        }
        if(!hireSoftwareEngineer.conductHRTest()) {
            flag = false;
        }
        if(flag) {
            System.out.println("Software Engineer Hired!");
        }
        else {
            System.out.println("Software Engineer Not Hired!");
        }
    }

}
