package com.vignesh.test;

import com.vignesh.template.HireDataEngineer;
import com.vignesh.template.HireSoftwareEngineer;

public class TemplateMethodPatternTest2 {

    public static void main(String[] args) {
        HireSoftwareEngineer hireSoftwareEngineer = new HireSoftwareEngineer();
        hireSoftwareEngineer.CandidateRecruitmentDrive();
        System.out.println("====================================");
        HireDataEngineer hireDataEngineer = new HireDataEngineer();
        hireDataEngineer.CandidateRecruitmentDrive();
    }

}
