package com.vignesh.factory_problem;

import com.vignesh.dao.CourseExcelDao;
import com.vignesh.dao.DAO;
import com.vignesh.dao.StudentExcelDao;

public class ExcelDaoFactory {
    public static DAO createDAO(String typeOfDao) {
        DAO dao;
        if(typeOfDao.equalsIgnoreCase("student")) {
            dao = new StudentExcelDao();
        }
        else if(typeOfDao.equalsIgnoreCase("course")) {
            dao = new CourseExcelDao();
        }
        else throw new RuntimeException("Invalid DAO Type");
        return dao;
    }
}